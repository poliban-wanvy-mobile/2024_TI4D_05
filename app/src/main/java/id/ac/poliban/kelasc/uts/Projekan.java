package id.ac.poliban.kelasc.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Projekan extends AppCompatActivity {
    ImageView iv_syahrani, iv_alam, iv_febri, iv_david, iv_hafid, iv_tio;
    TextView tv_syahrani, tv_alam, tv_febri, tv_david, tv_hafid, tv_tio;
    EditText et_search;
    Button btn_cancel;
    private boolean isSearching = false;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.mi_keluar) {
            Toast.makeText(this, "Logout berhasil", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(Projekan.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }, 1000);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projekan);

        iv_syahrani = findViewById(R.id.iv_syahrani);
        iv_alam = findViewById(R.id.iv_alam);
        iv_febri = findViewById(R.id.iv_febri);
        iv_david = findViewById(R.id.iv_david);
        iv_hafid = findViewById(R.id.iv_hafid);
        iv_tio = findViewById(R.id.iv_tio);

        tv_syahrani = findViewById(R.id.tv_syahrani);
        tv_alam = findViewById(R.id.tv_alam);
        tv_febri = findViewById(R.id.tv_febri);
        tv_david = findViewById(R.id.tv_david);
        tv_hafid = findViewById(R.id.tv_hafid);
        tv_tio = findViewById(R.id.tv_tio);

        et_search = findViewById(R.id.et_search);
        btn_cancel = findViewById(R.id.btn_cancel);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_search.setText("");
            }
        });

        et_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                isSearching = true;
                tampilkanData(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                isSearching = false;
            }
        });

        iv_syahrani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("Syahrani", "C030322136", "Teknik Informatika", "TI-4D");
            }
        });
        iv_alam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("Syaiful Alam", "C030322137", "Teknik Informatika", "TI-4D");
            }
        });
        iv_febri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("Febriannur Effendy", "C030322112", "Teknik Informatika", "TI-4D");
            }
        });
        iv_david.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("David Ramadhan", "C030322109", "Teknik Informatika", "TI-4D");
            }
        });
        iv_hafid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("Hafid Try Siswanto", "C030322115", "Teknik Informatika", "TI-4D");
            }
        });
        iv_tio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToHasil("Prasetio Lukito", "C030322130", "Teknik Informatika", "TI-4D");
            }
        });
    }

    private void tampilkanData(String keyword) {
        resetTampilan();
        if (keyword.equalsIgnoreCase("syahrani")) {
            iv_syahrani.setVisibility(View.VISIBLE);
            tv_syahrani.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("alam")) {
            iv_alam.setVisibility(View.VISIBLE);
            tv_alam.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("febri")) {
            iv_febri.setVisibility(View.VISIBLE);
            tv_febri.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("david")) {
            iv_david.setVisibility(View.VISIBLE);
            tv_david.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("hafid")) {
            iv_hafid.setVisibility(View.VISIBLE);
            tv_hafid.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("tio")) {
            iv_tio.setVisibility(View.VISIBLE);
            tv_tio.setVisibility(View.VISIBLE);
        } else if (keyword.equalsIgnoreCase("")) {
            iv_syahrani.setVisibility(View.VISIBLE);
            tv_syahrani.setVisibility(View.VISIBLE);
            iv_alam.setVisibility(View.VISIBLE);
            tv_alam.setVisibility(View.VISIBLE);
            iv_febri.setVisibility(View.VISIBLE);
            tv_febri.setVisibility(View.VISIBLE);
            iv_david.setVisibility(View.VISIBLE);
            tv_david.setVisibility(View.VISIBLE);
            iv_hafid.setVisibility(View.VISIBLE);
            tv_hafid.setVisibility(View.VISIBLE);
            iv_tio.setVisibility(View.VISIBLE);
            tv_tio.setVisibility(View.VISIBLE);
        }
    }
    private void resetTampilan() {
        iv_syahrani.setVisibility(View.GONE);
        iv_alam.setVisibility(View.GONE);
        iv_febri.setVisibility(View.GONE);
        iv_david.setVisibility(View.GONE);
        iv_hafid.setVisibility(View.GONE);
        iv_tio.setVisibility(View.GONE);

        tv_syahrani.setVisibility(View.GONE);
        tv_alam.setVisibility(View.GONE);
        tv_febri.setVisibility(View.GONE);
        tv_david.setVisibility(View.GONE);
        tv_hafid.setVisibility(View.GONE);
        tv_tio.setVisibility(View.GONE);
    }

    private void navigateToHasil(String nama, String nim, String prodi, String kelas) {
        Toast.makeText(Projekan.this, "Loading...", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Projekan.this, hasil.class);
                intent.putExtra("nama", nama);
                intent.putExtra("nim", nim);
                intent.putExtra("prodi", prodi);
                intent.putExtra("kelas", kelas);
                startActivity(intent);
            }
        }, 1000);
    }
}