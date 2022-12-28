package lat.pam.storeapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {
    private List<Data> mData;
    int images[];

    public AnswersAdapter(List<Data> mData, int img[]) {
        this.mData = mData;
        this.images=img;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        Data datas=mData.get(position);
        holder.tv_title.setText(mData.get(position).getFoodName());
        holder.tv_dess.setText(mData.get(position).getDetails());
        holder.tv_price.setText(mData.get(position).getPrice());
        holder.iv.setImageResource(images[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            Bundle extras=new Bundle();
            @Override
            public void onClick(View v) {
                extras.putString("judul",datas.getFoodName());
                extras.putString("des",datas.getDetails());
                extras.putString("harga",datas.getPrice());
                extras.putInt("img",datas.getId());
                Intent i=new Intent(holder.itemView.getContext(), MainActivity4.class);
                i.putExtras(extras);
                holder.itemView.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size()-1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title;
        TextView tv_dess;
        TextView tv_price;
        ImageView iv;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            tv_title=itemView.findViewById(R.id.titlee);
            tv_dess=itemView.findViewById(R.id.dess);
            tv_price=itemView.findViewById(R.id.price);
            iv=itemView.findViewById(R.id.pict);
        }
    }
}