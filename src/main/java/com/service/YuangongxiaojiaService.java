package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongxiaojiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongxiaojiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongxiaojiaView;


/**
 * 员工销假
 *
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface YuangongxiaojiaService extends IService<YuangongxiaojiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongxiaojiaVO> selectListVO(Wrapper<YuangongxiaojiaEntity> wrapper);
   	
   	YuangongxiaojiaVO selectVO(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
   	
   	List<YuangongxiaojiaView> selectListView(Wrapper<YuangongxiaojiaEntity> wrapper);
   	
   	YuangongxiaojiaView selectView(@Param("ew") Wrapper<YuangongxiaojiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongxiaojiaEntity> wrapper);
   	
}

