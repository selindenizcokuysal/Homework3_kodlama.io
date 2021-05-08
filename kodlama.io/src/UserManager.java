public class UserManager {

    public void add(User user){
        System.out.println(user.getId() + " is added.");
    }

    public void delete(User user){
        System.out.println(user.getId() +" is deleted.");
    }
    public void online(User user){
        System.out.println(user.getFirstName()+user.getLastName()+" is online!");
    }
    public void addMultiple(User[] users){
        for (User user : users){
            add(user);

        }

    }
}

