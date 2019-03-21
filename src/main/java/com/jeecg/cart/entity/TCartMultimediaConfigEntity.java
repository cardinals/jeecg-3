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
@Table(name = "t_cart_multimedia_config", schema = "")
@SuppressWarnings("serial")
public class TCartMultimediaConfigEntity implements java.io.Serializable {
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
	/**GPS导航系统*/
	@Excel(name="GPS导航系统",width=15)
	private String gps;
	/**中控台彩色大屏*/
	@Excel(name="中控台彩色大屏",width=15)
	private String centralConsoleColourScreen;
	/**蓝牙电话*/
	@Excel(name="蓝牙电话",width=15)
	private String bluetoothTelephone;
	/**外接音源接口*/
	@Excel(name="外接音源接口",width=15)
	private String externalSourceInterface;
	/**多媒体系统*/
	@Excel(name="多媒体系统",width=15)
	private String multimediaSystem;
	/**扬声器数量*/
	@Excel(name="扬声器数量",width=15)
	private String speakersNum;
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
	 *@return: java.lang.String  GPS导航系统
	 */
	
	@Column(name ="GPS",nullable=true,length=32)
	public String getGps(){
		return this.gps;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  GPS导航系统
	 */
	public void setGps(String gps){
		this.gps = gps;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  中控台彩色大屏
	 */
	
	@Column(name ="CENTRAL_CONSOLE_COLOUR_SCREEN",nullable=true,length=32)
	public String getCentralConsoleColourScreen(){
		return this.centralConsoleColourScreen;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  中控台彩色大屏
	 */
	public void setCentralConsoleColourScreen(String centralConsoleColourScreen){
		this.centralConsoleColourScreen = centralConsoleColourScreen;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  蓝牙电话
	 */
	
	@Column(name ="BLUETOOTH_TELEPHONE",nullable=true,length=32)
	public String getBluetoothTelephone(){
		return this.bluetoothTelephone;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  蓝牙电话
	 */
	public void setBluetoothTelephone(String bluetoothTelephone){
		this.bluetoothTelephone = bluetoothTelephone;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  外接音源接口
	 */
	
	@Column(name ="EXTERNAL_SOURCE_INTERFACE",nullable=true,length=32)
	public String getExternalSourceInterface(){
		return this.externalSourceInterface;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  外接音源接口
	 */
	public void setExternalSourceInterface(String externalSourceInterface){
		this.externalSourceInterface = externalSourceInterface;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  多媒体系统
	 */
	
	@Column(name ="MULTIMEDIA_SYSTEM",nullable=true,length=32)
	public String getMultimediaSystem(){
		return this.multimediaSystem;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  多媒体系统
	 */
	public void setMultimediaSystem(String multimediaSystem){
		this.multimediaSystem = multimediaSystem;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扬声器数量
	 */
	
	@Column(name ="SPEAKERS_NUM",nullable=true,length=32)
	public String getSpeakersNum(){
		return this.speakersNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扬声器数量
	 */
	public void setSpeakersNum(String speakersNum){
		this.speakersNum = speakersNum;
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

