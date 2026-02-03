package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dker {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public dker() {
        boolean z = false;
        this(z, z, z, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dker)) {
            return false;
        }
        dker dkerVar = (dker) obj;
        return this.a == dkerVar.a && this.b == dkerVar.b && this.c == dkerVar.c && this.d == dkerVar.d && this.e == dkerVar.e;
    }

    public final int hashCode() {
        int iA = dkeq.a(this.a);
        boolean z = this.e;
        boolean z2 = this.d;
        return (((((((iA * 31) + dkeq.a(this.b)) * 31) + dkeq.a(this.c)) * 31) + dkeq.a(z2)) * 31) + dkeq.a(z);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", enableMediaBoxSizeCalculatorFix=" + this.b + ", disableNewTimestampsForTalkback=" + this.c + ", useEmojiBubbleInCaption=" + this.d + ", updateBubbleMaxHeight=" + this.e + ")";
    }

    public dker(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public /* synthetic */ dker(boolean z, boolean z2, boolean z3, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), false, ((i & 4) == 0) & z2, (i & 8) != 0, ((i & 16) == 0) & z3);
    }
}
