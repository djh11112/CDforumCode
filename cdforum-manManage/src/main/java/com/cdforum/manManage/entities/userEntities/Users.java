package com.cdforum.manManage.entities.userEntities;

import lombok.Data;

@Data
public class Users {
    private String id;
    private String code;
    private String name;
    private String password;
    private String salt;
    private String avatar;
    private String org_id;
    private String email;
    private String phone;
    private String status;
    private String revision;
    private String created_by;
    private String created_time;
    private String updated_by;
    private String updated_time;
}
