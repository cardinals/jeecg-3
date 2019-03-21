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
@Table(name = "t_cart_light_config", schema = "")
@SuppressWarnings("serial")
public class TCartLightConfigEntity implements java.io.Serializable {
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
	/**近光灯远光灯*/
	@Excel(name="近光灯远光灯",width=15)
	private String lowHighLightLamps;
	/**日间行车灯*/
	@Excel(name="日间行车灯",width=15)
	private String drl;
	/**自适应远光灯*/
	@Excel(name="自适应远光灯",width=15)
	private String adaptiveHighLightLamp;
	/**自动头灯*/
	@Excel(name="自动头灯",width=15)
	private String automaticHeadlamp;
	/**转向辅助灯*/
	@Excel(name="转向辅助灯",width=15)
	private String steeringAuxiliaryLamp;
	/**转向头灯*/
	@Excel(name="转向头灯",width=15)
	private String headlight;
	/**前雾灯*/
	@Excel(name="前雾灯",width=15)
	private String frontFogLamp;
	/**大灯高度可调*/
	@Excel(name="大灯高度可调",width=15)
	private String headlampHeightAdjustable;
	/**大灯清洗装置*/
	@Excel(name="大灯清洗装置",width=15)
	private String headlampCleaningDevice;
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
	 *@return: java.lang.String  近光灯远光灯
	 */
	
	@Column(name ="LOW_HIGH_LIGHT_LAMPS",nullable=true,length=32)
	public String getLowHighLightLamps(){
		return this.lowHighLightLamps;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  近光灯远光灯
	 */
	public void setLowHighLightLamps(String lowHighLightLamps){
		this.lowHighLightLamps = lowHighLightLamps;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  日间行车灯
	 */
	
	@Column(name ="DRL",nullable=true,length=32)
	public String getDrl(){
		return this.drl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  日间行车灯
	 */
	public void setDrl(String drl){
		this.drl = drl;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  自适应远光灯
	 */
	
	@Column(name ="ADAPTIVE_HIGH_LIGHT_LAMP",nullable=true,length=32)
	public String getAdaptiveHighLightLamp(){
		return this.adaptiveHighLightLamp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  自适应远光灯
	 */
	public void setAdaptiveHighLightLamp(String adaptiveHighLightLamp){
		this.adaptiveHighLightLamp = adaptiveHighLightLamp;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  自动头灯
	 */
	
	@Column(name ="AUTOMATIC_HEADLAMP",nullable=true,length=32)
	public String getAutomaticHeadlamp(){
		return this.automaticHeadlamp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  自动头灯
	 */
	public void setAutomaticHeadlamp(String automaticHeadlamp){
		this.automaticHeadlamp = automaticHeadlamp;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转向辅助灯
	 */
	
	@Column(name ="STEERING_AUXILIARY_LAMP",nullable=true,length=32)
	public String getSteeringAuxiliaryLamp(){
		return this.steeringAuxiliaryLamp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转向辅助灯
	 */
	public void setSteeringAuxiliaryLamp(String steeringAuxiliaryLamp){
		this.steeringAuxiliaryLamp = steeringAuxiliaryLamp;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  转向头灯
	 */
	
	@Column(name ="HEADLIGHT",nullable=true,length=32)
	public String getHeadlight(){
		return this.headlight;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  转向头灯
	 */
	public void setHeadlight(String headlight){
		this.headlight = headlight;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  前雾灯
	 */
	
	@Column(name ="FRONT_FOG_LAMP",nullable=true,length=32)
	public String getFrontFogLamp(){
		return this.frontFogLamp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前雾灯
	 */
	public void setFrontFogLamp(String frontFogLamp){
		this.frontFogLamp = frontFogLamp;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  大灯高度可调
	 */
	
	@Column(name ="HEADLAMP_HEIGHT_ADJUSTABLE",nullable=true,length=32)
	public String getHeadlampHeightAdjustable(){
		return this.headlampHeightAdjustable;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  大灯高度可调
	 */
	public void setHeadlampHeightAdjustable(String headlampHeightAdjustable){
		this.headlampHeightAdjustable = headlampHeightAdjustable;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  大灯清洗装置
	 */
	
	@Column(name ="HEADLAMP_CLEANING_DEVICE",nullable=true,length=32)
	public String getHeadlampCleaningDevice(){
		return this.headlampCleaningDevice;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  大灯清洗装置
	 */
	public void setHeadlampCleaningDevice(String headlampCleaningDevice){
		this.headlampCleaningDevice = headlampCleaningDevice;
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

