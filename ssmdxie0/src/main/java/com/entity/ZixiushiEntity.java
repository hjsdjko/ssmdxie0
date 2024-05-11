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
 * 自修室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 21:53:16
 */
@TableName("zixiushi")
public class ZixiushiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZixiushiEntity() {
		
	}
	
	public ZixiushiEntity(T t) {
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
	 * 自修室名称
	 */
					
	private String zixiushimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 规模
	 */
					
	private String guimo;
	
	/**
	 * 座位数
	 */
					
	private String zuoweishu;
	
	/**
	 * 开放时间
	 */
					
	private String kaifangshijian;
	
	/**
	 * 配套设施
	 */
					
	private String peitaosheshi;
	
	/**
	 * 自修室详情
	 */
					
	private String zixiushixiangqing;
	
	/**
	 * 位置
	 */
					
	private String weizhi;
	
	
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
	 * 设置：自修室名称
	 */
	public void setZixiushimingcheng(String zixiushimingcheng) {
		this.zixiushimingcheng = zixiushimingcheng;
	}
	/**
	 * 获取：自修室名称
	 */
	public String getZixiushimingcheng() {
		return zixiushimingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：规模
	 */
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	/**
	 * 获取：规模
	 */
	public String getGuimo() {
		return guimo;
	}
	/**
	 * 设置：座位数
	 */
	public void setZuoweishu(String zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	/**
	 * 获取：座位数
	 */
	public String getZuoweishu() {
		return zuoweishu;
	}
	/**
	 * 设置：开放时间
	 */
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
	/**
	 * 设置：配套设施
	 */
	public void setPeitaosheshi(String peitaosheshi) {
		this.peitaosheshi = peitaosheshi;
	}
	/**
	 * 获取：配套设施
	 */
	public String getPeitaosheshi() {
		return peitaosheshi;
	}
	/**
	 * 设置：自修室详情
	 */
	public void setZixiushixiangqing(String zixiushixiangqing) {
		this.zixiushixiangqing = zixiushixiangqing;
	}
	/**
	 * 获取：自修室详情
	 */
	public String getZixiushixiangqing() {
		return zixiushixiangqing;
	}
	/**
	 * 设置：位置
	 */
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}

}
