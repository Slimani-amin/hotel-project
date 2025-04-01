package ma.ehtp.hotelbackend.entities;


import ma.ehtp.hotelbackend.enums.BookingStatus;
import ma.ehtp.hotelbackend.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "bookings")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.REMOVE)  // meaning when a user is deleted all associated booking of the user will be deleted
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private BigDecimal totalPrice;
    private String bookingReference;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

}
