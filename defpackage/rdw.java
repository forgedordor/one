package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdw extends rdu {
    public final Drawable a;
    private final rea b;

    public rdw(rea reaVar, Drawable drawable) {
        reaVar.getClass();
        this.b = reaVar;
        this.a = drawable;
        int iOrdinal = reaVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal == 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iOrdinal != 3) {
            throw new fctg();
        }
    }

    @Override // defpackage.rdu
    public final rea a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdw)) {
            return false;
        }
        rdw rdwVar = (rdw) obj;
        return this.b == rdwVar.b && fdbq.f(this.a, rdwVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Drawable drawable = this.a;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "Placeholder(status=" + this.b + ", placeholder=" + this.a + ")";
    }
}
