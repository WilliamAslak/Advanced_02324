package week2.Controller;

import week2.Model.IData;

public class Functionality implements IFunctionality {
    private IData iData;
    // Constructor to inject IData implementation
    public Functionality(IData data) {
        this.iData = data;
    }

    @Override
    public double getBMI(String cpr) {
        return 0;
    }

    @Override
    public String getTextualBMI(String cpr) {
        return null;
    }

    @Override
    public String getName(String cpr) {
        return null;
    }
}
