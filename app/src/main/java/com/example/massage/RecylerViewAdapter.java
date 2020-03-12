package com.example.massage;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class RecylerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public ImageView image;
    public TextView text;

    private bodyClickListener bodyClickListener;
    public RecylerViewHolder(View itemView) {
        super(itemView);
        image =(ImageView)itemView.findViewById(R.id.type_image);
        text =(TextView)itemView.findViewById(R.id.type_textView);

        itemView.setOnClickListener(this);
    }

    public void setBodyClickListener(com.example.massage.bodyClickListener bodyClickListener) {
        this.bodyClickListener = bodyClickListener;
    }

    @Override
    public void onClick(View view) {
        bodyClickListener.onCick(view,getAdapterPosition());
    }
}

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewHolder>{

    private List<body> bodyList;
    private Context context;

    public RecylerViewAdapter(List<body> bodyList, Context context) {
        this.bodyList = bodyList;
        this.context = context;
    }

    @Override
    public RecylerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itenView = inflater.inflate(R.layout.body_move,parent,false);
        return new RecylerViewHolder(itenView);
    }

    @Override
    public void onBindViewHolder(RecylerViewHolder holder, int position) {

        holder.image.setImageResource(bodyList.get(position).getBodytype_img());
        holder.text.setText(bodyList.get(position).getName());
        holder.setBodyClickListener(new bodyClickListener() {
            @Override
            //啟動Bodydetail按摩詳細的畫面
            public void onCick(View view, int position) {
            Intent intent = new Intent(context, bodydetail.class);
            intent.putExtra("bodytype_img",bodyList.get(position).getBodytype_img());
            intent.putExtra("name",bodyList.get(position).getName());
            context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bodyList.size();
    }
}
