package basic.aktivity.tugas3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {

    private final ArrayList<ItemModel>dataitem;
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textNama;
        TextView textEmail;
        LinearLayoutCompat parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textNama = itemView.findViewById(R.id.text_nama);
            textEmail = itemView.findViewById(R.id.text_email);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

    AdapterRecycleView(Context context, ArrayList<ItemModel>dataitem){
        this.context = context;
        this.dataitem = dataitem;
    }

    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleView.ViewHolder holder, int position) {

        TextView textNama = holder.textNama;
        TextView textEmail = holder.textEmail;

        textNama.setText(dataitem.get(position).getName());
        textEmail.setText(dataitem.get(position).getEmail());

        holder.parentLayout.setOnClickListener(v ->{
            Toast.makeText(context,"Anda memilih"+ dataitem.get(position).getName(), Toast.LENGTH_SHORT).show();

            if (dataitem.get(position).getName().equals("Ahsani")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "ASAHNI TAQWIM");
                context.startActivity(intent);
            }
            if (dataitem.get(position).getName().equals("Aufa")){
                Intent intent = new Intent(context, DefaultActivity.class);
            intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
            intent.putExtra("TEXT_DEFAULT", "AUFA RAHMAN");
            context.startActivity(intent);
        }
            if (dataitem.get(position).getName().equals("Fayat")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "FAYAT ZABIHULLAH");
                context.startActivity(intent);
            }
            if (dataitem.get(position).getName().equals("Ferdi")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "FERDI HASAN");
                context.startActivity(intent);
            }
            if (dataitem.get(position).getName().equals("Irfan")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "IRFAN DWI PRAWIRA");
                context.startActivity(intent);
            }
            if (dataitem.get(position).getName().equals("Taufik")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "TAUFIK APRINALDO");
                context.startActivity(intent);
            }
            if (dataitem.get(position).getName().equals("Zaky")){
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.ic_android_black_24dp);
                intent.putExtra("TEXT_DEFAULT", "M ZAKY APRIMA");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataitem.size();
    }
}
