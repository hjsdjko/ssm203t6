package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongzuobaobiaoEntity;
import com.entity.view.GongzuobaobiaoView;

import com.service.GongzuobaobiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 工作报表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@RestController
@RequestMapping("/gongzuobaobiao")
public class GongzuobaobiaoController {
    @Autowired
    private GongzuobaobiaoService gongzuobaobiaoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongzuobaobiaoEntity gongzuobaobiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bumen")) {
			gongzuobaobiao.setBumenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GongzuobaobiaoEntity> ew = new EntityWrapper<GongzuobaobiaoEntity>();
		PageUtils page = gongzuobaobiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuobaobiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongzuobaobiaoEntity gongzuobaobiao, 
		HttpServletRequest request){
        EntityWrapper<GongzuobaobiaoEntity> ew = new EntityWrapper<GongzuobaobiaoEntity>();
		PageUtils page = gongzuobaobiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongzuobaobiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongzuobaobiaoEntity gongzuobaobiao){
       	EntityWrapper<GongzuobaobiaoEntity> ew = new EntityWrapper<GongzuobaobiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongzuobaobiao, "gongzuobaobiao")); 
        return R.ok().put("data", gongzuobaobiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongzuobaobiaoEntity gongzuobaobiao){
        EntityWrapper< GongzuobaobiaoEntity> ew = new EntityWrapper< GongzuobaobiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongzuobaobiao, "gongzuobaobiao")); 
		GongzuobaobiaoView gongzuobaobiaoView =  gongzuobaobiaoService.selectView(ew);
		return R.ok("查询工作报表成功").put("data", gongzuobaobiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongzuobaobiaoEntity gongzuobaobiao = gongzuobaobiaoService.selectById(id);
        return R.ok().put("data", gongzuobaobiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongzuobaobiaoEntity gongzuobaobiao = gongzuobaobiaoService.selectById(id);
        return R.ok().put("data", gongzuobaobiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongzuobaobiaoEntity gongzuobaobiao, HttpServletRequest request){
    	gongzuobaobiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuobaobiao);

        gongzuobaobiaoService.insert(gongzuobaobiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GongzuobaobiaoEntity gongzuobaobiao, HttpServletRequest request){
    	gongzuobaobiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongzuobaobiao);

        gongzuobaobiaoService.insert(gongzuobaobiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongzuobaobiaoEntity gongzuobaobiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongzuobaobiao);
        gongzuobaobiaoService.updateById(gongzuobaobiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongzuobaobiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongzuobaobiaoEntity> wrapper = new EntityWrapper<GongzuobaobiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("bumen")) {
			wrapper.eq("bumenzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = gongzuobaobiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
