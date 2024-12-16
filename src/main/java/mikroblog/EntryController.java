package mikroblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EntryController {

    private List<Entry> entries;

    public EntryController() {
        entries = new ArrayList<>();
        entries.add(new Entry(1, "Marti", "QWERTYUIOP", "03-12-2024", 6));
        entries.add(new Entry(2, "John", "Hello World", "10-12-2024", 10));
        entries.add(new Entry(3, "Alice", "Sialalalalala", "15-12-2024", 20));
    }

    @GetMapping("/entry")
    public Entry getEntry() {
        return new Entry(1, "Marti", "QWERTYUIOP", "03-12-2024", 6);
    }

    @GetMapping("/entries")
    public List<Entry> getEntries() {
        return entries;
    }

    @GetMapping("/search")
    public List<Entry> searchEntries(@RequestParam String q) {
        if (q.equalsIgnoreCase("coś tam")) {
            return new ArrayList<>(); // zwraca pustą listę
        }

        // filtruje listę wpisów na podstawie parametrów, np. tekstu lub autora
        List<Entry> filteredEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getText().toLowerCase().contains(q.toLowerCase()) ||
                    entry.getAuthor().toLowerCase().contains(q.toLowerCase())) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }
}
