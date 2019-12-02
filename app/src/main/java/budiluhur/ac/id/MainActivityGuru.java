package budiluhur.ac.id;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityGuru extends AppCompatActivity {
    private Button btnNilaiMsk;
    private EditText NIP,password;
    private TextView method,status,role;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_guru);

        NIP = (EditText)findViewById(R.id.nip);
        password = (EditText)findViewById(R.id.pass);

        btnNilaiMsk = (Button) findViewById(R.id.btnNilaiMsk);
        btnNilaiMsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

    }

    public void LoginGet(View view) {
        String nip = NIP.getText ().toString ();
        String pass = password.getText ().toString ();
        new Server (this,status,role,0).execute(nip,pass);
    }

    public void openActivity3(){
        Intent intent =  new Intent(this, MainActivityMuridku.class); //ke Activity Murid
        startActivity(intent);
        }
    }
