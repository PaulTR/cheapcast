package at.maui.cheapcast.chromecast.model;

/**
 * Created with IntelliJ IDEA.
 * User: maui
 * Date: 08.08.13
 * Time: 14:34
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionResponse2 {
    private String URL, type;
    private int requestId;
    private Detail senderId;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Detail getSenderId() {
        return senderId;
    }

    public void setSenderId(Detail senderId) {
        this.senderId = senderId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}