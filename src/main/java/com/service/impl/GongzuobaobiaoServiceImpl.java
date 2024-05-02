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


import com.dao.GongzuobaobiaoDao;
import com.entity.GongzuobaobiaoEntity;
import com.service.GongzuobaobiaoService;
import com.entity.vo.GongzuobaobiaoVO;
import com.entity.view.GongzuobaobiaoView;

@Service("gongzuobaobiaoService")
public class GongzuobaobiaoServiceImpl extends ServiceImpl<GongzuobaobiaoDao, GongzuobaobiaoEntity> implements GongzuobaobiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuobaobiaoEntity> page = this.selectPage(
                new Query<GongzuobaobiaoEntity>(params).getPage(),
                new EntityWrapper<GongzuobaobiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuobaobiaoEntity> wrapper) {
		  Page<GongzuobaobiaoView> page =new Query<GongzuobaobiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuobaobiaoVO> selectListVO(Wrapper<GongzuobaobiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuobaobiaoVO selectVO(Wrapper<GongzuobaobiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuobaobiaoView> selectListView(Wrapper<GongzuobaobiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuobaobiaoView selectView(Wrapper<GongzuobaobiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
