package id.ac.poliban.kelasc.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_masuk;
    EditText editTextUsername, editTextPassword;
    private static final int LOGIN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_masuk = findViewById(R.id.btn_masuk);
        editTextUsername = findViewById(R.id.editTextText);
        editTextPassword = findViewById(R.id.editTextTextPassword);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_masuk.setEnabled(false);
                Toast.makeText(MainActivity.this, "Loading...", Toast.LENGTH_SHORT).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        login();
                    }
                }, LOGIN_DELAY);
            }
        });
    }

    private void login() {
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(MainActivity.this, "Tolong Isi Username atau Password Anda!", Toast.LENGTH_SHORT).show();
            btn_masuk.setEnabled(true);
            return;
        }

        if (username.equals("kelompok5") && password.equals("123")) {
            startActivity(new Intent(this, Projekan.class));
        } else {
            Toast.makeText(MainActivity.this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
            btn_masuk.setEnabled(true);
        }
    }
}
