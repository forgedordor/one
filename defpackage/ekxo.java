package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxo implements Serializable, ekzg {
    public byte a;
    public byte b;
    byte c;
    ekxp d;
    public double e;
    public double f;
    public double g;
    public double h;

    static {
        Math.asin(Math.sqrt(0.3333333333333333d));
    }

    public ekxo() {
    }

    public final ekyj a() {
        return ekyj.m(this.d.z());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekxo) {
            ekxo ekxoVar = (ekxo) obj;
            if (this.a == ekxoVar.a && this.b == ekxoVar.b && this.c == ekxoVar.c && this.d.equals(ekxoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a + 629) * 37) + this.c) * 37) + this.b) * 37) + this.d.hashCode();
    }

    public final String toString() {
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        return "[" + ((int) b) + ", " + ((int) b2) + ", " + ((int) b3) + ", " + String.valueOf(this.d) + "]";
    }

    public ekxo(ekxp ekxpVar) {
        this.d = ekxpVar;
        this.a = (byte) ekxpVar.b();
        long jQ = ekxpVar.q();
        this.c = (byte) ekxp.e(jQ);
        this.b = (byte) ekxpVar.h();
        int iC = ekxp.c(jQ);
        int iD = ekxp.d(jQ);
        int iG = ekxp.g(ekxpVar.h());
        this.e = ekzf.a(iC, iG);
        this.f = ekzf.a(iC + iG, iG);
        this.g = ekzf.a(iD, iG);
        this.h = ekzf.a(iD + iG, iG);
    }
}
