package com.example.voyage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
private int[] images;
private String[] name;
private String[] place;

public MessageAdapter(String[] strArr, String[] strArr2,  int[] iArr) {
        this.name = strArr;
        this.place = strArr2;
        this.images = iArr;
        }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.message, viewGroup, false));
        }


    @Override
    public void onBindViewHolder(@NonNull MessageAdapter.ViewHolder viewHolder, int i) {
        viewHolder.place.setText(this.place[i]);
        viewHolder.company.setText(this.name[i]);
        viewHolder.img.setImageResource(this.images[i]);
    }



     public int getItemCount() {
        return this.name.length;
        }

public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {

    ImageView img;
    TextView place;
    TextView company;

    public ViewHolder(@NonNull View view) {
        super(view);
        this.img = (ImageView) view.findViewById(R.id.imageView);
        this.place = (TextView) view.findViewById(R.id.place);
        this.company = (TextView) view.findViewById(R.id.company);

    }
}
}
