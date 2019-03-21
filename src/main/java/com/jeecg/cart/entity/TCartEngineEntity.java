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
@Table(name = "t_cart_engine", schema = "")
@SuppressWarnings("serial")
public class TCartEngineEntity implements java.io.Serializable {
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
	/**cartId*/
	private String cartId;
	/**发动机型号*/
	@Excel(name="发动机型号",width=15)
	private String engineOdel;
	/**排量*/
	@Excel(name="排量",width=15)
	private String displacement;
	/**进气形式*/
	@Excel(name="进气形式",width=15)
	private String intakeForm;
	/**气缸排列形式*/
	@Excel(name="气缸排列形式",width=15)
	private String cylinderArrangementDorm;
	/**气缸数*/
	@Excel(name="气缸数",width=15)
	private String cylinderNum;
	/**气门数*/
	@Excel(name="气门数",width=15)
	private String cylinderDoorNumber;
	/**缸径*/
	@Excel(name="缸径",width=15)
	private String cylinderDiameter;
	/**行程*/
	@Excel(name="行程",width=15)
	private String trip;
	/**最大马力*/
	@Excel(name="最大马力",width=15)
	private String maxHorsepower;
	/**最大功率*/
	@Excel(name="最大功率",width=15)
	private String maxPower;
	/**最大功率转速*/
	@Excel(name="最大功率转速",width=15)
	private String maxPowerSpeed;
	/**最大扭矩*/
	@Excel(name="最大扭矩",width=15)
	private String maxTorque;
	/**最大扭矩转速*/
	@Excel(name="最大扭矩转速",width=15)
	private String maxTorqueSpeed;
	/**发动机特有技术*/
	@Excel(name="发动机特有技术",width=15)
	private String engineSpecificTechnology;
	/**燃料形式*/
	@Excel(name="燃料形式",width=15)
	private String fuelForm;
	/**燃油标号*/
	@Excel(name="燃油标号",width=15)
	private String fuelLabeling;
	/**供油方式*/
	@Excel(name="供油方式",width=15)
	private String fuelSupplyMode;
	/**缸盖材料*/
	@Excel(name="缸盖材料",width=15)
	private String cylinderHeadMaterial;
	/**缸体材料*/
	@Excel(name="缸体材料",width=15)
	private String cylinderBlockMaterial;
	/**环保标准*/
	@Excel(name="环保标准",width=15)
	private String environmentalStandards;
	
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
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发动机型号
	 */
	
