class Book{
    private String author_name ;
    Book(String a){
        author_name=a; 
    }
    void print(){
        System.out.println("Author_name= "+ author_name );
    }
}
class Book_publication extends Book{
    private String Title ;
    Book_publication(String author,String title){
        super(author);
        this.Title=title;
    }
    
    void print(){
        super.print();
        System.out.println("Title ="+Title);
    }
}
class Paper_publication extends Book{
    private String Title ;
    Paper_publication(String author,String title){
        super(author);
        this.Title=title;
    }
    
    void print(){
        super.print();
        System.out.println("Title ="+Title);
    }
}
class Lab6__3{
    public static void main(String[]args){
       //java Lab6__3 abc book/paper(type) darshan
       //args[0]=authorname;
       // args[1]=type;
       //args [2]=title;
        Book b;
        if(args[1].equalsIgnoreCase("book")){
            b=new Book_publication(args[0],args[2]);
        }
        else if(args[1].equalsIgnoreCase("paper")){
            b=new Paper_publication(args[0],args[2]);
        }
        else{
            b=new Book(args[0]);
        }
        b.print();
    }
}