package com.example.fragment_tiki.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragment_tiki.MainActivity2;
import com.example.fragment_tiki.R;
import com.example.fragment_tiki.model.Donut;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DonutAdapter extends RecyclerView.Adapter<DonutAdapter.DonutViewHolder> {

    private List<Donut> donutList;
    private Activity activity;

    public DonutAdapter(List<Donut> donutList, Activity activity) {
        this.donutList = donutList;
        this.activity = activity;
    }

    public DonutAdapter() {
    }

    @NonNull
    @Override
    public DonutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new DonutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonutViewHolder holder, int position) {
        Donut donut = donutList.get(position);
        holder.tv1.setText(donut.getTitle());
        holder.tv2.setText(donut.getDesp());
        holder.tv3.setText(donut.getPrice());
        holder.imageView.setImageResource(donut.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, donut.toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, MainActivity2.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return donutList.size();
    }

    public class DonutViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tv1;
        private TextView tv2;
        private TextView tv3;

        public DonutViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            tv1 = (TextView) itemView.findViewById(R.id.textView);
            tv2 = (TextView) itemView.findViewById(R.id.textView2);
            tv3 = (TextView) itemView.findViewById(R.id.textView3);

        }
    }
}
