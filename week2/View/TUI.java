package week2.View;

// TUI.java
import week2.Controller.Functionality;
import week2.Controller.IFunctionality;
import week2.Model.Data;
import week2.Model.IData;

import java.util.Scanner;

public class TUI {
    private IFunctionality functionality;

    // Constructor to inject IFunctionality implementation
    public TUI(IFunctionality functionality) {
        this.functionality = functionality;
    }

    public void run(IData data, IFunctionality func) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CPR number: ");
        String cpr = scanner.nextLine();

        double bmi = func.getBMI(cpr);
        String textualBMI = func.getTextualBMI(cpr);
        String name = func.getName(cpr);

        System.out.println("Name: " + name);
        System.out.println("BMI: " + bmi);
        System.out.println("BMI Category: " + textualBMI);
    }

    public static void main(String[] args) {
        IData data = new Data();  // Replace with actual data implementation
        IFunctionality functionality = new Functionality(data);
        TUI tui = new TUI(functionality);

        tui.run(data, functionality);
    }
}
