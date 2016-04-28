public class Note {

    private String date;
    private String record;

    public Note() {
    }

    public Note(String date, String record) {
        this.date = date;
        this.record = record;
    }

    @Override
    public String toString(){
       return "This is Note date: " + this.date + ", record:" + this.record;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Note)) return false;

        Note note = (Note) obj;

       if (date != null ? !date.equals(note.date) : note.date != null) return false;
       // return !(record != null ? !record.equals(note.record) : note.record != null);

        /*if(date != null){
           !date.equals(note.date)
            return false;
        }else{
            note.date != null
            return false;
        }*/
        if ( record != null ) {
           return record.equals(note.record);
        } else{
            return note.record != null;
        }

    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (record != null ? record.hashCode() : 0);
        return result;
    }
}
