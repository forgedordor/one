package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koc {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    public koc(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = true;
        this.c = z;
        this.d = z2;
        this.e = true;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koc)) {
            return false;
        }
        koc kocVar = (koc) obj;
        if (this.a != kocVar.a) {
            return false;
        }
        boolean z = kocVar.b;
        if (this.c != kocVar.c || this.d != kocVar.d) {
            return false;
        }
        boolean z2 = kocVar.e;
        boolean z3 = kocVar.f;
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        boolean z = this.d;
        return (((((((((i * 31) + kob.a(true)) * 31) + kob.a(this.c)) * 31) + kob.a(z)) * 31) + kob.a(true)) * 31) + kob.a(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public koc(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = kna.a;
        int i2 = true != z ? 262152 : 262144;
        this(z4 ? i2 : i2 | 512, z2, z3);
    }

    public /* synthetic */ koc(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 | (!((i & 2) == 0)), (i & 4) != 0, true);
    }
}
