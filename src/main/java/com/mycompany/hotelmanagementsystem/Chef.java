package com.mycompany.hotelmanagementsystem;


public class Chef extends HotelStaff {

    private int yearsOfExperience;
    private String speciality;

    public Chef(String name, String surname) {
        super(name, surname);
    }

    // Setter and Getter methods
    public void yearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public void speciality(String speciality) {
        this.speciality = speciality;
    }

    public int yearsOfExperience() {
        return yearsOfExperience;
    }
    public String speciality() {
        return speciality;
    }


    @Override
    public String toString() {
        return super.toString() + " Housekeeper - Years of Experience: " + yearsOfExperience ;
    }
}

