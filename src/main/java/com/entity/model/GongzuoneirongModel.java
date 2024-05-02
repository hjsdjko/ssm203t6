package com.entity.model;

import com.entity.GongzuoneirongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 工作内容
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
public class GongzuoneirongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门姓名
	 */
	
	private String bumenxingming;
		
	/**
	 * 工作标题
	 */
	
	private String gongzuobiaoti;
		
	/**
	 * 工作时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gongzuoshijian;
		
	/**
	 * 工作安排
	 */
	
	private String gongzuoanpai;
		
	/**
	 * 工作内容
	 */
	
	private String gongzuoneirong;
		
	/**
	 * 工作文件
	 */
	
	private String gongzuowenjian;
				
	
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
				
	
	/**
	 * 设置：工作标题
	 */
	 
	public void setGongzuobiaoti(String gongzuobiaoti) {
		this.gongzuobiaoti = gongzuobiaoti;
	}
	
	/**
	 * 获取：工作标题
	 */
	public String getGongzuobiaoti() {
		return gongzuobiaoti;
	}
				
	
	/**
	 * 设置：工作时间
	 */
	 
	public void setGongzuoshijian(Date gongzuoshijian) {
		this.gongzuoshijian = gongzuoshijian;
	}
	
	/**
	 * 获取：工作时间
	 */
	public Date getGongzuoshijian() {
		return gongzuoshijian;
	}
				
	
	/**
	 * 设置：工作安排
	 */
	 
	public void setGongzuoanpai(String gongzuoanpai) {
		this.gongzuoanpai = gongzuoanpai;
	}
	
	/**
	 * 获取：工作安排
	 */
	public String getGongzuoanpai() {
		return gongzuoanpai;
	}
				
	
	/**
	 * 设置：工作内容
	 */
	 
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
				
	
	/**
	 * 设置：工作文件
	 */
	 
	public void setGongzuowenjian(String gongzuowenjian) {
		this.gongzuowenjian = gongzuowenjian;
	}
	
	/**
	 * 获取：工作文件
	 */
	public String getGongzuowenjian() {
		return gongzuowenjian;
	}
			
}
