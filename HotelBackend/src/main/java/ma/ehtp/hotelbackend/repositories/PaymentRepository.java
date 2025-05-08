package ma.ehtp.hotelbackend.repositories;

import ma.ehtp.hotelbackend.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
