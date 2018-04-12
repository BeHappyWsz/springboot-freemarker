package wsz.springboot.springbootfreemarker.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wsz.springboot.springbootfreemarker.domain.User;

import java.util.List;

/**
 * Created by wsz
 * date 2018/4/12
 */
@Mapper
@Repository
public interface UserDao {

    User findById(Long id);

    List<User> getAllUser();
}
