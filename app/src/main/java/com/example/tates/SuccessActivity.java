package com.example.tates;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {
    private Switch sw1,sw2,sw3,sw4,sw5,sw6,sw7,sw8,sw9,sw10;
    private static String MY_PREFS1 = "switch_prefs";
    private static String LIGHT_STATUS1 = "light_on";
    private static String SWITCH_STATUS1 = "switch_status";
    boolean switch_status1;
    boolean sw_st1,sw_st2,sw_st3,sw_st4,sw_st5,sw_st6,sw_st7,sw_st8,sw_st9,sw_st10;
    boolean light_status1;
    SharedPreferences myPref1;
    SharedPreferences.Editor myEditor1;

    private static String MY_PREFS2 = "switch_prefs";
    private static String LIGHT_STATUS2 = "light_on";
    private static String SWITCH_STATUS2 = "switch_status";
    boolean switch_status2;
    boolean light_status2;
    SharedPreferences myPref2;
    SharedPreferences.Editor myEditor2;

    private static String MY_PREFS3 = "switch_prefs";
    private static String LIGHT_STATUS3 = "light_on";
    private static String SWITCH_STATUS3 = "switch_status";
    boolean switch_status3;
    boolean light_status3;
    SharedPreferences myPref3;
    SharedPreferences.Editor myEditor3;

    private static String MY_PREFS4 = "switch_prefs";
    private static String LIGHT_STATUS4= "light_on";
    private static String SWITCH_STATUS4 = "switch_status";
    boolean switch_status4;
    boolean light_status4;
    SharedPreferences myPref4;
    SharedPreferences.Editor myEditor4;

    private static String MY_PREFS5 = "switch_prefs";
    private static String LIGHT_STATUS5 = "light_on";
    private static String SWITCH_STATUS5 = "switch_status";
    boolean switch_status5;
    boolean light_status5;
    SharedPreferences myPref5;
    SharedPreferences.Editor myEditor5;

    private static String MY_PREFS6 = "switch_prefs";
    private static String LIGHT_STATUS6 = "light_on";
    private static String SWITCH_STATUS6 = "switch_status";
    boolean switch_status6;
    boolean light_status6;
    SharedPreferences myPref6;
    SharedPreferences.Editor myEditor6;

    private static String MY_PREFS7 = "switch_prefs";
    private static String LIGHT_STATUS7 = "light_on";
    private static String SWITCH_STATUS7 = "switch_status";
    boolean switch_status7;
    boolean light_status7;
    SharedPreferences myPref7;
    SharedPreferences.Editor myEditor7;

    private static String MY_PREFS8 = "switch_prefs";
    private static String LIGHT_STATUS8 = "light_on";
    private static String SWITCH_STATUS8 = "switch_status";
    boolean switch_status8;
    boolean light_status8;
    SharedPreferences myPref8;
    SharedPreferences.Editor myEditor8;

    private static String MY_PREFS9 = "switch_prefs";
    private static String LIGHT_STATUS9 = "light_on";
    private static String SWITCH_STATUS9 = "switch_status";
    boolean switch_status9;
    boolean light_status9;
    SharedPreferences myPref9;
    SharedPreferences.Editor myEditor9;

    private static String MY_PREFS10 = "switch_prefs";
    private static String LIGHT_STATUS10 = "light_on";
    private static String SWITCH_STATUS10 = "switch_status";
    boolean switch_status10;
    boolean light_status10;
    SharedPreferences myPref10;
    SharedPreferences.Editor myEditor10;
    public static int days;
    TextView textView;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        sw1 = findViewById(R.id.switch1);
        sw2 = findViewById(R.id.switch2);
        sw3 = findViewById(R.id.switch3);
        sw4 = findViewById(R.id.switch4);
        sw5 = findViewById(R.id.switch5);
        sw6 = findViewById(R.id.switch6);
        sw7 = findViewById(R.id.switch7);
        sw8 = findViewById(R.id.switch8);
        sw9 = findViewById(R.id.switch9);
        sw10 = findViewById(R.id.switch10);
        textView = findViewById(R.id.textView12);
        pb = findViewById(R.id.progressBar);

        SharedPreferences pref = getPreferences(MODE_PRIVATE);
        try {
            int bm = Integer.parseInt(pref.getString("days", ""));
            textView.setText(Integer.toString(bm) + " дней");
            pb.setProgress(bm*100/183);
        }catch (Exception e){
            int bm = 0;
            textView.setText(Integer.toString(bm) + " дней");
        }

        myPref1 = getPreferences(MODE_PRIVATE);
        myEditor1 = getPreferences(MODE_PRIVATE).edit();
        switch_status1=myPref1.getBoolean(SWITCH_STATUS1,false);
        sw1.setChecked(switch_status1);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Стакан воды выпит, работай дальше!", Toast.LENGTH_LONG).show();
                        myEditor1.putBoolean(SWITCH_STATUS1, true);
                        myEditor1.commit();
                        sw1.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st1 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor1.putBoolean(SWITCH_STATUS1, false);
                        myEditor1.commit();
                        sw_st1 = false;
                        sw1.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Стакан воды выпит, работай дальше!", Toast.LENGTH_LONG).show();
                        myEditor1.putBoolean(SWITCH_STATUS1, true);
                        myEditor1.commit();
                        sw1.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st1 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor1.putBoolean(SWITCH_STATUS1, false);
                        myEditor1.commit();
                        sw_st1 = false;
                        sw1.setChecked(false);
                    }
                }

            }
        });

        myPref2 = getPreferences(MODE_PRIVATE);
        myEditor2 = getPreferences(MODE_PRIVATE).edit();
        switch_status2=myPref2.getBoolean(SWITCH_STATUS2,false);
        sw2.setChecked(switch_status2);
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Тренировка закончена, двигайся дальше, не останавливайся!", Toast.LENGTH_LONG).show();
                        myEditor2.putBoolean(SWITCH_STATUS2, true);
                        myEditor2.commit();
                        sw2.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st2 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor2.putBoolean(SWITCH_STATUS2, false);
                        myEditor2.commit();
                        sw_st2 = false;
                        sw2.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Тренировка закончена, двигайся дальше, не останавливайся!", Toast.LENGTH_LONG).show();
                        myEditor2.putBoolean(SWITCH_STATUS2, true);
                        myEditor2.commit();
                        sw2.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st2 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor2.putBoolean(SWITCH_STATUS2, false);
                        myEditor2.commit();
                        sw_st2 = false;
                        sw2.setChecked(false);
                    }
                }

            }
        });

        myPref3 = getPreferences(MODE_PRIVATE);
        myEditor3 = getPreferences(MODE_PRIVATE).edit();
        switch_status3=myPref3.getBoolean(SWITCH_STATUS3,false);
        sw3.setChecked(switch_status3);
        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Начало успешного дня положено, подолжай в том же духе, главное это скорость!", Toast.LENGTH_LONG).show();
                        myEditor3.putBoolean(SWITCH_STATUS3, true);
                        myEditor3.commit();
                        sw3.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st3 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor3.putBoolean(SWITCH_STATUS3, false);
                        myEditor3.commit();
                        sw_st3 = false;
                        sw3.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Начало успешного дня положено, подолжай в том же духе, главное это скорость!", Toast.LENGTH_LONG).show();
                        myEditor3.putBoolean(SWITCH_STATUS3, true);
                        myEditor3.commit();
                        sw3.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100/183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st3 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor3.putBoolean(SWITCH_STATUS3, false);
                        myEditor3.commit();
                        sw_st3 = false;
                        sw3.setChecked(false);
                    }
                }

            }
        });

        myPref4 = getPreferences(MODE_PRIVATE);
        myEditor4 = getPreferences(MODE_PRIVATE).edit();
        switch_status4=myPref4.getBoolean(SWITCH_STATUS4,false);
        sw4.setChecked(switch_status4);
        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Лучший! Сахар для слабаков, ищущих легкого дофамана.", Toast.LENGTH_LONG).show();
                        myEditor4.putBoolean(SWITCH_STATUS4, true);
                        myEditor4.commit();
                        sw4.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st4 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor4.putBoolean(SWITCH_STATUS4, false);
                        myEditor4.commit();
                        sw_st4 = false;
                        sw4.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Лучший! Сахар для слабаков, ищущих легкого дофамана.", Toast.LENGTH_LONG).show();
                        myEditor4.putBoolean(SWITCH_STATUS4, true);
                        myEditor4.commit();
                        sw4.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 /183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st4 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor4.putBoolean(SWITCH_STATUS4, false);
                        myEditor4.commit();
                        sw_st4 = false;
                        sw4.setChecked(false);
                    }
                }

            }
        });


        myPref5 = getPreferences(MODE_PRIVATE);
        myEditor5 = getPreferences(MODE_PRIVATE).edit();
        switch_status5=myPref5.getBoolean(SWITCH_STATUS5,false);
        sw5.setChecked(switch_status5);
        sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Молодец, такие прогулки дают хорошую перезагрузку, а теперь время возвращаться к работе!", Toast.LENGTH_LONG).show();
                        myEditor5.putBoolean(SWITCH_STATUS5, true);
                        myEditor5.commit();
                        sw5.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st5 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor5.putBoolean(SWITCH_STATUS5, false);
                        myEditor5.commit();
                        sw_st5 = false;
                        sw5.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Молодец, такие прогулки дают хорошую перезагрузку, а теперь время возвращаться к работе!", Toast.LENGTH_LONG).show();
                        myEditor5.putBoolean(SWITCH_STATUS5, true);
                        myEditor5.commit();
                        sw5.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st5 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor5.putBoolean(SWITCH_STATUS5, false);
                        myEditor5.commit();
                        sw_st5 = false;
                        sw5.setChecked(false);
                    }
                }
            }
        });

        myPref6 = getPreferences(MODE_PRIVATE);
        myEditor6 = getPreferences(MODE_PRIVATE).edit();
        switch_status6=myPref6.getBoolean(SWITCH_STATUS6,false);
        sw6.setChecked(switch_status6);
        sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Поспал ровно столько же, сколько и вчера, красава, и так на проьяжении 6 месяцев.", Toast.LENGTH_LONG).show();
                        myEditor6.putBoolean(SWITCH_STATUS6, true);
                        myEditor6.commit();
                        sw6.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st6 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor6.putBoolean(SWITCH_STATUS6, false);
                        myEditor6.commit();
                        sw_st6 = false;
                        sw6.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Поспал ровно столько же, сколько и вчера, красава, и так на проьяжении 6 месяцев.", Toast.LENGTH_LONG).show();
                        myEditor6.putBoolean(SWITCH_STATUS6, true);
                        myEditor6.commit();
                        sw6.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st6 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor6.putBoolean(SWITCH_STATUS6, false);
                        myEditor6.commit();
                        sw_st6 = false;
                        sw6.setChecked(false);
                    }
                }

            }
        });

        myPref7 = getPreferences(MODE_PRIVATE);
        myEditor7 = getPreferences(MODE_PRIVATE).edit();
        switch_status7=myPref7.getBoolean(SWITCH_STATUS7,false);
        sw7.setChecked(switch_status7);
        sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Отлично, 1 час пройден, если есть еще свободное время, то продолжай работать или сделай план на завтра.", Toast.LENGTH_LONG).show();
                        myEditor7.putBoolean(SWITCH_STATUS7, true);
                        myEditor7.commit();
                        sw7.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st7 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor7.putBoolean(SWITCH_STATUS7, false);
                        myEditor7.commit();
                        sw_st7 = false;
                        sw7.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Отлично, 1 час пройден, если есть еще свободное время, то продолжай работать или сделай план на завтра.", Toast.LENGTH_LONG).show();
                        myEditor7.putBoolean(SWITCH_STATUS7, true);
                        myEditor7.commit();
                        sw6.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st7 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor7.putBoolean(SWITCH_STATUS7, false);
                        myEditor7.commit();
                        sw_st7 = false;
                        sw7.setChecked(false);
                    }
                }
            }
        });

        myPref8 = getPreferences(MODE_PRIVATE);
        myEditor8 = getPreferences(MODE_PRIVATE).edit();
        switch_status8=myPref8.getBoolean(SWITCH_STATUS8,false);
        sw8.setChecked(switch_status8);
        sw8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Моё уважение, держись подальше от всех провокаций из интернета, отожмись под крутую музыку и посмотри на себя в зеркало!", Toast.LENGTH_LONG).show();
                        myEditor8.putBoolean(SWITCH_STATUS8, true);
                        myEditor8.commit();
                        sw8.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st8 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor8.putBoolean(SWITCH_STATUS8, false);
                        myEditor8.commit();
                        sw_st8 = false;
                        sw8.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Моё уважение, держись подальше от всех провокаций из интернета, отожмись под крутую музыку и посмотри на себя в зеркало!", Toast.LENGTH_LONG).show();
                        myEditor8.putBoolean(SWITCH_STATUS8, true);
                        myEditor8.commit();
                        sw8.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st8 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor8.putBoolean(SWITCH_STATUS8, false);
                        myEditor8.commit();
                        sw_st8 = false;
                        sw8.setChecked(false);
                    }
                }

            }
        });

        myPref9 = getPreferences(MODE_PRIVATE);
        myEditor9 = getPreferences(MODE_PRIVATE).edit();
        switch_status9=myPref9.getBoolean(SWITCH_STATUS9,false);
        sw9.setChecked(switch_status9);
        sw9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Здорово, для кого то это возможно самый сложный пункт, наказывай себя за каждую оплошность очередной соткой отжиманий!", Toast.LENGTH_LONG).show();
                        myEditor9.putBoolean(SWITCH_STATUS9, true);
                        myEditor9.commit();
                        sw9.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st9 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor9.putBoolean(SWITCH_STATUS9, false);
                        myEditor9.commit();
                        sw_st9 = false;
                        sw9.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Здорово, для кого то это возможно самый сложный пункт, наказывай себя за каждую оплошность очередной соткой отжиманий!", Toast.LENGTH_LONG).show();
                        myEditor9.putBoolean(SWITCH_STATUS9, true);
                        myEditor9.commit();
                        sw9.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st9 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor9.putBoolean(SWITCH_STATUS9, false);
                        myEditor9.commit();
                        sw_st9 = false;
                        sw9.setChecked(false);
                    }
                }
            }
        });


        myPref10 = getPreferences(MODE_PRIVATE);
        myEditor10 = getPreferences(MODE_PRIVATE).edit();
        switch_status10=myPref10.getBoolean(SWITCH_STATUS10,false);
        sw10.setChecked(switch_status10);
        sw10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                try {
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Великолепно, не возвращайся к этой привычке больше никогда, удачи, впереди еще много работы!", Toast.LENGTH_LONG).show();
                        myEditor10.putBoolean(SWITCH_STATUS10, true);
                        myEditor10.commit();
                        sw10.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            int bm = Integer.parseInt(pref.getString("days", ""));
                            pref.edit().putString("days", ""+bm+1).commit();
                            textView.setText("" + bm+1 + " дней");
                            pb.setProgress((bm+1) * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st10 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor10.putBoolean(SWITCH_STATUS10, false);
                        myEditor10.commit();
                        sw_st10 = false;
                        sw10.setChecked(false);
                    }
                }catch (Exception e){
                    if (buttonView.isChecked()) {
                        Toast.makeText(SuccessActivity.this, "Великолепно, не возвращайся к этой привычке больше никогда, удачи, впереди еще много работы!", Toast.LENGTH_LONG).show();
                        myEditor10.putBoolean(SWITCH_STATUS10, true);
                        myEditor10.commit();
                        sw10.setChecked(true);
                        if (sw_st1 == true & sw_st2 == true & sw_st3 == true & sw_st4 == true & sw_st5 == true & sw_st6 == true & sw_st7 == true & sw_st8 == true & sw_st9 == true & sw_st10 == true) {
                            pref.edit().putString("days", ""+1).commit();
                            textView.setText("" + 1 + " дней");
                            pb.setProgress(1 * 100 / 183);
                            sw1.setChecked(false);
                            sw2.setChecked(false);
                            sw3.setChecked(false);
                            sw4.setChecked(false);
                            sw5.setChecked(false);
                            sw6.setChecked(false);
                            sw7.setChecked(false);
                            sw8.setChecked(false);
                            sw9.setChecked(false);
                            sw10.setChecked(false);
                            sw_st1 = false;
                            sw_st2 = false;
                            sw_st3 = false;
                            sw_st4 = false;
                            sw_st5 = false;
                            sw_st6 = false;
                            sw_st7 = false;
                            sw_st8 = false;
                            sw_st9 = false;
                            sw_st10 = false;
                        }
                        else{
                            sw_st10 = true;
                        }
                    } else {
                        Toast.makeText(SuccessActivity.this, "Что не так?", Toast.LENGTH_LONG).show();
                        myEditor10.putBoolean(SWITCH_STATUS10, false);
                        myEditor10.commit();
                        sw_st10 = false;
                        sw10.setChecked(false);
                    }
                }

            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}