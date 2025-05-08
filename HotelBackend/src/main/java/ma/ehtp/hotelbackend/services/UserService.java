package ma.ehtp.hotelbackend.services;

import ma.ehtp.hotelbackend.dtos.LoginRequest;
import ma.ehtp.hotelbackend.dtos.RegistrationRequest;
import ma.ehtp.hotelbackend.dtos.Response;
import ma.ehtp.hotelbackend.dtos.UserDTO;
import ma.ehtp.hotelbackend.entities.User;

public interface UserService {

    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
