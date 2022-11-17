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

//import android.content.Context;
//import android.content.Intent;
//import com.example.commovproyecto.Ver_Edit_ElimActivity;


public class ListaPrElModeradoresAdapter extends RecyclerView.Adapter<ListaPrElModeradoresAdapter.ModeradorViewHolder> {

    ArrayList<ModeradoresClass> listaPrElimModerador;
    public ListaPrElModeradoresAdapter( ArrayList<ModeradoresClass> listaPrElimModerador){
        this.listaPrElimModerador=listaPrElimModerador;
    }

    @NonNull
    @Override
    public ModeradorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_elimina_moderador,null,false);
        return  new ModeradorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaPrElModeradoresAdapter.ModeradorViewHolder holder, int position) {
        holder.viewNombre.setText(listaPrElimModerador.get(position).getNombre());
        holder.viewCorreo.setText(listaPrElimModerador.get(position).getCorreo());
        holder.viewInstitucion.setText(listaPrElimModerador.get(position).getInstitucion());
        holder.viewPssword.setText(listaPrElimModerador.get(position).getPassw());
        holder.viewArea1.setText(listaPrElimModerador.get(position).getArea1());
        holder.viewarea2.setText(listaPrElimModerador.get(position).getArea2());
        holder.viewNombreMR.setText(listaPrElimModerador.get(position).getNombreMR());
    }

    @Override
    public int getItemCount() {

        return listaPrElimModerador.size();
    }

    public class ModeradorViewHolder extends RecyclerView.ViewHolder {

        TextView viewNombre, viewCorreo, viewArea1, viewarea2, viewInstitucion, viewNombreMR, viewPssword;


        public ModeradorViewHolder(@NonNull View itemView) {
            super(itemView);

            viewNombre= itemView.findViewById(R.id.viewNombreM);
            viewCorreo= itemView.findViewById(R.id.viewCorreo);
            viewArea1= itemView.findViewById(R.id.viewArea1);
            viewarea2= itemView.findViewById(R.id.viewarea2);
            viewInstitucion= itemView.findViewById(R.id.viewInstitucion);
            viewPssword= itemView.findViewById(R.id.viewPssword);
            viewNombreMR= itemView.findViewById(R.id.viewNombreMR);


        /*    itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, Li.class);
                    intent.putExtra("ID",listaPrElimModerador.get(getAdapterPosition()).getId());
                    context.startActivity(intent);

                }
            });*/

        }

    }
}
