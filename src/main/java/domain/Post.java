package domain;

import java.awt.*;

public class Post {

    private AddComment addComments;
    private AmountDislike dislikes;
    private AmountDislike canDislikes;
    private AmountLike canLikes;
    private AmountLike likes;
    private AmountView views;
    private Date date;
    private DeleteComment deleteComments;
    private EditPost editPost;
    private FromPost fromPost;
    private ImageContent images;
    private Message canMessage;
    private Message text;
    private MyFavorite favorite;
    private PostId postId;
    private Repost reports;
    private ShareFriend shareFriends;
    private IdOwnerPost idOwner;
    private IdOwnerPost ownerName;
    private IdOwnerPost ownerAvatar;

    public AddComment getAddComments() {
        return addComments;
    }

    public void setAddComments(AddComment addComments) {
        this.addComments = addComments;
    }

    public AmountDislike getDislikes() {
        return dislikes;
    }

    public void setDislikes(AmountDislike dislikes) {
        this.dislikes = dislikes;
    }

    public AmountDislike getCanDislikes() {
        return canDislikes;
    }

    public void setCanDislikes(AmountDislike canDislikes) {
        this.canDislikes = canDislikes;
    }

    public AmountLike getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(AmountLike canLikes) {
        this.canLikes = canLikes;
    }

    public AmountLike getLikes() {
        return likes;
    }

    public void setLikes(AmountLike likes) {
        this.likes = likes;
    }

    public AmountView getViews() {
        return views;
    }

    public void setViews(AmountView views) {
        this.views = views;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DeleteComment getDeleteComments() {
        return deleteComments;
    }

    public void setDeleteComments(DeleteComment deleteComments) {
        this.deleteComments = deleteComments;
    }

    public EditPost getEditPost() {
        return editPost;
    }

    public void setEditPost(EditPost editPost) {
        this.editPost = editPost;
    }

    public FromPost getFromPost() {
        return fromPost;
    }

    public void setFromPost(FromPost fromPost) {
        this.fromPost = fromPost;
    }

    public ImageContent getImages() {
        return images;
    }

    public void setImages(ImageContent images) {
        this.images = images;
    }

    public Message getCanMessage() {
        return canMessage;
    }

    public void setCanMessage(Message canMessage) {
        this.canMessage = canMessage;
    }

    public Message getText() {
        return text;
    }

    public void setText(Message text) {
        this.text = text;
    }

    public MyFavorite getFavorite() {
        return favorite;
    }

    public void setFavorite(MyFavorite favorite) {
        this.favorite = favorite;
    }

    public PostId getPostId() {
        return postId;
    }

    public void setPostId(PostId postId) {
        this.postId = postId;
    }

    public Repost getReports() {
        return reports;
    }

    public void setReports(Repost reports) {
        this.reports = reports;
    }

    public ShareFriend getShareFriends() {
        return shareFriends;
    }

    public void setShareFriends(ShareFriend shareFriends) {
        this.shareFriends = shareFriends;
    }

    public IdOwnerPost getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(IdOwnerPost idOwner) {
        this.idOwner = idOwner;
    }

    public IdOwnerPost getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(IdOwnerPost ownerName) {
        this.ownerName = ownerName;
    }

    public IdOwnerPost getOwnerAvatar() {
        return ownerAvatar;
    }

    public void setOwnerAvatar(IdOwnerPost ownerAvatar) {
        this.ownerAvatar = ownerAvatar;
    }
}