package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekye implements Serializable, ekzg {
    public final ekxe a;
    public final ekxk b;

    public ekye(ekxe ekxeVar, ekxk ekxkVar) {
        this.a = ekxeVar;
        this.b = ekxkVar;
    }

    public static boolean k(ekxe ekxeVar, ekxk ekxkVar) {
        if (Math.abs(ekxeVar.a) > 1.5707963267948966d || Math.abs(ekxeVar.b) > 1.5707963267948966d || Math.abs(ekxkVar.a) > 3.141592653589793d || Math.abs(ekxkVar.b) > 3.141592653589793d) {
            return false;
        }
        double d = ekxkVar.a;
        if (d != -3.141592653589793d || ekxkVar.b == 3.141592653589793d) {
            return (ekxkVar.b != -3.141592653589793d || d == 3.141592653589793d) && ekxeVar.i() == ekxkVar.l();
        }
        return false;
    }

    public abstract ekxe a();

    public abstract ekxk b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof ekye)) {
            return false;
        }
        ekye ekyeVar = (ekye) obj;
        return a().equals(ekyeVar.a()) && b().equals(ekyeVar.b());
    }

    public final boolean h(ekyj ekyjVar) {
        ekyb ekybVar = new ekyb(ekyjVar);
        if (!this.a.g(ekybVar.a)) {
            return false;
        }
        ekxk ekxkVar = this.b;
        double d = ekybVar.b;
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        return ekxkVar.k(d);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 629) * 37) + this.b.hashCode();
    }

    public final boolean i() {
        return this.a.i();
    }

    public final boolean j() {
        return k(this.a, this.b);
    }

    public final String toString() {
        ekxe ekxeVar = this.a;
        ekxi ekxiVar = new ekxi(ekxeVar.a);
        ekxk ekxkVar = this.b;
        return "[Lo=" + new ekyb(ekxiVar, new ekxi(ekxkVar.a)).toString() + ", Hi=" + new ekyb(new ekxi(ekxeVar.b), new ekxi(ekxkVar.b)).toString() + "]";
    }

    public ekye() {
        this.a = new ekxe(1.0d, 0.0d);
        this.b = ekxk.c();
    }
}
