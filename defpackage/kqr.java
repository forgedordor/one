package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqr extends kqp {
    float a;

    public kqr(float f) {
        super(null);
        this.a = f;
    }

    @Override // defpackage.kqp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kqr) {
            float fT = t();
            float fT2 = ((kqr) obj).t();
            if ((Float.isNaN(fT) && Float.isNaN(fT2)) || fT == fT2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kqp
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f = this.a;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    @Override // defpackage.kqp
    public final float t() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Float.parseFloat(v());
        }
        return this.a;
    }

    @Override // defpackage.kqp
    public final int u() {
        if (Float.isNaN(this.a) && y()) {
            this.a = Integer.parseInt(v());
        }
        return (int) this.a;
    }
}
