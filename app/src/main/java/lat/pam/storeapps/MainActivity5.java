package lat.pam.storeapps;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity5 extends AppCompatActivity {
    public static String str;

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
//
//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
//        int duration = Toast.LENGTH_SHORT;

        extras = MainActivity3.getActivityInstance().getExrass();
        String nama=extras.getString("Nama");
        String lock=extras.getString("LOCK");
        String sand=extras.getString("pesan");

        TextView tv1=findViewById(R.id.nama_d);
        TextView tv2=findViewById(R.id.cabang_loc);
        TextView tv3=findViewById(R.id.pesan);

        String tambah=sand+" telah Di pesan";
        tv1.setText(nama);
        tv2.setText(lock);
        tv3.setText(tambah);

        String gabung="Terima Kasih "+nama+" Sudah memesan Di toko Kami, pesanan "+sand+" dikirim menggunkan FaST delivery";

        Button btn1 = (Button) findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {

                Toast.makeText(getBaseContext(),gabung , Toast.LENGTH_LONG ).show();
            }
        });

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.ambil:
                if (checked){
                    str="Ambil";
                }
                // Put some meat on the sandwich
            else
                // Remove the meat
                break;
            case R.id.delivery:
                if (checked){
                    str="FAST DELIVERY";
                }
                // Cheese me
            else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
}