package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.crmx;
import defpackage.dfnr;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.ejwk;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.esyx;
import defpackage.esyz;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJsonData {
    protected static final String MAILTO_PREFIX = "mailto:";
    protected static final String SCHEME_SMS = "sms:";

    @esyz(a = "comm-addr")
    @esyx
    CommunicationAddressesData communicationAddressesData;

    @esyz(a = "media-list")
    @esyx
    MediaListData mediaListData;

    @esyz(a = "web-resources")
    @esyx
    WebResourceData webResourceData;
    private static final dfny<Boolean> ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX = dfod.a(152440489);
    private static final ejxr<Pattern> formattablePhoneNumbers = ejxx.a(new ejxr() { // from class: com.google.android.ims.businessinfo.json.BusinessInfoJsonData$$ExternalSyntheticLambda0
        @Override // defpackage.ejxr
        public final Object get() {
            return Pattern.compile((String) dfnr.a().b.e.a());
        }
    });

    /* compiled from: PG */
    private static class CommunicationAddressesData {

        @esyz(a = "tel")
        @esyx
        private TelephoneData telephoneData;

        @esyz(a = "uri-entry")
        @esyx
        private List<UriEntryData> uriEntries;

        private CommunicationAddressesData() {
        }
    }

    /* compiled from: PG */
    private static class MediaListData {

        @esyz(a = "media-entry")
        @esyx
        private List<MediaEntryJsonData> mediaEntries;

        private MediaListData() {
        }
    }

    /* compiled from: PG */
    static class TelephoneData {

        @esyz(a = "custom-label")
        @esyx
        private String customLabel;

        @esyz(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @esyx
        private String label;

        @esyz(a = "tel-nb")
        @esyx
        private TelephoneNumber telephoneNumber;

        @esyz(a = "tel-type")
        @esyx
        private String type;

        /* compiled from: PG */
        private static class TelephoneNumber {

            @esyz(a = "tel-str")
            @esyx
            private String telephoneString;

            private TelephoneNumber() {
            }
        }

        TelephoneData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        String getLabel() {
            return this.label;
        }

        public String getTelephoneString() {
            TelephoneNumber telephoneNumber = this.telephoneNumber;
            return (telephoneNumber == null || telephoneNumber.telephoneString == null) ? "" : this.telephoneNumber.telephoneString;
        }

        public String getTelephoneType() {
            return this.type;
        }

        public String toString() {
            return String.format("tel-str: %s tel-type: %s label: %s custom-label: %s", getTelephoneString(), this.type, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    protected static class UriEntryData {

        @esyz(a = "custom-label")
        @esyx
        private String customLabel;

        @esyz(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @esyx
        private String label;

        @esyz(a = "addr-uri-type")
        @esyx
        private String type;

        @esyz(a = "addr-uri")
        @esyx
        private String uri;

        protected UriEntryData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        public String getLabel() {
            return this.label;
        }

        public String getType() {
            return this.type;
        }

        public String getUri() {
            return this.uri;
        }

        public String toString() {
            return String.format("addr-uri-type: %s addr-uri: %s label: %s custom-label: %s", this.type, this.uri, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    protected static class WebEntryData {

        @esyz(a = "custom-label")
        @esyx
        private String customLabel;

        @esyz(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        @esyx
        private String label;

        @esyz(a = "url")
        @esyx
        private String url;

        protected WebEntryData() {
        }

        protected String getCustomLabel() {
            return this.customLabel;
        }

        protected String getLabel() {
            return this.label;
        }

        protected String getUrl() {
            return this.url;
        }

        public String toString() {
            return String.format("url: %s label: %s custom-label: %s", this.url, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    private static class WebResourceData {

        @esyz(a = "web-entry")
        @esyx
        private List<WebEntryData> webEntries;

        private WebResourceData() {
        }
    }

    static String formatPhoneNumberForHeader(String str, crmx crmxVar) {
        return (!((Boolean) ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX.a()).booleanValue() || formattablePhoneNumbers.get().matcher(str).matches()) ? crmxVar.p(str) : str.startsWith("tel:") ? str.substring(4) : str;
    }

    static String removeSmsPrefix(String str) {
        return ejwk.b(str).replaceFirst(SCHEME_SMS, "");
    }

    protected List<MediaEntryJsonData> getMediaEntries() {
        MediaListData mediaListData = this.mediaListData;
        if (mediaListData != null && mediaListData.mediaEntries != null) {
            return this.mediaListData.mediaEntries;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    protected TelephoneData getTelephoneData() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData == null) {
            return null;
        }
        return communicationAddressesData.telephoneData;
    }

    protected List<UriEntryData> getUriEntries() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData != null && communicationAddressesData.uriEntries != null) {
            return this.communicationAddressesData.uriEntries;
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    protected List<WebEntryData> getWebEntries() {
        WebResourceData webResourceData = this.webResourceData;
        if (webResourceData != null && webResourceData.webEntries != null) {
            return this.webResourceData.webEntries;
        }
        int i = ekgb.d;
        return ekoe.a;
    }
}
