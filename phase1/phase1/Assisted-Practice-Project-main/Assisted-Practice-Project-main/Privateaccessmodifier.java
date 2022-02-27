package assignment1;

class privateaccessmodifier
{ 
   private void display()          //only visible inside the class
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
public class Privateaccessmodifier{
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privateaccessmodifier  obj = new privateaccessmodifier(); 
        
		//Below will give error: trying to access private method of another class 
        //obj.display();

	}

}
