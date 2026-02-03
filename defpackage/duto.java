package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duto {
    public static Uri a(Context context, ejwi ejwiVar) {
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f((ejwiVar == null || !ejwiVar.g()) ? "datadownload" : (String) ejwiVar.c());
        if (ejwiVar != null && ejwiVar.g()) {
            ecfaVar.g("datadownload");
        }
        return ecfaVar.a();
    }

    public static Uri b(Context context, ejwi ejwiVar) {
        return a(context, ejwiVar).buildUpon().appendPath("links").build();
    }

    public static Uri c(Context context, String str) {
        int i = ecfh.a;
        return ecfg.a(str, context.getPackageName(), 0L);
    }

    public static String d(String str, ejwi ejwiVar) {
        if (ejwiVar != null && ejwiVar.g()) {
            str = str.concat((String) ejwiVar.c());
        }
        return str.concat(".pb");
    }

    public static Uri e(Context context, int i, String str, String str2, dtvq dtvqVar, ejwi ejwiVar, boolean z) {
        try {
            return z ? c(context, str2) : a(context, ejwiVar).buildUpon().appendPath(f(i)).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            durt.k(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            dtvqVar.a();
            return null;
        }
    }

    public static String f(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static Uri g(Context context) {
        Pattern pattern = ecfb.a;
        ecfa ecfaVar = new ecfa(context);
        ecfaVar.f("datadownloadmanifest");
        ecfaVar.g("datadownload");
        return ecfaVar.a();
    }
}
