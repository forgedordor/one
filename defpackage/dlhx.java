package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhx {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final boolean e;
    private final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public dlhx() {
        boolean z = false;
        this(z, z, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlhx)) {
            return false;
        }
        dlhx dlhxVar = (dlhx) obj;
        if (this.e != dlhxVar.e || this.a != dlhxVar.a) {
            return false;
        }
        boolean z = dlhxVar.f;
        return this.b == dlhxVar.b && this.c == dlhxVar.c && this.d == dlhxVar.d;
    }

    public final int hashCode() {
        int iA = dlhw.a(this.e);
        boolean z = this.d;
        boolean z2 = this.c;
        return (((((((((iA * 31) + dlhw.a(this.a)) * 31) + dlhw.a(false)) * 31) + dlhw.a(this.b)) * 31) + dlhw.a(z2)) * 31) + dlhw.a(z);
    }

    public final String toString() {
        return "Flags(enableInBubbleReadReceipts=" + this.e + ", enableSwipeToShowTimestamps=" + this.a + ", enableColorSwap=false, enableGetTextWithContentMinWidthFix=" + this.b + ", enableRememberMeasurementsForTextBubble=" + this.c + ", disableNewTimestampsForTalkback=" + this.d + ")";
    }

    public dlhx(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.e = z;
        this.a = z2;
        this.f = false;
        this.b = z3;
        this.c = z4;
        this.d = z5;
    }

    public /* synthetic */ dlhx(boolean z, boolean z2, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false, false, ((i & 16) == 0) & z2, false);
    }
}
