package basic.aktivity.tugas3;

import static basic.aktivity.tugas3.R.id.img_df;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default2);

        ImageView imgDefault = findViewById(img_df);
        TextView txtDefault = findViewById(R.id.txt_df);

        Intent intent = getIntent();
        int listgambar = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String listnama = intent.getStringExtra("TEXT_DEFAULT");

        imgDefault.setImageResource(listgambar);
        txtDefault.setText(listnama);
    }
}