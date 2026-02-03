package org.chromium.base;

import android.os.LocaleList;
import android.text.TextUtils;
import defpackage.a;
import internal.J.N;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class LocaleUtils {
    private LocaleUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 3365(0xd25, float:4.715E-42)
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r0 == r1) goto L55
            r1 = 3374(0xd2e, float:4.728E-42)
            if (r0 == r1) goto L4b
            r1 = 3391(0xd3f, float:4.752E-42)
            if (r0 == r1) goto L41
            r1 = 3405(0xd4d, float:4.771E-42)
            if (r0 == r1) goto L37
            r1 = 3704(0xe78, float:5.19E-42)
            if (r0 == r1) goto L2d
            r1 = 102533(0x19085, float:1.4368E-40)
            if (r0 == r1) goto L23
            goto L5f
        L23:
            java.lang.String r0 = "gom"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = 0
            goto L60
        L2d:
            java.lang.String r0 = "tl"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = r2
            goto L60
        L37:
            java.lang.String r0 = "jw"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = r3
            goto L60
        L41:
            java.lang.String r0 = "ji"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = r4
            goto L60
        L4b:
            java.lang.String r0 = "iw"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = r5
            goto L60
        L55:
            java.lang.String r0 = "in"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5f
            r0 = r6
            goto L60
        L5f:
            r0 = -1
        L60:
            if (r0 == 0) goto L7c
            if (r0 == r6) goto L79
            if (r0 == r5) goto L76
            if (r0 == r4) goto L73
            if (r0 == r3) goto L70
            if (r0 == r2) goto L6d
            return r7
        L6d:
            java.lang.String r7 = "fil"
            return r7
        L70:
            java.lang.String r7 = "jv"
            return r7
        L73:
            java.lang.String r7 = "yi"
            return r7
        L76:
            java.lang.String r7 = "he"
            return r7
        L79:
            java.lang.String r7 = "id"
            return r7
        L7c:
            java.lang.String r7 = "kok"
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.LocaleUtils.a(java.lang.String):java.lang.String");
    }

    public static String b(Locale locale) {
        String strA = a(locale.getLanguage());
        String country = locale.getCountry();
        return (strA.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) ? "nn-NO" : country.isEmpty() ? strA : a.q(country, strA, "-");
    }

    public static String getDefaultCountryCode() {
        String str = (String) N.MZJ2lrZY("default-country-code");
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        return str != null ? str : Locale.getDefault().getCountry();
    }

    public static String getDefaultLocaleListString() {
        LocaleList localeList = LocaleList.getDefault();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < localeList.size(); i++) {
            Locale localeBuild = localeList.get(i);
            String language = localeBuild.getLanguage();
            String strA = a(language);
            if (!strA.equals(language)) {
                localeBuild = new Locale.Builder().setLocale(localeBuild).setLanguage(strA).build();
            }
            arrayList.add(b(localeBuild));
        }
        return TextUtils.join(",", arrayList);
    }

    public static String getDefaultLocaleString() {
        return b(Locale.getDefault());
    }
}
