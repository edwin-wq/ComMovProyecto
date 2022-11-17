package com.example.commovproyecto.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.commovproyecto.R;
import com.example.commovproyecto.entidades.ModeradoresClass;

import java.util.ArrayList;

public class ListaModeradoresAdapter extends RecyclerView.Adapter<ListaModeradoresAdapter.ModeradorViewHolder> {

    ArrayList<ModeradoresClass> listaModeradores;
    public ListaModeradoresAdapter(ArrayList<ModeradoresClass>listaModeradores){
        this.listaModeradores=listaModeradores;
    }


    @NonNull
    @Override
    public ModeradorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_moderador,null,false);
        return  new ModeradorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModeradorViewHolder holder, int position) {
        //holder.viewId.setText(listaModeradores.get(position).getId());
        holder.viewNombre.setText(listaModeradores.get(position).getNombre());
        holder.viewCorreo.setText(listaModeradores.get(position).getCorreo());
        //holder.viewArea1.setText(listaModeradores.get(position).getArea1());
        //holder.viewarea2.setText(listaModeradores.get(position).getArea2());
        //holder.viewInstitucion.setText(listaModeradores.get(position).getInstitucion());
        //holder.viewNombreMR.setText(listaModeradores.get(position).getNombreMR());
    }

    @Override
    public int getItemCount() {
        return listaModeradores.size();
    }

    public class ModeradorViewHolder extends RecyclerView.ViewHolder {
        //viewId, viewArea1, viewarea2, viewInstitucion, viewNombreMR
        TextView viewNombre, viewCorreo;
        public ModeradorViewHolder(@NonNull View itemView) {
            super(itemView);
            //viewId= itemView.findViewById(R.id.viewId);
            viewNombre= itemView.findViewById(R.id.viewNombreM);
            viewCorreo= itemView.findViewById(R.id.viewCorreo);
            //viewArea1= itemView.findViewById(R.id.viewArea1);
            //viewarea2= itemView.findViewById(R.id.viewarea2);
            //viewInstitucion= itemView.findViewById(R.id.viewInstitucion);
            //viewNombreMR= itemView.findViewById(R.id.viewNombreMR);
        }
    }
}
