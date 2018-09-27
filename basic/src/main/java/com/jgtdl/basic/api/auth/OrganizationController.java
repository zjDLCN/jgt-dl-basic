package com.jgtdl.basic.api.auth;

import com.jgtdl.basic.core.api.BaseController;
import com.jgtdl.basic.model.auth.Organization;
import com.jgtdl.basic.service.auth.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 组织信息接口
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/20
 * @time: 21:32
 */
@RestController
@RequestMapping("/auth/orgs")
public class OrganizationController
    implements BaseController<Organization,OrganizationService,Long> {

  @Autowired
  private OrganizationService organizationService;

  /**
   * 获取业务对象实例
   *
   * @return 对应的Service层实例
   */
  @Override
  public OrganizationService getService() {
    return organizationService;
  }
}
