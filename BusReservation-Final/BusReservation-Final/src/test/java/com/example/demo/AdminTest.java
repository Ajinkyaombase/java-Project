package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin_Table;

import com.example.demo.layer3.AdminImpl;

@SpringBootTest
public class AdminTest {
    
    @Autowired
    AdminImpl adminRepo;
  
    @Test
    public void insertAdminTest() {
        Admin_Table Akt=new Admin_Table();
        Akt.setAdminid(13);
        Akt.setAdminPassword("ddsdfsdnn34");
      adminRepo.insertAdminRecord(Akt);
    }
    
    @Test
    void updateAdminTest() {
        Admin_Table Akt=new Admin_Table();
        Akt=adminRepo.find(Admin_Table.class,13);
        Akt.setAdminid(12);
        Akt.setAdminPassword("cged55");
        adminRepo.updateAdmin(Akt);
    }
    
    @Test
    void deleteAdmin() {
        Admin_Table aobj=new Admin_Table();
        adminRepo.remove(Admin_Table.class, 12);
    }
    
    @Test
    void fetchById() {
        Admin_Table aobj;
        aobj=adminRepo.selectAdmin(15);
        System.out.println("Admin_Table AdminId:"+aobj.getAdminid());
        System.out.println("Admin_Table Admin_Password:"+aobj.getAdminPassword());
}
    
    @Test
    void SelectAllATest() {
        List <Admin_Table> adminList;
        
         adminList=adminRepo.selectAllAdminss();
        for(Admin_Table aobj:adminList) {
            System.out.println("Admin_Table AdminId:"+aobj.getAdminid());
            System.out.println("Admin_Table Admin_Password:"+aobj.getAdminPassword());
        }
    }
}