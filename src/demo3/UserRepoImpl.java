package demo3;

        import java.util.ArrayList;
        import java.util.List;

/**
 * @author Lhouceine OUHAMZA
 */

public class UserRepoImpl implements UserRepo {
    @Override
    public List<User> findAll() {
           ArrayList<User> users = new ArrayList<>();
           User user1 = new User("anas", "kadiri", true);
           User user2 = new User("ali", "slimani", false);
           users.add(user1);
           users.add(user2);
           return users;
       }



}
