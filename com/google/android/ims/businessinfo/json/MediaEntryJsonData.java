package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.esyx;
import defpackage.esyz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaEntryJsonData {

    @esyz(a = "custom-label")
    @esyx
    private String customLabel;

    @esyz(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
    @esyx
    private String label;

    @esyz(a = "media")
    @esyx
    private Media media;

    @esyz(a = "media-content")
    @esyx
    private String mediaContent;

    @esyz(a = "addr-uri-type")
    @esyx
    private String type;

    /* compiled from: PG */
    private static class Media {

        @esyz(a = "content")
        @esyx
        private String content;

        @esyz(a = "media-url")
        @esyx
        private String mediaUrl;

        @esyz(a = "url")
        @esyx
        private String url;

        private Media() {
        }
    }

    protected String getContent() {
        Media media = this.media;
        return (media == null || media.content == null) ? "" : this.media.content;
    }

    protected String getCustomLabel() {
        return this.customLabel;
    }

    protected String getLabel() {
        return this.label;
    }

    protected String getMediaContent() {
        return this.mediaContent;
    }

    protected String getType() {
        return this.type;
    }

    protected String getUrl() {
        Media media = this.media;
        if (media == null) {
            return null;
        }
        return !TextUtils.isEmpty(media.mediaUrl) ? this.media.mediaUrl : this.media.url;
    }

    public String toString() {
        return String.format("url: %s content: %s label: %s custom-label: %s media-content: %s addr-uri-type: %s", getUrl(), getContent(), this.label, this.customLabel, this.mediaContent, this.type);
    }
}
