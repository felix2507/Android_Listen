package de.fschlosser.listen.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import de.fschlosser.listen.R;
import de.fschlosser.listen.notes.Note;

public class NotesRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Note> notes = Collections.emptyList();

    public NotesRecyclerAdapter(List<Note> notes) {
        this.notes = notes;
    }
    @Override
    public int getItemCount() {
        return notes.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.notes_list_item, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        View view = holder.itemView;
        TextView headerTextView = view.findViewById(R.id.note_list_item_header);
        TextView messageTextView = view.findViewById(R.id.note_list_item_message);

        headerTextView.setText(notes.get(position).getTitle());
        messageTextView.setText(notes.get(position).getMessage());

        view.setOnClickListener((View v) -> {
            Toast.makeText(v.getContext(),
                    notes.get(position).getTitle() + " clicked",
                    Toast.LENGTH_LONG)
                    .show();
        });
    }

}
