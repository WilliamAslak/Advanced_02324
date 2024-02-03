package week2.Model;

public interface IData {

    //Return the name of the person
    String getName(String cpr);

    //Return the person's weight
    double getWeight(String cpr);

    //Return the person's height
    double getHeight(String cpr);
}
