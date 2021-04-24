package com.example.tugas4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.text.BreakIterator;
import java.util.ArrayList;

//dihubungkan denganrecyclerview agar layout dan fungsinya dapat berjalan
//viewholder untuk menyimpan view yang akan digunakan
public class OppoAdapter extends RecyclerView.Adapter<OppoAdapter.viewHolder> {
    //informasi memulai intent, view, atau layout
    private Context context;
    private ArrayList<OppoModel> oppoModels;

    public OppoAdapter(ArrayList<OppoModel> listData, Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<OppoModel> getOppoModels(){
        return oppoModels;
    }

    public void setOppoModels(ArrayList<OppoModel> oppoModels) {
        this.oppoModels = oppoModels;
    }

    @NonNull
    @Override
    //pembuatan vvieholder baru
    public OppoAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //convert layout xml
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    //untuk mengambil data yg digunakan mengisi di tampilannyya
    public void onBindViewHolder(@NonNull OppoAdapter.viewHolder holder, int i) {
        //untuk load gambar
        Glide.with(context).load(getOppoModels().get(i).getFoto()).into(holder.iv_foto);
        holder.tv_tipe.setText(getOppoModels().get(i).getTipe());

    }

    @Override
    //mendapatkan set ukuran data yang akan ditampilkan
    public int getItemCount() {

        return getOppoModels().size();
    }
    //class holder yg terhubung ke layout item list
    public class viewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_foto;
        private TextView tv_tipe;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            iv_foto = itemView.findViewById(R.id.foto_oppo);
            tv_tipe = itemView.findViewById(R.id.tipe_oppo);
        }
    }
}
