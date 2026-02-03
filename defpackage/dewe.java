package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.ims.businessinfo.json.BusinessInfoJsonParser;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dewe extends dewf {
    private volatile String a;
    private final BusinessInfoDatabase e;
    private final boolean f;
    private final crmx g;

    /* JADX WARN: Illegal instructions before constructor call */
    public dewe(String str, Context context, BusinessInfoDatabase businessInfoDatabase, boolean z, crmx crmxVar) {
        dewi dewiVar = dewi.AVAILABILITY_UNKNOWN;
        super(str, context, dewiVar);
        this.e = businessInfoDatabase;
        this.f = z;
        this.g = crmxVar;
        ejwi<String> businessInfoVersion = businessInfoDatabase.getBusinessInfoVersion(str);
        if (businessInfoVersion.g()) {
            this.a = (String) businessInfoVersion.c();
        }
        this.d = businessInfoDatabase.isMetadataLocallyAvailable(str) ? dewi.INFO_LOCALLY_AVAILABLE : dewiVar;
    }

    private final void g(BusinessInfoDatabase businessInfoDatabase, HttpsURLConnection httpsURLConnection) throws NumberFormatException {
        String headerField = httpsURLConnection.getHeaderField("ETag");
        this.a = headerField;
        String headerField2 = httpsURLConnection.getHeaderField("Cache-Control");
        long millis = 0;
        if (headerField2 != null) {
            String[] strArrSplit = TextUtils.split(headerField2, ",");
            int length = strArrSplit.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String strTrim = strArrSplit[i].trim();
                if (strTrim.startsWith("max-age=")) {
                    try {
                        millis = TimeUnit.SECONDS.toMillis(Long.parseLong(strTrim.substring(8))) + dhkl.a().longValue();
                        break;
                    } catch (Exception e) {
                        dhja.i(e, "Failed to parse the cache-control header: %s", headerField2);
                    }
                }
                i++;
            }
        }
        businessInfoDatabase.insertOrUpdateBusinessInfoMetadata(this.b, headerField, millis);
    }

    @Override // defpackage.dewf
    protected final dewi a(HttpsURLConnection httpsURLConnection) throws IOException {
        dewi dewiVar;
        URL url = httpsURLConnection.getURL();
        dhja.k("Fetching business info metadata from %s...", dhja.a(url));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
        try {
            boolean z = this.f;
            String str = this.b;
            BusinessInfoData businessInfoDataLegacyParse = z ? BusinessInfoJsonParser.parse(str, bufferedReader, this.g) : BusinessInfoJsonParser.legacyParse(str, bufferedReader, this.g);
            if (businessInfoDataLegacyParse != null) {
                String rbmBotId = businessInfoDataLegacyParse.getRbmBotId();
                String name = businessInfoDataLegacyParse.getName();
                dhja.k("Saving bot info metadata for botId: %s name: %s...", dhja.a(rbmBotId), dhja.a(name));
                BusinessInfoDatabase businessInfoDatabase = this.e;
                g(businessInfoDatabase, httpsURLConnection);
                if (businessInfoDatabase.insertOrUpdateBusinessInfoData(businessInfoDataLegacyParse)) {
                    dhja.k("Saved bot business info metadata for botId %s name: %s.", dhja.a(rbmBotId), dhja.a(name));
                    dewiVar = dewi.INFO_LOCALLY_AVAILABLE;
                } else {
                    dhja.g("Error saving bot business info metadata for botId %s name: %s.", dhja.a(rbmBotId), dhja.a(name));
                    dewiVar = dewi.CLIENT_ERROR;
                }
            } else {
                dhja.g("Business info data model object is null for botId %s.", dhja.a(str));
                dhja.g("Unable to save business info for %s / %s.", dhja.a(str), dhja.a(url));
                dewiVar = dewi.CLIENT_ERROR;
            }
            bufferedReader.close();
            return dewiVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dewf
    public final String b() {
        return this.b + "_" + this.f;
    }

    @Override // defpackage.dewf
    public final String c() throws NumberFormatException {
        String language;
        String str = this.b;
        String str2 = null;
        if (str == null) {
            dhja.g("Cannot build bot info metadata server url with null rbmBotId.", new Object[0]);
            return null;
        }
        String strA = (String) dfnr.a().b.d.a();
        if (TextUtils.isEmpty(strA)) {
            strA = dhib.a(str);
            if (TextUtils.isEmpty(strA)) {
                dhja.g("Cannot build bot info metadata server url with invalid rbmBotId %s", dhja.a(str));
                return null;
            }
        }
        Context context = this.c;
        String strM = dhkv.g(context).m();
        if (!TextUtils.isEmpty(strM) && strM.length() >= 5) {
            if (strM.length() != 6) {
                str2 = String.format(Locale.US, "%d%03d", Integer.valueOf(Integer.parseInt(strM.substring(0, 3))), Integer.valueOf(Integer.parseInt(strM.substring(3))));
            } else {
                str2 = strM;
            }
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(strA).path("bot").appendQueryParameter("id", "sip:".concat(str));
        if (!TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ho", str2);
        }
        if (((Boolean) dfnr.a.a()).booleanValue()) {
            try {
                language = lad.a(context.getResources().getConfiguration()).f(0).getLanguage();
            } catch (NullPointerException e) {
                dhja.i(e, "Error finding language code on device for rbmBotId %s", dhja.a(str));
                language = "";
            }
            if (TextUtils.isEmpty(language)) {
                dhja.k("Defaulting to English locale for business info retrieval", new Object[0]);
                language = "en";
            }
            builderAppendQueryParameter.appendQueryParameter("hl", language);
        } else {
            try {
                builderAppendQueryParameter.appendQueryParameter("hl", lad.a(context.getResources().getConfiguration()).f(0).getLanguage());
            } catch (NullPointerException e2) {
                dhja.i(e2, "Error finding language code on device for rbmBotId %s", dhja.a(str));
            }
        }
        boolean z = this.f;
        String str3 = (String) dfnr.a().b.c.a();
        if (z && !TextUtils.isEmpty(str3)) {
            builderAppendQueryParameter.appendQueryParameter("v", String.format("%s", str3));
        }
        String string = builderAppendQueryParameter.build().toString();
        dhja.k("Built bot info server url %s for rbmBotId %s", dhja.a(string), dhja.a(str));
        return string;
    }

    @Override // defpackage.dewf
    protected final void d(HttpsURLConnection httpsURLConnection) throws NumberFormatException {
        g(this.e, httpsURLConnection);
    }

    @Override // defpackage.dewf
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.dewf
    public final HttpsURLConnection f(String str) {
        HttpsURLConnection httpsURLConnectionF = super.f(str);
        String str2 = this.a;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String str3 = this.b;
        if (zIsEmpty) {
            dhja.k("Creating connection with missing bot info version for botId: %s", dhja.a(str3));
            return httpsURLConnectionF;
        }
        dhja.k("Creating connection with bot info version: %s for botId: %s", str2, dhja.a(str3));
        httpsURLConnectionF.setRequestProperty("If-None-Match", str2);
        return httpsURLConnectionF;
    }
}
