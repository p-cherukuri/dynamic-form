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
        public Form findFormBySubmissionNum(int submissionNum) {
            return formRepository.findBySubmissionNum(submissionNum);
        }

        @Override
        public void saveForm(Form form, int newRandomNum) {
            form.setSubmissionNum(newRandomNum);
            formRepository.save(form);
        }
}
