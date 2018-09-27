package com.jgtdl.basic.core.model;

import com.google.common.base.MoreObjects;

/**
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/26
 * @time: 20:07
 */
public class BaseCondition<T> {
  private Integer page;
  private Integer size;
  private T queryParams;

  public BaseCondition() {
  }

  public BaseCondition(T queryParams) {
    this.queryParams = queryParams;
  }

  public BaseCondition(Integer page, Integer size, T queryParams) {
    this.page = page;
    this.size = size;
    this.queryParams = queryParams;
  }

  public BaseCondition(Integer page, Integer size) {
    this.page = page;
    this.size = size;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("page", page)
        .add("size", size)
        .add("queryParams", queryParams)
        .toString();
  }

  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public T getQueryParams() {
    return queryParams;
  }

  public void setQueryParams(T queryParams) {
    this.queryParams = queryParams;
  }
}
