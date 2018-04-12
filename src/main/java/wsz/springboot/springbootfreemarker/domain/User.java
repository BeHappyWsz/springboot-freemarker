package wsz.springboot.springbootfreemarker.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wsz
 * date 2018/4/12
 */
public class User {

    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String username;

    @Setter
    @Getter
    private String password;

    @Setter
    @Getter
    private int age;
}
