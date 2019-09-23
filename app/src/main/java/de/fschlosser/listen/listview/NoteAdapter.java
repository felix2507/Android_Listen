package de.fschlosser.listen.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

import de.fschlosser.listen.R;
import de.fschlosser.listen.notes.Note;

public class NoteAdapter extends BaseAdapter {

    private List<Note> notes = Collections.emptyList();

    public NoteAdapter(List<Note> notes) {
        this.notes = notes;
    }

    @Override
    public int getCount() {
        return notes.size();
    }

    @Override
    public Note getItem(int i) {
        return notes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.notes_list_item, viewGroup, false);
        }

        TextView headerTextView = view.findViewById(R.id.note_list_item_header);
        TextView messageTextView = view.findViewById(R.id.note_list_item_message);

        Note note = getItem(i);

        headerTextView.setText(note.getTitle());
        messageTextView.setText(note.getMessage());

        view.setOnClickListener((clickedView -> {
            Toast.makeText(clickedView.getContext(),
                    "Item " + note.getTitle(), Toast.LENGTH_LONG)
                    .show();
        }));

        return view;
    }

}
