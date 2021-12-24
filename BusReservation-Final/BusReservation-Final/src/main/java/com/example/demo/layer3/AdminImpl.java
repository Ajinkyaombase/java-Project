package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin_Table;


@Repository
public class AdminImpl extends BaseRepository implements AdminRepo {

    @Transactional
    public void insertAdminRecord(Admin_Table aobj) {
        // TODO Auto-generated method stub
        super.persist(aobj);
    }

    @Override
    public Admin_Table selectAdmin(int AdminNumber) {
        // TODO Auto-generated method stub
        Admin_Table aobj=super.find(Admin_Table.class, AdminNumber);
        return aobj;
    }

    @Override
    public List<Admin_Table> selectAllAdminss() {
        // TODO Auto-generated method stub
        List<Admin_Table>aobj =new ArrayList<Admin_Table>();
        return super.findAll("Admin_Table");
        
    }

    @Transactional
    public void updateAdmin(Admin_Table aobj) {
        // TODO Auto-generated method stub
        super.merge(aobj);
    }

    @Transactional
    public void deleteAdmin(int AdminNumber) {
        // TODO Auto-generated method stub
        super.remove(Admin_Table.class, AdminNumber);
        
    }

}