package com.jeecg.cart.entity;
import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 车辆信息表
 * @author onlineGenerator
 * @date 2019-03-07 08:54:10
 * @version V1.0   
 *
 */
@Entity
@Table(name = "t_cart_air_refrigerator", schema = "")
@SuppressWarnings("serial")
public class TCartAirRefrigeratorEntity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**创建人名称*/
	private String createName;
	/**创建人登录名称*/
	private String createBy;
	/**创建日期*/
	private Date createDate;
	/**更新人名称*/
	private String updateName;
	/**更新人登录名称*/
	private String updateBy;
	/**更新日期*/
	private Date updateDate;
	/**所属部门*/
	private String sysOrgCode;
	/**所属公司*/
	private String sysCompanyCode;
	/**流程状态*/
	private String bpmStatus;
	/**空调控制方式*/
	@Excel(name="空调控制方式",width=15)
	private String airControlMode;
	/**后排独立空调*/
	@Excel(name="后排独立空调",width=15)
	private String rearIndependentAir;
	/**后座出风口*/
	@Excel(name="后座出风口",width=15)
	private String rearOutlet;
	/**温度分区控制*/
	@Excel(name="温度分区控制",width=15)
	private String temperatureZoningControl;
	/**车内空气调节*/
	@Excel(name="车内空气调节",width=15)
	private String inCarAirConditioning;
	/**车载冰箱*/
	@Excel(name="车载冰箱",width=15)
	private String vehicleRefrigerator;
	/**cartId*/
	private String cartId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	
	@Column(name ="ID",nullable=false,length=36)
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */
	
	@Column(name ="CREATE_BY",nullable=true,length=50)
	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(String updateName){
		this.updateName = updateName;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */
	
	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(String updateBy){
		this.updateBy = updateBy;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */
	
	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */
	
	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */
	
	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  空调控制方式
	 */
	
	@Column(name ="AIR_CONTROL_MODE",nullable=true,length=32)
	public String getAirControlMode(){
		return this.airControlMode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  空调控制方式
	 */
	public void setAirControlMode(String airControlMode){
		this.airControlMode = airControlMode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后排独立空调
	 */
	
	@Column(name ="REAR_INDEPENDENT_AIR",nullable=true,length=32)
	public String getRearIndependentAir(){
		return this.rearIndependentAir;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后排独立空调
	 */
	public void setRearIndependentAir(String rearIndependentAir){
		this.rearIndependentAir = rearIndependentAir;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后座出风口
	 */
	
	@Column(name ="REAR_OUTLET",nullable=true,length=32)
	public String getRearOutlet(){
		return this.rearOutlet;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后座出风口
	 */
	public void setRearOutlet(String rearOutlet){
		this.rearOutlet = rearOutlet;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  温度分区控制
	 */
	
	@Column(name ="TEMPERATURE_ZONING_CONTROL",nullable=true,length=32)
	public String getTemperatureZoningControl(){
		return this.temperatureZoningControl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  温度分区控制
	 */
	public void setTemperatureZoningControl(String temperatureZoningControl){
		this.temperatureZoningControl = temperatureZoningControl;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车内空气调节
	 */
	
	@Column(name ="IN_CAR_AIR_CONDITIONING",nullable=true,length=32)
	public String getInCarAirConditioning(){
		return this.inCarAirConditioning;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车内空气调节
	 */
	public void setInCarAirConditioning(String inCarAirConditioning){
		this.inCarAirConditioning = inCarAirConditioning;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车载冰箱
	 */
	
	@Column(name ="VEHICLE_REFRIGERATOR",nullable=true,length=32)
	public String getVehicleRefrigerator(){
		return this.vehicleRefrigerator;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车载冰箱
	 */
	public void setVehicleRefrigerator(String vehicleRefrigerator){
		this.vehicleRefrigerator = vehicleRefrigerator;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cartId
	 */
	
	@Column(name ="CART_ID",nullable=true,length=32)
	public String getCartId(){
		return this.cartId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  cartId
	 */
	public void setCartId(String cartId){
		this.cartId = cartId;
	}
	
}

