package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yod implements ykp {
    public final uin a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final ajlt e;
    public final boolean f;

    public yod(uin uinVar, boolean z, String str, boolean z2, ajlt ajltVar, boolean z3) {
        this.a = uinVar;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = ajltVar;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yod)) {
            return false;
        }
        yod yodVar = (yod) obj;
        return fdbq.f(this.a, yodVar.a) && this.b == yodVar.b && fdbq.f(this.c, yodVar.c) && this.d == yodVar.d && fdbq.f(this.e, yodVar.e) && this.f == yodVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + yoc.a(this.b)) * 31) + this.c.hashCode()) * 31) + yoc.a(this.d)) * 31) + this.e.hashCode()) * 31) + yoc.a(this.f);
    }

    public final String toString() {
        return "VCardBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.d + ", message=" + this.e + ", isOutgoing=" + this.f + ")";
    }
}
