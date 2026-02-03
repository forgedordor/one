package defpackage;

import java.math.BigDecimal;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekwx implements Comparable {
    final BigDecimal a;
    final BigDecimal b;
    final BigDecimal c;

    public ekwx(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.a = bigDecimal;
        this.b = bigDecimal2;
        this.c = bigDecimal3;
    }

    final ekwx a(ekwx ekwxVar) {
        BigDecimal bigDecimal = this.c;
        BigDecimal bigDecimal2 = ekwxVar.b;
        BigDecimal bigDecimal3 = this.b;
        BigDecimal bigDecimal4 = ekwxVar.c;
        BigDecimal bigDecimalSubtract = bigDecimal3.multiply(bigDecimal4).subtract(bigDecimal.multiply(bigDecimal2));
        BigDecimal bigDecimal5 = this.a;
        BigDecimal bigDecimal6 = ekwxVar.a;
        return new ekwx(bigDecimalSubtract, bigDecimal.multiply(bigDecimal6).subtract(bigDecimal5.multiply(bigDecimal4)), bigDecimal5.multiply(bigDecimal2).subtract(bigDecimal3.multiply(bigDecimal6)));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ekwx ekwxVar = (ekwx) obj;
        int iCompareTo = this.a.compareTo(ekwxVar.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.b.compareTo(ekwxVar.b);
        return iCompareTo2 != 0 ? iCompareTo2 : this.c.compareTo(ekwxVar.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekwx)) {
            return false;
        }
        ekwx ekwxVar = (ekwx) obj;
        return this.a.equals(ekwxVar.a) && this.b.equals(ekwxVar.b) && this.c.equals(ekwxVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public ekwx(ekyj ekyjVar) {
        this(new BigDecimal(ekyjVar.e), new BigDecimal(ekyjVar.f), new BigDecimal(ekyjVar.g));
    }
}
