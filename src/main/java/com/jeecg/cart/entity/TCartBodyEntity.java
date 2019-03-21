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
@Table(name = "t_cart_body", schema = "")
@SuppressWarnings("serial")
public class TCartBodyEntity implements java.io.Serializable {
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
	/**长度*/
	@Excel(name="长度",width=15)
	private String cartLength;
	/**宽度*/
	@Excel(name="宽度",width=15)
	private String cartWidth;
	/**高度*/
	@Excel(name="高度",width=15)
	private String cartHight;
	/**轴距*/
	@Excel(name="轴距",width=15)
	private String wheelbase;
	/**前轮距*/
	@Excel(name="前轮距",width=15)
	private String frontWheelPitch;
	/**后轮距*/
	@Excel(name="后轮距",width=15)
	private String rearWheelPitch;
	/**最小离地间隙*/
	@Excel(name="最小离地间隙",width=15)
	private String miniGround;
	/**整车质量*/
	@Excel(name="整车质量",width=15)
	private String cartFullWeight;
	/**车身结构*/
	@Excel(name="车身结构",width=15)
	private String cartStructure;
	/**车门数*/
	@Excel(name="车门数",width=15)
	private String cartDoorNum;
	/**座位数*/
	@Excel(name="座位数",width=15)
	private String cartSeatNum;
	/**邮箱容积*/
	@Excel(name="邮箱容积",width=15)
	private String tankVolume;
	/**行李箱容积*/
	@Excel(name="行李箱容积",width=15)
	private String cargoVolume;
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
	 *@return: java.lang.String  长度
	 */
	
	@Column(name ="CART_LENGTH",nullable=true,length=32)
	public String getCartLength(){
		return this.cartLength;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  长度
	 */
	public void setCartLength(String cartLength){
		this.cartLength = cartLength;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  宽度
	 */
	
	@Column(name ="CART_WIDTH",nullable=true,length=32)
	public String getCartWidth(){
		return this.cartWidth;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  宽度
	 */
	public void setCartWidth(String cartWidth){
		this.cartWidth = cartWidth;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  高度
	 */
	
	@Column(name ="CART_HIGHT",nullable=true,length=32)
	public String getCartHight(){
		return this.cartHight;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  高度
	 */
	public void setCartHight(String cartHight){
		this.cartHight = cartHight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  轴距
	 */
	
	@Column(name ="WHEELBASE",nullable=true,length=32)
	public String getWheelbase(){
		return this.wheelbase;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  轴距
	 */
	public void setWheelbase(String wheelbase){
		this.wheelbase = wheelbase;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前轮距
	 */
	
	@Column(name ="FRONT_WHEEL_PITCH",nullable=true,length=32)
	public String getFrontWheelPitch(){
		return this.frontWheelPitch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前轮距
	 */
	public void setFrontWheelPitch(String frontWheelPitch){
		this.frontWheelPitch = frontWheelPitch;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后轮距
	 */
	
	@Column(name ="REAR_WHEEL_PITCH",nullable=true,length=32)
	public String getRearWheelPitch(){
		return this.rearWheelPitch;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后轮距
	 */
	public void setRearWheelPitch(String rearWheelPitch){
		this.rearWheelPitch = rearWheelPitch;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  最小离地间隙
	 */
	
	@Column(name ="MINI_GROUND",nullable=true,length=32)
	public String getMiniGround(){
		return this.miniGround;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  最小离地间隙
	 */
	public void setMiniGround(String miniGround){
		this.miniGround = miniGround;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  整车质量
	 */
	
	@Column(name ="CART_FULL_WEIGHT",nullable=true,length=32)
	public String getCartFullWeight(){
		return this.cartFullWeight;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  整车质量
	 */
	public void setCartFullWeight(String cartFullWeight){
		this.cartFullWeight = cartFullWeight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车身结构
	 */
	
	@Column(name ="CART_STRUCTURE",nullable=true,length=32)
	public String getCartStructure(){
		return this.cartStructure;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车身结构
	 */
	public void setCartStructure(String cartStructure){
		this.cartStructure = cartStructure;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车门数
	 */
	
	@Column(name ="CART_DOOR_NUM",nullable=true,length=32)
	public String getCartDoorNum(){
		return this.cartDoorNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车门数
	 */
	public void setCartDoorNum(String cartDoorNum){
		this.cartDoorNum = cartDoorNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  座位数
	 */
	
	@Column(name ="CART_SEAT_NUM",nullable=true,length=32)
	public String getCartSeatNum(){
		return this.cartSeatNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  座位数
	 */
	public void setCartSeatNum(String cartSeatNum){
		this.cartSeatNum = cartSeatNum;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮箱容积
	 */
	
	@Column(name ="TANK_VOLUME",nullable=true,length=32)
	public String getTankVolume(){
		return this.tankVolume;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮箱容积
	 */
	public void setTankVolume(String tankVolume){
		this.tankVolume = tankVolume;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  行李箱容积
	 */
	
	@Column(name ="CARGO_VOLUME",nullable=true,length=32)
	public String getCargoVolume(){
		return this.cargoVolume;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行李箱容积
	 */
	public void setCargoVolume(String cargoVolume){
		this.cargoVolume = cargoVolume;
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

