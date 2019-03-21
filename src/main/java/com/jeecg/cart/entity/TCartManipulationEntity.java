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
@Table(name = "t_cart_manipulation", schema = "")
@SuppressWarnings("serial")
public class TCartManipulationEntity implements java.io.Serializable {
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
	/**ABS防抱死*/
	@Excel(name="ABS防抱死",width=15)
	private String abs;
	/**制动分配*/
	@Excel(name="制动分配",width=15)
	private String distributionBrake;
	/**刹车辅助*/
	@Excel(name="刹车辅助",width=15)
	private String assistBrake;
	/**牵引力控制*/
	@Excel(name="牵引力控制",width=15)
	private String tractionControl;
	/**车身稳定控制*/
	@Excel(name="车身稳定控制",width=15)
	private String bodyStabilityControl;
	/**上坡辅助*/
	@Excel(name="上坡辅助",width=15)
	private String hillStartAssist;
	/**自动驻车*/
	@Excel(name="自动驻车",width=15)
	private String automaticParking;
	/**陡坡缓降*/
	@Excel(name="陡坡缓降",width=15)
	private String hdc;
	/**可变悬架*/
	@Excel(name="可变悬架",width=15)
	private String variableSuspension;
	/**空气悬架*/
	@Excel(name="空气悬架",width=15)
	private String airSuspension;
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
	 *@return: java.lang.String  ABS防抱死
	 */
	
	@Column(name ="ABS",nullable=true,length=32)
	public String getAbs(){
		return this.abs;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ABS防抱死
	 */
	public void setAbs(String abs){
		this.abs = abs;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  制动分配
	 */
	
	@Column(name ="DISTRIBUTION_BRAKE",nullable=true,length=32)
	public String getDistributionBrake(){
		return this.distributionBrake;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  制动分配
	 */
	public void setDistributionBrake(String distributionBrake){
		this.distributionBrake = distributionBrake;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  刹车辅助
	 */
	
	@Column(name ="ASSIST_BRAKE",nullable=true,length=32)
	public String getAssistBrake(){
		return this.assistBrake;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  刹车辅助
	 */
	public void setAssistBrake(String assistBrake){
		this.assistBrake = assistBrake;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  牵引力控制
	 */
	
	@Column(name ="TRACTION_CONTROL",nullable=true,length=32)
	public String getTractionControl(){
		return this.tractionControl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  牵引力控制
	 */
	public void setTractionControl(String tractionControl){
		this.tractionControl = tractionControl;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车身稳定控制
	 */
	
	@Column(name ="BODY_STABILITY_CONTROL",nullable=true,length=32)
	public String getBodyStabilityControl(){
		return this.bodyStabilityControl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车身稳定控制
	 */
	public void setBodyStabilityControl(String bodyStabilityControl){
		this.bodyStabilityControl = bodyStabilityControl;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  上坡辅助
	 */
	
	@Column(name ="HILL_START_ASSIST",nullable=true,length=32)
	public String getHillStartAssist(){
		return this.hillStartAssist;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  上坡辅助
	 */
	public void setHillStartAssist(String hillStartAssist){
		this.hillStartAssist = hillStartAssist;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  自动驻车
	 */
	
	@Column(name ="AUTOMATIC_PARKING",nullable=true,length=32)
	public String getAutomaticParking(){
		return this.automaticParking;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  自动驻车
	 */
	public void setAutomaticParking(String automaticParking){
		this.automaticParking = automaticParking;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  陡坡缓降
	 */
	
	@Column(name ="HDC",nullable=true,length=32)
	public String getHdc(){
		return this.hdc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  陡坡缓降
	 */
	public void setHdc(String hdc){
		this.hdc = hdc;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  可变悬架
	 */
	
	@Column(name ="VARIABLE_SUSPENSION",nullable=true,length=32)
	public String getVariableSuspension(){
		return this.variableSuspension;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  可变悬架
	 */
	public void setVariableSuspension(String variableSuspension){
		this.variableSuspension = variableSuspension;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  空气悬架
	 */
	
	@Column(name ="AIR_SUSPENSION",nullable=true,length=32)
	public String getAirSuspension(){
		return this.airSuspension;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  空气悬架
	 */
	public void setAirSuspension(String airSuspension){
		this.airSuspension = airSuspension;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  cartId
	 */
	
	@Column(name ="CART_ID",nullable=false,length=32)
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

