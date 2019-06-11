package com.mars.gradle.models;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * Person:
 * description:
 */

@Data
@NoArgsConstructor
public class Person {

    private String name;
    private boolean havePet;
    private int age;

}
