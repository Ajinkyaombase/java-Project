package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.layer2.User_Table;

@Repository
public class UserTableIMPL extends BaseRepository implements UserTableRepo {

	@Transactional
	public void insertUserTableRecord(User_Table ref) {
// TODO Auto-generated method stub
		super.persist(ref);
	}

	@Override
	public User_Table selectUserTable(int UserTableNumber) {
// TODO Auto-generated method stub
		User_Table UserTableObj = super.find(User_Table.class, UserTableNumber);
		return UserTableObj;
	}

	@Override
	public List<User_Table> selectAllUserTables() {
// TODO Auto-generated method stub
		List<User_Table> UserTableObj = new ArrayList<User_Table>();
		return super.findAll("User_Table");
	}

	@Transactional
	public void updateUserTable(User_Table UserTableObj) {
// TODO Auto-generated method stub
		super.merge(UserTableObj);
	}

	@Override
	public void deleteUserTable(int UserTableNumber) {
// TODO Auto-generated method stub
		super.remove(User_Table.class, UserTableNumber);

	}

}