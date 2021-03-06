package com.sailmi.database.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.sailmi.annotation.Lock;

@MappedSuperclass
public class IdEntity implements Serializable 
{

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id",unique=true, nullable=false)
  private Long id;
  private Date addTime;

  @Lock
  private boolean deleteStatus;

  public Long getId()
  {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getAddTime() {
    return this.addTime;
  }

  public void setAddTime(Date addTime) {
    this.addTime = addTime;
  }

  public boolean isDeleteStatus() {
    return this.deleteStatus;
  }

  public void setDeleteStatus(boolean deleteStatus) {
    this.deleteStatus = deleteStatus;
  }
  
  public void checkSession(){
	  
  }
}