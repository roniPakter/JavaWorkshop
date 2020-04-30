package com.example.javaworkshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
   FirebaseDatabase database = FirebaseDatabase.getInstance();

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      DatabaseReference myRef = database.getReference("message");

      myRef.setValue("Hello, World!");
   }
}
