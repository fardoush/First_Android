package sample.android.com.firstandroidappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText userNAme, userPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_page);

        setTitle("Title");

        userNAme = findViewById(R.id.getUserName);
        userPassword = findViewById(R.id.password);

    }


    public void click(View view) {

        String user = userNAme.getText().toString();
        String pass = userPassword.getText().toString();

        if (user.equals("admin") && pass.equals("123")) {


            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }

    }
}
