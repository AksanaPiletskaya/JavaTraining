public class Note {
    private String name;

    public Note() {
    }

    public String toString(){
       return "This is my note " + this.name;
    }

    public void addRecord(String record) {
    }

    public String getRecordByText(String text){
        return text;
    }

     public void showRecord(String text){
     }

     public boolean loadNote(String fileName){
       return true;
     }

     public boolean saveIntoFile(Note note){
        return true;
     }
}
