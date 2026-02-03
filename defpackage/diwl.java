package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diwl {
    public final float a;
    public final float b;
    public final long c;
    public final ddp d;
    public final ddp e;
    public final int f;
    public final float g;

    public diwl(float f, float f2, long j, ddp ddpVar, ddp ddpVar2, int i, float f3) {
        ddpVar.getClass();
        ddpVar2.getClass();
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = ddpVar;
        this.e = ddpVar2;
        this.f = i;
        this.g = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diwl)) {
            return false;
        }
        diwl diwlVar = (diwl) obj;
        if (Float.compare(this.a, diwlVar.a) != 0 || Float.compare(this.b, diwlVar.b) != 0) {
            return false;
        }
        long j = this.c;
        long j2 = diwlVar.c;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.d, diwlVar.d) && fdbq.f(this.e, diwlVar.e) && this.f == diwlVar.f && Float.compare(this.g, diwlVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = ije.a;
        return (((((((((iFloatToIntBits * 31) + fctr.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "SparkleUiData(xPercent=" + this.a + ", yPercent=" + this.b + ", color=" + ije.g(this.c) + ", scale=" + this.d + ", alpha=" + this.e + ", delayMillis=" + this.f + ", finalSizeScale=" + this.g + ")";
    }

    public /* synthetic */ diwl(float f, float f2, long j, ddp ddpVar, ddp ddpVar2, int i) {
        this(f, f2, j, ddpVar, ddpVar2, i, 1.0f);
    }
}
