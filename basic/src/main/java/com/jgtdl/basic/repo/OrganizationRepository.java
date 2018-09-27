package com.jgtdl.basic.repo;

import com.jgtdl.basic.core.repo.BaseRepository;
import com.jgtdl.basic.model.auth.Organization;
import org.springframework.stereotype.Repository;

/**
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/26
 * @time: 20:17
 */
@Repository
public interface OrganizationRepository extends BaseRepository<Organization,Long> {

}
