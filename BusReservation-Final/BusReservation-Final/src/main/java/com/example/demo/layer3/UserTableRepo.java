package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.User_Table;

@Repository
public interface UserTableRepo {

	void insertUserTableRecord(User_Table ref);

	User_Table selectUserTable(int UserTableNumber);

	List<User_Table> selectAllUserTables();

	void updateUserTable(User_Table UserTableObj);

	void deleteUserTable(int UserTableNumber);

}