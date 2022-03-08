package com.company;

public class AttendeeManager {
    public Attendee createByID(String id) throws InvalidIDNumberException {
        Attendee newAttendee = new Attendee(id);
        if (newAttendee.getIdNumber().length() == 8) {
            return newAttendee;
        } else {
            throw new InvalidIDNumberException("Error creating Attendee, Invalid ID Number");
        }
    }
}
