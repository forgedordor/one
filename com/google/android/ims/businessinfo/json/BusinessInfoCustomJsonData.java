package com.google.android.ims.businessinfo.json;

import android.text.TextUtils;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.crmx;
import defpackage.dhja;
import defpackage.esyx;
import defpackage.esyz;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoCustomJsonData extends BusinessInfoJsonData {
    private static final String MEDIA_ENTRY_HERO_IMAGE_URL_MEDIA_CONTENT = "HERO";
    private static final String URI_ENTRY_EMAIL_TYPE = "Email";
    private static final String URI_ENTRY_PHONE_NUMBER_TYPE = "Other";
    private static final String WEB_ENTRY_PRIVACY_POLICY_LABEL = "PRIVACY";
    private static final String WEB_ENTRY_WEBSITE_LABEL = "OTHER";

    @esyz(a = "agent-use-case-category")
    @esyx
    private String agentUseCaseCategory;

    private static void addMediaEntryProperty(BusinessInfoData.Builder builder, MediaEntryJsonData mediaEntryJsonData) {
        String mediaContent = mediaEntryJsonData.getMediaContent();
        String url = mediaEntryJsonData.getUrl();
        if (TextUtils.isEmpty(mediaContent) || TextUtils.isEmpty(url)) {
            dhja.q("Cannot parse custom media entry, missing properties: %s", mediaEntryJsonData);
        } else if (mediaContent.equals(MEDIA_ENTRY_HERO_IMAGE_URL_MEDIA_CONTENT)) {
            builder.setHeroImageRemoteUrl(url);
        } else {
            dhja.q("Cannot parse custom media entry, invalid type: %s", mediaEntryJsonData);
        }
    }

    private static void addUriEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.UriEntryData uriEntryData, crmx crmxVar) {
        String type = uriEntryData.getType();
        String uri = uriEntryData.getUri();
        if (TextUtils.isEmpty(type) || TextUtils.isEmpty(uri)) {
            dhja.q("Cannot parse custom uri entry, missing properties: %s", uriEntryData);
            return;
        }
        if (type.equals(URI_ENTRY_EMAIL_TYPE)) {
            builder.addOptionalEmailAddress(uri, uri.replaceFirst("mailto:", ""), uriEntryData.getCustomLabel());
        } else if (type.equals(URI_ENTRY_PHONE_NUMBER_TYPE)) {
            builder.addOptionalPhoneNumber(uri, formatPhoneNumberForHeader(uri, crmxVar), uriEntryData.getCustomLabel());
        } else {
            dhja.q("Cannot parse custom uri entry, invalid type: %s", uriEntryData);
        }
    }

    private static void addWebEntryProperty(BusinessInfoData.Builder builder, BusinessInfoJsonData.WebEntryData webEntryData) {
        String label = webEntryData.getLabel();
        String url = webEntryData.getUrl();
        if (TextUtils.isEmpty(label) || TextUtils.isEmpty(url)) {
            dhja.q("Cannot parse custom web entry, missing properties: %s", webEntryData);
            return;
        }
        if (label.equals(WEB_ENTRY_PRIVACY_POLICY_LABEL)) {
            String customLabel = webEntryData.getCustomLabel();
            if (customLabel != null) {
                label = customLabel;
            }
            builder.setPrivacyPolicyUrl(url, label, null);
            return;
        }
        if (label.equals("OTHER")) {
            builder.addOptionalWebsite(url, url.replaceFirst("^(https?://)", ""), webEntryData.getCustomLabel());
        } else {
            dhja.q("Cannot parse custom web entry, invalid type: %s", webEntryData);
        }
    }

    public void parseJsonToBuilder(BusinessInfoData.Builder builder, crmx crmxVar) {
        Iterator<BusinessInfoJsonData.UriEntryData> it = getUriEntries().iterator();
        while (it.hasNext()) {
            addUriEntryProperty(builder, it.next(), crmxVar);
        }
        Iterator<MediaEntryJsonData> it2 = getMediaEntries().iterator();
        while (it2.hasNext()) {
            addMediaEntryProperty(builder, it2.next());
        }
        Iterator<BusinessInfoJsonData.WebEntryData> it3 = getWebEntries().iterator();
        while (it3.hasNext()) {
            addWebEntryProperty(builder, it3.next());
        }
        if (!((Boolean) BusinessInfoData.enableAgentUseCaseCategoryDeserialization.a()).booleanValue() || TextUtils.isEmpty(this.agentUseCaseCategory)) {
            return;
        }
        builder.setAgentUseCase(AgentUseCase.valueOf(this.agentUseCaseCategory));
    }
}
