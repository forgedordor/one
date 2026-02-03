package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feys {
    public static final feyt a(String str) {
        str.getClass();
        Matcher matcher = feyt.a.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(a.a(str, "No subtype found for: \"", "\""));
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strGroup.toLowerCase(locale);
        lowerCase.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        String lowerCase2 = strGroup2.toLowerCase(locale2);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = feyt.b.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                String strSubstring = str.substring(iEnd);
                strSubstring.getClass();
                throw new IllegalArgumentException(a.d(str, strSubstring, "Parameter is not formatted correctly: \"", "\" for: \"", "\""));
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (fdgn.t(strGroup4, "'") && fdgn.n(strGroup4, "'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    strGroup4.getClass();
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new feyt(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
    }
}
