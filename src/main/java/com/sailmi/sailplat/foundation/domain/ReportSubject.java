 package com.sailmi.sailplat.foundation.domain;
 
 import javax.persistence.Entity;
 import javax.persistence.FetchType;
 import javax.persistence.ManyToOne;
 import javax.persistence.Table;
 import org.hibernate.annotations.Cache;
 import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.sailmi.database.domain.IdEntity;
 
 @Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
 @Entity
 @Table(name="tbl_report_subject")
 public class ReportSubject extends IdEntity
 {
   //标题
   private String title;
 
   //报道类型
   @ManyToOne
   private ReportType type;
 
   public String getTitle()
   {
     return this.title;
   }
 
   public void setTitle(String title) {
     this.title = title;
   }
 
   public ReportType getType() {
     return this.type;
   }
 
   public void setType(ReportType type) {
     this.type = type;
   }
 }



 
 