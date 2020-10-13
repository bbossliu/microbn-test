package org.example.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Person)表实体类
 *
 * @author liux
 * @since 2020-10-10 14:35:27
 */
@Data
@SuppressWarnings("serial")
public class Person {
    //主键Id
    private Long id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //备注
    private String remark;
}