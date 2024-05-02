package com.dao;

import com.entity.GongzuoneirongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuoneirongVO;
import com.entity.view.GongzuoneirongView;


/**
 * 工作内容
 * 
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface GongzuoneirongDao extends BaseMapper<GongzuoneirongEntity> {
	
	List<GongzuoneirongVO> selectListVO(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
	
	GongzuoneirongVO selectVO(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
	
	List<GongzuoneirongView> selectListView(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);

	List<GongzuoneirongView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
	
	GongzuoneirongView selectView(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
	
}
