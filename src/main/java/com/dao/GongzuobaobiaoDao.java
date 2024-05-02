package com.dao;

import com.entity.GongzuobaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuobaobiaoVO;
import com.entity.view.GongzuobaobiaoView;


/**
 * 工作报表
 * 
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface GongzuobaobiaoDao extends BaseMapper<GongzuobaobiaoEntity> {
	
	List<GongzuobaobiaoVO> selectListVO(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
	
	GongzuobaobiaoVO selectVO(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
	
	List<GongzuobaobiaoView> selectListView(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);

	List<GongzuobaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
	
	GongzuobaobiaoView selectView(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
	
}
