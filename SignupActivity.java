package hkit.kr.portfolio;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Button check_signupbtn;
    CheckBox signup_checkbtn;
    String subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        check_signupbtn = findViewById(R.id.check_signupbtn);
        signup_checkbtn = findViewById(R.id.signup_checkbtn);
        check_signupbtn.setOnClickListener(goclick);
        Intent intent = getIntent();
        subject = intent.getStringExtra("subject");
    }
    View.OnClickListener goclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(signup_checkbtn.isChecked()) {
                Intent intent = new Intent(getBaseContext(), GosignupActivity.class);
                intent.putExtra("subject",subject);
                startActivity(intent);
            }else{
                Toast.makeText(getBaseContext(), "개인정보보호를동의해주세요", Toast.LENGTH_SHORT).show();

            }
        }
    };

}
