package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsy {
    public final float a;
    public final float b;
    public final fdap c;

    public dmsy(float f, float f2, fdap fdapVar) {
        this.a = f;
        this.b = f2;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmsy)) {
            return false;
        }
        dmsy dmsyVar = (dmsy) obj;
        return Float.compare(this.a, dmsyVar.a) == 0 && Float.compare(this.b, dmsyVar.b) == 0 && fdbq.f(this.c, dmsyVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ZoomButtonUiData(zoomRatio=" + this.a + ", currentZoomRatio=" + this.b + ", onClick=" + this.c + ")";
    }

    public dmsy() {
        this(1.0f, 1.0f, new fdap() { // from class: dmsx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Float) obj).floatValue();
                return fctx.a;
            }
        });
    }
}
