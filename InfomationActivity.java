package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class InfomationActivity extends AppCompatActivity {
    Button singup_btn, online_btn;
    String subject = "QM/QC 품질관리사 및 ERP 정보관리 전문가";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        singup_btn = findViewById(R.id.singup_btn);
        singup_btn.setOnClickListener(singup_click);
    }
    View.OnClickListener singup_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), SignupActivity.class);
            intent.putExtra("subject",subject);
            startActivity(intent);
        }
    };
}
