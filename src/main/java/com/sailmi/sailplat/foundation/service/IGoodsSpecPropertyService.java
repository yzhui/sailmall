package com.sailmi.sailplat.foundation.service;

import com.sailmi.database.query.support.IPageList;
import com.sailmi.database.query.support.IQueryObject;
import com.sailmi.sailplat.foundation.domain.GoodsSpecProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGoodsSpecPropertyService
{
  public abstract boolean save(GoodsSpecProperty paramGoodsSpecProperty);

  public abstract GoodsSpecProperty getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(GoodsSpecProperty paramGoodsSpecProperty);

  public abstract List<GoodsSpecProperty> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 