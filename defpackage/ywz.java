package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywz implements ykp {
    public final amwk a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final fdae e;
    public final fdae f;
    private final boolean g;

    public ywz(amwk amwkVar, boolean z, String str, boolean z2, boolean z3, fdae fdaeVar, fdae fdaeVar2) {
        this.a = amwkVar;
        this.b = z;
        this.c = str;
        this.g = z2;
        this.d = z3;
        this.e = fdaeVar;
        this.f = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywz)) {
            return false;
        }
        ywz ywzVar = (ywz) obj;
        return fdbq.f(this.a, ywzVar.a) && this.b == ywzVar.b && fdbq.f(this.c, ywzVar.c) && this.g == ywzVar.g && this.d == ywzVar.d && fdbq.f(this.e, ywzVar.e) && fdbq.f(this.f, ywzVar.f);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + ywy.a(this.b)) * 31) + this.c.hashCode()) * 31) + ywy.a(this.g)) * 31) + ywy.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "PendingBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.g + ", isOutgoing=" + this.d + ", onCancelTransfer=" + this.e + ", onResumeTransfer=" + this.f + ")";
    }
}
