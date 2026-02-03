package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxj implements Comparable, Serializable {
    public static final ekxj a = new ekxj(0.0d);
    public static final ekxj b = new ekxj(2.0d);
    public static final ekxj c = new ekxj(4.0d);
    public static final ekxj d = new ekxj(Double.POSITIVE_INFINITY);
    public static final ekxj e = new ekxj(-1.0d);
    public final double f;

    public ekxj(double d2) {
        this.f = d2;
        if (f()) {
            return;
        }
        throw new IllegalArgumentException("Invalid length2: " + d2);
    }

    public static ekxj c(double d2) {
        return new ekxj(Math.min(4.0d, d2));
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ekxj ekxjVar) {
        return Double.compare(this.f, ekxjVar.f);
    }

    public final ekxi b() {
        if (e()) {
            return new ekxi(-1.0d);
        }
        if (d()) {
            return ekxi.a;
        }
        double dAsin = Math.asin(Math.sqrt(this.f) * 0.5d);
        return new ekxi(dAsin + dAsin);
    }

    public final boolean d() {
        return this.f == Double.POSITIVE_INFINITY;
    }

    public final boolean e() {
        return this.f < 0.0d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ekxj) && this.f == ((ekxj) obj).f;
    }

    public final boolean f() {
        double d2 = this.f;
        return (d2 >= 0.0d && d2 <= 4.0d) || e() || d();
    }

    public final int hashCode() {
        double d2 = this.f;
        if (d2 == 0.0d) {
            return 0;
        }
        int i = eomv.a;
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        double d2 = e.f;
        double d3 = this.f;
        return d3 == d2 ? "NEGATIVE" : d3 == a.f ? "ZERO" : d3 == c.f ? "STRAIGHT" : d3 == d.f ? "INFINITY" : b().toString();
    }

    public ekxj(ekyj ekyjVar, ekyj ekyjVar2) {
        this(Math.min(4.0d, ekyjVar.c(ekyjVar2)));
        ejwl.a(ekxm.d(ekyjVar));
        ejwl.a(ekxm.d(ekyjVar2));
        ejwl.a(f());
    }
}
