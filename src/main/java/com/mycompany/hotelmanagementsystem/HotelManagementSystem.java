/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hotelmanagementsystem;

/**** ENTER HERE YOUR DETAILS:*******
         * 
         * FIRST NAME: Samadhi
         * 
         * LAST NAME: Dissanayake
         * 
         * STUDENT ID: 2082815 / 20230952
         * 
         */

public class HotelManagementSystem  {

    public static void main(String[] args) {
        
        HotelManager hotelManager = new WestminsterHotelManager(100);
        boolean exit = false;
        while (!exit) {
            exit = hotelManager.runMenu();
        }
    }
}
