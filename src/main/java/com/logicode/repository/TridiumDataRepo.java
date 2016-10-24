package com.logicode.repository;

import com.logicode.model.TridiumData;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jjenkins on 10/24/2016.
 * The interface for accessing the tridium sql data
 */
public interface TridiumDataRepo extends CrudRepository<TridiumData, Long> {

    /**
     * Enable the user to be looked up my userName
     * @param timestamp the time it was done
     * @return
     */

    List<TridiumData> findBytimestamp(Long timestamp);
}
