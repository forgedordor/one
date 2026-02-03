package defpackage;

import android.graphics.RenderEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iiw extends ikk {
    private final ikk a = null;
    private final float b;
    private final float c;
    private final int d;

    public iiw(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // defpackage.ikk
    protected final RenderEffect a() {
        float f = this.b;
        float f2 = this.c;
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, iiq.a(this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iiw)) {
            return false;
        }
        iiw iiwVar = (iiw) obj;
        if (this.b != iiwVar.b || this.c != iiwVar.c || !ikx.b(this.d, iiwVar.d)) {
            return false;
        }
        ikk ikkVar = iiwVar.a;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + this.d;
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) ikx.a(this.d)) + ')';
    }
}
