package com.slx.prototype;

public class Room
{
    String roomID;

    public Room(String roomID)
    {
        this.roomID = roomID;
    }

    /*** ACCESSORS ***/

    public String getRoomID()
    {
        return roomID;
    }

    public void setRoomID(String roomID)
    {
        this.roomID = roomID;
    }
}
