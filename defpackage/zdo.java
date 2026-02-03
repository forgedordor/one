package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zdo implements ykp {
    public final ajlt a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final amuk e;

    public zdo(ajlt ajltVar, amuk amukVar, boolean z, String str, boolean z2) {
        this.a = ajltVar;
        this.e = amukVar;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdo)) {
            return false;
        }
        zdo zdoVar = (zdo) obj;
        return fdbq.f(this.a, zdoVar.a) && fdbq.f(this.e, zdoVar.e) && this.b == zdoVar.b && fdbq.f(this.c, zdoVar.c) && this.d == zdoVar.d;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + zdn.a(this.b)) * 31) + this.c.hashCode()) * 31) + zdn.a(this.d);
    }

    public final String toString() {
        return "RichCardCarouselBubbleArgs(message=" + this.a + ", content=" + this.e + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.d + ")";
    }
}
