package com.entity.model;

import com.entity.GongzuobaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 工作报表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public class GongzuobaobiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 统计时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjishijian;
		
	/**
	 * 统计内容
	 */
	
	private String tongjineirong;
		
	/**
	 * 统计人
	 */
	
	private String tongjiren;
		
	/**
	 * 报表内容
	 */
	
	private String baobiaoneirong;
		
	/**
	 * 部门账号
	 */
	
	private String bumenzhanghao;
		
	/**
	 * 部门姓名
	 */
	
	private String bumenxingming;
				
	
	/**
	 * 设置：统计时间
	 */
	 
	public void setTongjishijian(Date tongjishijian) {
		this.tongjishijian = tongjishijian;
	}
	
	/**
	 * 获取：统计时间
	 */
	public Date getTongjishijian() {
		return tongjishijian;
	}
				
	
	/**
	 * 设置：统计内容
	 */
	 
	public void setTongjineirong(String tongjineirong) {
		this.tongjineirong = tongjineirong;
	}
	
	/**
	 * 获取：统计内容
	 */
	public String getTongjineirong() {
		return tongjineirong;
	}
				
	
	/**
	 * 设置：统计人
	 */
	 
	public void setTongjiren(String tongjiren) {
		this.tongjiren = tongjiren;
	}
	
	/**
	 * 获取：统计人
	 */
	public String getTongjiren() {
		return tongjiren;
	}
				
	
	/**
	 * 设置：报表内容
	 */
	 
	public void setBaobiaoneirong(String baobiaoneirong) {
		this.baobiaoneirong = baobiaoneirong;
	}
	
	/**
	 * 获取：报表内容
	 */
	public String getBaobiaoneirong() {
		return baobiaoneirong;
	}
				
	
	/**
	 * 设置：部门账号
	 */
	 
	public void setBumenzhanghao(String bumenzhanghao) {
		this.bumenzhanghao = bumenzhanghao;
	}
	
	/**
	 * 获取：部门账号
	 */
	public String getBumenzhanghao() {
		return bumenzhanghao;
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
