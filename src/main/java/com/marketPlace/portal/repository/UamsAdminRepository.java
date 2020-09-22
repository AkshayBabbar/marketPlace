package com.marketPlace.portal.repository;

import com.marketPlace.portal.entity.uams.UamsAdmin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UamsAdminRepository extends CrudRepository<UamsAdmin, Long> {

}
