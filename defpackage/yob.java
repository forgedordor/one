package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yob implements ykp {
    public final boolean a;
    public final String b;
    public final boolean c;
    private final amsv d;

    public yob(amsv amsvVar, boolean z, String str, boolean z2) {
        this.d = amsvVar;
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yob)) {
            return false;
        }
        yob yobVar = (yob) obj;
        return fdbq.f(this.d, yobVar.d) && this.a == yobVar.a && fdbq.f(this.b, yobVar.b) && this.c == yobVar.c;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + yoa.a(this.a)) * 31) + this.b.hashCode()) * 31) + yoa.a(this.c);
    }

    public final String toString() {
        return "SatelliteAttachmentFailureBubbleArgs(content=" + this.d + ", isHighlighted=" + this.a + ", contentDescription=" + this.b + ", enableSwipeToShowTimestamps=" + this.c + ")";
    }
}
