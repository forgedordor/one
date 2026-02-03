package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.dhib;
import defpackage.dhja;
import defpackage.esyx;
import defpackage.esyz;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessVerifierInfoJsonData {
    private static final String MEDIA_ENTRY_LOGO_IMAGE_URL_MEDIA_CONTENT = "LOGO";
    static final String VERIFIER_ID_NAMESPACE_FORMAT_STRING = "%s:%s";

    @esyz(a = "verification-info")
    @esyx
    private VerificationInfoData verificationInfoData;

    /* compiled from: PG */
    static class VerificationInfoData {

        @esyz(a = "media-list")
        @esyx
        private MediaListData mediaListData;

        @esyz(a = "verified")
        @esyx
        private boolean verified;

        @esyz(a = "verifier-id")
        @esyx
        private String verifierId;

        @esyz(a = "verified-by")
        @esyx
        private String verifierName;

        /* compiled from: PG */
        private static class MediaListData {

            @esyz(a = "media-entry")
            @esyx
            private List<MediaEntryJsonData> mediaEntries;

            private MediaListData() {
            }

            public List<MediaEntryJsonData> getMediaEntries() {
                return this.mediaEntries;
            }
        }

        VerificationInfoData() {
        }
    }

    private void addMediaEntryProperty(BusinessInfoData.Builder builder, MediaEntryJsonData mediaEntryJsonData) {
        String mediaContent = mediaEntryJsonData.getMediaContent();
        if (TextUtils.isEmpty(mediaContent) || TextUtils.isEmpty(mediaEntryJsonData.getUrl())) {
            dhja.q("Cannot parse custom media entry, missing properties: %s", mediaEntryJsonData);
        } else if (mediaContent.equals("LOGO")) {
            builder.setVerifierLogoImageRemoteUrl(mediaEntryJsonData.getUrl());
        } else {
            dhja.q("Cannot parse custom media entry, invalid type: %s", mediaEntryJsonData);
        }
    }

    static String getNamespacedVerifierId(String str, String str2) {
        String strA = dhib.a(str);
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException(String.format("Cannot parse RBM bot id for its SIP host: %s", str));
        }
        return String.format(VERIFIER_ID_NAMESPACE_FORMAT_STRING, strA, str2);
    }

    public boolean getVerified() {
        return this.verificationInfoData.verified;
    }

    public boolean parseJsonToBuilder(BusinessInfoData.Builder builder, String str) {
        VerificationInfoData verificationInfoData = this.verificationInfoData;
        if (verificationInfoData == null) {
            dhja.q("Could not create business info data object from invalid verifier info json: %s", dhja.a(null));
            return false;
        }
        builder.setVerifierName(verificationInfoData.verifierName);
        builder.setVerifierId(getNamespacedVerifierId(str, this.verificationInfoData.verifierId));
        List<MediaEntryJsonData> mediaEntries = this.verificationInfoData.mediaListData.getMediaEntries();
        if (mediaEntries != null) {
            Iterator<MediaEntryJsonData> it = mediaEntries.iterator();
            while (it.hasNext()) {
                addMediaEntryProperty(builder, it.next());
            }
        }
        return true;
    }
}
