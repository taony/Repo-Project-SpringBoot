package com.devnote.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 18:41
 */

@Data
@Table(name="t_user")
public class UserDO {

    @Id
    @Column(name="user_Id")
    public String userId;

    @Column(name="user_name")
    public String userName;
}
