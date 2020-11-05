package com.kb.service;

import java.util.List;

import com.kb.dao.PersonnelDAO;
import com.kb.model.Personnel;
import com.kb.model.Module;
import com.kb.dao.ModuleDAO;
public class ModuleService {
	 ModuleDAO moduleDao = new ModuleDAO();
	    public List<Module> getAllModule() {
	        List<Module> moduleList = moduleDao.getAllModule();
	        return moduleList;
	    }

}
