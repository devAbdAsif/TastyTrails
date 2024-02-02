package com.example.tastytrails;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AccessControlContext;
import java.util.ArrayList;

public class Adapterdish extends RecyclerView.Adapter<Adapterdish.Viewholder> {
    ArrayList<ModelDish> arrayList;
    Context context;

    public Adapterdish(ArrayList<ModelDish> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapterdish.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rvdish,parent,false);
        return new  Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterdish.Viewholder holder, int position) {
        final ModelDish item = arrayList.get(position);
        holder.imageView.setImageResource(arrayList.get(position).getImg());
        holder.txtviewname.setText(arrayList.get(position).getName());
        holder.txtviewdesc.setText(arrayList.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("image name",item.getImg());
                intent.putExtra("Text",item.getName());
                intent.putExtra("desc",item.getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtviewname,txtviewdesc;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.cimgdish);
            txtviewname=itemView.findViewById(R.id.cheaddish);
            txtviewdesc=itemView.findViewById(R.id.ctxtdish);
        }
    }
}
