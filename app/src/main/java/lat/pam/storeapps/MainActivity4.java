package lat.pam.storeapps;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    int imge[]={R.drawable.pizza,R.drawable.mpizza,R.drawable.spg,R.drawable.brg,R.drawable.img,R.drawable.kentang};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView img=findViewById(R.id.images);
        TextView tv1=findViewById(R.id.judul);
        TextView tv2=findViewById(R.id.desc);
        TextView tv3=findViewById(R.id.tv_price);

        Intent i=getIntent();
        Bundle exras = i.getExtras();
        String judul = exras.getString("judul");
        String des = exras.getString("des");
        String harga = exras.getString("harga");
        int imgee = exras.getInt("img");

        img.setImageResource(imge[imgee]);
        tv1.setText(judul);
        tv2.setText(des);
        tv3.setText(harga);

        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putExtras(exras);
                startActivity(intent);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}