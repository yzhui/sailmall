package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

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
 * TblStoregradeLog generated by hbm2java
 */
@Entity
@Table(name = "tbl_storegrade_log", catalog = "sailplat")
public class TblStoregradeLog implements java.io.Serializable {

	private Long id;
	private TblStore tblStore;
	private Date addTime;
	private boolean deleteStatus;
	private boolean logEdit;
	private String storeGradeInfo;
	private int storeGradeStatus;

	public TblStoregradeLog() {
	}

	public TblStoregradeLog(boolean deleteStatus, boolean logEdit, int storeGradeStatus) {
		this.deleteStatus = deleteStatus;
		this.logEdit = logEdit;
		this.storeGradeStatus = storeGradeStatus;
	}

	public TblStoregradeLog(TblStore tblStore, Date addTime, boolean deleteStatus, boolean logEdit,
			String storeGradeInfo, int storeGradeStatus) {
		this.tblStore = tblStore;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.logEdit = logEdit;
		this.storeGradeInfo = storeGradeInfo;
		this.storeGradeStatus = storeGradeStatus;
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
	@JoinColumn(name = "store_id")
	public TblStore getTblStore() {
		return this.tblStore;
	}

	public void setTblStore(TblStore tblStore) {
		this.tblStore = tblStore;
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

	@Column(name = "log_edit", nullable = false)
	public boolean isLogEdit() {
		return this.logEdit;
	}

	public void setLogEdit(boolean logEdit) {
		this.logEdit = logEdit;
	}

	@Column(name = "store_grade_info")
	public String getStoreGradeInfo() {
		return this.storeGradeInfo;
	}

	public void setStoreGradeInfo(String storeGradeInfo) {
		this.storeGradeInfo = storeGradeInfo;
	}

	@Column(name = "store_grade_status", nullable = false)
	public int getStoreGradeStatus() {
		return this.storeGradeStatus;
	}

	public void setStoreGradeStatus(int storeGradeStatus) {
		this.storeGradeStatus = storeGradeStatus;
	}

}
