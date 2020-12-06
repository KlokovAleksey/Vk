package domain;

import java.awt.*;

public class IdOwnerPost {

    private int idOwner;
    private String ownerName;
    private Image ownerAvatar;
    private int date;

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Image getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(Image ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }

}
