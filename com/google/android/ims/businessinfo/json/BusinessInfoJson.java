package com.google.android.ims.businessinfo.json;

import com.google.android.ims.businessinfo.json.BusinessInfoJsonData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.crmx;
import defpackage.dhja;
import defpackage.ejwk;
import defpackage.esyx;
import defpackage.esyz;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJson {
    private static final String FALLBACK = "Fallback";
    private static final String SIP_URI = "SIP-URI";
    private static final String SIP_URI_PREFIX = "sip:";

    @esyz(a = "colour")
    @esyx
    String colour;

    @esyz(a = "custom-pcc")
    @esyx
    BusinessInfoCustomJsonData customPccData;

    @esyz(a = "pcc")
    @esyx
    StandardData pccData;

    /* compiled from: PG */
    static class StandardData {

        @esyz(a = "org-details")
        @esyx
        BusinessInfoStandardJsonData standardData;

        @esyz(a = "pcc-type")
        @esyx
        String type;

        StandardData() {
        }
    }

    public BusinessInfoData buildBusinessInfoData(String str, crmx crmxVar) {
        if (str == null || BusinessInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = ejwk.b(getBotId());
        }
        dhja.k("Building business info data object for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        if (parseJsonToBuilder(builder, str, crmxVar)) {
            return builder.build();
        }
        return null;
    }

    public String getBotId() {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        String uri;
        StandardData standardData = this.pccData;
        if (standardData == null || (businessInfoStandardJsonData = standardData.standardData) == null) {
            return null;
        }
        for (BusinessInfoJsonData.UriEntryData uriEntryData : businessInfoStandardJsonData.getUriEntries()) {
            if (Objects.equals(uriEntryData.getType(), SIP_URI) && (uri = uriEntryData.getUri()) != null) {
                return uri.replaceFirst(SIP_URI_PREFIX, "");
            }
        }
        return null;
    }

    public String getColour() {
        return this.colour;
    }

    public String getFallbackUrl() {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        StandardData standardData = this.pccData;
        if (standardData == null || (businessInfoStandardJsonData = standardData.standardData) == null) {
            return null;
        }
        for (BusinessInfoJsonData.UriEntryData uriEntryData : businessInfoStandardJsonData.getUriEntries()) {
            if (Objects.equals(uriEntryData.getLabel(), FALLBACK)) {
                return uriEntryData.getUri();
            }
        }
        return null;
    }

    public String getName() {
        StandardData standardData = this.pccData;
        standardData.getClass();
        return standardData.standardData.getName();
    }

    public boolean parseJsonToBuilder(BusinessInfoData.Builder builder, String str, crmx crmxVar) {
        BusinessInfoStandardJsonData businessInfoStandardJsonData;
        StandardData standardData = this.pccData;
        if (standardData == null || (businessInfoStandardJsonData = standardData.standardData) == null) {
            dhja.q("Could not create business info data object from invalid json: %s", dhja.a(standardData));
            return false;
        }
        businessInfoStandardJsonData.parseJsonToBuilder(builder, str, crmxVar);
        BusinessInfoCustomJsonData businessInfoCustomJsonData = this.customPccData;
        if (businessInfoCustomJsonData != null) {
            businessInfoCustomJsonData.parseJsonToBuilder(builder, crmxVar);
        }
        return true;
    }
}
