package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoz extends eatk {
    public final eatj a;
    public final double b;

    public eaoz(eatj eatjVar, double d) {
        if (eatjVar == null) {
            throw new NullPointerException("Null place");
        }
        this.a = eatjVar;
        this.b = d;
    }

    @Override // defpackage.eatk
    public final double a() {
        return this.b;
    }

    @Override // defpackage.eatk
    public final eatj b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatk) {
            eatk eatkVar = (eatk) obj;
            if (this.a.equals(eatkVar.b()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(eatkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        double d = this.b;
        return (iHashCode * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)));
    }

    public final String toString() {
        return "PlaceLikelihood{place=" + this.a.toString() + ", likelihood=" + this.b + "}";
    }
}
