package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuoneirongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuoneirongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuoneirongView;


/**
 * 工作内容
 *
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public interface GongzuoneirongService extends IService<GongzuoneirongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuoneirongVO> selectListVO(Wrapper<GongzuoneirongEntity> wrapper);
   	
   	GongzuoneirongVO selectVO(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
   	
   	List<GongzuoneirongView> selectListView(Wrapper<GongzuoneirongEntity> wrapper);
   	
   	GongzuoneirongView selectView(@Param("ew") Wrapper<GongzuoneirongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuoneirongEntity> wrapper);
   	
}

