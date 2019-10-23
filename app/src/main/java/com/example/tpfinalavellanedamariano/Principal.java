package com.example.tpfinalavellanedamariano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener
{
    Button btn_hola;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pruebatpfinal);

        btn_hola.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {

    }
}
