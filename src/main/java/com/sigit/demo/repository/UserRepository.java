package com.sigit.demo.repository;

import com.sigit.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Date 07/09/20
 *
 * @author sigit
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
