package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erz implements esa {
    private final float a;

    public erz(float f) {
        this.a = f;
    }

    @Override // defpackage.esa
    public final int a(kio kioVar, int i, int i2) {
        return kioVar.ep(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof erz) {
            return kir.b(this.a, ((erz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}
