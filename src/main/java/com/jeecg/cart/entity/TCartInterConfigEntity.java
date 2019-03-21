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
@Table(name = "t_cart_inter_config", schema = "")
@SuppressWarnings("serial")
public class TCartInterConfigEntity implements java.io.Serializable {
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
	/**真皮方向盘*/
	@Excel(name="真皮方向盘",width=15)
	private String leatherSteeringWheel;
	/**方向盘调节*/
	@Excel(name="方向盘调节",width=15)
	private String steeringWheelAdjustment;
	/**方向盘电动调节*/
	@Excel(name="方向盘电动调节",width=15)
	private String steeringElectricRegulation;
	/**多功能方向盘*/
	@Excel(name="多功能方向盘",width=15)
	private String multifunctionalSteeringWheel;
	/**方向盘换挡*/
	@Excel(name="方向盘换挡",width=15)
	private String steeringWheelShift;
	/**方向盘加热*/
	@Excel(name="方向盘加热",width=15)
	private String steeringWheelHeating;
	/**定速巡航*/
	@Excel(name="定速巡航",width=15)
	private String cruiseControl;
	/**前后驻车雷达*/
	@Excel(name="前后驻车雷达",width=15)
	private String frontBackParkingRadar;
	/**倒车视频影像*/
	@Excel(name="倒车视频影像",width=15)
	private String reversingVideoImage;
	/**行车电脑显示屏*/
	@Excel(name="行车电脑显示屏",width=15)
	private String drivingComputerDisplay;
	/**全液晶仪表盘*/
	@Excel(name="全液晶仪表盘",width=15)
	private String allLiquidCrystalDashboard;
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
	 *@return: java.lang.String  真皮方向盘
	 */
	
	@Column(name ="LEATHER_STEERING_WHEEL",nullable=true,length=32)
	public String getLeatherSteeringWheel(){
		return this.leatherSteeringWheel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  真皮方向盘
	 */
	public void setLeatherSteeringWheel(String leatherSteeringWheel){
		this.leatherSteeringWheel = leatherSteeringWheel;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  方向盘调节
	 */
	
	@Column(name ="STEERING_WHEEL_ADJUSTMENT",nullable=true,length=32)
	public String getSteeringWheelAdjustment(){
		return this.steeringWheelAdjustment;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  方向盘调节
	 */
	public void setSteeringWheelAdjustment(String steeringWheelAdjustment){
		this.steeringWheelAdjustment = steeringWheelAdjustment;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  方向盘电动调节
	 */
	
	@Column(name ="STEERING_ELECTRIC_REGULATION",nullable=true,length=32)
	public String getSteeringElectricRegulation(){
		return this.steeringElectricRegulation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  方向盘电动调节
	 */
	public void setSteeringElectricRegulation(String steeringElectricRegulation){
		this.steeringElectricRegulation = steeringElectricRegulation;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  多功能方向盘
	 */
	
	@Column(name ="MULTIFUNCTIONAL_STEERING_WHEEL",nullable=true,length=32)
	public String getMultifunctionalSteeringWheel(){
		return this.multifunctionalSteeringWheel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  多功能方向盘
	 */
	public void setMultifunctionalSteeringWheel(String multifunctionalSteeringWheel){
		this.multifunctionalSteeringWheel = multifunctionalSteeringWheel;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  方向盘换挡
	 */
	
	@Column(name ="STEERING_WHEEL_SHIFT",nullable=true,length=32)
	public String getSteeringWheelShift(){
		return this.steeringWheelShift;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  方向盘换挡
	 */
	public void setSteeringWheelShift(String steeringWheelShift){
		this.steeringWheelShift = steeringWheelShift;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  方向盘加热
	 */
	
	@Column(name ="STEERING_WHEEL_HEATING",nullable=true,length=32)
	public String getSteeringWheelHeating(){
		return this.steeringWheelHeating;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  方向盘加热
	 */
	public void setSteeringWheelHeating(String steeringWheelHeating){
		this.steeringWheelHeating = steeringWheelHeating;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  定速巡航
	 */
	
	@Column(name ="CRUISE_CONTROL",nullable=true,length=32)
	public String getCruiseControl(){
		return this.cruiseControl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  定速巡航
	 */
	public void setCruiseControl(String cruiseControl){
		this.cruiseControl = cruiseControl;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前后驻车雷达
	 */
	
	@Column(name ="FRONT_BACK_PARKING_RADAR",nullable=true,length=32)
	public String getFrontBackParkingRadar(){
		return this.frontBackParkingRadar;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前后驻车雷达
	 */
	public void setFrontBackParkingRadar(String frontBackParkingRadar){
		this.frontBackParkingRadar = frontBackParkingRadar;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  倒车视频影像
	 */
	
	@Column(name ="REVERSING_VIDEO_IMAGE",nullable=true,length=32)
	public String getReversingVideoImage(){
		return this.reversingVideoImage;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  倒车视频影像
	 */
	public void setReversingVideoImage(String reversingVideoImage){
		this.reversingVideoImage = reversingVideoImage;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  行车电脑显示屏
	 */
	
	@Column(name ="DRIVING_COMPUTER_DISPLAY",nullable=true,length=32)
	public String getDrivingComputerDisplay(){
		return this.drivingComputerDisplay;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  行车电脑显示屏
	 */
	public void setDrivingComputerDisplay(String drivingComputerDisplay){
		this.drivingComputerDisplay = drivingComputerDisplay;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  全液晶仪表盘
	 */
	
	@Column(name ="ALL_LIQUID_CRYSTAL_DASHBOARD",nullable=true,length=32)
	public String getAllLiquidCrystalDashboard(){
		return this.allLiquidCrystalDashboard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  全液晶仪表盘
	 */
	public void setAllLiquidCrystalDashboard(String allLiquidCrystalDashboard){
		this.allLiquidCrystalDashboard = allLiquidCrystalDashboard;
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

