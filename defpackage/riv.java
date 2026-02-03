package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class riv implements rit {
    int a;
    public Bitmap.Config b;
    private final riw c;

    public riv(riw riwVar) {
        this.c = riwVar;
    }

    @Override // defpackage.rit
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof riv) {
            riv rivVar = (riv) obj;
            if (this.a == rivVar.a && rvk.l(this.b, rivVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return rix.c(this.a, this.b);
    }
}
