package com.example.daftarhargalaptop.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.daftarhargalaptop.DetailActivity;
import com.example.daftarhargalaptop.R;
import com.example.daftarhargalaptop.model.Laptop;
import java.util.ArrayList;

public class ListLaptopAdapter extends RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder> {
    private ArrayList<Laptop> listLaptop;

    public ListLaptopAdapter(ArrayList<Laptop> list) {
        this.listLaptop = list;
    }

    @NonNull
    @Override
    public ListLaptopAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_laptop, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Laptop laptop = listLaptop.get(position);

        Glide.with(holder.itemView.getContext())
                .load(laptop.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvJenis.setText(laptop.getJenis());
        holder.tvHarga.setText(laptop.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Laptop selectedLaptop = listLaptop.get(holder.getAdapterPosition());
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_JENIS, selectedLaptop.getJenis());
                intent.putExtra(DetailActivity.EXTRA_MERK, selectedLaptop.getMerk());
                intent.putExtra(DetailActivity.EXTRA_HARGA, selectedLaptop.getHarga());
                intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, selectedLaptop.getDeskripsi());
                intent.putExtra(DetailActivity.EXTRA_PHOTO, selectedLaptop.getPhoto());
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listLaptop.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvJenis, tvHarga;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvJenis = itemView.findViewById(R.id.tv_item_jenis);
            tvHarga = itemView.findViewById(R.id.tv_item_harga);
        }
    }
}
