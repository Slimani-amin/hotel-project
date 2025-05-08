package ma.ehtp.hotelbackend.services;

import ma.ehtp.hotelbackend.dtos.BookingDTO;
import ma.ehtp.hotelbackend.dtos.Response;

public interface BookingService {

    Response getAllBookings();
    Response createBooking(BookingDTO bookingDTO);
    Response findBookingByReferenceNo(String  bookingReference);
    Response updateBooking(BookingDTO bookingDTO);
}
