package com.entity.vo;

import com.entity.JiaoyidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 交易订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public class JiaoyidingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源名称
	 */
	
	private String fangyuanmingcheng;
		
	/**
	 * 房源图片
	 */
	
	private String fangyuantupian;
		
	/**
	 * 房源位置
	 */
	
	private String fangyuanweizhi;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 租赁期限
	 */
	
	private String zulinqixian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 租户账号
	 */
	
	private String zuhuzhanghao;
		
	/**
	 * 租户姓名
	 */
	
	private String zuhuxingming;
		
	/**
	 * 合同文件
	 */
	
	private String hetongwenjian;
		
	/**
	 * 交易时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaoyishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：房源名称
	 */
	 
	public void setFangyuanmingcheng(String fangyuanmingcheng) {
		this.fangyuanmingcheng = fangyuanmingcheng;
	}
	
	/**
	 * 获取：房源名称
	 */
	public String getFangyuanmingcheng() {
		return fangyuanmingcheng;
	}
				
	
	/**
	 * 设置：房源图片
	 */
	 
	public void setFangyuantupian(String fangyuantupian) {
		this.fangyuantupian = fangyuantupian;
	}
	
	/**
	 * 获取：房源图片
	 */
	public String getFangyuantupian() {
		return fangyuantupian;
	}
				
	
	/**
	 * 设置：房源位置
	 */
	 
	public void setFangyuanweizhi(String fangyuanweizhi) {
		this.fangyuanweizhi = fangyuanweizhi;
	}
	
	/**
	 * 获取：房源位置
	 */
	public String getFangyuanweizhi() {
		return fangyuanweizhi;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：租赁期限
	 */
	 
	public void setZulinqixian(String zulinqixian) {
		this.zulinqixian = zulinqixian;
	}
	
	/**
	 * 获取：租赁期限
	 */
	public String getZulinqixian() {
		return zulinqixian;
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
	 * 设置：租户账号
	 */
	 
	public void setZuhuzhanghao(String zuhuzhanghao) {
		this.zuhuzhanghao = zuhuzhanghao;
	}
	
	/**
	 * 获取：租户账号
	 */
	public String getZuhuzhanghao() {
		return zuhuzhanghao;
	}
				
	
	/**
	 * 设置：租户姓名
	 */
	 
	public void setZuhuxingming(String zuhuxingming) {
		this.zuhuxingming = zuhuxingming;
	}
	
	/**
	 * 获取：租户姓名
	 */
	public String getZuhuxingming() {
		return zuhuxingming;
	}
				
	
	/**
	 * 设置：合同文件
	 */
	 
	public void setHetongwenjian(String hetongwenjian) {
		this.hetongwenjian = hetongwenjian;
	}
	
	/**
	 * 获取：合同文件
	 */
	public String getHetongwenjian() {
		return hetongwenjian;
	}
				
	
	/**
	 * 设置：交易时间
	 */
	 
	public void setJiaoyishijian(Date jiaoyishijian) {
		this.jiaoyishijian = jiaoyishijian;
	}
	
	/**
	 * 获取：交易时间
	 */
	public Date getJiaoyishijian() {
		return jiaoyishijian;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
