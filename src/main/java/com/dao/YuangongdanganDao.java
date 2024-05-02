package com.dao;

import com.entity.YuangongdanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongdanganVO;
import com.entity.view.YuangongdanganView;


/**
 * 员工档案
 * 
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface YuangongdanganDao extends BaseMapper<YuangongdanganEntity> {
	
	List<YuangongdanganVO> selectListVO(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
	
	YuangongdanganVO selectVO(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
	
	List<YuangongdanganView> selectListView(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);

	List<YuangongdanganView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
	
	YuangongdanganView selectView(@Param("ew") Wrapper<YuangongdanganEntity> wrapper);
	
}
