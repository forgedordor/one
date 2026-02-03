package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import defpackage.crmx;
import defpackage.dhja;
import defpackage.esyd;
import defpackage.esye;
import defpackage.esyr;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJsonParser {
    private static final esyd marshaller;

    static {
        esye esyeVar = new esye();
        esyeVar.b();
        marshaller = esyeVar.a();
    }

    private BusinessInfoJsonParser() {
    }

    public static BusinessInfoData legacyParse(String str, Reader reader, crmx crmxVar) {
        dhja.k("Attempting to parse json for %s...", dhja.a(str));
        try {
            BusinessInfoJson businessInfoJson = (BusinessInfoJson) marshaller.g(reader, BusinessInfoJson.class);
            dhja.k("Done parsing json for %s.", dhja.a(str));
            if (businessInfoJson != null) {
                return businessInfoJson.buildBusinessInfoData(str, crmxVar);
            }
            dhja.g("Received null json object from parsing rbmBotId %s", dhja.a(str));
            return null;
        } catch (esyr unused) {
            dhja.g("Unable to parse business info for rbmBotId %s due to invalid JSON", dhja.a(str));
            return null;
        }
    }

    public static BusinessInfoData parse(String str, Reader reader, crmx crmxVar) {
        dhja.k("Attempting to parse json for %s...", dhja.a(str));
        try {
            CombinedBusinessInfoAndVerifierInfoJson combinedBusinessInfoAndVerifierInfoJson = (CombinedBusinessInfoAndVerifierInfoJson) marshaller.g(reader, CombinedBusinessInfoAndVerifierInfoJson.class);
            dhja.k("Done parsing json for %s.", dhja.a(str));
            if (combinedBusinessInfoAndVerifierInfoJson != null) {
                return combinedBusinessInfoAndVerifierInfoJson.buildBusinessInfoData(str, crmxVar);
            }
            dhja.g("Received null json object from parsing rbmBotId %s", dhja.a(str));
            return null;
        } catch (esyr unused) {
            dhja.g("Unable to parse business info for rbmBotId %s due to invalid JSON", dhja.a(str));
            return null;
        }
    }
}
