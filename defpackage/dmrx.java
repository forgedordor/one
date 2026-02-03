package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrx implements dmrz {
    public final Bitmap a;
    private final dpxd b;

    public dmrx(Bitmap bitmap, dpxd dpxdVar) {
        this.a = bitmap;
        this.b = dpxdVar;
    }

    @Override // defpackage.dmrz
    public final dpxd a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrx)) {
            return false;
        }
        dmrx dmrxVar = (dmrx) obj;
        return fdbq.f(this.a, dmrxVar.a) && fdbq.f(this.b, dmrxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dpxd dpxdVar = this.b;
        return iHashCode + (dpxdVar == null ? 0 : dpxdVar.hashCode());
    }

    public final String toString() {
        return "BitmapIcon(bitmap=" + this.a + ", backgroundColor=" + this.b + ")";
    }
}
