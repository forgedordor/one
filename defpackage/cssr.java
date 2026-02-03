package defpackage;

import android.text.TextUtils;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssr {
    public static final Pattern a = Pattern.compile("^\\+?[0-9\\s\\(\\)\\-x]+$");

    public static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            int iDigit = Character.digit(c, 10);
            if (iDigit != -1) {
                sb.append(iDigit);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static List c(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",", -1)) {
            arrayList.add(str2.trim());
        }
        arrayList.removeAll(ekgb.r(""));
        return arrayList;
    }

    public static void d(StringBuilder sb, String str, String str2) {
        e(sb, null, str, str2);
    }

    public static void e(StringBuilder sb, String str, String str2, String str3) {
        if (sb.length() > 0) {
            sb.append(str3);
        }
        if (!ejwk.c(str)) {
            sb.append(str);
        }
        sb.append(str2);
    }

    public static boolean f(String str, String str2) {
        if (ejwk.c(str) || ejwk.c(str2)) {
            return false;
        }
        return str.toLowerCase(Locale.US).equals(str2.toLowerCase(Locale.US));
    }

    public static boolean g(String str) {
        if (!ejwk.c(str)) {
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String h(String str) {
        return URLEncoder.encode(str, "UTF-8");
    }
}
