
public class User {
   public String name;
   
   public User(String name)
   {
	   this.name = name;
   }
   
   @Override
   public boolean equals(Object o)
   {
	   User inUser = (User)o;
	   return this.name.equals(inUser.name);
   }
   
}
