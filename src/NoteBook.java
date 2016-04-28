import java.util.ArrayList;

public class NoteBook extends NoteBookConsoleView {
    private ArrayList<Note> notes;
    private String name;

    public NoteBook(String name){
       this.name = name;
    }

    public NoteBook(){

    }



    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof NoteBook)) return false;

        NoteBook noteBook = (NoteBook) obj;

        return !(name != null ? !name.equals(noteBook.name) : noteBook.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
