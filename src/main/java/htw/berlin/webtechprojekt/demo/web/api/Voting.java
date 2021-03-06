package htw.berlin.webtechprojekt.demo.web.api;

import java.util.ArrayList;
import java.util.List;

public class Voting {

    private Long id;
    private String title;
    private String image1;
    private String image2;
    private int votingsImage1;
    private int votingsImage2;
    private String ownerId;
    private String userName;
    private List<String> votedUsers = new ArrayList<>();


    public Voting(Long id, String title, String image1, String image2, int votingsImage1, int votingsImage2, String ownerId, String userName, List<String> votedUsers) {
        this.id = id;
        this.title = title;
        this.image1 = image1;
        this.image2 = image2;
        this.votingsImage1 = votingsImage1;
        this.votingsImage2 = votingsImage2;
        this.ownerId = ownerId;
        this.userName = userName;
        this.votedUsers = votedUsers;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public int getVotingsImage1() {
        return votingsImage1;
    }

    public void setVotingsImage1(int votingsImage1) {
        this.votingsImage1 = votingsImage1;
    }

    public int getVotingsImage2() {
        return votingsImage2;
    }

    public void setVotingsImage2(int votingsImage2) {
        this.votingsImage2 = votingsImage2;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getVotedUsers() {
        return votedUsers;
    }

    public void setVotedUsers(List<String> votedUsers) {
        this.votedUsers = votedUsers;
    }
}

