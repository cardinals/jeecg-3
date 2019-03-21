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
@Table(name = "t_cart_glass_rearview_mirror", schema = "")
@SuppressWarnings("serial")
public class TCartGlassRearviewMirrorEntity implements java.io.Serializable {
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
	/**前后电动车窗*/
	@Excel(name="前后电动车窗",width=15)
	private String frontRearElectricWindow;
	/**车窗防夹手功能*/
	@Excel(name="车窗防夹手功能",width=15)
	private String antiClipFunctionWindow;
	/**后视镜电动调节*/
	@Excel(name="后视镜电动调节",width=15)
	private String rearviewMirror;
	/**后视镜加热*/
	@Excel(name="后视镜加热",width=15)
	private String rearviewMirrorHeating;
	/**内外后视镜自动防眩目*/
	@Excel(name="内外后视镜自动防眩目",width=15)
	private String autoInsideOutsideRearview;
	/**后视镜电动折叠*/
	@Excel(name="后视镜电动折叠",width=15)
	private String electricFoldingMirror;
	/**遮阳板化妆镜*/
	@Excel(name="遮阳板化妆镜",width=15)
	private String sunshadeMakeupMirror;
	/**后雨刷*/
	@Excel(name="后雨刷",width=15)
	private String rearWiper;
	/**感应雨刷*/
	@Excel(name="感应雨刷",width=15)
	private String inductionWiper;
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
	 *@return: java.lang.String  前后电动车窗
	 */
	
	@Column(name ="FRONT_REAR_ELECTRIC_WINDOW",nullable=true,length=32)
	public String getFrontRearElectricWindow(){
		return this.frontRearElectricWindow;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  前后电动车窗
	 */
	public void setFrontRearElectricWindow(String frontRearElectricWindow){
		this.frontRearElectricWindow = frontRearElectricWindow;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  车窗防夹手功能
	 */
	
	@Column(name ="ANTI_CLIP_FUNCTION_WINDOW",nullable=true,length=32)
	public String getAntiClipFunctionWindow(){
		return this.antiClipFunctionWindow;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  车窗防夹手功能
	 */
	public void setAntiClipFunctionWindow(String antiClipFunctionWindow){
		this.antiClipFunctionWindow = antiClipFunctionWindow;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后视镜电动调节
	 */
	
	@Column(name ="REARVIEW_MIRROR",nullable=true,length=32)
	public String getRearviewMirror(){
		return this.rearviewMirror;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后视镜电动调节
	 */
	public void setRearviewMirror(String rearviewMirror){
		this.rearviewMirror = rearviewMirror;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后视镜加热
	 */
	
	@Column(name ="REARVIEW_MIRROR_HEATING",nullable=true,length=32)
	public String getRearviewMirrorHeating(){
		return this.rearviewMirrorHeating;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后视镜加热
	 */
	public void setRearviewMirrorHeating(String rearviewMirrorHeating){
		this.rearviewMirrorHeating = rearviewMirrorHeating;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  内外后视镜自动防眩目
	 */
	
	@Column(name ="AUTO_INSIDE_OUTSIDE_REARVIEW",nullable=true,length=32)
	public String getAutoInsideOutsideRearview(){
		return this.autoInsideOutsideRearview;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  内外后视镜自动防眩目
	 */
	public void setAutoInsideOutsideRearview(String autoInsideOutsideRearview){
		this.autoInsideOutsideRearview = autoInsideOutsideRearview;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后视镜电动折叠
	 */
	
	@Column(name ="ELECTRIC_FOLDING_MIRROR",nullable=true,length=32)
	public String getElectricFoldingMirror(){
		return this.electricFoldingMirror;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后视镜电动折叠
	 */
	public void setElectricFoldingMirror(String electricFoldingMirror){
		this.electricFoldingMirror = electricFoldingMirror;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  遮阳板化妆镜
	 */
	
	@Column(name ="SUNSHADE_MAKEUP_MIRROR",nullable=true,length=32)
	public String getSunshadeMakeupMirror(){
		return this.sunshadeMakeupMirror;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  遮阳板化妆镜
	 */
	public void setSunshadeMakeupMirror(String sunshadeMakeupMirror){
		this.sunshadeMakeupMirror = sunshadeMakeupMirror;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  后雨刷
	 */
	
	@Column(name ="REAR_WIPER",nullable=true,length=32)
	public String getRearWiper(){
		return this.rearWiper;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  后雨刷
	 */
	public void setRearWiper(String rearWiper){
		this.rearWiper = rearWiper;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  感应雨刷
	 */
	
	@Column(name ="INDUCTION_WIPER",nullable=true,length=32)
	public String getInductionWiper(){
		return this.inductionWiper;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  感应雨刷
	 */
	public void setInductionWiper(String inductionWiper){
		this.inductionWiper = inductionWiper;
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

