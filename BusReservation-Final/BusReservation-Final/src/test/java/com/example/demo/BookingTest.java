package com.example.demo;


import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Booking_Table;
import com.example.demo.layer2.TransactionTable;
import com.example.demo.layer3.BookingImpl;
import com.example.demo.layer3.TransactionIMPL;


@SpringBootTest
public class BookingTest {
    @Autowired
    BookingImpl bookingRepo;
    
    @Autowired
    TransactionIMPL tranRepo;
    
    @Test
    public void insertBookingTest() {
        Booking_Table bkt =new Booking_Table();
        bkt.setAc_Seats_Booked("ac _seat book");
        bkt.setNon_Ac_Seats_Booked("non AC");
        bkt.setBooking_Date(LocalDate.of(2021,11,11));
        bkt.setBooking_Status("done");
        bkt.setTotal_cost(200);
        bookingRepo.insertbookingRecord(bkt);   
    }
    
   
    
    
    @Test
    void updateBookingTest() {
        
            Booking_Table bkt = new  Booking_Table();
            bkt =bookingRepo.find(Booking_Table.class,13);
            bkt.setAc_Seats_Booked("yes");
            bkt.setBooking_Status("sucessful");
            bkt.setBooking_Date(LocalDate.of(2021,11,11));
            bkt.setNon_Ac_Seats_Booked("no");
            bkt.setTotal_cost(1000);
            bookingRepo.updateBooking(bkt);
            
        }
    
    @Test
    void deleteBooking() {
        Booking_Table bobj=new Booking_Table();
        bookingRepo.remove(Booking_Table.class, 8);
    
    }
    
    @Test
    void fetchById() {
        Booking_Table bobj;
        bobj=bookingRepo.selectBooking(9);
        
            System.out.println("Booking_Table Ac_Seats_Booked  : "+ bobj.getAc_Seats_Booked());
            System.out.println("Booking_Table Booking_status  : "+ bobj.getAc_Seats_Booked());
            System.out.println("Booking_Table  Booking_Date is:"+bobj.getBooking_Date());
            System.out.println("Booking_Table  Non_Ac_Seats is:"+bobj.getNon_Ac_Seats_Booked());
            
            System.out.println("Booking_Table  Total_cost is:"+bobj.getTotal_cost());
            
    }
    
    
    @Test
    void SelectAllBookingTest() {
        List <Booking_Table> bookList;
        
         bookList=bookingRepo.selectAllBookings();
        for(Booking_Table bobj:bookList) {
            System.out.println("Booking_Table Ac_Seats_Booked  : "+ bobj.getAc_Seats_Booked());
            System.out.println("Booking_Table Booking_status  : "+ bobj.getAc_Seats_Booked());
            System.out.println("Booking_Table  Booking_Date is:"+bobj.getBooking_Date());
            System.out.println("Booking_Table  Non_Ac_Seats is:"+bobj.getNon_Ac_Seats_Booked());
            System.out.println("Booking_Table  Total_cost is:"+bobj.getTotal_cost());
            
    }
        }
}   