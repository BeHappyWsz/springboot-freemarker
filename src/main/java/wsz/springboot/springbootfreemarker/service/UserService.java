package wsz.springboot.springbootfreemarker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wsz.springboot.springbootfreemarker.dao.UserDao;
import wsz.springboot.springbootfreemarker.domain.User;

import java.util.List;

/**
 * Created by wsz
 * date 2018/4/12
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findById(long id){
        return userDao.findById(id);
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }
}
