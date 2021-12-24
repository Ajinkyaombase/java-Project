
package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Booking_Table;

@Repository
public interface BookingRepo {
    void insertbookingRecord(Booking_Table bobj);

    Booking_Table selectBooking(int bookingNumber);
    List<Booking_Table> selectAllBookings() ;


    void updateBooking(Booking_Table bobj)  ;
    void deleteBooking(int  bookingNumber)  ;

}