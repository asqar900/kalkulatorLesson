package kz.cource.kalkulator;

import static kz.cource.kalkulator.R.id.*;
import static kz.cource.kalkulator.R.id.btn0;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textResult;
    private StringBuilder inputNumber = new StringBuilder();







    Button button7, button8, button9,button6,button5,button4,button3,button2,button1,button0;
    Button btnten, btnkosw, btnalw, btnkobeytu, btnbolu, btnprocet, btnminusplus, btnnowiru,btnnukte;
    TextView tvsan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textResult = findViewById(R.id.tvsan);
        int[] buttonIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn0

        };
        for (int id : buttonIds) {
            Button button =
                    findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button b = (Button) v;
                    inputNumber.append(b.getText().toString());
                    textResult.setText(inputNumber.toString());
                    Button btnClear = findViewById(R.id.btnowiru);
                    btnClear.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            inputNumber.setLength(0);
                            textResult.setText("0");
                        }
                    });
                }
            });
            button0 = findViewById(btn0);
            button1 = findViewById(R.id.btn1);
            button2 = findViewById(R.id.btn2);
            button3 = findViewById(R.id.btn3);
            button4 = findViewById(R.id.btn4);
            button5 = findViewById(R.id.btn5);
            button6 = findViewById(R.id.btn6);
            button7 = findViewById(R.id.btn7);
            button8 = findViewById(R.id.btn8);
            button9 = findViewById(R.id.btn9);
            btnten = findViewById(R.id.btnten);
            btnminusplus = findViewById(R.id.btnminusplus);
            btnprocet = findViewById(R.id.btnprocet);
            btnkosw = findViewById(R.id.btnkosw);
            btnnowiru = findViewById(R.id.btnowiru);
            btnalw = findViewById(R.id.btnalw);
            btnbolu = findViewById(R.id.btnbolu);
            btnkobeytu = findViewById(R.id.btnkobeytu);
            btnnukte = findViewById(R.id.btnnukte);
            tvsan = findViewById(R.id.tvsan);









        };
















    };

    };