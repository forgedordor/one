package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxf implements Serializable {
    public final ekxe a;
    public final ekxe b;

    public ekxf(ekxe ekxeVar, ekxe ekxeVar2) {
        this.a = ekxeVar;
        this.b = ekxeVar2;
    }

    public static ekxf a() {
        return new ekxf(new ekxe(1.0d, 0.0d), new ekxe(1.0d, 0.0d));
    }

    public final ekxf b(double d) {
        ekxg ekxgVar = new ekxg(d, d);
        ekxe ekxeVarB = this.a.b(ekxgVar.a);
        ekxe ekxeVarB2 = this.b.b(ekxgVar.b);
        return (ekxeVarB.i() || ekxeVarB2.i()) ? a() : new ekxf(ekxeVarB, ekxeVarB2);
    }

    public final ekxg c(int i, int i2) {
        double d = i == 0 ? this.a.a : this.a.b;
        ekxe ekxeVar = this.b;
        return new ekxg(d, i2 == 0 ? ekxeVar.a : ekxeVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxf) {
            ekxf ekxfVar = (ekxf) obj;
            if (this.a.equals(ekxfVar.a) && this.b.equals(ekxfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 701) + this.b.hashCode();
    }

    public final String toString() {
        ekxe ekxeVar = this.b;
        ekxe ekxeVar2 = this.a;
        return "[Lo" + new ekxg(ekxeVar2.a, ekxeVar.a).toString() + ", Hi" + new ekxg(ekxeVar2.b, ekxeVar.b).toString() + "]";
    }

    public ekxf() {
        this(new ekxe(), new ekxe());
    }
}
