package com.github.franciscozuccala.example;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.github.franciscozuccala.example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag(MainFragment.class.getSimpleName());

        if(mainFragment == null){
            mainFragment = new MainFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, mainFragment, MainFragment.class.getSimpleName())
                    .commit();
        }
    }
}
