package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbnc {
    public final Context a;
    private final dbnb b;

    public dbnc(Context context) {
        dbnb dbnbVar = new dbnb();
        this.a = context;
        this.b = dbnbVar;
    }

    public static String a(String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        String str = strArr[0];
        try {
            URL url = new URL(str);
            builder.appendQueryParameter("url", url.getProtocol() + "://" + url.getHost());
            return "weblogin:".concat(String.valueOf(builder.build().getQuery()));
        } catch (MalformedURLException unused) {
            throw new IllegalArgumentException("Invalid URL: ".concat(String.valueOf(str)));
        }
    }

    public final void b(List list) {
        Set cssVar;
        String str;
        int size = list.size();
        int i = 128;
        if (size == 0) {
            cssVar = new css();
        } else {
            cssVar = size <= 128 ? new css(size) : new HashSet(size, 0.75f);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dbvh dbvhVar = (dbvh) it.next();
            String str2 = !dbvhVar.f.isEmpty() ? dbvhVar.f : dbvhVar.e;
            if (TextUtils.isEmpty(str2) || dbvhVar.c.isEmpty() || dbvhVar.d.isEmpty()) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                Boolean boolValueOf = (dbvhVar.b & 32) != 0 ? Boolean.valueOf(dbvhVar.h) : null;
                dclh.k(str2);
                String str3 = (true != dbma.a(boolValueOf) ? "http" : "https") + "://" + str2;
                String str4 = dbvhVar.c;
                String str5 = dbvhVar.d;
                String str6 = dbvhVar.e;
                String str7 = dbvhVar.g;
                Boolean boolValueOf2 = (dbvhVar.b & 64) != 0 ? Boolean.valueOf(dbvhVar.i) : null;
                Boolean boolValueOf3 = (dbvhVar.b & 32) != 0 ? Boolean.valueOf(dbvhVar.h) : null;
                Long lValueOf = (dbvhVar.b & i) != 0 ? Long.valueOf(dbvhVar.j) : null;
                int i2 = dbvhVar.b;
                if ((i2 & 256) != 0) {
                    int iA = dbvg.a(dbvhVar.k);
                    str = (iA == 0 || iA == 1) ? "UNKNOWN_PRIORITY" : iA != 2 ? iA != 3 ? "HIGH" : "MEDIUM" : "LOW";
                } else {
                    str = null;
                }
                String str8 = (i2 & 512) != 0 ? dbvhVar.l : null;
                boolean z = ((i2 & 1024) == 0 || dbvhVar.m.isEmpty()) ? false : true;
                if (str4 == null) {
                    str4 = "";
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                StringBuilder sb = new StringBuilder(str4);
                sb.append('=');
                if (!TextUtils.isEmpty(str5)) {
                    sb.append(str5);
                }
                if (dbma.a(boolValueOf2)) {
                    sb.append(";HttpOnly");
                }
                if (dbma.a(boolValueOf3)) {
                    sb.append(";Secure");
                }
                if (!TextUtils.isEmpty(str6)) {
                    sb.append(";Domain=");
                    sb.append(str6);
                }
                if (!TextUtils.isEmpty(str7)) {
                    sb.append(";Path=");
                    sb.append(str7);
                }
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    sb.append(";Max-Age=");
                    sb.append(lValueOf);
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(";Priority=");
                    sb.append(str);
                }
                if (!TextUtils.isEmpty(str8)) {
                    sb.append(";SameSite=");
                    sb.append(str8);
                }
                if (dbma.a(boolValueOf4)) {
                    sb.append(";SameParty");
                }
                String string = sb.toString();
                Log.d("WebLoginHelper", "Setting cookie for url: ".concat(str3));
                this.b.a.setCookie(str3, string);
                cssVar.add(str3);
            }
            i = 128;
        }
    }
}
