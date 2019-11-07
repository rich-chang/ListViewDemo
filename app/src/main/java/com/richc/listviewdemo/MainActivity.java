package com.richc.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvFriend = findViewById(R.id.friendListView);

        ArrayList<String> friendList = new ArrayList<String>();

        friendList.add("Gloria");
        friendList.add("Zoe");
        friendList.add("Ashley");
        friendList.add("Jarad");
        friendList.add("Cindy");
        friendList.add("Emma");

        ArrayAdapter<String> friendAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendList);

        lvFriend.setAdapter(friendAdapter);
    }
}
