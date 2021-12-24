package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.User_Table;
import com.example.demo.layer3.UserTableIMPL;

@SpringBootTest
public class UserTableTest {

	@Autowired
	UserTableIMPL UserTableRepo;

	@Test
	void insertUserTable() {

		LocalDate ld = LocalDate.of(2020, 4, 7);
		User_Table UserTableObj = new User_Table();
		UserTableObj.setRegisteredEmail("ddqwefghdj@fngf.com");
		UserTableObj.setFirstName("maya");
		UserTableObj.setLastname("malhotra");
		UserTableObj.setPhoneNumber(623534255f);
		UserTableObj.setPassword("aff3");
		UserTableObj.setDateofBirth(ld);
		UserTableRepo.insertUserTableRecord(UserTableObj);

	}

	@Test
	void updateUserTable() {
		User_Table UserTableObj = null;
		UserTableObj = UserTableRepo.find(User_Table.class, 9);
		UserTableObj.setRegisteredEmail("dhfjdfss@djdf.com");
		UserTableObj.setFirstName("griffy");
		UserTableObj.setLastname("edfef");
		UserTableObj.setPhoneNumber(0544567);
		UserTableObj.setPassword("gtrrfy7");
		UserTableObj.setDateofBirth(LocalDate.of(2020, 12, 9));
		UserTableRepo.updateUserTable(UserTableObj);
	}

	@Test
	void deleteUserTable() {
		User_Table UserTableObj = new User_Table();
		UserTableRepo.remove(User_Table.class, 9);
	}

	@Test
	void fetchById() {
		User_Table UserTableObj;
		UserTableObj = UserTableRepo.selectUserTable(7);
		System.out.println("User_Table REGISTERED_EMAIL" + UserTableObj.getRegisteredEmail());
		System.out.println("User_Table FIRST_NAME: " + UserTableObj.getFirstName());
		System.out.println("User_Table LAST_NAME :" + UserTableObj.getLastname());
		System.out.println("User_Table PHONE_NUMBER :" + UserTableObj.getPhoneNumber());
		System.out.println("User_Table PASSWORD :" + UserTableObj.getPassword());
		System.out.println("User_Table DATE_OF_BIRTH :" + UserTableObj.getDateofBirth());

		System.out.println("-----------------------------------------");
	}

	@Test
	void fetchAllAddress() {
		List<User_Table> User_TableList;
		User_TableList = UserTableRepo.selectAllUserTables();
		for (User_Table UserTableObj : User_TableList) {

			System.out.println("User_Table REGISTERED_EMAIL" + UserTableObj.getRegisteredEmail());
			System.out.println("User_Table FIRST_NAME: " + UserTableObj.getFirstName());
			System.out.println("User_Table LAST_NAME :" + UserTableObj.getLastname());
			System.out.println("User_Table PHONE_NUMBER :" + UserTableObj.getPhoneNumber());
			System.out.println("User_Table PASSWORD :" + UserTableObj.getPassword());
			System.out.println("User_Table DATE_OF_BIRTH :" + UserTableObj.getDateofBirth());

			System.out.println("-----------------------------------------");
		}
	}
}
