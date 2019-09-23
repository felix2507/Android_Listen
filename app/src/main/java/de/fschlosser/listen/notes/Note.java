package de.fschlosser.listen.notes;

import java.util.Arrays;
import java.util.List;

public class Note {

    public static List<Note> dummyEntries() {
        return Arrays.asList(
                new Note("Prüfung", "Prüfungsfragen vorbereiten"),
                new Note("Vorlesung", "Vorlesung vorbereiten"),
                new Note("Einkaufen", "Waschmittel, Brot, ..."),
                new Note("Projekt", "Spätestens um 7 los nach Stuttgart"),
                new Note("Projekt", "IDE einrichten"),
                new Note("Projekt", "App aufsetzen"),
                new Note("Refinement", "Stories anschauen und fragen klären"),
                new Note("Planning", "Arbeitszeit die nächsten 2 Wochen klären"),
                new Note("Review", "Vorbereiten"),
                new Note("Retro", null),
                new Note("Sport", "Endlich mal wieder trainieren gehen")
        );
    }


    private final String title;
    private final String message;

    public Note(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }
}
