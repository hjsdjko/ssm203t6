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
 * 员工档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 19:15:23
 */
@TableName("yuangongdangan")
public class YuangongdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongdanganEntity() {
		
	}
	
	public YuangongdanganEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 政治面貌
	 */
					
	private String zhengzhimianmao;
	
	/**
	 * 婚姻状况
	 */
					
	private String hunyinzhuangkuang;
	
	/**
	 * 毕业学校
	 */
					
	private String biyexuexiao;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 职务
	 */
					
	private String zhiwu;
	
	/**
	 * 入公司时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rugongsishijian;
	
	/**
	 * 转正时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date zhuanzhengshijian;
	
	/**
	 * 聘用形式
	 */
					
	private String pinyongxingshi;
	
	/**
	 * 合同到期时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date hetongdaoqishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：政治面貌
	 */
	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}
	/**
	 * 获取：政治面貌
	 */
	public String getZhengzhimianmao() {
		return zhengzhimianmao;
	}
	/**
	 * 设置：婚姻状况
	 */
	public void setHunyinzhuangkuang(String hunyinzhuangkuang) {
		this.hunyinzhuangkuang = hunyinzhuangkuang;
	}
	/**
	 * 获取：婚姻状况
	 */
	public String getHunyinzhuangkuang() {
		return hunyinzhuangkuang;
	}
	/**
	 * 设置：毕业学校
	 */
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：职务
	 */
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	/**
	 * 获取：职务
	 */
	public String getZhiwu() {
		return zhiwu;
	}
	/**
	 * 设置：入公司时间
	 */
	public void setRugongsishijian(Date rugongsishijian) {
		this.rugongsishijian = rugongsishijian;
	}
	/**
	 * 获取：入公司时间
	 */
	public Date getRugongsishijian() {
		return rugongsishijian;
	}
	/**
	 * 设置：转正时间
	 */
	public void setZhuanzhengshijian(Date zhuanzhengshijian) {
		this.zhuanzhengshijian = zhuanzhengshijian;
	}
	/**
	 * 获取：转正时间
	 */
	public Date getZhuanzhengshijian() {
		return zhuanzhengshijian;
	}
	/**
	 * 设置：聘用形式
	 */
	public void setPinyongxingshi(String pinyongxingshi) {
		this.pinyongxingshi = pinyongxingshi;
	}
	/**
	 * 获取：聘用形式
	 */
	public String getPinyongxingshi() {
		return pinyongxingshi;
	}
	/**
	 * 设置：合同到期时间
	 */
	public void setHetongdaoqishijian(Date hetongdaoqishijian) {
		this.hetongdaoqishijian = hetongdaoqishijian;
	}
	/**
	 * 获取：合同到期时间
	 */
	public Date getHetongdaoqishijian() {
		return hetongdaoqishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
