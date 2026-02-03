package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evi implements evf {
    private final float a;

    public evi(float f) {
        this.a = f;
    }

    @Override // defpackage.evf
    public final float a(long j, kio kioVar) {
        return kioVar.en(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof evi) && kir.b(this.a, ((evi) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
