package com.example.buithihai.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
/////
    // Hello Đại Ca
    EditText edtTen, edtCanNang, edtChieuCao;
    Button btnTinhBMI;
    TextView txtBMI, txtChuanDoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTinhBMI.setOnClickListener(this);
    }

    private void addControls() {
        edtTen=findViewById(R.id.edtTen);
        edtCanNang=findViewById(R.id.edtCanNang);
        edtChieuCao=findViewById(R.id.edtChieuCao);
        btnTinhBMI=findViewById(R.id.btnTinhBMI);
        txtBMI=findViewById(R.id.txtBMI);
        txtChuanDoan=findViewById(R.id.txtChuanDoan);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(btnTinhBMI))
        {
            XuLyBMI();
        }
    }

    private void XuLyBMI() {
        double H=Double.parseDouble(edtChieuCao.getText().toString());
        double W=Double.parseDouble(edtCanNang.getText().toString());
        double BMI = W/Math.pow(H,2);
        txtBMI.setText(BMI+"");
        if (BMI < 18)
            txtChuanDoan.setText(edtTen.getText().toString() +" => Gầy");
        else if (BMI <= 24.9)
            txtChuanDoan.setText(edtTen.getText().toString() +" => Bình Thường");
        else if (BMI <29.9)
            txtChuanDoan.setText(edtTen.getText().toString() +" => Béo Phì Độ 1");
        else if (BMI <34.9)
            txtChuanDoan.setText(edtTen.getText().toString() +" => Béo Phì Độ 2");
        else
            txtChuanDoan.setText(edtTen.getText().toString() +" => Béo Phì Độ 3");
    }
}
