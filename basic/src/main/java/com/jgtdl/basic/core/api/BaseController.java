package com.jgtdl.basic.core.api;

import com.jgtdl.basic.core.model.BaseCondition;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 基础接口
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/20
 * @time: 21:33
 */
public interface BaseController<T,S,PK>  {

  /**
   * 获取该接口所有数据
   * @return 接口所有数据
   */
  @GetMapping
  default List<T> getDatas(){

    return null;
  }

//  /**
//   * 根据查询条件获取接口数据
//   * @param condition 查询条件集合，包括分页条件以及查询参数
//   * @return 符合条件的接口数据
//   */
//  @GetMapping
//  default List<T> getDatasByCondition(@RequestBody BaseCondition condition) {
//    return null;
//  }

  /**
   * 获取业务对象实例
   * @return 对应的Service层实例
   */
  S getService();
}
