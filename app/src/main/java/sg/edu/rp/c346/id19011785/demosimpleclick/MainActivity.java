package sg.edu.rp.c346.id19011785.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;
    Button btnClick;
    EditText editTInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.buttonDisplay);
        tvDisplay = findViewById(R.id.textViewDisplay);
        editTInput = findViewById(R.id.editTextInput);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTInput.getText().toString();
                tvDisplay.setText(userInput);
            }

        });
    }
}