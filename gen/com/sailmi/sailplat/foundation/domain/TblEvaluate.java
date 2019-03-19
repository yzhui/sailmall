package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblEvaluate generated by hbm2java
 */
@Entity
@Table(name = "tbl_evaluate", catalog = "sailplat")
public class TblEvaluate implements java.io.Serializable {

	private Long id;
	private TblGoods tblGoods;
	private TblOrderform tblOrderform;
	private TblUser tblUserByEvaluateSellerUserId;
	private TblUser tblUserByEvaluateUserId;
	private Date addTime;
	private boolean deleteStatus;
	private String evaluateAdminInfo;
	private int evaluateBuyerVal;
	private String evaluateInfo;
	private String evaluateSellerInfo;
	private Date evaluateSellerTime;
	private int evaluateSellerVal;
	private int evaluateStatus;
	private String evaluateType;
	private String goodsSpec;
	private BigDecimal descriptionEvaluate;
	private BigDecimal serviceEvaluate;
	private BigDecimal shipEvaluate;

	public TblEvaluate() {
	}

	public TblEvaluate(boolean deleteStatus, int evaluateBuyerVal, int evaluateSellerVal, int evaluateStatus) {
		this.deleteStatus = deleteStatus;
		this.evaluateBuyerVal = evaluateBuyerVal;
		this.evaluateSellerVal = evaluateSellerVal;
		this.evaluateStatus = evaluateStatus;
	}

	public TblEvaluate(TblGoods tblGoods, TblOrderform tblOrderform, TblUser tblUserByEvaluateSellerUserId,
			TblUser tblUserByEvaluateUserId, Date addTime, boolean deleteStatus, String evaluateAdminInfo,
			int evaluateBuyerVal, String evaluateInfo, String evaluateSellerInfo, Date evaluateSellerTime,
			int evaluateSellerVal, int evaluateStatus, String evaluateType, String goodsSpec,
			BigDecimal descriptionEvaluate, BigDecimal serviceEvaluate, BigDecimal shipEvaluate) {
		this.tblGoods = tblGoods;
		this.tblOrderform = tblOrderform;
		this.tblUserByEvaluateSellerUserId = tblUserByEvaluateSellerUserId;
		this.tblUserByEvaluateUserId = tblUserByEvaluateUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.evaluateAdminInfo = evaluateAdminInfo;
		this.evaluateBuyerVal = evaluateBuyerVal;
		this.evaluateInfo = evaluateInfo;
		this.evaluateSellerInfo = evaluateSellerInfo;
		this.evaluateSellerTime = evaluateSellerTime;
		this.evaluateSellerVal = evaluateSellerVal;
		this.evaluateStatus = evaluateStatus;
		this.evaluateType = evaluateType;
		this.goodsSpec = goodsSpec;
		this.descriptionEvaluate = descriptionEvaluate;
		this.serviceEvaluate = serviceEvaluate;
		this.shipEvaluate = shipEvaluate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluate_goods_id")
	public TblGoods getTblGoods() {
		return this.tblGoods;
	}

	public void setTblGoods(TblGoods tblGoods) {
		this.tblGoods = tblGoods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "of_id")
	public TblOrderform getTblOrderform() {
		return this.tblOrderform;
	}

	public void setTblOrderform(TblOrderform tblOrderform) {
		this.tblOrderform = tblOrderform;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluate_seller_user_id")
	public TblUser getTblUserByEvaluateSellerUserId() {
		return this.tblUserByEvaluateSellerUserId;
	}

	public void setTblUserByEvaluateSellerUserId(TblUser tblUserByEvaluateSellerUserId) {
		this.tblUserByEvaluateSellerUserId = tblUserByEvaluateSellerUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "evaluate_user_id")
	public TblUser getTblUserByEvaluateUserId() {
		return this.tblUserByEvaluateUserId;
	}

	public void setTblUserByEvaluateUserId(TblUser tblUserByEvaluateUserId) {
		this.tblUserByEvaluateUserId = tblUserByEvaluateUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "deleteStatus", nullable = false)
	public boolean isDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	@Column(name = "evaluate_admin_info")
	public String getEvaluateAdminInfo() {
		return this.evaluateAdminInfo;
	}

	public void setEvaluateAdminInfo(String evaluateAdminInfo) {
		this.evaluateAdminInfo = evaluateAdminInfo;
	}

	@Column(name = "evaluate_buyer_val", nullable = false)
	public int getEvaluateBuyerVal() {
		return this.evaluateBuyerVal;
	}

	public void setEvaluateBuyerVal(int evaluateBuyerVal) {
		this.evaluateBuyerVal = evaluateBuyerVal;
	}

	@Column(name = "evaluate_info")
	public String getEvaluateInfo() {
		return this.evaluateInfo;
	}

	public void setEvaluateInfo(String evaluateInfo) {
		this.evaluateInfo = evaluateInfo;
	}

	@Column(name = "evaluate_seller_info")
	public String getEvaluateSellerInfo() {
		return this.evaluateSellerInfo;
	}

	public void setEvaluateSellerInfo(String evaluateSellerInfo) {
		this.evaluateSellerInfo = evaluateSellerInfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "evaluate_seller_time", length = 19)
	public Date getEvaluateSellerTime() {
		return this.evaluateSellerTime;
	}

	public void setEvaluateSellerTime(Date evaluateSellerTime) {
		this.evaluateSellerTime = evaluateSellerTime;
	}

	@Column(name = "evaluate_seller_val", nullable = false)
	public int getEvaluateSellerVal() {
		return this.evaluateSellerVal;
	}

	public void setEvaluateSellerVal(int evaluateSellerVal) {
		this.evaluateSellerVal = evaluateSellerVal;
	}

	@Column(name = "evaluate_status", nullable = false)
	public int getEvaluateStatus() {
		return this.evaluateStatus;
	}

	public void setEvaluateStatus(int evaluateStatus) {
		this.evaluateStatus = evaluateStatus;
	}

	@Column(name = "evaluate_type")
	public String getEvaluateType() {
		return this.evaluateType;
	}

	public void setEvaluateType(String evaluateType) {
		this.evaluateType = evaluateType;
	}

	@Column(name = "goods_spec")
	public String getGoodsSpec() {
		return this.goodsSpec;
	}

	public void setGoodsSpec(String goodsSpec) {
		this.goodsSpec = goodsSpec;
	}

	@Column(name = "description_evaluate", precision = 12)
	public BigDecimal getDescriptionEvaluate() {
		return this.descriptionEvaluate;
	}

	public void setDescriptionEvaluate(BigDecimal descriptionEvaluate) {
		this.descriptionEvaluate = descriptionEvaluate;
	}

	@Column(name = "service_evaluate", precision = 12)
	public BigDecimal getServiceEvaluate() {
		return this.serviceEvaluate;
	}

	public void setServiceEvaluate(BigDecimal serviceEvaluate) {
		this.serviceEvaluate = serviceEvaluate;
	}

	@Column(name = "ship_evaluate", precision = 12)
	public BigDecimal getShipEvaluate() {
		return this.shipEvaluate;
	}

	public void setShipEvaluate(BigDecimal shipEvaluate) {
		this.shipEvaluate = shipEvaluate;
	}

}