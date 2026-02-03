package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmc {
    private static final ekgb d = ekgb.C("USD", "INR", "SGD", "GBP", "AED", "EUR", "CAD", "HKD", "JPY", "AUD", "CHF", "KRW", "ZAR", "THB");
    public static final Pattern a = Pattern.compile("([0-9]{1,3}[,\\s]?)*[0-9]{1,3}(\\.[0-9]+)?");
    public static final Pattern b = Pattern.compile("(?i)\\(?(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)[\\.:]?\\)?\\s*[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?");
    public static final Pattern c = Pattern.compile("(?i)[\\{\\(]?(<MONEY_[0-9]+>)[\\}\\)]?\\s*(\\$|usd|inr|sgd|gbp|aed|eur|cad|hkd|jpy|aud|chf|krw|jye|zar|thb|rs|cr)");
    private static final Pattern e = Pattern.compile("\\s|,");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[PHI: r5
      0x00e6: PHI (r5v9 java.lang.String) = 
      (r5v8 java.lang.String)
      (r5v8 java.lang.String)
      (r5v8 java.lang.String)
      (r5v10 java.lang.String)
      (r5v10 java.lang.String)
     binds: [B:15:0x00a2, B:17:0x00aa, B:19:0x00b0, B:22:0x00bb, B:24:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(defpackage.ekfw r9, java.util.regex.Matcher r10, java.util.HashMap r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejmc.a(ekfw, java.util.regex.Matcher, java.util.HashMap, int, int):void");
    }
}
