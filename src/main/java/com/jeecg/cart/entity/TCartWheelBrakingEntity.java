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
@Table(name = "t_cart_wheel_braking", schema = "")
@SuppressWarnings("serial")
public class TCartWheelBrakingEntity implements java.io.Serializable {
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
	/**前制动器类型*/
	@Excel(name="前制动器类型",width=15)
	private String frontBrakeType;
	/**后制动器类型*/
	@Excel(name="后制动器类型",width=15)
	private String rearBrakeType;
	/**驻车自动类型*/
	@Excel(name="驻车自动类型",width=15)
	private String parkingAutomationType;
	/**前轮胎规格*/
	@Excel(name="前轮胎规格",width=15)
	private String frontTireSpecification;
	/**后轮胎类型*/
	@Excel(name="后轮胎类型",width=15)
	private String rearTireType;
	/**备胎规格*/
	@Excel(name="备胎规格",width=15)
	private String spareTireSpecification;
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
	 *@return: java.lang.String  前制动器类型
	 */
	
	@Column(name ="FRONT_BRAKE_TYPE",nullable=true,length=32)
	public String getFrontBrakeType(){
		return this.frontBrakeType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前制动器类型
	 */
	public void setFrontBrakeType(String frontBrakeType){
		this.frontBrakeType = frontBrakeType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后制动器类型
	 */
	
	@Column(name ="REAR_BRAKE_TYPE",nullable=true,length=32)
	public String getRearBrakeType(){
		return this.rearBrakeType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后制动器类型
	 */
	public void setRearBrakeType(String rearBrakeType){
		this.rearBrakeType = rearBrakeType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  驻车自动类型
	 */
	
	@Column(name ="PARKING_AUTOMATION_TYPE",nullable=true,length=32)
	public String getParkingAutomationType(){
		return this.parkingAutomationType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  驻车自动类型
	 */
	public void setParkingAutomationType(String parkingAutomationType){
		this.parkingAutomationType = parkingAutomationType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前轮胎规格
	 */
	
	@Column(name ="FRONT_TIRE_SPECIFICATION",nullable=true,length=32)
	public String getFrontTireSpecification(){
		return this.frontTireSpecification;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前轮胎规格
	 */
	public void setFrontTireSpecification(String frontTireSpecification){
		this.frontTireSpecification = frontTireSpecification;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后轮胎类型
	 */
	
	@Column(name ="REAR_TIRE_TYPE",nullable=true,length=32)
	public String getRearTireType(){
		return this.rearTireType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后轮胎类型
	 */
	public void setRearTireType(String rearTireType){
		this.rearTireType = rearTireType;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备胎规格
	 */
	
	@Column(name ="SPARE_TIRE_SPECIFICATION",nullable=true,length=32)
	public String getSpareTireSpecification(){
		return this.spareTireSpecification;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备胎规格
	 */
	public void setSpareTireSpecification(String spareTireSpecification){
		this.spareTireSpecification = spareTireSpecification;
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

