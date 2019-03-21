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
@Table(name = "t_cart_high_tech_config", schema = "")
@SuppressWarnings("serial")
public class TCartHighTechConfigEntity implements java.io.Serializable {
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
	/**自动泊车入位*/
	@Excel(name="自动泊车入位",width=15)
	private String automaticParking;
	/**发动机启停技术*/
	@Excel(name="发动机启停技术",width=15)
	private String engineStartStopTechnology;
	/**并线辅助*/
	@Excel(name="并线辅助",width=15)
	private String doublingAssistance;
	/**车道偏离预警系统*/
	@Excel(name="车道偏离预警系统",width=15)
	private String ldws;
	/**主动刹车*/
	@Excel(name="主动刹车",width=15)
	private String activeBrake;
	/**整体主动转向系统*/
	@Excel(name="整体主动转向系统",width=15)
	private String integralActiveSteeringSys;
	/**夜视系统*/
	@Excel(name="夜视系统",width=15)
	private String nightVisionSystem;
	/**中控液晶屏分屏*/
	@Excel(name="中控液晶屏分屏",width=15)
	private String lcdScreenDivider;
	/**自适应巡航*/
	@Excel(name="自适应巡航",width=15)
	private String adaptiveCruise;
	/**全景摄像头*/
	@Excel(name="全景摄像头",width=15)
	private String panoramicCamera;
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
	 *@return: java.lang.String  自动泊车入位
	 */
	
	@Column(name ="AUTOMATIC_PARKING",nullable=true,length=32)
	public String getAutomaticParking(){
		return this.automaticParking;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  自动泊车入位
	 */
	public void setAutomaticParking(String automaticParking){
		this.automaticParking = automaticParking;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发动机启停技术
	 */
	
	@Column(name ="ENGINE_START_STOP_TECHNOLOGY",nullable=true,length=32)
	public String getEngineStartStopTechnology(){
		return this.engineStartStopTechnology;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发动机启停技术
	 */
	public void setEngineStartStopTechnology(String engineStartStopTechnology){
		this.engineStartStopTechnology = engineStartStopTechnology;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  并线辅助
	 */
	
	@Column(name ="DOUBLING_ASSISTANCE",nullable=true,length=32)
	public String getDoublingAssistance(){
		return this.doublingAssistance;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  并线辅助
	 */
	public void setDoublingAssistance(String doublingAssistance){
		this.doublingAssistance = doublingAssistance;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车道偏离预警系统
	 */
	
	@Column(name ="LDWS",nullable=true,length=32)
	public String getLdws(){
		return this.ldws;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车道偏离预警系统
	 */
	public void setLdws(String ldws){
		this.ldws = ldws;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主动刹车
	 */
	
	@Column(name ="ACTIVE_BRAKE",nullable=true,length=32)
	public String getActiveBrake(){
		return this.activeBrake;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主动刹车
	 */
	public void setActiveBrake(String activeBrake){
		this.activeBrake = activeBrake;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  整体主动转向系统
	 */
	
	@Column(name ="INTEGRAL_ACTIVE_STEERING_SYS",nullable=true,length=32)
	public String getIntegralActiveSteeringSys(){
		return this.integralActiveSteeringSys;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  整体主动转向系统
	 */
	public void setIntegralActiveSteeringSys(String integralActiveSteeringSys){
		this.integralActiveSteeringSys = integralActiveSteeringSys;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  夜视系统
	 */
	
	@Column(name ="NIGHT_VISION_SYSTEM",nullable=true,length=32)
	public String getNightVisionSystem(){
		return this.nightVisionSystem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  夜视系统
	 */
	public void setNightVisionSystem(String nightVisionSystem){
		this.nightVisionSystem = nightVisionSystem;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  中控液晶屏分屏
	 */
	
	@Column(name ="LCD_SCREEN_DIVIDER",nullable=true,length=32)
	public String getLcdScreenDivider(){
		return this.lcdScreenDivider;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  中控液晶屏分屏
	 */
	public void setLcdScreenDivider(String lcdScreenDivider){
		this.lcdScreenDivider = lcdScreenDivider;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  自适应巡航
	 */
	
	@Column(name ="ADAPTIVE_CRUISE",nullable=true,length=32)
	public String getAdaptiveCruise(){
		return this.adaptiveCruise;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  自适应巡航
	 */
	public void setAdaptiveCruise(String adaptiveCruise){
		this.adaptiveCruise = adaptiveCruise;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  全景摄像头
	 */
	
	@Column(name ="PANORAMIC_CAMERA",nullable=true,length=32)
	public String getPanoramicCamera(){
		return this.panoramicCamera;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  全景摄像头
	 */
	public void setPanoramicCamera(String panoramicCamera){
		this.panoramicCamera = panoramicCamera;
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
