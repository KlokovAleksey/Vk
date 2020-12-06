package domain;

import java.awt.*;

public class PostManager {

    private boolean addComment;
    private int amountDislike;
    private int amountLike;
    private int amountView;
    private String date;
    private boolean deleteComment;
    private boolean editPost;
    private String fromPost;
    private Image imageContent;
    private String message;
    private boolean myFavorite;
    private int postId;
    private boolean repost;
    private boolean shareFriend;


    public boolean isAddComment() {
        return addComment;
    }

    public void setAddComment(boolean addComment) {
        this.addComment = addComment;
    }

    public int getAmountDislike() {
        return amountDislike;
    }

    public void setAmountDislike(int amountDislike) {
        this.amountDislike = amountDislike;
    }

    public int getAmountLike() {
        return amountLike;
    }

    public void setAmountLike(int amountLike) {
        this.amountLike = amountLike;
    }

    public int getAmountView() {
        return amountView;
    }

    public void setAmountView(int amountView) {
        this.amountView = amountView;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDeleteComment() {
        return deleteComment;
    }

    public void setDeleteComment(boolean deleteComment) {
        this.deleteComment = deleteComment;
    }

    public boolean isEditPost() {
        return editPost;
    }

    public void setEditPost(boolean editPost) {
        this.editPost = editPost;
    }

    public String getFromPost() {
        return fromPost;
    }

    public void setFromPost(String fromPost) {
        this.fromPost = fromPost;
    }

    public Image getImageContent() {
        return imageContent;
    }

    public void setImageContent(Image imageContent) {
        this.imageContent = imageContent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isMyFavorite() {
        return myFavorite;
    }

    public void setMyFavorite(boolean myFavorite) {
        this.myFavorite = myFavorite;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public boolean isRepost() {
        return repost;
    }

    public void setRepost(boolean repost) {
        this.repost = repost;
    }

    public boolean isShareFriend() {
        return shareFriend;
    }

    public void setShareFriend(boolean shareFriend) {
        this.shareFriend = shareFriend;
    }
}


