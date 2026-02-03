package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxn implements Serializable, ekzg {
    public final ekyj a;
    public final ekxj b;

    public ekxn(ekyj ekyjVar, ekxj ekxjVar) {
        this.a = ekyjVar;
        this.b = ekxjVar;
    }

    public static ekxn b(ekyj ekyjVar, ekxi ekxiVar) {
        ekxj ekxjVar;
        ejwl.a(ekxm.d(ekyjVar));
        ekxi ekxiVar2 = new ekxi(Math.min(ekxiVar.c, 3.141592653589793d));
        double d = ekxiVar2.c;
        ekxj ekxjVar2 = ekxj.a;
        if (d < 0.0d) {
            ekxjVar = ekxj.e;
        } else if (ekxiVar2.equals(ekxi.a)) {
            ekxjVar = ekxj.d;
        } else {
            double dSin = Math.sin(Math.min(3.141592653589793d, d) * 0.5d);
            double d2 = dSin + dSin;
            ekxjVar = new ekxj(d2 * d2);
        }
        return new ekxn(ekyjVar, ekxjVar);
    }

    public final double a() {
        return this.b.f * 0.5d;
    }

    public final boolean c() {
        return this.b.e();
    }

    public final boolean d() {
        return ekxj.c.equals(this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxn) {
            ekxn ekxnVar = (ekxn) obj;
            if (this.a.p(ekxnVar.a) && this.b.equals(ekxnVar.b)) {
                return true;
            }
            if (c() && ekxnVar.c()) {
                return true;
            }
            if (d() && ekxnVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (d()) {
            return 17;
        }
        if (c()) {
            return 37;
        }
        return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
    }

    public final String toString() {
        ekxj ekxjVar = this.b;
        return "[Point = " + this.a.toString() + " Radius = " + String.valueOf(ekxjVar) + "]";
    }
}
