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
 * 工作报表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@TableName("gongzuobaobiao")
public class GongzuobaobiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzuobaobiaoEntity() {
		
	}
	
	public GongzuobaobiaoEntity(T t) {
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
	 * 报表名称
	 */
					
	private String baobiaomingcheng;
	
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
	 * 设置：报表名称
	 */
	public void setBaobiaomingcheng(String baobiaomingcheng) {
		this.baobiaomingcheng = baobiaomingcheng;
	}
	/**
	 * 获取：报表名称
	 */
	public String getBaobiaomingcheng() {
		return baobiaomingcheng;
	}
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
