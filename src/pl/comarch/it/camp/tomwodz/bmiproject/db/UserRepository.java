package pl.comarch.it.camp.tomwodz.bmiproject.db;

import pl.comarch.it.camp.tomwodz.bmiproject.user.User;
public class UserRepository {
    private User[] users = new User[6];

    public UserRepository() {
        this.users[0] = new User("Empty", "Empty", 0, 0, 0, "Empty", true,0);
        this.users[1] = new User("Empty", "Empty", 0, 0, 0, "Empty", true,0);
        this.users[2] = new User("Empty", "Empty", 0, 0, 0, "Empty", true,0 );
        this.users[3] = new User("Empty", "Empty", 0, 0, 0, "Empty", true, 0);
        this.users[4] = new User("Empty", "Empty", 0, 0, 0, "Empty", true, 0);
        this.users[5] = new User("Empty", "Empty", 0, 0, 0, "Empty", true, 0);
    }

    public User[] getUsers() {
        return users;
    }
    public void setUsers(String id, String name, double height, double weight, double bmi, String descriptionBmi, boolean empty, int nextID) {
        for (User user : this.users) {
            if (user.isEmpty() != empty) {
                user.setEmpty(empty);
                user.setID(id);
                user.setName(name);
                user.setHeight(height);
                user.setWeight(weight);
                user.setWeight(weight);
                user.setDescriptionBmi(descriptionBmi);
                user.setBMI(bmi);
                user.setNextID(nextID);
                System.out.println("Remeber your ID!: " + user.getID());
                if(nextID > 5) {
                    clearUser(nextID - 5); // Automatyczne czyszczenie najstarszego User'a tablicy User
                    break;
                }
                break;
            }
        }
    }

    public void clearUser(int n){
        for (User user : this.users) {
            if (user.getNextID() == n) {
                user.setEmpty(true);
                user.setName("Free");
                user.setHeight(0);
                user.setWeight(0);
                user.setDescriptionBmi("Empty");
                user.setBMI(0);
                user.setID("Free");
                break;
            }
        }
        }
    }


