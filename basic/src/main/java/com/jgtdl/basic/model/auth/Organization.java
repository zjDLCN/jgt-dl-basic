package com.jgtdl.basic.model.auth;

import com.google.common.base.MoreObjects;
import com.jgtdl.basic.core.model.BaseModel;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 组织实体
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/20
 * @time: 21:37
 */
@Entity
@Table(name = "t_auth_org")
public class Organization extends BaseModel {

  private static final long serialVersionUID = 2238897875448551196L;

  private String name;

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("name", name)
        .add("super", super.toString())
        .toString();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
