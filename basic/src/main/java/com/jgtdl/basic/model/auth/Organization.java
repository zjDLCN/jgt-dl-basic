package com.jgtdl.basic.model.auth;

import com.jgtdl.basic.core.model.BaseModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 组织实体
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/20
 * @time: 21:37
 */
@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@ToString
public class Organization extends BaseModel {

  private static final long serialVersionUID = 2238897875448551196L;

  private String uuid;
  private String name;
}
