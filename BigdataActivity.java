package hkit.kr.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BigdataActivity extends AppCompatActivity {
    Button bigbatasingup_btn;
    String subject = "빅데이터 과정";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigdata);

        bigbatasingup_btn =findViewById(R.id.bigbatasingup_btn);
        bigbatasingup_btn.setOnClickListener(click);
    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override

        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), SignupActivity.class);
            intent.putExtra("subject", subject);
            startActivity(intent);
        }
    };
}