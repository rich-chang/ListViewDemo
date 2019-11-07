package com.richc.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvFriend = findViewById(R.id.friendListView);

        //ArrayList<String> friendList2 = new ArrayList<String>(asList("Gloria", "Zoe", "Ashley"));
        final ArrayList<String> friendList = new ArrayList<String>();
        friendList.add("Gloria");
        friendList.add("Zoe");
        friendList.add("Ashley");
        friendList.add("Jarad");
        friendList.add("Cindy");
        friendList.add("Emma");

        ArrayAdapter<String> friendAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendList);

        lvFriend.setAdapter(friendAdapter);

        lvFriend.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // adapterView: lvFriend variable
                // view: item been clicked
                // i: position of clicked item
                Log.i("Clicked item", friendList.get(i));

                Toast.makeText(adapterView.getContext(), "Hello "+friendList.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
