package com.example.tates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MoneysActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    ProgressBar progressBar;
    Button buttonplus,buttonminus;
    SharedPreferences sPref;
    private int bugatti = 329000000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moneys);
        editText = findViewById(R.id.editText_title);
        buttonminus = findViewById(R.id.b1);
        buttonplus = findViewById(R.id.b2);
        textView = findViewById(R.id.textView16);
        progressBar = findViewById(R.id.progressBar2);
        try {
            sPref = getPreferences(MODE_PRIVATE);
            int bm = Integer.parseInt(sPref.getString("money", ""));
            textView.setText(Integer.toString(bm) + " рублей");
            progressBar.setProgress(bm*100/bugatti);
        }catch (Exception e){
            int bm = 0;
            textView.setText(Integer.toString(bm) + " рублей");
        }

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sPref = getPreferences(MODE_PRIVATE);
                    String basemoney = sPref.getString("money", "");
                    String edit_textt = editText.getText().toString();
                    int b_m_int = Integer.parseInt(basemoney) + 0;
                    int e_t_int = Integer.parseInt(edit_textt);
                    int otv = b_m_int - e_t_int;
                    SharedPreferences.Editor ed = sPref.edit();
                    ed.putString("money", Integer.toString(otv));
                    ed.commit();
                    textView.setText(Integer.toString(otv) + " рублей");
                    Toast.makeText(MoneysActivity.this, "Я надеюсь они были потрачены с пользой", Toast.LENGTH_LONG).show();
                    progressBar.setProgress(otv*100/bugatti);
                }catch (Exception e){
                    int b_m_int = 0;
                    String edit_textt = editText.getText().toString();
                    int e_t_int = Integer.parseInt(edit_textt);
                    int otv = b_m_int - e_t_int;
                    SharedPreferences.Editor ed = sPref.edit();
                    ed.putString("money", Integer.toString(otv));
                    ed.commit();
                    textView.setText(Integer.toString(otv) + " рублей");
                    progressBar.setProgress(otv*100/bugatti);
                    Toast.makeText(MoneysActivity.this, "Я надеюсь они были потрачены с пользой", Toast.LENGTH_LONG).show();
                }
            }
        });

        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sPref = getPreferences(MODE_PRIVATE);
                    String basemoney = sPref.getString("money", "");
                    String edit_textt = editText.getText().toString();
                    int b_m_int = Integer.parseInt(basemoney) + 0;
                    int e_t_int = Integer.parseInt(edit_textt);
                    int otv = b_m_int + e_t_int;
                    SharedPreferences.Editor ed = sPref.edit();
                    ed.putString("money", Integer.toString(otv));
                    ed.commit();
                    textView.setText(Integer.toString(otv) + " рублей");
                    progressBar.setProgress(otv*100/bugatti);
                    Toast.makeText(MoneysActivity.this, "Ты еще на один шаг ближе к Бугатти!", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    int b_m_int = 0;
                    String edit_textt = editText.getText().toString();
                    int e_t_int = Integer.parseInt(edit_textt);
                    int otv = b_m_int + e_t_int;
                    SharedPreferences.Editor ed = sPref.edit();
                    ed.putString("money", Integer.toString(otv));
                    ed.commit();
                    textView.setText(Integer.toString(otv) + " рублей");
                    progressBar.setProgress(otv*100/bugatti);
                    Toast.makeText(MoneysActivity.this, "Ты еще на один шаг ближе к Бугатти!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}