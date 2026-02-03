package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.crmx;
import defpackage.dhja;
import defpackage.ejwk;
import defpackage.esyx;
import defpackage.esyz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CombinedBusinessInfoAndVerifierInfoJson {

    @esyz(a = "botinfo")
    @esyx
    private BusinessInfoJson botInfo;

    @esyz(a = "bot-verification")
    @esyx
    private BusinessVerifierInfoJsonData botVerifierInfo;

    public BusinessInfoData buildBusinessInfoData(String str, crmx crmxVar) {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData;
        if (str == null || CombinedBusinessInfoAndVerifierInfoJson$$ExternalSyntheticBackport0.m(str)) {
            str = ejwk.b(getBotId());
        }
        dhja.k("Building business info data object with verifier info for %s", str);
        BusinessInfoData.Builder builder = BusinessInfoData.builder(str);
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson == null) {
            dhja.q("Could not create business info data object from invalid json: %s", null);
            return null;
        }
        if (businessInfoJson.parseJsonToBuilder(builder, str, crmxVar) && ((businessVerifierInfoJsonData = this.botVerifierInfo) == null || businessVerifierInfoJsonData.parseJsonToBuilder(builder, str))) {
            return builder.build();
        }
        return null;
    }

    public String getBotId() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getBotId();
        }
        return null;
    }

    public String getColour() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getColour();
        }
        return null;
    }

    public String getFallbackUrl() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getFallbackUrl();
        }
        return null;
    }

    public String getName() {
        BusinessInfoJson businessInfoJson = this.botInfo;
        if (businessInfoJson != null) {
            return businessInfoJson.getName();
        }
        return null;
    }

    public boolean getVerified() {
        BusinessVerifierInfoJsonData businessVerifierInfoJsonData = this.botVerifierInfo;
        if (businessVerifierInfoJsonData != null) {
            return businessVerifierInfoJsonData.getVerified();
        }
        return false;
    }
}
