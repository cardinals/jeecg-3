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
@Table(name = "t_cart_external_config", schema = "")
@SuppressWarnings("serial")
public class TCartExternalConfigEntity implements java.io.Serializable {
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
	/**电动天窗*/
	@Excel(name="电动天窗",width=15)
	private String electricSkylight;
	/**全景天窗*/
	@Excel(name="全景天窗",width=15)
	private String panoramicSunroof;
	/**运动外观套件*/
	@Excel(name="运动外观套件",width=15)
	private String sportsAppearanceKit;
	/**铝合金轮圈*/
	@Excel(name="铝合金轮圈",width=15)
	private String aluminumAlloyWheels;
	/**电动吸合门*/
	@Excel(name="电动吸合门",width=15)
	private String electricSuctionDoor;
	/**侧滑门*/
	@Excel(name="侧滑门",width=15)
	private String sideslipDoor;
	/**电动后备厢*/
	@Excel(name="电动后备厢",width=15)
	private String electricTrunk;
	/**感应后备厢*/
	@Excel(name="感应后备厢",width=15)
	private String inductionTrunk;
	/**车顶行李架*/
	@Excel(name="车顶行李架",width=15)
	private String roofLuggageRack;
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
	 *@return: java.lang.String  电动天窗
	 */
	
	@Column(name ="ELECTRIC_SKYLIGHT",nullable=true,length=32)
	public String getElectricSkylight(){
		return this.electricSkylight;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电动天窗
	 */
	public void setElectricSkylight(String electricSkylight){
		this.electricSkylight = electricSkylight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  全景天窗
	 */
	
	@Column(name ="PANORAMIC_SUNROOF",nullable=true,length=32)
	public String getPanoramicSunroof(){
		return this.panoramicSunroof;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  全景天窗
	 */
	public void setPanoramicSunroof(String panoramicSunroof){
		this.panoramicSunroof = panoramicSunroof;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  运动外观套件
	 */
	
	@Column(name ="SPORTS_APPEARANCE_KIT",nullable=true,length=32)
	public String getSportsAppearanceKit(){
		return this.sportsAppearanceKit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  运动外观套件
	 */
	public void setSportsAppearanceKit(String sportsAppearanceKit){
		this.sportsAppearanceKit = sportsAppearanceKit;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  铝合金轮圈
	 */
	
	@Column(name ="ALUMINUM_ALLOY_WHEELS",nullable=true,length=32)
	public String getAluminumAlloyWheels(){
		return this.aluminumAlloyWheels;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  铝合金轮圈
	 */
	public void setAluminumAlloyWheels(String aluminumAlloyWheels){
		this.aluminumAlloyWheels = aluminumAlloyWheels;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  电动吸合门
	 */
	
	@Column(name ="ELECTRIC_SUCTION_DOOR",nullable=true,length=32)
	public String getElectricSuctionDoor(){
		return this.electricSuctionDoor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电动吸合门
	 */
	public void setElectricSuctionDoor(String electricSuctionDoor){
		this.electricSuctionDoor = electricSuctionDoor;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  侧滑门
	 */
	
	@Column(name ="SIDESLIP_DOOR",nullable=true,length=32)
	public String getSideslipDoor(){
		return this.sideslipDoor;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  侧滑门
	 */
	public void setSideslipDoor(String sideslipDoor){
		this.sideslipDoor = sideslipDoor;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  电动后备厢
	 */
	
	@Column(name ="ELECTRIC_TRUNK",nullable=true,length=32)
	public String getElectricTrunk(){
		return this.electricTrunk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  电动后备厢
	 */
	public void setElectricTrunk(String electricTrunk){
		this.electricTrunk = electricTrunk;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  感应后备厢
	 */
	
	@Column(name ="INDUCTION_TRUNK",nullable=true,length=32)
	public String getInductionTrunk(){
		return this.inductionTrunk;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  感应后备厢
	 */
	public void setInductionTrunk(String inductionTrunk){
		this.inductionTrunk = inductionTrunk;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车顶行李架
	 */
	
	@Column(name ="ROOF_LUGGAGE_RACK",nullable=true,length=32)
	public String getRoofLuggageRack(){
		return this.roofLuggageRack;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车顶行李架
	 */
	public void setRoofLuggageRack(String roofLuggageRack){
		this.roofLuggageRack = roofLuggageRack;
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

