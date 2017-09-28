package sp.phone.common;

import android.location.Location;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import gov.anzong.androidnga.activity.ArticleListActivity;
import gov.anzong.androidnga.activity.FlexibleMessageListActivity;
import gov.anzong.androidnga.activity.FlexibleNonameTopicListActivity;
import gov.anzong.androidnga.activity.FlexibleProfileActivity;
import gov.anzong.androidnga.activity.FlexibleSignActivity;
import gov.anzong.androidnga.activity.FlexibleTopicListActivity;
import gov.anzong.androidnga.activity.LoginActivity;
import gov.anzong.androidnga.activity.MessageDetialActivity;
import gov.anzong.androidnga.activity.MessagePostActivity;
import gov.anzong.androidnga.activity.NonameArticleListActivity;
import gov.anzong.androidnga.activity.NonamePostActivity;
import gov.anzong.androidnga.activity.PostActivity;
import gov.anzong.androidnga.activity.RecentReplyListActivity;
import gov.anzong.androidnga.activity.SignPostActivity;
import gov.anzong.androidnga.activity.SplitArticleListActivity;
import gov.anzong.androidnga.activity.SplitFlexibleMessageListActivity;
import gov.anzong.androidnga.activity.SplitFlexibleNonameTopicListActivity;
import gov.anzong.androidnga.activity.SplitFlexibleProfileActivity;
import gov.anzong.androidnga.activity.SplitFlexibleSignActivity;
import gov.anzong.androidnga.activity.SplitFlexibleTopicListActivity;
import gov.anzong.androidnga.activity.SplitMessageDetialActivity;
import gov.anzong.androidnga.activity.SplitMessagePostActivity;
import gov.anzong.androidnga.activity.SplitNonameArticleListActivity;
import gov.anzong.androidnga.activity.SplitNonamePostActivity;
import gov.anzong.androidnga.activity.SplitPostActivity;
import gov.anzong.androidnga.activity.SplitRecentReplyListActivity;
import gov.anzong.androidnga.activity.SplitSignPostActivity;
import gov.anzong.meizi.MeiziMainActivity;
import gov.anzong.meizi.MeiziTopicActivity;
import gov.anzong.meizi.SplitMeiziMainActivity;
import gov.anzong.meizi.SplitMeiziTopicActivity;
import sp.phone.bean.Bookmark;
import sp.phone.utils.StringUtils;

public class PhoneConfiguration implements PreferenceKey {
    public String userName;
    public int nikeWidth = 100;
    public boolean downAvatarNoWifi;
    public boolean downImgNoWifi;
    public boolean iconmode;
    public boolean refresh_after_post_setting_mode = true;
    public int imageQuality = 0;    //0 = original, 1 = small, 2= medium, 3 = large
    public int swipeenablePosition = 2;    //0 = left, 1 = right, 2= L&R, 3 = L&R&B
    public int HandSide = 0;    //0 = right, 1 = left
    public int blackgunsound = 0;    //0 = right, 1 = left
    public boolean notification;
    public boolean notificationSound;
    public long lastMessageCheck = 0;
    public String cid;
    public String uid;
    public boolean showAnimation = false;
    public boolean showSignature = true;
    public boolean useViewCache;
    public Location location = null;
    public boolean uploadLocation = false;
    public boolean showStatic = false;
    public boolean showReplyButton = true;
    public boolean swipeBack = true;
    public boolean showColortxt = false;
    public boolean showNewweiba = false;
    public boolean showLajibankuai = true;
    public boolean fullscreen = false;
    public boolean kitwebview = false;
    public boolean materialMode;
    public int replytotalnum = 0;
    public Set<Integer> blacklist = new HashSet<Integer>();
    public String db_cookie;
    public Class<?> topicActivityClass = FlexibleTopicListActivity.class;
    public Class<?> articleActivityClass = ArticleListActivity.class;
    public Class<?> nonameArticleActivityClass = NonameArticleListActivity.class;
    public Class<?> postActivityClass = PostActivity.class;
    public Class<?> nonamePostActivityClass = NonamePostActivity.class;
    public Class<?> messagePostActivityClass = MessagePostActivity.class;
    public Class<?> signPostActivityClass = SignPostActivity.class;
    public Class<?> signActivityClass = FlexibleSignActivity.class;
    public Class<?> profileActivityClass = FlexibleProfileActivity.class;
    public Class<?> loginActivityClass = LoginActivity.class;
    public Class<?> recentReplyListActivityClass = RecentReplyListActivity.class;
    public Class<?> MeiziMainActivityClass = MeiziMainActivity.class;
    public Class<?> MeiziTopicActivityClass = MeiziTopicActivity.class;
    public Class<?> messageActivityClass = FlexibleMessageListActivity.class;
    public Class<?> nonameActivityClass = FlexibleNonameTopicListActivity.class;
    public Class<?> messageDetialActivity = MessageDetialActivity.class;
    public String replyString;
    List<Bookmark> bookmarks;// url<-->tilte
    private boolean refreshAfterPost;
    private float textSize;
    private int webSize;
    private int uiFlag = 0;

