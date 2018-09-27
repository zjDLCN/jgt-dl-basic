package com.jgtdl.basic.core.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author ZhangJian.JGT-DL
 * @date: 2018/09/2018/9/26
 * @time: 20:18
 */
@NoRepositoryBean
public interface BaseRepository<T,PK extends Serializable>
  extends JpaRepository<T,PK>, JpaSpecificationExecutor<T> {

}
