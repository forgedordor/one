package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yon implements ykp {
    public final amsy a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final ajlt e;
    public final ynj f;
    public final boolean g;
    public final boolean h;
    public final dkpc i;

    public yon(amsy amsyVar, boolean z, String str, boolean z2, ajlt ajltVar, ynj ynjVar, boolean z3, boolean z4, dkpc dkpcVar) {
        this.a = amsyVar;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = ajltVar;
        this.f = ynjVar;
        this.g = z3;
        this.h = z4;
        this.i = dkpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yon)) {
            return false;
        }
        yon yonVar = (yon) obj;
        return fdbq.f(this.a, yonVar.a) && this.b == yonVar.b && fdbq.f(this.c, yonVar.c) && this.d == yonVar.d && fdbq.f(this.e, yonVar.e) && fdbq.f(this.f, yonVar.f) && this.g == yonVar.g && this.h == yonVar.h && fdbq.f(this.i, yonVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() * 31) + yom.a(this.b)) * 31) + this.c.hashCode()) * 31) + yom.a(this.d)) * 31) + this.e.hashCode();
        ynj ynjVar = this.f;
        int iHashCode2 = ((((((iHashCode * 31) + (ynjVar == null ? 0 : ynjVar.hashCode())) * 31) + yom.a(this.g)) * 31) + yom.a(this.h)) * 31;
        dkpc dkpcVar = this.i;
        return iHashCode2 + (dkpcVar != null ? dkpcVar.hashCode() : 0);
    }

    public final String toString() {
        return "AudioBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.d + ", message=" + this.e + ", searchData=" + this.f + ", isRichType=" + this.g + ", isOutgoing=" + this.h + ", statusUiData=" + this.i + ")";
    }
}