    private boolean mShowBottomTab;

    private boolean mLeftHandMode;

    private boolean mHaMode;


    private static class PhoneConfigurationHolder {

        private static PhoneConfiguration sInstance = new PhoneConfiguration();
    }


    private PhoneConfiguration() {

        bookmarks = new ArrayList<>();

    }

    public static PhoneConfiguration getInstance() {
        return PhoneConfigurationHolder.sInstance;
    }


    public void setShowBottomTab(boolean value) {
        mShowBottomTab = value;
    }

    public boolean isShownBottomTab() {
        return mShowBottomTab;
    }

    public boolean isLeftHandMode() {
        return mLeftHandMode;
    }

    public void setLeftHandMode(boolean leftHandMode) {
        mLeftHandMode = leftHandMode;
    }

    public void setHardwareAcceleratedMode(boolean value) {
        mHaMode = value;
    }

    public boolean getHardwareAcceleratedMode() {
        return mHaMode;
    }

    public String getDb_Cookie() {
        return db_cookie;
    }

    public void setDb_Cookie(String db_cookie) {
        this.db_cookie = db_cookie;
    }

    public int getNikeWidth() {
        return nikeWidth;
    }

    public void setNikeWidth(int nikeWidth) {
        this.nikeWidth = nikeWidth;
    }

    public boolean isDownAvatarNoWifi() {
        return downAvatarNoWifi;
    }

    public void setDownAvatarNoWifi(boolean downAvatarNoWifi) {
        this.downAvatarNoWifi = downAvatarNoWifi;
    }

    public boolean isDownImgNoWifi() {
        return downImgNoWifi;
    }

    public void setDownImgNoWifi(boolean downImgNoWifi) {
        this.downImgNoWifi = downImgNoWifi;
    }

    public boolean isMaterialMode(){
        return materialMode;
    }

