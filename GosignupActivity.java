package hkit.kr.portfolio;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioGroup;
import android.widget.Toast;

public class GosignupActivity extends Activity {
    NumberPicker year_picker_btn, month_picker_btn, day_picker_btn;
    Button email_btn, reset_btn, go_home;
    EditText name_btn, phone_btn;
    RadioGroup genderRadioGroup;

    String subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gosignup);

        Intent intent = getIntent();
        subject = intent.getStringExtra("subject");

        year_picker_btn = findViewById(R.id.year_picker_btn);
        year_picker_btn.setMinValue(1960);
        year_picker_btn.setMaxValue(2030);

        month_picker_btn = findViewById(R.id.month_picker_btn);
        month_picker_btn.setMinValue(1);
        month_picker_btn.setMaxValue(12);

        day_picker_btn = findViewById(R.id.day_picker_btn);
        day_picker_btn.setMinValue(1);
        day_picker_btn.setMaxValue(31);

        email_btn = findViewById(R.id.email_btn);
        email_btn.setOnClickListener(email_btn_click);
        name_btn = findViewById(R.id.name_btn);
        phone_btn = findViewById(R.id.phone_btn);

        genderRadioGroup = findViewById(R.id.genderRadioGroup);

        reset_btn = findViewById(R.id.reset_btn);
        reset_btn.setOnClickListener(reset_btn_click);

        go_home=findViewById(R.id.go_home);
        go_home.setOnClickListener(go_home_click);

    }
    View.OnClickListener email_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int year = year_picker_btn.getValue();
            int month = month_picker_btn.getValue();
            int day = day_picker_btn.getValue();
            String phone = phone_btn.getText().toString();
            String name = name_btn.getText().toString();

            if(name_btn.getText().toString().equals("")){
                Toast.makeText(getBaseContext(),"이름을입력해주세요",Toast.LENGTH_SHORT).show();
            }else if(phone_btn.getText().toString().equals("")){
                Toast.makeText(getBaseContext(),"전화번호를입력해주세요",Toast.LENGTH_SHORT).show();
            }else {

                String bodyText = "<가입정보>\n";
                bodyText += "이름 : " + name + "\n";
                bodyText += "전화번호 : " + phone + "\n";

                if (genderRadioGroup.getCheckedRadioButtonId() == R.id.femaleRadioButton) {
                    bodyText += "성별 : 여자\n";
                } else if (genderRadioGroup.getCheckedRadioButtonId() == R.id.maleRadioButton) {
                    bodyText += "성별 : 남자\n";
                }
                bodyText += "생년월일 : " + year + "년" + month + "월" + day + "일";


                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("text/plain");
                String[] address = {"unjuda0@gmail.com"}; //받을이메일주소값
                email.putExtra(Intent.EXTRA_EMAIL, address);
                email.putExtra(Intent.EXTRA_SUBJECT, subject + "의 가입정보");
                email.putExtra(Intent.EXTRA_TEXT, bodyText);
                startActivity(email);
            }
        }
    };
        View.OnClickListener reset_btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_btn.setText(null);
                phone_btn.setText(null);
            }
        };
        View.OnClickListener go_home_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        };
}
