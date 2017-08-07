package com.example.arman.charts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChartsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charts);

        findClick();
    }

    private void findClick() {
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1: {
                replaceFragment(LineChartFragment.newInstance());
                break;
            }
            case R.id.btn2: {
                replaceFragment(BarFragment.newInstance());
                break;
            }
            case R.id.btn3: {
                replaceFragment(HorizontalBarFragment.newInstance());
                break;
            }
            case R.id.btn4: {
                replaceFragment(PieFragment.newInstance());
                break;
            }
            case R.id.btn5: {
                replaceFragment(RadarFragment.newInstance());
                break;
            }
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, fragment).commit();
    }
}