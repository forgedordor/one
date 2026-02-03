package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evl implements evf {
    private final float a;

    public evl(float f) {
        this.a = f;
    }

    @Override // defpackage.evf
    public final float a(long j, kio kioVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evl) && Float.compare(this.a, ((evl) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
