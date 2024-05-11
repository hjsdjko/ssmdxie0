package com.entity.model;

import com.entity.ZixiushiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 自修室
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 21:53:16
 */
public class ZixiushiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
