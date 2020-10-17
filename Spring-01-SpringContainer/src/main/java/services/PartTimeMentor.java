package services;

import iterfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor is created");
    }
}
