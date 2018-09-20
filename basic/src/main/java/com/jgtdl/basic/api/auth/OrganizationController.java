package com.jgtdl.basic.api.auth;

import com.jgtdl.basic.core.api.BaseController;
import com.jgtdl.basic.model.auth.Organization;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
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
public class OrganizationController implements BaseController {

  @GetMapping
  public List<Organization> findDataList(){
    return null;
  }
}
