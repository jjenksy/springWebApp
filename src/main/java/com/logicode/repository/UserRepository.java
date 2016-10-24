package com.logicode.repository;

import com.logicode.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * @UserRepository  extends the Spring Data JPA’s JpaRepository interface
 * By extending JpaRepository, UserRepository inherits 18 methods for performing
 * common persistence operations. The JpaRepository interface is parameterized
 *with two parameters: the domain type that the repository will work with, and the
 *type of its ID property. The interface
  *will be implemented automatically at runtime when the application is started.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Enable the user to be looked up my userName
     * @param userName the users name
     * @return
     */

    List<User> findByuserName(String userName);

}
