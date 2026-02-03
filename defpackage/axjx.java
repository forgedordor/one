package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjx {
    private static Pattern d;
    private final Context h;
    private static final cqce b = cqce.g("BugleDataModel", "SearchUtils");
    public static final ThreadLocal a = new ThreadLocal();
    private static String[] c = new String[0];
    private static final HashSet e = new HashSet();
    private static final BreakIterator f = BreakIterator.getWordInstance();
    private static float[] g = new float[100];

    public axjx(Context context) {
        this.h = context;
    }

    public final Matcher a(String[] strArr, CharSequence charSequence, StringBuilder sb, HashSet hashSet) {
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append("(\\b\\Q");
            sb.append(str);
            sb.append("\\E");
            hashSet.add(str);
            sb.append(")");
        }
        Matcher matcher = Pattern.compile(sb.toString()).matcher(charSequence.toString().toLowerCase(craf.c(this.h)));
        for (int iEnd = 0; matcher.find(iEnd) && !hashSet.isEmpty(); iEnd = matcher.end()) {
            hashSet.remove(matcher.group());
        }
        return matcher;
    }

    public final String[] b(String str) {
        String[] strArrSplit = str.toLowerCase(craf.c(this.h)).split("\\W+");
        int i = 0;
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(str2)) {
                i++;
            }
        }
        if (i == 0) {
            return strArrSplit;
        }
        String[] strArr = new String[strArrSplit.length - i];
        int i2 = 0;
        for (String str3 : strArrSplit) {
            if (!TextUtils.isEmpty(str3)) {
                strArr[i2] = str3;
                i2++;
            }
        }
        return strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01b9 -> B:85:0x01bb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence c(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.String r25, android.widget.TextView r26) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axjx.c(java.lang.CharSequence, java.lang.CharSequence, java.lang.String, android.widget.TextView):java.lang.CharSequence");
    }
}
