class CalculateAges 
{
public static void main (String [] args)
{
 myAge();
 georgeAge();
 mariaAge();
 eleniAge();

}

public static void myAge (){
    
 Integer current_year = 2020;
 Integer age = 30;
 Integer year = current_year -age;
 Integer was_old =1960;
 Integer will_old =2040;
        
 System.out.println("Giannis you were born in: " + year);
 System.out.println("You were " + (was_old - year) + " in 1960");
 System.out.println("You will be " + (will_old - year) + " in 2040");
}

public static void georgeAge (){
    
 Integer current_year = 2020;
 Integer age = 40;
 Integer year = current_year -age;
 Integer was_old =1960;
 Integer will_old =2040;
        
 System.out.println("George you were born in: " + year);
 System.out.println("You were " + (was_old - year) + " in 1960");
 System.out.println("You will be " + (will_old - year) + " in 2040");
}

public static void mariaAge (){
    
 Integer current_year = 2020;
 Integer age = 20;
 Integer year = current_year -age;
 Integer was_old =1960;
 Integer will_old =2040;
        
 System.out.println("Maria you were born in: " + year);
 System.out.println("You were " + (was_old - year) + " in 1960");
 System.out.println("You will be " + (will_old - year) + " in 2040");
}

public static void eleniAge (){
    
 Integer current_year = 2020;
 Integer age = 25;
 Integer year = current_year -age;
 Integer was_old =1960;
 Integer will_old =2040;
        
 System.out.println("Eleni you were born in: " + year);
 System.out.println("You were " + (was_old - year) + " in 1960");
 System.out.println("You will be " + (will_old - year) + " in 2040");
}

}




