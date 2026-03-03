public class Two{
String title; String author; int year;
public Two(String author,String title){
this.title=title;
this.author=author;
}public Two(String author, String title, int year){
this.author=author;
this.title=title;
this.year=year;
}public void display(){
System.out.println("Book Title: "+title+"\nAuthor:"+author+"\nyear"+year+"\n-------");
}
public static void main(String[] args){
Two b1= new Two("Atomic Habits","James Clear",2007);
Two b2= new Two("Compound Effect","Darren Harry",2016);
System.out.println("-------");
b1.display();
b2.display();
}
}
