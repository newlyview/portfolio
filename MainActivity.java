package hkit.kr.portfolio;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static android.provider.LiveFolders.INTENT;

public class MainActivity extends AppCompatActivity {

    Button electronic_btn, bigdata_btn,block_btn,infomation_btn,medical_btn,block1_btn,
            virtualization_btn,selfdriving_btn, online_go_btn, dial_btn, dial_btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        electronic_btn = findViewById(R.id.electronic_btn);
        electronic_btn.setOnClickListener(click);
        bigdata_btn = findViewById(R.id.bigbata_btn);
        bigdata_btn.setOnClickListener(click0);
        block_btn = findViewById(R.id.block_btn);
        block_btn.setOnClickListener(block_btn_click);
        infomation_btn=findViewById(R.id.infomation_btn);
        infomation_btn.setOnClickListener(infomation_btn_click);
        medical_btn = findViewById(R.id.medical_btn);
        medical_btn.setOnClickListener(medical_btn_click);
        block1_btn = findViewById(R.id.block1_btn);
        block1_btn.setOnClickListener(block1_btn_click);
        virtualization_btn = findViewById(R.id.virtualization_btn);
        virtualization_btn.setOnClickListener(virtualization_btn_click);
        selfdriving_btn = findViewById(R.id.selfdriving_btn);
        selfdriving_btn.setOnClickListener(selfdriving_btn_click);
        online_go_btn = findViewById(R.id.online_go_btn);
        online_go_btn.setOnClickListener(online_go_btn_click);
        dial_btn = findViewById(R.id.dial_btn);
        dial_btn.setOnClickListener(dial_btn_click);
        dial_btn1=findViewById(R.id.dial_btn1);
        dial_btn1.setOnClickListener(dial_btn_click);
    }
    View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), ElectronicActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener click0 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), BigdataActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener block_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), blockActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener infomation_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), InfomationActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener medical_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), MedicalActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener block1_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), block1Activity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener virtualization_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), VirtualizationActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener selfdriving_btn_click =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), selfdrivingActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener online_go_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), GoonlineActivity.class);
            startActivity(intent);
        }
    };
    View.OnClickListener dial_btn_click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:0539520008"));
            startActivity(intent);
        }
    };

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setMessage("\n정말로 종료하시겠습니까?").setPositiveButton("종료하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        })
                .setNegativeButton("돌아가기",null).show();
    }
}
