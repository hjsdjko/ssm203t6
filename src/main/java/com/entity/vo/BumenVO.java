package com.entity.vo;

import com.entity.BumenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 部门
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public class BumenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 部门姓名
	 */
	
	private String bumenxingming;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：部门姓名
	 */
	 
	public void setBumenxingming(String bumenxingming) {
		this.bumenxingming = bumenxingming;
	}
	
	/**
	 * 获取：部门姓名
	 */
	public String getBumenxingming() {
		return bumenxingming;
	}
			
}
