
public class Person {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    Person(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;

        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name ==null || name.trim().isEmpty()){
            this.name = "Информация не указана";}
        else {
            this.name = name;
        }
        if (town == null || town.trim().isEmpty()){
            this.town = "Инфрмация не указана";}
        else {
            this.town = town;
        }
        if (jobTitle == null|| jobTitle.trim().isEmpty())
        {
            this.jobTitle ="Информация не указана";
        }else{

            this.jobTitle = jobTitle;

        }}
    void getAcquainted() {
        System.out.println("Привет меня зовут " + this.name + " Я из города " + this.town + " Я родился в " + this.yearOfBirth + " году " + " Я работаю на должности " + this.jobTitle + " Будем знакомы!");
    }

}

