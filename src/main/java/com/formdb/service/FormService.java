package com.formdb.service;

import com.formdb.model.Form;
/**
 * Created by Phani on 2/26/17.
 */

public interface FormService {
    public Form findFormById(int formId);
    public void saveForm(Form form, int newRandomId);
}
