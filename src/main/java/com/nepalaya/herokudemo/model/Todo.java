package com.nepalaya.herokudemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todos")
public class Todo implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private  Long id;

    @Id
    @Column(name = "DESCRIPTION", nullable = false)
    private  String description;

    public Todo(String description) {
        this.description = description;
    }
}
