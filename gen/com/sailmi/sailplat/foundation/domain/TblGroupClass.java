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
 * TblGroupClass generated by hbm2java
 */
@Entity
@Table(name = "tbl_group_class", catalog = "sailplat")
public class TblGroupClass implements java.io.Serializable {

	private Long id;
	private TblGroupClass tblGroupClass;
	private Date addTime;
	private boolean deleteStatus;
	private int gcLevel;
	private String gcName;
	private int gcSequence;
	private Set<TblGroupGoods> tblGroupGoodses = new HashSet<TblGroupGoods>(0);
	private Set<TblGroupClass> tblGroupClasses = new HashSet<TblGroupClass>(0);

	public TblGroupClass() {
	}

	public TblGroupClass(boolean deleteStatus, int gcLevel, int gcSequence) {
		this.deleteStatus = deleteStatus;
		this.gcLevel = gcLevel;
		this.gcSequence = gcSequence;
	}

	public TblGroupClass(TblGroupClass tblGroupClass, Date addTime, boolean deleteStatus, int gcLevel, String gcName,
			int gcSequence, Set<TblGroupGoods> tblGroupGoodses, Set<TblGroupClass> tblGroupClasses) {
		this.tblGroupClass = tblGroupClass;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.gcLevel = gcLevel;
		this.gcName = gcName;
		this.gcSequence = gcSequence;
		this.tblGroupGoodses = tblGroupGoodses;
		this.tblGroupClasses = tblGroupClasses;
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
	@JoinColumn(name = "parent_id")
	public TblGroupClass getTblGroupClass() {
		return this.tblGroupClass;
	}

	public void setTblGroupClass(TblGroupClass tblGroupClass) {
		this.tblGroupClass = tblGroupClass;
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

	@Column(name = "gc_level", nullable = false)
	public int getGcLevel() {
		return this.gcLevel;
	}

	public void setGcLevel(int gcLevel) {
		this.gcLevel = gcLevel;
	}

	@Column(name = "gc_name")
	public String getGcName() {
		return this.gcName;
	}

	public void setGcName(String gcName) {
		this.gcName = gcName;
	}

	@Column(name = "gc_sequence", nullable = false)
	public int getGcSequence() {
		return this.gcSequence;
	}

	public void setGcSequence(int gcSequence) {
		this.gcSequence = gcSequence;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGroupClass")
	public Set<TblGroupGoods> getTblGroupGoodses() {
		return this.tblGroupGoodses;
	}

	public void setTblGroupGoodses(Set<TblGroupGoods> tblGroupGoodses) {
		this.tblGroupGoodses = tblGroupGoodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGroupClass")
	public Set<TblGroupClass> getTblGroupClasses() {
		return this.tblGroupClasses;
	}

	public void setTblGroupClasses(Set<TblGroupClass> tblGroupClasses) {
		this.tblGroupClasses = tblGroupClasses;
	}

}