package com.formdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formdb.model.Form;
import com.formdb.repository.FormRepository;
/**
 * Created by Phani on 2/26/17.
 */

@Service("formService")
public class FormServiceImp implements FormService {

        @Autowired
        private FormRepository formRepository;

        @Override
        public Form findFormById(int formId) {
            return formRepository.findById(formId);
        }

        @Override
        public void saveForm(Form form, int newRandomId) {
            form.setFormId(newRandomId);
            formRepository.save(form);
        }
}
