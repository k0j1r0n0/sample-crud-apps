package com.k0j1r0n0.crud.entity;

//import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "key_value_table")
public class KeyValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Long型に変更

    @Column(name = "val_key") // カラム名を val_key に変更
    private String key;

    @Column(name = "val_value") // カラム名を val_value に変更
    private String value;

    // 以下、getter, setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
