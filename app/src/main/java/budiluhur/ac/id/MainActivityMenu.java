package budiluhur.ac.id;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMenu extends AppCompatActivity {
    private Button button2;
    private Button btnabout;
    private Button btnhelp;
    private Button btnlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        btnabout = (Button) findViewById(R.id.btnabout);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        btnhelp = (Button) findViewById(R.id.btnhelp);
        btnhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });

        btnlistview = (Button) findViewById(R.id.btnlistview);
        btnlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

    }

    public void openActivity2(){
        Intent intent =  new Intent(this, MainActivityGuru.class); //ke Activity Guru
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent =  new Intent(this, MainActivityAbout.class); //ke Activity Guru
        startActivity(intent);
    }

    public void openActivity5(){
        Intent intent =  new Intent(this, MainActivityHelp.class); //ke Activity Guru
        startActivity(intent);
    }

    public void openActivity6(){
        Intent intent =  new Intent(this, MainActivityDaftarMurid.class); //ke Activity Guru
        startActivity(intent);
    }


}
