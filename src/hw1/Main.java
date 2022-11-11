package hw1;

public class Main {
    public static void main(String[] args) {
        Posts post = new Posts();

        Posts post1 = new Posts(
                2,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "uia et suscipit\\nsuscipit recusandae consequuntur expedita et cum nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"
        );

        System.out.println(post1);

        post1.setID(3);
        System.out.println(post1.getId());

        post1.setBody("hbomdskfjehjagdf");
        System.out.println(post1.getBody());

        post1.setTitle("bnkfswjktrewe");
        System.out.println(post1.getTitle());


        Comments comments = new Comments();

        Comments comments1 = new Comments(
                1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\\ntempora quo necessitatibus\\ndolor quam autem quasi\\nreiciendis et nam sapiente accusantium"
        );

        System.out.println(comments1);

        comments1.setId(2);
        System.out.println(comments1.getId());

        comments1.setName("kfoijg");
        System.out.println(comments1.getName());

        comments1.setEmail("biurhntg@gmail.com");
        System.out.println(comments1.getEmail());

        comments1.setBody("ihverofsadavf");
        System.out.println(comments1.getBody());

    }

}
