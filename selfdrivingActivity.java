package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class selfdrivingActivity extends AppCompatActivity {
    Button singup_btn;
    String subject = "머신러닝/V2X/컴퓨터비전활용 자율주행자동차";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selfdriving);
        singup_btn = findViewById(R.id.singup_btn);
        singup_btn.setOnClickListener(singup_btn_click);
    }
    View.OnClickListener singup_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), SignupActivity.class);
            intent.putExtra("subject",subject);
            startActivity(intent);
        }
    };
}
