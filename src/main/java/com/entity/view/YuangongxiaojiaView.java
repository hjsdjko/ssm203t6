package com.entity.view;

import com.entity.YuangongxiaojiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 员工销假
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@TableName("yuangongxiaojia")
public class YuangongxiaojiaView  extends YuangongxiaojiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuangongxiaojiaView(){
	}
 
 	public YuangongxiaojiaView(YuangongxiaojiaEntity yuangongxiaojiaEntity){
 	try {
			BeanUtils.copyProperties(this, yuangongxiaojiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
