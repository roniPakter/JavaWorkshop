package com.example.javaworkshop.Model;

public class Parcel {
   private MailType _type;
   private  boolean _fragile;
   private MaxWeight _maxWeight;
   private String _storageLocation;
   private Person _recipient;
   private String _recipientPhone;

   //------------------------------------ Constructor -----------------------------------//
   public Parcel(MailType type, boolean fragile, MaxWeight maxWeight, String storageLocation, Person recipient) {
      _type = _type;
      _fragile = _fragile;
      _maxWeight = _maxWeight;
      _storageLocation = _storageLocation;
      _recipient = _recipient;
      _recipientPhone = _recipient.getPhone();
   }
   public Parcel(){}

   //------------------------------------ Getters -----------------------------------//
   public MailType getType() {
      return _type;
   }

   public boolean isFragile() {
      return _fragile;
   }

   public MaxWeight getMaxWeight() {
      return _maxWeight;
   }

   public String getStorageLocation() {
      return _storageLocation;
   }

   public Person getRecipient() {
      return _recipient;
   }

   public String getRecipientPhone() {
      return _recipientPhone;
   }

   //------------------------------------ Setters -----------------------------------//
   public void setType(MailType type) {
      _type = type;
   }

   public void setFragile(boolean fragile) {
      _fragile = fragile;
   }

   public void setMaxWeight(MaxWeight maxWeight) {
      _maxWeight = maxWeight;
   }

   public void setStorageLocation(String storageLocation) {
      _storageLocation = storageLocation;
   }

   public void setRecipient(Person recipient) {
      _recipient = recipient;
      _recipientPhone = recipient.getPhone();
   }
}
