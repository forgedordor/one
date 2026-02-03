package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
public class j implements InterfaceC0031e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final TemporalField a;
    public final int b;
    public final int c;
    public final D d;
    public final int e;

    public j(TemporalField temporalField, int i, int i2, D d) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = d;
        this.e = 0;
    }

    public long a(x xVar, long j) {
        return j;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == D.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.g(this.a, j, i, i2);
    }

    public j d() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    public j e(int i) {
        return new j(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.InterfaceC0031e
    public boolean f(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        DecimalStyle decimalStyle = xVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        String strA = decimalStyle.a(string);
        int i2 = this.b;
        D d = this.d;
        if (jA >= 0) {
            int i3 = AbstractC0028b.a[d.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0028b.a[d.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(decimalStyle.b);
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - strA.length(); i5++) {
            sb.append(decimalStyle.a);
        }
        sb.append(strA);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
    
        if (r2 <= r10) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0170  */
    @Override // j$.time.format.InterfaceC0031e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(j$.time.format.v r26, java.lang.CharSequence r27, int r28) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.j(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public String toString() {
        TemporalField temporalField = this.a;
        D d = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && d == D.NORMAL) {
            return "Value(" + String.valueOf(temporalField) + ")";
        }
        if (i2 == i && d == D.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(temporalField) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(temporalField) + "," + i2 + "," + i + "," + String.valueOf(d) + ")";
    }

    public j(TemporalField temporalField, int i, int i2, D d, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = d;
        this.e = i3;
    }
}
