package springmvc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.Dao.UserDao;
import springmvc.model.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
    public List<User> display(){
        return this.userDao.displayUser();
    }
}
