package id.ac.poliban.kelasc.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hasil extends AppCompatActivity {
    TextView tv_nama, tv_nim, tv_prodi, tv_kelas;
    ImageView iv_gambar;
    Button btn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tv_nama = findViewById(R.id.tv_nama);
        tv_nim = findViewById(R.id.tv_nim);
        tv_prodi = findViewById(R.id.tv_prodi);
        tv_kelas = findViewById(R.id.tv_kelas);
        iv_gambar = findViewById(R.id.iv_gambar);
        btn_kembali = findViewById(R.id.btn_kembali);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nama = extras.getString("nama");
            String nim = extras.getString("nim");
            String prodi = extras.getString("prodi");
            String kelas = extras.getString("kelas");

            tv_nama.setText(nama);
            tv_nim.setText(nim);
            tv_prodi.setText(prodi);
            tv_kelas.setText(kelas);

            if (nama.equalsIgnoreCase("Syahrani")) {
                iv_gambar.setImageResource(R.drawable.syahrani);
            } else if (nama.equalsIgnoreCase("Syaiful Alam")) {
                iv_gambar.setImageResource(R.drawable.alam);
            } else if (nama.equalsIgnoreCase("Febriannur Effendy")) {
                iv_gambar.setImageResource(R.drawable.febri);
            } else if (nama.equalsIgnoreCase("David Ramadhan")) {
                iv_gambar.setImageResource(R.drawable.david);
            } else if (nama.equalsIgnoreCase("Hafid Try Siswanto")) {
                iv_gambar.setImageResource(R.drawable.febri);
            } else if (nama.equalsIgnoreCase("Prasetio Lukito")) {
                iv_gambar.setImageResource(R.drawable.tio);
            }
        }

        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hasil.this, Projekan.class);
                startActivity(intent);
            }
        });
    }
}
