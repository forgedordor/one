package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evk implements evf {
    private final float a;

    public evk(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            ebs.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.evf
    public final float a(long j, kio kioVar) {
        return ihz.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evk) && Float.compare(this.a, ((evk) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
