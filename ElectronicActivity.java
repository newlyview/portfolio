package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ElectronicActivity extends AppCompatActivity {
    Button signup_btn;
    String subject = "전기PLC시스템제어과정";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);
        signup_btn = (Button)findViewById(R.id.signup_btn);
        signup_btn.setOnClickListener(click);

    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(),SignupActivity.class);
            intent.putExtra("subject",subject);
            startActivity(intent);
        }
    };
}
