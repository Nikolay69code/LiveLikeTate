package com.example.tates.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tates.Models.Notes;
import com.example.tates.NotesClickListener;
import com.example.tates.R;

import java.util.List;

public class NotesListAdapter extends RecyclerView.Adapter<NotesViewHolder> {

    Context context;
    List<Notes> list;
    NotesClickListener listener;

    public NotesListAdapter(Context context, List<Notes> list, NotesClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotesViewHolder(LayoutInflater.from(context).inflate(R.layout.notes_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        holder.textdate.setText(list.get(position).getDate());
        holder.textdate.setSelected(true);

        holder.texttitle.setText(list.get(position).getTitle());
        holder.texttitle.setSelected(true);

        holder.textnotes.setText(list.get(position).getNotes());
        holder.textnotes.setSelected(true);

        if(list.get(position).isPinned()){
            holder.imageButton.setImageResource(R.drawable.but);
        }
        else{
            holder.imageButton.setImageResource(0);
        }
        holder.notes_conteiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(list.get(holder.getAdapterPosition()));
            }
        });
        holder.notes_conteiner.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onLongClick(list.get(holder.getAdapterPosition()),holder.notes_conteiner);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public void filterList(List<Notes> filteredList){
        list = filteredList;
        notifyDataSetChanged();
    }
}
class NotesViewHolder extends RecyclerView.ViewHolder {
    CardView notes_conteiner;
    TextView texttitle,textnotes,textdate;
    ImageButton imageButton;
    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        notes_conteiner = itemView.findViewById(R.id.notes_conteiner);
        texttitle= itemView.findViewById(R.id.texttitle);
        textnotes = itemView.findViewById(R.id.textnotes);
        textdate = itemView.findViewById(R.id.textdate);
        imageButton = itemView.findViewById(R.id.imageButton);
    }
}
