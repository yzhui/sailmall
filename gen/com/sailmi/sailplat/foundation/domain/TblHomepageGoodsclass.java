package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblHomepageGoodsclass generated by hbm2java
 */
@Entity
@Table(name = "tbl_homepage_goodsclass", catalog = "sailplat")
public class TblHomepageGoodsclass implements java.io.Serializable {

	private Long id;
	private TblGoodsclass tblGoodsclass;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs = new HashSet<TblHomepageGoodsclassLog>(0);

	public TblHomepageGoodsclass() {
	}

	public TblHomepageGoodsclass(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblHomepageGoodsclass(TblGoodsclass tblGoodsclass, TblUser tblUser, Date addTime, boolean deleteStatus,
			Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs) {
		this.tblGoodsclass = tblGoodsclass;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.tblHomepageGoodsclassLogs = tblHomepageGoodsclassLogs;
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
	@JoinColumn(name = "gc_id")
	public TblGoodsclass getTblGoodsclass() {
		return this.tblGoodsclass;
	}

	public void setTblGoodsclass(TblGoodsclass tblGoodsclass) {
		this.tblGoodsclass = tblGoodsclass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TblUser getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblHomepageGoodsclass")
	public Set<TblHomepageGoodsclassLog> getTblHomepageGoodsclassLogs() {
		return this.tblHomepageGoodsclassLogs;
	}

	public void setTblHomepageGoodsclassLogs(Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs) {
		this.tblHomepageGoodsclassLogs = tblHomepageGoodsclassLogs;
	}

}
