package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class blockActivity extends AppCompatActivity {
    Button singup_btn;
    String subject = "블록체인 플랫폼 개발";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block);
        singup_btn=findViewById(R.id.singup_btn);
        singup_btn.setOnClickListener(singup_btn_click);
    }
    View.OnClickListener singup_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), SignupActivity.class);
            intent.putExtra("subject",subject);
            startActivity(intent);
        }
    };
}
