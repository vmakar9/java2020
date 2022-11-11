package hw1;

public class Posts {
    private int id;
    private String title;
    private  String body;

   public Posts(){

   }

    public Posts(int id, String title, String body) {

        this.id = id;
        this.title = title;
        this.body = body;
    }

    public void setID(int id){
       this.id = id;
    }

    public int getId(){
       return this.id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
