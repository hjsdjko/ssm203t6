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


import com.dao.GongzuoneirongDao;
import com.entity.GongzuoneirongEntity;
import com.service.GongzuoneirongService;
import com.entity.vo.GongzuoneirongVO;
import com.entity.view.GongzuoneirongView;

@Service("gongzuoneirongService")
public class GongzuoneirongServiceImpl extends ServiceImpl<GongzuoneirongDao, GongzuoneirongEntity> implements GongzuoneirongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuoneirongEntity> page = this.selectPage(
                new Query<GongzuoneirongEntity>(params).getPage(),
                new EntityWrapper<GongzuoneirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuoneirongEntity> wrapper) {
		  Page<GongzuoneirongView> page =new Query<GongzuoneirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuoneirongVO> selectListVO(Wrapper<GongzuoneirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuoneirongVO selectVO(Wrapper<GongzuoneirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuoneirongView> selectListView(Wrapper<GongzuoneirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuoneirongView selectView(Wrapper<GongzuoneirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
