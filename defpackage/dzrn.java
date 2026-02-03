package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrn {
    private final fcsu i;
    private static final ekhx d = ekhx.t("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern e = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern a = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern f = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final Pattern b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final Pattern c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final Pattern g = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern h = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public dzrn(fcsu fcsuVar) {
        this.i = fcsuVar;
    }

    static String a(String str) {
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    static String d(String str, boolean z) {
        boolean z2;
        if (ejwk.c(str)) {
            return null;
        }
        if (z) {
            z2 = true;
        } else {
            String strA = a(str);
            if (strA != null) {
                str = strA;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        String strB = b(str);
        if (strB != null && !strB.equals(str)) {
            z2 = true;
        }
        if (strB != null) {
            Matcher matcher2 = h.matcher(strB);
            if (matcher2.find()) {
                strB = matcher2.replaceFirst("<ip>");
                z2 = true;
            }
        }
        if (strB == null || z2) {
            return strB;
        }
        Matcher matcher3 = g.matcher(strB);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:
    
        r9 = d(r11, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c8, code lost:
    
        if (r9 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ca, code lost:
    
        r9 = defpackage.dzrn.f.matcher(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
    
        if (r9.matches() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d6, code lost:
    
        r9 = r9.group(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01db, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:
    
        if (r9 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01de, code lost:
    
        r3.copyOnWrite();
        r11 = (defpackage.feez) r3.instance;
        r11.b |= 524288;
        r11.u = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.feix c(java.lang.Iterable r17) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzrn.c(java.lang.Iterable):feix");
    }
}
