package com.jgtdl.basic.core.type;

/**
 * 数据启用/停用枚举
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/27
 * @time: 20:23
 */
public enum ValidEnum {
  /**
   * 启用标识
   */
  ENABLED(0,"启用"),
  /**
   * 停用标识
   */
  DISABLED(1,"停用");

  private  String text;
  private  int code;


  /**
   * 构造函数
   * @param code 值
   * @param text 文本
   */
  ValidEnum(int code,String text) {
    this.code = code;
    this.text = text;
  }

  /**
   * 根据值获取文本
   * @param code 值
   * @return 文本
   */
  public static String getText(int code){
    for (ValidEnum valid: ValidEnum.values()) {
      if(valid.getCode() == code){
        return  valid.getText();
      }
    }
    return null;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
