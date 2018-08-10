package kz.alashalemi.edittextmask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.addTextChangedListener(new MaskWatcher("#### ## ##### #### ####"));
        phoneNumber.setRawInputType(InputType.TYPE_CLASS_NUMBER);

        Button btnPrint = findViewById(R.id.btn_print);
        btnPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("sj", phoneNumber.getText().toString().replaceAll("\\s+",""));
            }
        });
    }
}
