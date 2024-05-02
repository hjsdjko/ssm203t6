package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuobaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuobaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuobaobiaoView;


/**
 * 工作报表
 *
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface GongzuobaobiaoService extends IService<GongzuobaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuobaobiaoVO> selectListVO(Wrapper<GongzuobaobiaoEntity> wrapper);
   	
   	GongzuobaobiaoVO selectVO(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
   	
   	List<GongzuobaobiaoView> selectListView(Wrapper<GongzuobaobiaoEntity> wrapper);
   	
   	GongzuobaobiaoView selectView(@Param("ew") Wrapper<GongzuobaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuobaobiaoEntity> wrapper);
   	
}

