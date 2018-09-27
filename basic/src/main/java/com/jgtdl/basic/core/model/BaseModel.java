package com.jgtdl.basic.core.model;

import com.google.common.base.MoreObjects;
import com.jgtdl.basic.core.type.ValidEnum;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 基础Model PO
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/20
 * @time: 21:37
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseModel implements Serializable {

  private static final long serialVersionUID = 8964085584373211885L;

  /**
   * 主键，采用32位UUID形式
   */
  @Id
  @GenericGenerator(name="system-uuid",strategy = "uuid")
  @GeneratedValue(generator = "system-uuid")
  @Column(length = 32)
  private String uuid;

  @Enumerated(value = EnumType.STRING)
  @Column(length = 20)
  private ValidEnum valid = ValidEnum.ENABLED;

  @CreatedDate
  private LocalDateTime createdTime;

  @LastModifiedDate
  private LocalDateTime updatedTime;


  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("uuid", uuid)
        .add("valid", valid)
        .add("createdTime", createdTime)
        .add("updatedTime", updatedTime)
        .toString();
  }



  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ValidEnum getValid() {
    return valid;
  }

  public void setValid(ValidEnum valid) {
    this.valid = valid;
  }

  public LocalDateTime getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public LocalDateTime getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(LocalDateTime updatedTime) {
    this.updatedTime = updatedTime;
  }
}
