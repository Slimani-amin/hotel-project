package ma.ehtp.hotelbackend.services;

import ma.ehtp.hotelbackend.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
