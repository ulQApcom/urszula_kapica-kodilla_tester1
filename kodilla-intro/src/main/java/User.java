public class User {
    String userName;
    int userAge;



    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public String getUserNames(){
        return this.userName;
    }

    public int getUserAge(){
        return this.userAge;
    }


    public static void main(String[] args) {

        User carl = new User("Carl", 22);
        User gilda = new User("Gilda", 12);
        User connie = new User("Connie", 31);
        User barbara = new User("Barbara", 42);
        User robert = new User("Robert", 56);

        User[] users = {carl, gilda, connie, barbara, robert};

        int sum = 0;
        int average = 0;

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getUserAge();
        }

        average = sum/users.length;
        for (int i= 0; i< users.length; i++){
            if( average>users[i].userAge){
                System.out.println("User names is:" + users[i].getUserNames() + " is younger than age average.");
            }
        }

    }
}