	@Column(name ="ENGINE_ODEL",nullable=true,length=32)
	public String getEngineOdel(){
		return this.engineOdel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发动机型号
	 */
	public void setEngineOdel(String engineOdel){
		this.engineOdel = engineOdel;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  排量
	 */
	
	@Column(name ="DISPLACEMENT",nullable=true,length=32)
	public String getDisplacement(){
		return this.displacement;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  排量
	 */
	public void setDisplacement(String displacement){
		this.displacement = displacement;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  进气形式
	 */
	
	@Column(name ="INTAKE_FORM",nullable=true,length=32)
	public String getIntakeForm(){
		return this.intakeForm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  进气形式
	 */
	public void setIntakeForm(String intakeForm){
		this.intakeForm = intakeForm;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  气缸排列形式
	 */
	
	@Column(name ="CYLINDER_ARRANGEMENT_DORM",nullable=true,length=32)
	public String getCylinderArrangementDorm(){
		return this.cylinderArrangementDorm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  气缸排列形式
	 */
	public void setCylinderArrangementDorm(String cylinderArrangementDorm){
		this.cylinderArrangementDorm = cylinderArrangementDorm;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  气缸数
	 */
	
	@Column(name ="CYLINDER_NUM",nullable=true,length=32)
	public String getCylinderNum(){
		return this.cylinderNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  气缸数
	 */
	public void setCylinderNum(String cylinderNum){
		this.cylinderNum = cylinderNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  气门数
	 */
	
	@Column(name ="CYLINDER_DOOR_NUMBER",nullable=true,length=32)
	public String getCylinderDoorNumber(){
		return this.cylinderDoorNumber;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  气门数
	 */
	public void setCylinderDoorNumber(String cylinderDoorNumber){
		this.cylinderDoorNumber = cylinderDoorNumber;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缸径
	 */
	
	@Column(name ="CYLINDER_DIAMETER",nullable=true,length=32)
	public String getCylinderDiameter(){
		return this.cylinderDiameter;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缸径
	 */
	public void setCylinderDiameter(String cylinderDiameter){
		this.cylinderDiameter = cylinderDiameter;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  行程
	 */
	
	@Column(name ="TRIP",nullable=true,length=32)
	public String getTrip(){
		return this.trip;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行程
	 */
	public void setTrip(String trip){
		this.trip = trip;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最大马力
	 */
	
	@Column(name ="MAX_HORSEPOWER",nullable=true,length=32)
	public String getMaxHorsepower(){
		return this.maxHorsepower;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最大马力
	 */
	public void setMaxHorsepower(String maxHorsepower){
		this.maxHorsepower = maxHorsepower;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最大功率
	 */
	
	@Column(name ="MAX_POWER",nullable=true,length=32)
	public String getMaxPower(){
		return this.maxPower;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最大功率
	 */
	public void setMaxPower(String maxPower){
		this.maxPower = maxPower;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最大功率转速
	 */
	
	@Column(name ="MAX_POWER_SPEED",nullable=true,length=32)
	public String getMaxPowerSpeed(){
		return this.maxPowerSpeed;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最大功率转速
	 */
	public void setMaxPowerSpeed(String maxPowerSpeed){
		this.maxPowerSpeed = maxPowerSpeed;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最大扭矩
	 */
	
	@Column(name ="MAX_TORQUE",nullable=true,length=32)
	public String getMaxTorque(){
		return this.maxTorque;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最大扭矩
	 */
	public void setMaxTorque(String maxTorque){
		this.maxTorque = maxTorque;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最大扭矩转速
	 */
	
	@Column(name ="MAX_TORQUE_SPEED",nullable=true,length=32)
	public String getMaxTorqueSpeed(){
		return this.maxTorqueSpeed;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最大扭矩转速
	 */
	public void setMaxTorqueSpeed(String maxTorqueSpeed){
		this.maxTorqueSpeed = maxTorqueSpeed;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发动机特有技术
	 */
	
	@Column(name ="ENGINE_SPECIFIC_TECHNOLOGY",nullable=true,length=32)
	public String getEngineSpecificTechnology(){
		return this.engineSpecificTechnology;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发动机特有技术
	 */
	public void setEngineSpecificTechnology(String engineSpecificTechnology){
		this.engineSpecificTechnology = engineSpecificTechnology;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  燃料形式
	 */
	
	@Column(name ="FUEL_FORM",nullable=true,length=32)
	public String getFuelForm(){
		return this.fuelForm;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  燃料形式
	 */
	public void setFuelForm(String fuelForm){
		this.fuelForm = fuelForm;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  燃油标号
	 */
	
	@Column(name ="FUEL_LABELING",nullable=true,length=32)
	public String getFuelLabeling(){
		return this.fuelLabeling;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  燃油标号
	 */
	public void setFuelLabeling(String fuelLabeling){
		this.fuelLabeling = fuelLabeling;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供油方式
	 */
	
	@Column(name ="FUEL_SUPPLY_MODE",nullable=true,length=32)
	public String getFuelSupplyMode(){
		return this.fuelSupplyMode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  供油方式
	 */
	public void setFuelSupplyMode(String fuelSupplyMode){
		this.fuelSupplyMode = fuelSupplyMode;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缸盖材料
	 */
	
	@Column(name ="CYLINDER_HEAD_MATERIAL",nullable=true,length=32)
	public String getCylinderHeadMaterial(){
		return this.cylinderHeadMaterial;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缸盖材料
	 */
	public void setCylinderHeadMaterial(String cylinderHeadMaterial){
		this.cylinderHeadMaterial = cylinderHeadMaterial;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  缸体材料
	 */
	
	@Column(name ="CYLINDER_BLOCK_MATERIAL",nullable=true,length=32)
	public String getCylinderBlockMaterial(){
		return this.cylinderBlockMaterial;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  缸体材料
	 */
	public void setCylinderBlockMaterial(String cylinderBlockMaterial){
		this.cylinderBlockMaterial = cylinderBlockMaterial;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  环保标准
	 */
	
	@Column(name ="ENVIRONMENTAL_STANDARDS",nullable=true,length=32)
	public String getEnvironmentalStandards(){
		return this.environmentalStandards;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  环保标准
	 */
	public void setEnvironmentalStandards(String environmentalStandards){
		this.environmentalStandards = environmentalStandards;
	}
	
}

