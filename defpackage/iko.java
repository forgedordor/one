package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iko {
    public static final iko a = new iko();
    public final long b;
    public final long c;
    public final float d;

    public iko(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iko)) {
            return false;
        }
        long j = this.b;
        iko ikoVar = (iko) obj;
        long j2 = ikoVar.b;
        long j3 = ije.a;
        return fcts.a(j, j2) && ihs.h(this.c, ikoVar.c) && this.d == ikoVar.d;
    }

    public final int hashCode() {
        long j = ije.a;
        return (((fctr.a(this.b) * 31) + ihr.a(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) ije.g(this.b)) + ", offset=" + ((Object) ihs.g(this.c)) + ", blurRadius=" + this.d + ')';
    }

    public /* synthetic */ iko() {
        this(ijg.d(4278190080L), 0L, 0.0f);
    }
}
