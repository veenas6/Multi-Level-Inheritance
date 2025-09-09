class Person {
    int id;
    String name;

    void setPersonDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayPersonDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class student extends Person {
    String department;

    void setstudentDetails(String department) {
        this.department = department;
    }

    void displaystudentDetails() {
        displayPersonDetails(); 
        System.out.println("Department: " + department);
    }
}

class team extends student {
    int teamSize;
    String teamName;

    void setteamDetails(String teamName, int teamSize) {
       this.teamName= teamName;
       this.teamSize = teamSize;
        
    }

    void displayteamDetails() {
        displaystudentDetails(); 
        System.out.println("Team Name: " + teamName);        
        System.out.println("Team Size: " + teamSize);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        team C1 = new team();
        C1.setPersonDetails(2137, "Veena");
        C1.setstudentDetails("Computer");
        C1.setteamDetails("Alpha",10);
        C1.displayteamDetails();
    }
}
