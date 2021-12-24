package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin_Table;


@Repository
public interface AdminRepo {
    void insertAdminRecord(Admin_Table aobj);

    Admin_Table selectAdmin(int AdminNumber);
    List<Admin_Table> selectAllAdminss() ;


    void updateAdmin(Admin_Table aobj)  ;
    void deleteAdmin(int  AdminNumber)  ;

    

}