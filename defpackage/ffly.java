package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffly implements fflv {
    protected final fflv a;
    protected final fflx b;

    public ffly(fflv fflvVar, fflx fflxVar) {
        this.a = fflvVar;
        this.b = fflxVar;
    }

    @Override // defpackage.fflv
    public final int a() {
        return this.b.a[r0.length - 1];
    }

    @Override // defpackage.fflv
    public final BigInteger b() {
        return ((fflz) this.a).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffly)) {
            return false;
        }
        ffly fflyVar = (ffly) obj;
        return this.a.equals(fflyVar.a) && this.b.equals(fflyVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}
