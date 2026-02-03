package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytg implements ykp {
    public final ytn a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public ytg(ytn ytnVar, boolean z, String str, boolean z2) {
        this.a = ytnVar;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytg)) {
            return false;
        }
        ytg ytgVar = (ytg) obj;
        return fdbq.f(this.a, ytgVar.a) && this.b == ytgVar.b && fdbq.f(this.c, ytgVar.c) && this.d == ytgVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + ytf.a(this.b)) * 31) + this.c.hashCode()) * 31) + ytf.a(this.d);
    }

    public final String toString() {
        return "GalleryBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.d + ")";
    }
}
