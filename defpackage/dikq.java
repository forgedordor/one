package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikq {
    public final float a;
    public final fdap b;
    public final fdae c;

    public dikq(float f, fdap fdapVar, fdae fdaeVar) {
        fdapVar.getClass();
        fdaeVar.getClass();
        this.a = f;
        this.b = fdapVar;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikq)) {
            return false;
        }
        dikq dikqVar = (dikq) obj;
        return Float.compare(this.a, dikqVar.a) == 0 && fdbq.f(this.b, dikqVar.b) && fdbq.f(this.c, dikqVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SeekbarUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }
}
