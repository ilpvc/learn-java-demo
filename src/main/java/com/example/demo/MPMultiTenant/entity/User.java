package com.example.demo.MPMultiTenant.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description:
 *
 * @date:2023/9/19 9:27
 * @author: ilpvc
 */
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String address;
    private Long tenantId;

}
