package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyj implements Comparable, Serializable, ekzg {
    public static final ekyj a = new ekyj(0.0d, 0.0d, 0.0d);
    public static final ekyj b = new ekyj(1.0d, 0.0d, 0.0d);
    public static final ekyj c = new ekyj(0.0d, 0.0d, 1.0d);
    public static final ekyj d = new ekyj(0.0d, 0.0d, -1.0d);
    final double e;
    final double f;
    final double g;

    public ekyj(double d2, double d3, double d4) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
    }

    public static final double f(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3) {
        double d2 = ekyjVar2.f;
        double d3 = ekyjVar3.g;
        double d4 = ekyjVar2.g;
        double d5 = ekyjVar3.f;
        double d6 = ekyjVar3.e;
        double d7 = ekyjVar2.e;
        double d8 = ekyjVar.e * ((d2 * d3) - (d4 * d5));
        double d9 = ekyjVar.f * ((d4 * d6) - (d3 * d7));
        return d8 + d9 + (ekyjVar.g * ((d7 * d5) - (d2 * d6)));
    }

    static final int h(double d2, double d3, double d4) {
        double dAbs = Math.abs(d2);
        double dAbs2 = Math.abs(d3);
        double dAbs3 = Math.abs(d4);
        return dAbs > dAbs2 ? dAbs > dAbs3 ? 0 : 2 : dAbs2 > dAbs3 ? 1 : 2;
    }

    public static final ekyj i(ekyj ekyjVar, ekyj ekyjVar2) {
        return new ekyj(ekyjVar.e + ekyjVar2.e, ekyjVar.f + ekyjVar2.f, ekyjVar.g + ekyjVar2.g);
    }

    public static final ekyj j(ekyj ekyjVar, ekyj ekyjVar2) {
        double d2 = ekyjVar.f;
        double d3 = ekyjVar2.g;
        double d4 = d2 * d3;
        double d5 = ekyjVar.g;
        double d6 = ekyjVar2.f;
        double d7 = d5 * d6;
        double d8 = ekyjVar2.e;
        double d9 = ekyjVar.e;
        return new ekyj(d4 - d7, (d5 * d8) - (d3 * d9), (d9 * d6) - (d2 * d8));
    }

    public static final ekyj k(ekyj ekyjVar, double d2) {
        double d3 = ekyjVar.g;
        return new ekyj(d2 * ekyjVar.e, d2 * ekyjVar.f, d2 * d3);
    }

    public static final ekyj l(ekyj ekyjVar) {
        double d2 = ekyjVar.g;
        return new ekyj(-ekyjVar.e, -ekyjVar.f, -d2);
    }

    public static final ekyj m(ekyj ekyjVar) {
        double d2 = ekyjVar.d();
        if (d2 != 0.0d) {
            d2 = 1.0d / d2;
        }
        return k(ekyjVar, d2);
    }

    public static final ekyj n(ekyj ekyjVar, ekyj ekyjVar2) {
        return new ekyj(ekyjVar.e - ekyjVar2.e, ekyjVar.f - ekyjVar2.f, ekyjVar.g - ekyjVar2.g);
    }

    public final double a(ekyj ekyjVar) {
        return (this.e * ekyjVar.e) + (this.f * ekyjVar.f) + (this.g * ekyjVar.g);
    }

    public final double b(int i) {
        return i == 0 ? this.e : i == 1 ? this.f : this.g;
    }

    public final double c(ekyj ekyjVar) {
        double d2 = this.e - ekyjVar.e;
        double d3 = this.f - ekyjVar.f;
        double d4 = this.g - ekyjVar.g;
        return (d2 * d2) + (d3 * d3) + (d4 * d4);
    }

    public final double d() {
        return Math.sqrt(e());
    }

    public final double e() {
        double d2 = this.g;
        double d3 = this.f;
        double d4 = this.e;
        return (d4 * d4) + (d3 * d3) + (d2 * d2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekyj)) {
            return false;
        }
        ekyj ekyjVar = (ekyj) obj;
        return this.e == ekyjVar.e && this.f == ekyjVar.f && this.g == ekyjVar.g;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ekyj ekyjVar) {
        if (q(ekyjVar)) {
            return -1;
        }
        return !p(ekyjVar) ? 1 : 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(Math.abs(this.e)) + 646;
        long jDoubleToLongBits2 = jDoubleToLongBits + (jDoubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.f));
        long jDoubleToLongBits3 = jDoubleToLongBits2 + (37 * jDoubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.g));
        return (int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32));
    }

    public final String o() {
        ekyb ekybVar = new ekyb(this);
        return "(" + (ekybVar.a * 57.29577951308232d) + ", " + (ekybVar.b * 57.29577951308232d) + ")";
    }

    public final boolean p(ekyj ekyjVar) {
        return this.e == ekyjVar.e && this.f == ekyjVar.f && this.g == ekyjVar.g;
    }

    public final boolean q(ekyj ekyjVar) {
        double d2 = this.e;
        double d3 = ekyjVar.e;
        if (d2 < d3) {
            return true;
        }
        if (d3 < d2) {
            return false;
        }
        double d4 = this.f;
        double d5 = ekyjVar.f;
        if (d4 < d5) {
            return true;
        }
        return d5 >= d4 && this.g < ekyjVar.g;
    }

    public final String toString() {
        return "(" + this.e + ", " + this.f + ", " + this.g + ")";
    }

    public ekyj() {
        this(0.0d, 0.0d, 0.0d);
    }
}
