

public interface UserRepository {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    List<User> getUsers();
}

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(User user) {
        // implementation details
    }

    public void deleteUser(User user) {
        // implementation details
    }

    public List<User> getUsers() {
        return users;
    }
}
//model class
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters
}


public class RepositoryPatternExample 
{
    public static void main(String[] args) 
    {
        //main
UserRepository userRepository = new UserRepositoryImpl();

User user1 = new User("John", 30);
userRepository.addUser(user1);

User user2 = new User("Jane", 25);
userRepository.addUser(user2);

List<User> users = userRepository.getUsers();
for (User user : users) {
    System.out.println(user.getName() + " " + user.getAge());
}
 }
}
