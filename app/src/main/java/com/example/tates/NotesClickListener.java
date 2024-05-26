package com.example.tates;

import androidx.cardview.widget.CardView;

import com.example.tates.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
