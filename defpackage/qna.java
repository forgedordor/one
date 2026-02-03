package defpackage;

import j$.util.Objects;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qna {
    private static final BigDecimal a = new BigDecimal(20);
    private static final BigDecimal b = new BigDecimal(90);
    private static final BigDecimal c = new BigDecimal(180);
    private static final BigDecimal d = new BigDecimal(4);
    private static final BigDecimal e = new BigDecimal(5);
    private final String f;

    public qna(double d2, double d3) {
        BigDecimal bigDecimal;
        int iMin = Math.min(12, 15);
        if (iMin >= 4) {
            int i = 10;
            if (iMin >= 10 || (iMin & 1) != 1) {
                BigDecimal bigDecimal2 = b;
                double dMin = Math.min(Math.max(d2, -bigDecimal2.intValue()), bigDecimal2.intValue());
                double d4 = d3;
                while (true) {
                    bigDecimal = c;
                    if (d4 >= (-bigDecimal.intValue())) {
                        break;
                    }
                    int iIntValue = bigDecimal.intValue();
                    d4 += iIntValue + iIntValue;
                }
                while (d4 >= bigDecimal.intValue()) {
                    int iIntValue2 = bigDecimal.intValue();
                    d4 -= iIntValue2 + iIntValue2;
                }
                if (dMin == bigDecimal2.doubleValue()) {
                    dMin -= (iMin <= 10 ? Math.pow(a.intValue(), Math.floor((iMin / (-2)) + 2)) : Math.pow(a.intValue(), -3.0d) / Math.pow(e.intValue(), iMin - 10)) * 0.9d;
                }
                BigDecimal bigDecimal3 = new BigDecimal(dMin + bigDecimal2.doubleValue());
                BigDecimal bigDecimal4 = new BigDecimal(d4 + bigDecimal.doubleValue());
                StringBuilder sb = new StringBuilder();
                BigDecimal bigDecimal5 = a;
                BigDecimal bigDecimalMultiply = bigDecimal5.multiply(bigDecimal5);
                BigDecimal bigDecimalMultiply2 = bigDecimal5.multiply(bigDecimal5);
                int i2 = 0;
                while (i2 < iMin) {
                    if (i2 < i) {
                        bigDecimalMultiply = bigDecimalMultiply.divide(bigDecimal5);
                        bigDecimalMultiply2 = bigDecimalMultiply2.divide(bigDecimal5);
                        BigDecimal bigDecimalDivide = bigDecimal3.divide(bigDecimalMultiply, 0, 3);
                        BigDecimal bigDecimalDivide2 = bigDecimal4.divide(bigDecimalMultiply2, 0, 3);
                        bigDecimal3 = bigDecimal3.subtract(bigDecimalMultiply.multiply(bigDecimalDivide));
                        bigDecimal4 = bigDecimal4.subtract(bigDecimalMultiply2.multiply(bigDecimalDivide2));
                        sb.append("23456789CFGHJMPQRVWX".charAt(bigDecimalDivide.intValue()));
                        sb.append("23456789CFGHJMPQRVWX".charAt(bigDecimalDivide2.intValue()));
                        i2 += 2;
                    } else {
                        bigDecimalMultiply = bigDecimalMultiply.divide(e);
                        BigDecimal bigDecimal6 = d;
                        bigDecimalMultiply2 = bigDecimalMultiply2.divide(bigDecimal6);
                        BigDecimal bigDecimalDivide3 = bigDecimal3.divide(bigDecimalMultiply, 0, 3);
                        BigDecimal bigDecimalDivide4 = bigDecimal4.divide(bigDecimalMultiply2, 0, 3);
                        BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimalMultiply.multiply(bigDecimalDivide3));
                        bigDecimal4 = bigDecimal4.subtract(bigDecimalMultiply2.multiply(bigDecimalDivide4));
                        sb.append("23456789CFGHJMPQRVWX".charAt((bigDecimalDivide3.intValue() * bigDecimal6.intValue()) + bigDecimalDivide4.intValue()));
                        i2++;
                        bigDecimal3 = bigDecimalSubtract;
                    }
                    if (i2 == 8) {
                        sb.append('+');
                    }
                    i = 10;
                }
                if (i2 < 8) {
                    while (i2 < 8) {
                        sb.append('0');
                        i2++;
                    }
                    sb.append('+');
                }
                this.f = sb.toString();
                return;
            }
        }
        throw new IllegalArgumentException(a.g(iMin, "Illegal code length "));
    }

    public final qmz a() {
        try {
            if (new qna(this.f).b()) {
                String strReplace = this.f.replace("+", "").replace("0", "");
                BigDecimal bigDecimal = a;
                BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal);
                BigDecimal bigDecimalMultiply2 = bigDecimal.multiply(bigDecimal);
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                BigDecimal bigDecimalAdd2 = BigDecimal.ZERO;
                int i = 0;
                while (i < Math.min(strReplace.length(), 15)) {
                    int i2 = i + 1;
                    if (i < 10) {
                        bigDecimalMultiply = bigDecimalMultiply.divide(bigDecimal);
                        bigDecimalMultiply2 = bigDecimalMultiply2.divide(bigDecimal);
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply.multiply(new BigDecimal("23456789CFGHJMPQRVWX".indexOf(strReplace.charAt(i)))));
                        bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply2.multiply(new BigDecimal("23456789CFGHJMPQRVWX".indexOf(strReplace.charAt(i2)))));
                        i += 2;
                    } else {
                        int iIndexOf = "23456789CFGHJMPQRVWX".indexOf(strReplace.charAt(i));
                        BigDecimal bigDecimal2 = d;
                        int iIntValue = iIndexOf / bigDecimal2.intValue();
                        int iIntValue2 = iIndexOf % bigDecimal2.intValue();
                        bigDecimalMultiply = bigDecimalMultiply.divide(e);
                        bigDecimalMultiply2 = bigDecimalMultiply2.divide(bigDecimal2);
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply.multiply(new BigDecimal(iIntValue)));
                        bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply2.multiply(new BigDecimal(iIntValue2)));
                        i = i2;
                    }
                }
                BigDecimal bigDecimal3 = b;
                BigDecimal bigDecimalSubtract = bigDecimalAdd.subtract(bigDecimal3);
                BigDecimal bigDecimal4 = c;
                return new qmz(bigDecimalSubtract, bigDecimalAdd2.subtract(bigDecimal4), bigDecimalAdd.subtract(bigDecimal3).add(bigDecimalMultiply), bigDecimalAdd2.subtract(bigDecimal4).add(bigDecimalMultiply2));
            }
        } catch (IllegalArgumentException unused) {
        }
        throw new IllegalStateException("Method decode() could only be called on valid full codes, code was " + this.f + ".");
    }

    public final boolean b() {
        return this.f.indexOf(43) == 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f, ((qna) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qna(java.lang.String r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = r11.toUpperCase()
            if (r0 == 0) goto Lac
            int r1 = r0.length()
            r2 = 2
            if (r1 < r2) goto Lac
            java.lang.String r0 = r0.toUpperCase()
            r1 = 43
            int r3 = r0.indexOf(r1)
            r4 = -1
            if (r3 == r4) goto Lac
            int r1 = r0.lastIndexOf(r1)
            if (r3 != r1) goto Lac
            int r1 = r3 % 2
            if (r1 != 0) goto Lac
            r1 = 8
            java.lang.String r5 = "23456789CFGHJMPQRVWX"
            r6 = 0
            r7 = 1
            if (r3 != r1) goto L53
            char r8 = r0.charAt(r6)
            int r8 = r5.indexOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r9.getClass()
            if (r8 > r1) goto Lac
            char r1 = r0.charAt(r7)
            int r1 = r5.indexOf(r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r8.getClass()
            r8 = 17
            if (r1 > r8) goto Lac
        L53:
            r1 = r6
            r8 = r1
        L55:
            if (r1 >= r3) goto L81
            r9 = 48
            if (r8 == 0) goto L63
            char r8 = r0.charAt(r1)
            if (r8 != r9) goto Lac
        L61:
            r8 = r7
            goto L7f
        L63:
            char r8 = r0.charAt(r1)
            int r8 = r5.indexOf(r8)
            if (r8 == r4) goto L6f
            r8 = r6
            goto L7f
        L6f:
            char r8 = r0.charAt(r1)
            if (r8 != r9) goto Lac
            if (r1 == r2) goto L61
            r8 = 4
            if (r1 == r8) goto L61
            r8 = 6
            if (r1 != r8) goto Lac
            r1 = r8
            goto L61
        L7f:
            int r1 = r1 + r7
            goto L55
        L81:
            int r1 = r0.length()
            int r6 = r3 + 1
            if (r1 <= r6) goto La5
            if (r8 != 0) goto Lac
            int r1 = r0.length()
            int r3 = r3 + r2
            if (r1 == r3) goto Lac
        L92:
            int r1 = r0.length()
            if (r6 >= r1) goto La5
            char r1 = r0.charAt(r6)
            int r1 = r5.indexOf(r1)
            if (r1 == r4) goto Lac
            int r6 = r6 + 1
            goto L92
        La5:
            java.lang.String r11 = r11.toUpperCase()
            r10.f = r11
            return
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provided code '"
            java.lang.String r2 = "' is not a valid Open Location Code."
            java.lang.String r11 = defpackage.a.a(r11, r1, r2)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qna.<init>(java.lang.String):void");
    }
}
