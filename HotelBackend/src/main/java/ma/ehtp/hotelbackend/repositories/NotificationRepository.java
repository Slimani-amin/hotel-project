package ma.ehtp.hotelbackend.repositories;

import ma.ehtp.hotelbackend.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
