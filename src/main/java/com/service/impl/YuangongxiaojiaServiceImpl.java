package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuangongxiaojiaDao;
import com.entity.YuangongxiaojiaEntity;
import com.service.YuangongxiaojiaService;
import com.entity.vo.YuangongxiaojiaVO;
import com.entity.view.YuangongxiaojiaView;

@Service("yuangongxiaojiaService")
public class YuangongxiaojiaServiceImpl extends ServiceImpl<YuangongxiaojiaDao, YuangongxiaojiaEntity> implements YuangongxiaojiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongxiaojiaEntity> page = this.selectPage(
                new Query<YuangongxiaojiaEntity>(params).getPage(),
                new EntityWrapper<YuangongxiaojiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongxiaojiaEntity> wrapper) {
		  Page<YuangongxiaojiaView> page =new Query<YuangongxiaojiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongxiaojiaVO> selectListVO(Wrapper<YuangongxiaojiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongxiaojiaVO selectVO(Wrapper<YuangongxiaojiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongxiaojiaView> selectListView(Wrapper<YuangongxiaojiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongxiaojiaView selectView(Wrapper<YuangongxiaojiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
