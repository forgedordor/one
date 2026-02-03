package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddm implements fddn {
    private final float a;
    private final float b;

    public fddm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* bridge */ /* synthetic */ boolean e(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // defpackage.fddn
    public final boolean a() {
        return this.a > this.b;
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.fddn
    public final /* bridge */ /* synthetic */ Comparable c() {
        return Float.valueOf(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ boolean d(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.a && fFloatValue <= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fddm) {
            if (a() && ((fddm) obj).a()) {
                return true;
            }
            fddm fddmVar = (fddm) obj;
            return this.a == fddmVar.a && this.b == fddmVar.b;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
