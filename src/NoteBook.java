public class NoteBook extends Note{
    private String model;
    private String page;
    private int quantityPages;

    public NoteBook(String model, int quantityPages, String page){
       this.model = model;
       this.quantityPages = quantityPages;
       this.page = page;
    }

    public boolean equals(Object object){
        if (object == null) {
           return false;
        }

        NoteBook nb1 = (NoteBook) object;

        if (this.model == nb1.model){
           return true;
        }
        return false;
    }

}
