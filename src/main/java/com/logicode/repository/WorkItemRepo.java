package com.logicode.repository;

import com.logicode.Model.WorkItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jjenkins on 11/2/2016.
 */
public interface WorkItemRepo extends JpaRepository<WorkItem, Long> {
}
