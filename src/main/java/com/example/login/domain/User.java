package com.example.login.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author wangch
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/6/1 0001上午 12:27
 */
@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    @NonNull private String userName;
    @Column(nullable = false)
    @NonNull private String passWord;
    @Column(nullable = false, unique = true)
    @NonNull private String email;
    @Column(nullable = true, unique = true)
    @NonNull private String nickName;
    @Column(nullable = false)
    @NonNull private String regTime;

    //省略getter settet方法、构造方法

}
