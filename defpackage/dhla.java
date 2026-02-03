package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhla {
    private static final Pattern a = Pattern.compile("^(messages\\.android_(\\d{8})_(\\d+)_rc(\\d+)).*$");
    private static final Pattern b = Pattern.compile("^.*(carrierservices_\\d{8}(_\\d+)?).*$");
    private static final Pattern c = Pattern.compile("^(carrierservices\\.android_(\\d{8}(_\\d+)?(_rc\\d+)?))(\\..*)?$");

    public static int a(Context context) {
        try {
            return f(context, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static String b(Context context) {
        String strC = c(context, "com.google.android.apps.messaging");
        if (strC == null) {
            return "unknown";
        }
        String lowerCase = strC.toLowerCase(Locale.US);
        return lowerCase.contains("phone") ? "phone" : lowerCase.contains("wear") ? "wear" : "unknown";
    }

    public static String c(Context context, String str) {
        try {
            return f(context, str).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        return b(context).equals("wear");
    }

    public static String e(Context context, int i, int i2) {
        if (!"com.google.android.apps.messaging".equals(context.getPackageName())) {
            String strC = c(context, "com.google.android.ims");
            if (strC == null) {
                dhja.q("Null version name extracted for cs apk", new Object[0]);
                return "";
            }
            Pattern pattern = b;
            Matcher matcher = pattern.matcher(strC.toLowerCase(Locale.US));
            Matcher matcher2 = c.matcher(strC.toLowerCase(Locale.US));
            if (matcher2.matches()) {
                return i2 == 1 ? ejwk.b(matcher2.group(2)) : ejwk.b(matcher2.group(1));
            }
            if (matcher.find()) {
                return i2 == 1 ? g(strC) : ejwk.b(matcher.group(1));
            }
            dhja.q("CS.apk's version name [%s] doesn't match the expected format [%s].", strC, pattern);
            return g(strC);
        }
        String strC2 = c(context, "com.google.android.apps.messaging");
        if (strC2 == null) {
            dhja.q("Null version name extracted for Bugle.", new Object[0]);
            return "";
        }
        Pattern pattern2 = a;
        Matcher matcher3 = pattern2.matcher(strC2.toLowerCase(Locale.US));
        if (matcher3.matches()) {
            return i2 == 1 ? String.format("%s-%s.%s", ejwk.b(matcher3.group(2)), ejwk.b(matcher3.group(3)), ejwk.b(matcher3.group(4))) : ejwk.b(matcher3.group(1));
        }
        dhja.q("Bugle's version name [%s] doesn't match the expected format [%s].", strC2, pattern2);
        int i3 = i / 1000;
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i3 / 10000);
        Integer numValueOf2 = Integer.valueOf((i3 / 1000) % 10);
        return String.format(locale, "b%dv%dv%03d-%d.%d", numValueOf, numValueOf2, Integer.valueOf(i3 % 1000), numValueOf, numValueOf2);
    }

    private static PackageInfo f(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 0);
    }

    private static String g(String str) throws NumberFormatException {
        int i;
        int i2;
        if (str.indexOf(46) != -1) {
            try {
                i = Integer.parseInt(str.substring(0, str.indexOf(46, str.indexOf(46) + 1)).replace(".", ""));
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                dhja.i(e, "Exception while parsing the CS apk version (%s) ", str);
            }
        } else {
            i = 0;
        }
        String strSubstring = str.substring(str.length() - 3);
        try {
        } catch (NumberFormatException e2) {
            dhja.i(e2, "Error getting the build version name from package info", new Object[0]);
        }
        if (TextUtils.isEmpty(strSubstring)) {
            i2 = 0;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                char cCharAt = strSubstring.charAt(i3);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    sb.append(cCharAt);
                }
            }
            i2 = Integer.parseInt(sb.toString());
        }
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(i / 10);
        Integer numValueOf2 = Integer.valueOf(i % 10);
        return String.format(locale, "c%dv%dv%03d-%d.%d", numValueOf, numValueOf2, Integer.valueOf(i2), numValueOf, numValueOf2);
    }
}
