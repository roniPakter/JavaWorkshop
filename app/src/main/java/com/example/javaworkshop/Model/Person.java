package com.example.javaworkshop.Model;

public class Person {
   private String _firstName;
   private String _lastName;
   private String _phone;
   private String _address;

   //------------------------------------ Constructor -----------------------------------//
   public Person(String firstName, String lastName, String phone, String address) {
      _firstName = firstName;
      _lastName = lastName;
      _phone = phone;
      _address = address;
   }

   //default constructor
   public Person(){ }

   //------------------------------------ Getters -----------------------------------//
   public String getFirstName() {
      return _firstName;
   }

   public String getLastName() {
      return _lastName;
   }

   public String getPhone() {
      return _phone;
   }

   public String get_address() {
      return _address;
   }

   //------------------------------------ Setters -----------------------------------//

   public void setFirstName(String firstName) {
      _firstName = _firstName;
   }

   public void setLastName(String lastName) {
      _lastName = _lastName;
   }

   public void setPhone(String phone) {
      _phone = _phone;
   }

   public void setAddress(String address) {
      _address = _address;
   }
}
