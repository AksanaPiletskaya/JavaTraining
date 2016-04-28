public class NBP {
    private final static NBP ins = new NBP();
    private NoteBook noteBook;

    public static NBP getInstance(){
        return ins;
    }

    private NBP(){
        if(noteBook == null) {
            noteBook = new NoteBook();
        }
    }

}
