/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example;

import lombok.Builder;

/**
 *
 * @author vitalii
 */
enum Gender {
    MALE, FEMALE
}

@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;

}