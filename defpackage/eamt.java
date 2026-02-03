package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eamt extends eajp {
    private final Locale b;
    private final String c;
    private final eaww d;

    protected eamt(eanv eanvVar, Locale locale, String str, eaww eawwVar) {
        super(eanvVar);
        this.b = locale;
        this.c = str;
        this.d = eawwVar;
    }

    protected static void f(Map map, String str, Object obj) {
        String string = obj != null ? obj.toString() : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put(str, string);
    }

    @Override // defpackage.eajp
    public final String b() {
        new HashMap();
        String str = this.c;
        ejwl.b(!TextUtils.isEmpty(str), "API key cannot be empty.");
        HashMap map = new HashMap(e());
        Uri.Builder builderBuildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        builderBuildUpon.appendEncodedPath("maps/api/place/");
        builderBuildUpon.appendEncodedPath(d());
        builderBuildUpon.appendQueryParameter("key", str);
        Locale locale = this.b;
        if (locale != null) {
            String languageTag = locale.toLanguageTag();
            if (!TextUtils.isEmpty(languageTag)) {
                builderBuildUpon.appendQueryParameter("language", languageTag);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    @Override // defpackage.eajp
    public final Map c() throws PackageManager.NameNotFoundException {
        HashMap map = new HashMap();
        Context context = this.d.a;
        String packageName = context.getPackageName();
        String strA = eawk.a(context.getPackageManager(), packageName);
        ekgi ekgiVar = new ekgi();
        if (packageName != null) {
            ekgiVar.i("X-Android-Package", packageName);
        }
        if (strA != null) {
            ekgiVar.i("X-Android-Cert", strA);
        }
        map.putAll(ekgiVar.c());
        map.put("X-Places-Android-Sdk", "4.3.1");
        return map;
    }

    protected abstract String d();

    protected abstract Map e();
}
