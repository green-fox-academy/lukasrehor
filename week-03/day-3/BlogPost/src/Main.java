public class Main {
    public static void main(String[] args) {
        BlogPost firstPost = new BlogPost("Lorem Ipsum", "Lorem ipsum dolor sit amet.",
                "John Doe", "2000.05.04.");
        BlogPost secondPost = new BlogPost("Wait but why", "A popular long-form," +
                " stick-figure-illustrated blog about almost everything.", "Tim Urban", "2010.10.10.");
        BlogPost thirdPost = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention." +
                        " When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t" +
                        " really into the whole organizer profile thing.", "William Turton", "2017.03.28.");
        System.out.println(firstPost.title);
        System.out.println();
        System.out.println(firstPost.authorName);
        System.out.println(firstPost.publicationDate);
        System.out.println();
        System.out.println(firstPost.text);
    }
}