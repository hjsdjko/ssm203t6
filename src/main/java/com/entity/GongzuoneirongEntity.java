package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 工作内容
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@TableName("gongzuoneirong")
public class GongzuoneirongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzuoneirongEntity() {
		
	}
	
	public GongzuoneirongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 部门账号
	 */
					
	private String bumenzhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