    public void setMaterialMode(boolean materialMode){
        this.materialMode = materialMode;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public boolean isNotificationSound() {
        return notificationSound;
    }

    public void setNotificationSound(boolean notificationSound) {
        this.notificationSound = notificationSound;
    }

    public long getLastMessageCheck() {
        return lastMessageCheck;
    }

    public void setLastMessageCheck(long lastMessageCheck) {
        this.lastMessageCheck = lastMessageCheck;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setNickname(String userName) {
        this.userName = userName;
    }

    public int getReplyTotalNum() {
        return replytotalnum;
    }

    public void setReplyTotalNum(int replytotalnum) {
        this.replytotalnum = replytotalnum;
    }

    public String getReplyString() {
        return replyString;
    }

    public void setReplyString(String replyString) {
        this.replyString = replyString;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public int getWebSize() {
        return webSize;
    }

    public void setWebSize(int webSize) {
        this.webSize = webSize;
    }

    public boolean isRefreshAfterPost() {
        return refreshAfterPost;
    }

    public void setRefreshAfterPost(boolean refreshAfterPost) {
        this.refreshAfterPost = refreshAfterPost;
    }

    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public String getCookie() {
        if (!StringUtils.isEmpty(uid) && !StringUtils.isEmpty(cid)) {
            return "ngaPassportUid=" + uid +
                    "; ngaPassportCid=" + cid;
        }
        return "";
    }

    public boolean addBookmark(String url, String title) {
        boolean ret = true;
        for (Bookmark b : bookmarks) {
            if (b.getUrl().equals(url))
                return false;

        }
        Bookmark newBookmark = new Bookmark();
        newBookmark.setTitle(title);
        newBookmark.setUrl(url);
        bookmarks.add(newBookmark);
        return ret;
    }

    public boolean removeBookmark(String url) {

        for (Bookmark b : bookmarks) {
            if (b.getUrl().equals(url)) {
                bookmarks.remove(b);
                return true;
            }
        }
        return false;

    }


    public int getUiFlag() {
        return uiFlag;
    }

    public void setUiFlag(int uiFlag) {
        this.uiFlag = uiFlag;
        switch (uiFlag) {

            case UI_FLAG_SPLIT:/*仅开启菜单在下方，则文章和主题用split，发还是普通的*/
                topicActivityClass = SplitFlexibleTopicListActivity.class;
                messageActivityClass = SplitFlexibleMessageListActivity.class;
                nonameActivityClass = SplitFlexibleNonameTopicListActivity.class;
                articleActivityClass = SplitArticleListActivity.class;
                nonameArticleActivityClass = SplitNonameArticleListActivity.class;
                messageDetialActivity = SplitMessageDetialActivity.class;
                postActivityClass = PostActivity.class;
                signPostActivityClass = SignPostActivity.class;
                nonamePostActivityClass = NonamePostActivity.class;
                messagePostActivityClass = MessagePostActivity.class;
                signActivityClass = SplitFlexibleSignActivity.class;//
                profileActivityClass = SplitFlexibleProfileActivity.class;
                recentReplyListActivityClass = SplitRecentReplyListActivity.class;
                MeiziMainActivityClass = SplitMeiziMainActivity.class;
                MeiziTopicActivityClass = SplitMeiziTopicActivity.class;
                break;
            case UI_FLAG_HA:/*仅开启硬件加速，全部都要加速，所以发的也要硬件加速的*/
                topicActivityClass = FlexibleTopicListActivity.class;
                articleActivityClass = ArticleListActivity.class;
                nonameArticleActivityClass = NonameArticleListActivity.class;
                messageDetialActivity = MessageDetialActivity.class;
                messageActivityClass = FlexibleMessageListActivity.class;
                nonameActivityClass = FlexibleNonameTopicListActivity.class;
                postActivityClass = PostActivity.class;
                signPostActivityClass = SignPostActivity.class;
                nonamePostActivityClass = NonamePostActivity.class;
                messagePostActivityClass = MessagePostActivity.class;
                signActivityClass = FlexibleSignActivity.class;//OK
                profileActivityClass = FlexibleProfileActivity.class;
                recentReplyListActivityClass = RecentReplyListActivity.class;
                MeiziMainActivityClass = MeiziMainActivity.class;
                MeiziTopicActivityClass = MeiziTopicActivity.class;
                break;
            case UI_FLAG_REPLYSPLIT:/*仅开启发在下面，则菜单和硬件加速都用普通的，发用Split版本的*/
                topicActivityClass = FlexibleTopicListActivity.class;
                messageActivityClass = FlexibleMessageListActivity.class;
                nonameActivityClass = FlexibleNonameTopicListActivity.class;
                articleActivityClass = ArticleListActivity.class;
                nonameArticleActivityClass = NonameArticleListActivity.class;
                messageDetialActivity = MessageDetialActivity.class;
                postActivityClass = SplitPostActivity.class;
                signPostActivityClass = SplitSignPostActivity.class;
                nonamePostActivityClass = SplitNonamePostActivity.class;
                messagePostActivityClass = SplitMessagePostActivity.class;
                signActivityClass = FlexibleSignActivity.class;//
                profileActivityClass = FlexibleProfileActivity.class;
                recentReplyListActivityClass = RecentReplyListActivity.class;
                MeiziMainActivityClass = MeiziMainActivity.class;
                MeiziTopicActivityClass = MeiziTopicActivity.class;
                break;
            case (UI_FLAG_SPLIT + UI_FLAG_HA):/*开启硬件加速和普通菜单在下面，则普通需要下面和加速，加速需要普通和加速，菜单只要加速*/
                topicActivityClass = SplitFlexibleTopicListActivity.class;
                messageActivityClass = SplitFlexibleMessageListActivity.class;
                nonameActivityClass = SplitFlexibleNonameTopicListActivity.class;
                articleActivityClass = SplitArticleListActivity.class;
                nonameArticleActivityClass = SplitNonameArticleListActivity.class;
                messageDetialActivity = SplitMessageDetialActivity.class;
                postActivityClass = PostActivity.class;
                signPostActivityClass = SignPostActivity.class;
                nonamePostActivityClass = NonamePostActivity.class;
                messagePostActivityClass = MessagePostActivity.class;
                signActivityClass = SplitFlexibleSignActivity.class;//
                profileActivityClass = SplitFlexibleProfileActivity.class;
                recentReplyListActivityClass = SplitRecentReplyListActivity.class;
                MeiziMainActivityClass = SplitMeiziMainActivity.class;
                MeiziTopicActivityClass = SplitMeiziTopicActivity.class;
                break;
            case (UI_FLAG_SPLIT + UI_FLAG_REPLYSPLIT):/*开启2个下面，则就是所有split不用ha*/
                topicActivityClass = SplitFlexibleTopicListActivity.class;
                messageActivityClass = SplitFlexibleMessageListActivity.class;
                nonameActivityClass = SplitFlexibleNonameTopicListActivity.class;
                articleActivityClass = SplitArticleListActivity.class;
                nonameArticleActivityClass = SplitNonameArticleListActivity.class;
                messageDetialActivity = SplitMessageDetialActivity.class;
                postActivityClass = SplitPostActivity.class;
                signPostActivityClass = SplitSignPostActivity.class;
                nonamePostActivityClass = SplitNonamePostActivity.class;
                messagePostActivityClass = SplitMessagePostActivity.class;
                signActivityClass = SplitFlexibleSignActivity.class;//
                profileActivityClass = SplitFlexibleProfileActivity.class;
                recentReplyListActivityClass = SplitRecentReplyListActivity.class;
                MeiziMainActivityClass = SplitMeiziMainActivity.class;
                MeiziTopicActivityClass = SplitMeiziTopicActivity.class;
                break;
            case (UI_FLAG_HA + UI_FLAG_REPLYSPLIT):/*开启加速和下面，则普通只要加速，加速也只要加速，菜单需要加速和split*/
                topicActivityClass = FlexibleTopicListActivity.class;
                messageActivityClass = FlexibleMessageListActivity.class;
                nonameActivityClass = FlexibleNonameTopicListActivity.class;
                articleActivityClass = ArticleListActivity.class;
                nonameArticleActivityClass = NonameArticleListActivity.class;
                messageDetialActivity = MessageDetialActivity.class;
                postActivityClass = SplitPostActivity.class;
                signPostActivityClass = SplitSignPostActivity.class;
                nonamePostActivityClass = SplitNonamePostActivity.class;
                messagePostActivityClass = MessagePostActivity.class;
                signActivityClass = FlexibleSignActivity.class;//
                profileActivityClass = FlexibleProfileActivity.class;
                recentReplyListActivityClass = RecentReplyListActivity.class;
                MeiziMainActivityClass = MeiziMainActivity.class;
                MeiziTopicActivityClass = MeiziTopicActivity.class;
                break;
            case (UI_FLAG_SPLIT + UI_FLAG_HA + UI_FLAG_REPLYSPLIT):/*全开就全开*/
                topicActivityClass = SplitFlexibleTopicListActivity.class;
                messageActivityClass = SplitFlexibleMessageListActivity.class;
                nonameActivityClass = SplitFlexibleNonameTopicListActivity.class;
                articleActivityClass = SplitArticleListActivity.class;
                nonameArticleActivityClass = SplitNonameArticleListActivity.class;
                messageDetialActivity = SplitMessageDetialActivity.class;
                postActivityClass = SplitPostActivity.class;
                signPostActivityClass = SplitSignPostActivity.class;
                nonamePostActivityClass = SplitNonamePostActivity.class;
                messagePostActivityClass = SplitMessagePostActivity.class;
                signActivityClass = SplitFlexibleSignActivity.class;//
                profileActivityClass = SplitFlexibleProfileActivity.class;
                recentReplyListActivityClass = SplitRecentReplyListActivity.class;
                MeiziMainActivityClass = SplitMeiziMainActivity.class;
                MeiziTopicActivityClass = SplitMeiziTopicActivity.class;
                break;
            case 0:
            default:
                topicActivityClass = FlexibleTopicListActivity.class;
                articleActivityClass = ArticleListActivity.class;
                nonameArticleActivityClass = NonameArticleListActivity.class;
                messageDetialActivity = MessageDetialActivity.class;
                postActivityClass = PostActivity.class;
                signPostActivityClass = SignPostActivity.class;
                messagePostActivityClass = MessagePostActivity.class;
                signActivityClass = FlexibleSignActivity.class;
                profileActivityClass = FlexibleProfileActivity.class;
                recentReplyListActivityClass = RecentReplyListActivity.class;
                MeiziMainActivityClass = MeiziMainActivity.class;
                MeiziTopicActivityClass = MeiziTopicActivity.class;
                messageActivityClass = FlexibleMessageListActivity.class;
                nonameActivityClass = FlexibleNonameTopicListActivity.class;
                nonamePostActivityClass = NonamePostActivity.class;
        }
    }

}

