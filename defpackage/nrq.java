package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrq implements mbs {
    public final float a;
    public final int b;

    public nrq(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nrq nrqVar = (nrq) obj;
            if (this.a == nrqVar.a && this.b == nrqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
