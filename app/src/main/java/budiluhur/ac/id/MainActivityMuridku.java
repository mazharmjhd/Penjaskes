package budiluhur.ac.id;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityMuridku extends AppCompatActivity {

    private EditText NAMASISWA,NILAIPRAKTEK,NIS,KETERANGAN,KELAS,TAHUNAJARAN;
    private TextView method,status,role;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main_muridku);

        NAMASISWA = (EditText)findViewById(R.id.Murid);
        NILAIPRAKTEK = (EditText)findViewById(R.id.Nilai);
        NIS = (EditText)findViewById(R.id.nis);
        KETERANGAN = (EditText)findViewById(R.id.txtketerangan);
        KELAS = (EditText)findViewById(R.id.kelas);
        TAHUNAJARAN = (EditText)findViewById(R.id.txtTahunAjrn);

    }

    public void LoginGet(View view) {
        String Murid = NAMASISWA.getText ().toString ();
        String Nilai = NILAIPRAKTEK.getText ().toString ();
        String nis = NIS.getText ().toString ();
        String txtketerangan = KETERANGAN.getText ().toString ();
        String kelas = KELAS.getText ().toString ();
        String txtTahunAjrn = TAHUNAJARAN.getText ().toString ();
        new Server (this,status,role,0).execute(Murid,Nilai,nis,txtketerangan,kelas,txtTahunAjrn);
    }

}
