package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Booking_Table;

@Repository
public class BookingImpl extends BaseRepository implements BookingRepo {

    @Transactional
    public void insertbookingRecord(Booking_Table bobj) {
        // TODO Auto-generated method stub
        super.persist(bobj);
    }

    @Override
    public Booking_Table selectBooking(int bookingNumber) {
        // TODO Auto-generated method stub
        Booking_Table bobj=super.find(Booking_Table.class, bookingNumber);
        return bobj;
        
    }

    @Override
    public List<Booking_Table> selectAllBookings() {
        // TODO Auto-generated method stub
        List<Booking_Table>bobj =new ArrayList<Booking_Table>();
        return super.findAll("Booking_Table");
        
    }

    @Transactional
    public void updateBooking(Booking_Table bobj) {
        // TODO Auto-generated method stub
        super.merge(bobj);
        
    }

    @Transactional
    public void deleteBooking(int bookingNumber) {
        // TODO Auto-generated method stub
        super.remove(Booking_Table.class, bookingNumber);    
        
    }


}