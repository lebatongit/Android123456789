package com.example.bai27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnThemAlbum,btnDSAlbum,btnQLBaihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThemAlbum=(Button) findViewById(R.id.buttonAddAlbum);
        btnDSAlbum=(Button) findViewById(R.id.buttonXemDSAlbum);
        btnQLBaihat=(Button)findViewById(R.id.buttonThemBaiHat);

        btnThemAlbum.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        if(view==btnThemAlbum)
        {
            Intent intent=new Intent(MainActivity.this,AddAlbumActivity.class);
            startActivityForResult(intent,0);
        }
//        else if(view==btnDSAlbum)
//        {
//            Intent intent=new Intent(MainActivity.this,ListAlbumActivity.class);
//            Bundle bundle=new Bundle();
//            bundle.putSerializable("list",albumList);
//            intent.putExtra("DATA",bundle);
//            startActivityForResult(intent,LIST_ALBUM);
//        }
//        else if(view==btnQLBaihat) {
//            Intent intent=new Intent(this,SongActivity.class);
//            Bundle bundle=new Bundle();
//            bundle.putSerializable("list",albumList);
//            intent.putExtra("DATA",bundle);
//            startActivity(intent);
//        }
    }
}