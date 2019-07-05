package com.devnote.springmybatis.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @description: TODO
 * @author: taony
 * @email:taonyzhang@gmail.com
 * @date: 2019-03-12 23:18
 */
@Data
@Builder
public class User {

    public String userId;
    public String userName;

    @Override
    public String toString() {
        return userId + ":" + userName;
    }
}
