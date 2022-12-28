package lat.pam.storeapps;

import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

public class MainActivity6 extends AppCompatActivity {

   AnswersAdapter mAdapter;
   RecyclerView mRecyclerView;
   ProgressBar progressBar;
   LinearLayoutManager layoutManager;
   List<Data> mdata=new ArrayList<>();

    int img[]={R.drawable.pizza,R.drawable.spageti,R.drawable.burger,R.drawable.steak,R.drawable.kentang};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.toolbar);

        String menu="MENU";
        TextView textView2=findViewById(R.id.nama);
        textView2.setTextColor(Color.parseColor("#FFFFFF"));
        textView2.setText(menu);
        mRecyclerView = findViewById(R.id.rv_main);
        progressBar =findViewById(R.id.progressBar);
        layoutManager= new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter=new AnswersAdapter(mdata, img);
        mRecyclerView.setAdapter(mAdapter);

        fetchPosts();
        }

        private void fetchPosts(){
        progressBar.setVisibility(View.VISIBLE);
        RetrofitClient.getClient().getPosts().enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    mdata.addAll(response.body());
                    mAdapter.notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity6.this,"Error"+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        }
}