package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcl implements ykp {
    public final ajlt a;
    public final amvz b;
    public final boolean c;
    public final String d;
    private final boolean e;

    public zcl(ajlt ajltVar, amvz amvzVar, boolean z, String str, boolean z2) {
        amvzVar.getClass();
        this.a = ajltVar;
        this.b = amvzVar;
        this.c = z;
        this.d = str;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcl)) {
            return false;
        }
        zcl zclVar = (zcl) obj;
        return fdbq.f(this.a, zclVar.a) && fdbq.f(this.b, zclVar.b) && this.c == zclVar.c && fdbq.f(this.d, zclVar.d) && this.e == zclVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + zck.a(this.c)) * 31) + this.d.hashCode()) * 31) + zck.a(this.e);
    }

    public final String toString() {
        return "RichCardBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ", enableSwipeToShowTimestamps=" + this.e + ")";
    }
}
