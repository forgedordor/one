package j$.time.format;

import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes9.dex */
public final class f extends j {
    public final boolean g;

    public f(TemporalField temporalField, int i, int i2, boolean z) {
        this(temporalField, i, i2, z, 0);
        Objects.a(temporalField, "field");
        j$.time.temporal.m mVarRange = temporalField.range();
        if (mVarRange.a != mVarRange.b || mVarRange.c != mVarRange.d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(temporalField)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        return vVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0031e
    public final boolean f(x xVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = xVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        DecimalStyle decimalStyle = xVar.b.c;
        long jLongValue = lA.longValue();
        j$.time.temporal.m mVarRange = temporalField.range();
        mVarRange.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(mVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(mVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strA = decimalStyle.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(decimalStyle.c);
            }
            sb.append(strA);
            return true;
        }
        if (i > 0) {
            if (z) {
                sb.append(decimalStyle.c);
            }
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(decimalStyle.a);
            }
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0031e
    public final int j(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        DateTimeFormatter dateTimeFormatter = vVar.a;
        int i2 = (z || b(vVar)) ? this.b : 0;
        int i3 = (vVar.c || b(vVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                if (charSequence.charAt(i) == dateTimeFormatter.c.c) {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = i4;
            int i7 = 0;
            while (true) {
                if (i6 >= iMin) {
                    break;
                }
                int i8 = i6 + 1;
                int iCharAt = charSequence.charAt(i6) - dateTimeFormatter.c.a;
                if (iCharAt < 0 || iCharAt > 9) {
                    iCharAt = -1;
                }
                if (iCharAt >= 0) {
                    i7 = (i7 * 10) + iCharAt;
                    i6 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
            j$.time.temporal.m mVarRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(mVarRange.a);
            return vVar.g(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(mVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i6);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, D.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
