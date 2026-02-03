package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdj implements Comparable {
    public final boolean a;
    public final boolean b;
    private final int c;
    private final boolean d;

    public tdj(int i, boolean z, boolean z2, boolean z3) {
        this.c = i;
        this.d = z;
        this.a = z2;
        this.b = z3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        tdj tdjVar = (tdj) obj;
        tdjVar.getClass();
        return fdbq.a(this.c, tdjVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdj)) {
            return false;
        }
        tdj tdjVar = (tdj) obj;
        return this.c == tdjVar.c && this.d == tdjVar.d && this.a == tdjVar.a && this.b == tdjVar.b;
    }

    public final int hashCode() {
        int i = this.c;
        boolean z = this.b;
        return (((((i * 31) + tdi.a(this.d)) * 31) + tdi.a(this.a)) * 31) + tdi.a(z);
    }

    public final String toString() {
        return "BannerPriority(weight=" + this.c + ", canBeShownAgain=" + this.d + ", canShowAfterAnotherBanner=" + this.a + ", anyOtherBannersCanShowAfterThis=" + this.b + ")";
    }

    public /* synthetic */ tdj(int i, int i2) {
        this(i, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 8) != 0);
    }
}
