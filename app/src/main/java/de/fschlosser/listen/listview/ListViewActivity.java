package de.fschlosser.listen.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import de.fschlosser.listen.R;
import de.fschlosser.listen.notes.Note;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new NoteAdapter(Note.dummyEntries()));
    }
}
