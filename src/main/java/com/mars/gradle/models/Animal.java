package com.mars.gradle.models;

import lombok.Data;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * Animal:
 * description:
 */

@Data
public class Animal {

    private String name;
    private boolean isPet;
    private String size;
    private boolean inExtinction;

}
