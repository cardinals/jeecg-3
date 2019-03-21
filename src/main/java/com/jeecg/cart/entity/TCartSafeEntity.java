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
@Table(name = "t_cart_safe", schema = "")
@SuppressWarnings("serial")
public class TCartSafeEntity implements java.io.Serializable {
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
	/**主副驾驶安全气囊*/
	@Excel(name="主副驾驶安全气囊",width=15)
	private String mainCoPilotAirbags;
	/**前后排侧气囊*/
	@Excel(name="前后排侧气囊",width=15)
	private String anteriorLateralBalloon;
	/**前后排头部气囊*/
	@Excel(name="前后排头部气囊",width=15)
	private String frontBackRowHeadBalloon;
	/**膝部气囊*/
	@Excel(name="膝部气囊",width=15)
	private String kneeAirbag;
	/**胎压监测装置*/
	@Excel(name="胎压监测装置",width=15)
	private String tirePressureMonitoring;
	/**零胎压继续行驶*/
	@Excel(name="零胎压继续行驶",width=15)
	private String zeroTirePressureToContinue;
	/**安全带未息提示*/
	@Excel(name="安全带未息提示",width=15)
	private String seatbeltHint;
	/**ISOFIX儿童座椅接口*/
	@Excel(name="ISOFIX儿童座椅接口",width=15)
	private String isofix;
	/**发动起电子防盗*/
	@Excel(name="发动起电子防盗",width=15)
	private String launchElectronicAntiTheft;
	/**车内中控锁*/
	@Excel(name="车内中控锁",width=15)
	private String inCarCentralControlLock;
	/**遥控钥匙*/
	@Excel(name="遥控钥匙",width=15)
	private String remoteKey;
	/**无钥匙启动系统*/
	@Excel(name="无钥匙启动系统",width=15)
	private String keylessStartupSystem;
	/**无钥匙进入系统*/
	@Excel(name="无钥匙进入系统",width=15)
	private String keylessAccessSystem;
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
	 *@return: java.lang.String  主副驾驶安全气囊
	 */
	
	@Column(name ="MAIN_CO_PILOT_AIRBAGS",nullable=true,length=32)
	public String getMainCoPilotAirbags(){
		return this.mainCoPilotAirbags;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主副驾驶安全气囊
	 */
	public void setMainCoPilotAirbags(String mainCoPilotAirbags){
		this.mainCoPilotAirbags = mainCoPilotAirbags;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前后排侧气囊
	 */
	
	@Column(name ="ANTERIOR_LATERAL_BALLOON",nullable=true,length=32)
	public String getAnteriorLateralBalloon(){
		return this.anteriorLateralBalloon;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前后排侧气囊
	 */
	public void setAnteriorLateralBalloon(String anteriorLateralBalloon){
		this.anteriorLateralBalloon = anteriorLateralBalloon;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前后排头部气囊
	 */
	
	@Column(name ="FRONT_BACK_ROW_HEAD_BALLOON",nullable=true,length=32)
	public String getFrontBackRowHeadBalloon(){
		return this.frontBackRowHeadBalloon;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前后排头部气囊
	 */
	public void setFrontBackRowHeadBalloon(String frontBackRowHeadBalloon){
		this.frontBackRowHeadBalloon = frontBackRowHeadBalloon;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  膝部气囊
	 */
	
	@Column(name ="KNEE_AIRBAG",nullable=true,length=32)
	public String getKneeAirbag(){
		return this.kneeAirbag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  膝部气囊
	 */
	public void setKneeAirbag(String kneeAirbag){
		this.kneeAirbag = kneeAirbag;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  胎压监测装置
	 */
	
	@Column(name ="TIRE_PRESSURE_MONITORING",nullable=true,length=32)
	public String getTirePressureMonitoring(){
		return this.tirePressureMonitoring;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  胎压监测装置
	 */
	public void setTirePressureMonitoring(String tirePressureMonitoring){
		this.tirePressureMonitoring = tirePressureMonitoring;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  零胎压继续行驶
	 */
	
	@Column(name ="ZERO_TIRE_PRESSURE_TO_CONTINUE",nullable=true,length=32)
	public String getZeroTirePressureToContinue(){
		return this.zeroTirePressureToContinue;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  零胎压继续行驶
	 */
	public void setZeroTirePressureToContinue(String zeroTirePressureToContinue){
		this.zeroTirePressureToContinue = zeroTirePressureToContinue;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  安全带未息提示
	 */
	
	@Column(name ="SEATBELT_HINT",nullable=true,length=32)
	public String getSeatbeltHint(){
		return this.seatbeltHint;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  安全带未息提示
	 */
	public void setSeatbeltHint(String seatbeltHint){
		this.seatbeltHint = seatbeltHint;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  ISOFIX儿童座椅接口
	 */
	
	@Column(name ="ISOFIX",nullable=true,length=32)
	public String getIsofix(){
		return this.isofix;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ISOFIX儿童座椅接口
	 */
	public void setIsofix(String isofix){
		this.isofix = isofix;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发动起电子防盗
	 */
	
	@Column(name ="LAUNCH_ELECTRONIC_ANTI_THEFT",nullable=true,length=32)
	public String getLaunchElectronicAntiTheft(){
		return this.launchElectronicAntiTheft;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发动起电子防盗
	 */
	public void setLaunchElectronicAntiTheft(String launchElectronicAntiTheft){
		this.launchElectronicAntiTheft = launchElectronicAntiTheft;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车内中控锁
	 */
	
	@Column(name ="IN_CAR_CENTRAL_CONTROL_LOCK",nullable=true,length=32)
	public String getInCarCentralControlLock(){
		return this.inCarCentralControlLock;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车内中控锁
	 */
	public void setInCarCentralControlLock(String inCarCentralControlLock){
		this.inCarCentralControlLock = inCarCentralControlLock;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  遥控钥匙
	 */
	
	@Column(name ="REMOTE_KEY",nullable=true,length=32)
	public String getRemoteKey(){
		return this.remoteKey;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  遥控钥匙
	 */
	public void setRemoteKey(String remoteKey){
		this.remoteKey = remoteKey;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  无钥匙启动系统
	 */
	
	@Column(name ="KEYLESS_STARTUP_SYSTEM",nullable=true,length=32)
	public String getKeylessStartupSystem(){
		return this.keylessStartupSystem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  无钥匙启动系统
	 */
	public void setKeylessStartupSystem(String keylessStartupSystem){
		this.keylessStartupSystem = keylessStartupSystem;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  无钥匙进入系统
	 */
	
	@Column(name ="KEYLESS_ACCESS_SYSTEM",nullable=true,length=32)
	public String getKeylessAccessSystem(){
		return this.keylessAccessSystem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  无钥匙进入系统
	 */
	public void setKeylessAccessSystem(String keylessAccessSystem){
		this.keylessAccessSystem = keylessAccessSystem;
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

