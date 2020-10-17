package service;

import implementation.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part  time Mentor Account is Created...");
    }
}
