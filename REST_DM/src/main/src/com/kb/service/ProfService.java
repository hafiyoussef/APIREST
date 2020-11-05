package com.kb.service;
 
import java.util.List;




import com.kb.model.Personnel;
import com.kb.dao.PersonnelDAO;
 
public class ProfService {
    PersonnelDAO profDao = new PersonnelDAO();
    public List<Personnel> getAllProfesseur() {
        List<Personnel> userList = profDao.getAllPersonnel();
        return userList;
    }
    public Personnel getPersonnel(int i) {
    	Personnel prof = profDao.getPersonnel(i);
    	return prof ;
    }
 
}