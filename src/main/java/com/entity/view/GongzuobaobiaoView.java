package com.entity.view;

import com.entity.GongzuobaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 工作报表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@TableName("gongzuobaobiao")
public class GongzuobaobiaoView  extends GongzuobaobiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongzuobaobiaoView(){
	}
 
 	public GongzuobaobiaoView(GongzuobaobiaoEntity gongzuobaobiaoEntity){
 	try {
			BeanUtils.copyProperties(this, gongzuobaobiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
