package com.dao;

import com.entity.YuangongxiaojiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongxiaojiaVO;
import com.entity.view.YuangongxiaojiaView;


/**
 * 员工销假
 * 
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface YuangongxiaojiaDao extends BaseMapper<YuangongxiaojiaEntity> {
	
	List<YuangongxiaojiaVO> selectListVO(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
	
	YuangongxiaojiaVO selectVO(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
	
	List<YuangongxiaojiaView> selectListView(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);

	List<YuangongxiaojiaView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
	
	YuangongxiaojiaView selectView(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
	
}
