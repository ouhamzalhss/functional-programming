package demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Lhouceine OUHAMZA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private String fullName;
    private boolean isActive;

    public UserDto(User user) {
        this.setFullName(user.getFirstName()+ " " + user.getLastName().toUpperCase());
        this.setActive(user.isActive());
    }
}
