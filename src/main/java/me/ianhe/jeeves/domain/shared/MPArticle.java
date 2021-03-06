package me.ianhe.jeeves.domain.shared;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author iHelin
 * @since 2018/8/15 20:39
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MPArticle {
    @JsonProperty
    private String Title;
    @JsonProperty
    private String Digest;
    @JsonProperty
    private String Cover;
    @JsonProperty
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDigest() {
        return Digest;
    }

    public void setDigest(String digest) {
        Digest = digest;
    }

    public String getCover() {
        return Cover;
    }

    public void setCover(String cover) {
        Cover = cover;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
