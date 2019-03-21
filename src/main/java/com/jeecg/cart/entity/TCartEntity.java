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
@Table(name = "t_cart", schema = "")
@SuppressWarnings("serial")
public class TCartEntity implements java.io.Serializable {
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
	/**车辆名称*/
	@Excel(name="车辆名称",width=15)
	private String name;
	/**车牌时间*/
	@Excel(name="车牌时间",width=15,format = "yyyy-MM-dd")
	private Date cartBrandTime;
	/**归属地*/
	@Excel(name="归属地",width=15)
	private String qCellCore;
	/**所在地*/
	@Excel(name="所在地",width=15)
	private String locationAddr;
	/**排放标准*/
	@Excel(name="排放标准",width=15)
	private String emissionStandard;
	/**颜色*/
	@Excel(name="颜色",width=15)
	private String color;
	/**里程数*/
	@Excel(name="里程数",width=15)
	private String mileage;
	/**价格*/
	@Excel(name="价格",width=15)
	private Double price;
	/**新车价格*/
	@Excel(name="新车价格",width=15)
	private String newPrice;
	/**首付价格*/
	@Excel(name="首付价格",width=15)
	private Double downPayments;
	/**月供*/
	@Excel(name="月供",width=15)
	private Double monthlySupply;
	/**排量*/
	@Excel(name="排量",width=15)
	private String displacement;
	/**变速箱*/
	@Excel(name="变速箱",width=15)
	private String gearBox;
	
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
	 *@return: java.lang.String  车辆名称
	 */
	
	@Column(name ="NAME",nullable=false,length=150)
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车辆名称
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  车牌时间
	 */
	
	@Column(name ="CART_BRAND_TIME",nullable=false,length=32)
	public Date getCartBrandTime(){
		return this.cartBrandTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  车牌时间
	 */
	public void setCartBrandTime(Date cartBrandTime){
		this.cartBrandTime = cartBrandTime;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  归属地
	 */
	
	@Column(name ="Q_CELL_CORE",nullable=true,length=32)
	public String getQCellCore(){
		return this.qCellCore;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  归属地
	 */
	public void setQCellCore(String qCellCore){
		this.qCellCore = qCellCore;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所在地
	 */
	
	@Column(name ="LOCATION_ADDR",nullable=false,length=32)
	public String getLocationAddr(){
		return this.locationAddr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所在地
	 */
	public void setLocationAddr(String locationAddr){
		this.locationAddr = locationAddr;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  排放标准
	 */
	
	@Column(name ="EMISSION_STANDARD",nullable=false,length=32)
	public String getEmissionStandard(){
		return this.emissionStandard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  排放标准
	 */
	public void setEmissionStandard(String emissionStandard){
		this.emissionStandard = emissionStandard;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  颜色
	 */
	
	@Column(name ="COLOR",nullable=false,length=32)
	public String getColor(){
		return this.color;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  颜色
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  里程数
	 */
	
	@Column(name ="MILEAGE",nullable=false,length=32)
	public String getMileage(){
		return this.mileage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  里程数
	 */
	public void setMileage(String mileage){
		this.mileage = mileage;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  价格
	 */
	
	@Column(name ="PRICE",nullable=false,scale=2,length=10)
	public Double getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  价格
	 */
	public void setPrice(Double price){
		this.price = price;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  新车价格
	 */
	
	@Column(name ="NEW_PRICE",nullable=false,length=32)
	public String getNewPrice(){
		return this.newPrice;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  新车价格
	 */
	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  首付价格
	 */
	
	@Column(name ="DOWN_PAYMENTS",nullable=false,scale=1,length=10)
	public Double getDownPayments(){
		return this.downPayments;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  首付价格
	 */
	public void setDownPayments(Double downPayments){
		this.downPayments = downPayments;
	}
	
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  月供
	 */
	
	@Column(name ="MONTHLY_SUPPLY",nullable=false,scale=2,length=10)
	public Double getMonthlySupply(){
		return this.monthlySupply;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  月供
	 */
	public void setMonthlySupply(Double monthlySupply){
		this.monthlySupply = monthlySupply;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  排量
	 */
	
	@Column(name ="DISPLACEMENT",nullable=false,length=32)
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
	 *@return: java.lang.String  变速箱
	 */
	
	@Column(name ="GEAR_BOX",nullable=false,length=100)
	public String getGearBox(){
		return this.gearBox;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  变速箱
	 */
	public void setGearBox(String gearBox){
		this.gearBox = gearBox;
	}
	
}
