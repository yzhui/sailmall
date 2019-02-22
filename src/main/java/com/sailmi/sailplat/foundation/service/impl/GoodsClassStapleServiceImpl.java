 package com.sailmi.sailplat.foundation.service.impl;
 
 import com.sailmi.database.dao.IGenericDAO;
import com.sailmi.database.query.GenericPageList;
import com.sailmi.database.query.PageObject;
import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.GoodsClassStaple;
import com.sailmi.sailplat.foundation.service.IGoodsClassStapleService;

import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 @Service
 @Transactional
 public class GoodsClassStapleServiceImpl
   implements IGoodsClassStapleService
 {
 
   @Resource(name="goodsClassStapleDAO")
   private IGenericDAO<GoodsClassStaple> goodsClassStapleDao;
 
   public boolean save(GoodsClassStaple goodsClassStaple)
   {
     try
     {
       this.goodsClassStapleDao.save(goodsClassStaple);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public GoodsClassStaple getObjById(Long id)
   {
     GoodsClassStaple goodsClassStaple = (GoodsClassStaple)this.goodsClassStapleDao.get(id);
     if (goodsClassStaple != null) {
       return goodsClassStaple;
     }
     return null;
   }
 
   public boolean delete(Long id) {
     try {
       this.goodsClassStapleDao.remove(id);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public boolean batchDelete(List<Serializable> goodsClassStapleIds)
   {
     for (Serializable id : goodsClassStapleIds) {
       delete((Long)id);
     }
     return true;
   }
 
   public IPageList list(IQueryObject properties) {
     if (properties == null) {
       return null;
     }
     String query = properties.getQuery();
     Map params = properties.getParameters();
     GenericPageList pList = new GenericPageList(GoodsClassStaple.class, query, 
       params, this.goodsClassStapleDao);
     if (properties != null) {
       PageObject pageObj = properties.getPageObj();
       if (pageObj != null)
         pList.doList(pageObj.getCurrentPage() == null ? 0 : pageObj
           .getCurrentPage().intValue(), pageObj.getPageSize() == null ? 0 : 
           pageObj.getPageSize().intValue());
     } else {
       pList.doList(0, -1);
     }return pList;
   }
 
   public boolean update(GoodsClassStaple goodsClassStaple) {
     try {
       this.goodsClassStapleDao.update(goodsClassStaple);
       return true;
     } catch (Exception e) {
       e.printStackTrace();
     }return false;
   }
 
   public List<GoodsClassStaple> query(String query, Map params, int begin, int max) {
     return this.goodsClassStapleDao.query(query, params, begin, max);
   }
 }



 
 