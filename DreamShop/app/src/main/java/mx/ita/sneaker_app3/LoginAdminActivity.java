package mx.ita.sneaker_app3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginAdminActivity extends AppCompatActivity{

    private TextView registrate;
    private EditText correo;
    private  EditText password;
    private FirebaseAuth mAuth;
    private Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        correo = findViewById(R.id.correo);
        password = findViewById(R.id.password);
        registrate = findViewById(R.id.registrateaqui);
        mAuth = FirebaseAuth.getInstance();
        iniciar = findViewById(R.id.iniciar);


        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { iniciarSesion();
            }
        });
        registrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginAdminActivity.this, Registro.class);
                startActivity(i);

            }
        });

    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void iniciarSesion(){
        try {
            mAuth.signInWithEmailAndPassword(correo.getText().toString(), password.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(getApplicationContext(), "Inicio de sesion exitosa", Toast.LENGTH_SHORT).show();
                        abriraplicacion();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error correo o pass", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }catch (Exception e){
            Toast.makeText(this,"No deje campos vacios",Toast.LENGTH_SHORT).show();
        }
    }
    public void abriraplicacion(){
        Intent i = new Intent(LoginAdminActivity.this, AdminActivity.class );
        startActivity(i);
    }

}