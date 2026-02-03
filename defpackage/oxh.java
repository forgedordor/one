package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oxh {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public oxh(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final int a(orr orrVar) {
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        throw new fctg();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxh)) {
            return false;
        }
        oxh oxhVar = (oxh) obj;
        return this.c == oxhVar.c && this.d == oxhVar.d && this.e == oxhVar.e && this.f == oxhVar.f;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }
}
