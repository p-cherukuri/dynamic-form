package com.formdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formdb.model.Form;

/**
 * Created by Phani on 2/26/17.
 */

@Repository("formRepository")
public interface FormRepository extends JpaRepository<Form, Long> {
        Form findById(int formId);
}
