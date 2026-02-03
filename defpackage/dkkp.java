package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkp {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public dkkp() {
        boolean z = false;
        this(z, z, z, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkkp)) {
            return false;
        }
        dkkp dkkpVar = (dkkp) obj;
        return this.e == dkkpVar.e && this.a == dkkpVar.a && this.b == dkkpVar.b && this.c == dkkpVar.c && this.d == dkkpVar.d;
    }

    public final int hashCode() {
        long j = this.a;
        int iA = dkko.a(this.e);
        boolean z = this.d;
        return (((((((iA * 31) + ((int) (j ^ (j >>> 32)))) * 31) + dkko.a(this.b)) * 31) + dkko.a(this.c)) * 31) + dkko.a(z);
    }

    public final String toString() {
        return "Flags(repositionProgressIndicatorForAccessibility=" + this.e + ", slopMultiplierForHorizontalSwipe=" + this.a + ", enableLazyMessageOnClick=" + this.b + ", disableNewTimestampsForTalkback=" + this.c + ", applyTraversalGroup=" + this.d + ")";
    }

    public dkkp(boolean z, long j, boolean z2, boolean z3, boolean z4) {
        this.e = z;
        this.a = j;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public /* synthetic */ dkkp(boolean z, boolean z2, boolean z3, int i) {
        this(false, (i & 2) != 0 ? 1L : 0L, ((i & 4) == 0) & z, ((i & 8) == 0) & z2, ((i & 16) == 0) & z3);
    }
}
