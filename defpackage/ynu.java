package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynu implements ykp {
    public final boolean a;
    public final amsv b;
    public final boolean c;
    public final String d;

    public ynu(boolean z, amsv amsvVar, boolean z2, String str) {
        this.a = z;
        this.b = amsvVar;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynu)) {
            return false;
        }
        ynu ynuVar = (ynu) obj;
        return this.a == ynuVar.a && fdbq.f(this.b, ynuVar.b) && this.c == ynuVar.c && fdbq.f(this.d, ynuVar.d);
    }

    public final int hashCode() {
        return (((((ynt.a(this.a) * 31) + this.b.hashCode()) * 31) + ynt.a(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PermanentFailureBubbleArgs(enableSwipeToShowTimestamps=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ")";
    }
}
