package demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lhouceine OUHAMZA
 */

/**
 * Create getUsers() method
 * extract code to local method
 * use lambda expression
 * use reference method (MapAndFlatMAp::toDto, UserDto::new...)
 *
 */
public class App {


    public static List<UserDto> getUsers(){
        UserRepo userRepo = new UserRepoImpl();
        return userRepo.findAll()
                .stream()
                .map(App::toDto)
                .collect(Collectors.toList());

    }

    private static UserDto toDto(User user) {
        UserDto dto = new UserDto(user);
//        dto.setFullName(user.getFirstName()+ " " + user.getLastName().toUpperCase());
//        dto.setActive(user.isActive());
        return dto;
    }

    public static void main(String[] args){
        System.out.println(getUsers());
    }
}
