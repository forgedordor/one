package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyp extends esyj {
    public final Object a;

    public esyp(Object obj) {
        this.a = obj;
    }

    private static boolean j(esyp esypVar) {
        Object obj = esypVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.esyj
    public final String a() {
        Object obj = this.a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (i()) {
            return e().toString();
        }
        if (h()) {
            return ((Boolean) obj).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public final double d() {
        return i() ? e().doubleValue() : Double.parseDouble(a());
    }

    public final Number e() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new etad((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        esyp esypVar = (esyp) obj;
        if (j(this) && j(esypVar)) {
            return ((this.a instanceof BigInteger) || (esypVar.a instanceof BigInteger)) ? g().equals(esypVar.g()) : e().longValue() == esypVar.e().longValue();
        }
        Object obj2 = this.a;
        if (obj2 instanceof Number) {
            Object obj3 = esypVar.a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return f().compareTo(esypVar.f()) == 0;
                }
                double d = d();
                double d2 = esypVar.d();
                if (d != d2) {
                    return Double.isNaN(d) && Double.isNaN(d2);
                }
                return true;
            }
        }
        return obj2.equals(esypVar.a);
    }

    public final BigDecimal f() {
        Object obj = this.a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : etam.a(a());
    }

    public final BigInteger g() {
        Object obj = this.a;
        return obj instanceof BigInteger ? (BigInteger) obj : j(this) ? BigInteger.valueOf(e().longValue()) : etam.b(a());
    }

    public final boolean h() {
        return this.a instanceof Boolean;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (j(this)) {
            jDoubleToLongBits = e().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(e().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final boolean i() {
        return this.a instanceof Number;
    }

    public esyp(String str) {
        str.getClass();
        this.a = str;
    }
}
