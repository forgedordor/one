package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqfq {
    public final fdae a;
    public final int b;
    public final int c;

    public dqfq(fdae fdaeVar, int i, int i2) {
        this.a = fdaeVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqfq)) {
            return false;
        }
        dqfq dqfqVar = (dqfq) obj;
        return fdbq.f(this.a, dqfqVar.a) && this.b == dqfqVar.b && this.c == dqfqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "PlayPauseButtonData(onClick=" + this.a + ", iconResId=" + this.b + ", contentDescriptionId=" + this.c + ")";
    }
}
