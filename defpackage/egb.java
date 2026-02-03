package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egb implements egc {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 0.0f;
    private final float d = 0.0f;

    @Override // defpackage.egc
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.egc
    public final float b(kji kjiVar) {
        return 0.0f;
    }

    @Override // defpackage.egc
    public final float c(kji kjiVar) {
        return 0.0f;
    }

    @Override // defpackage.egc
    public final float d() {
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof egb)) {
            return false;
        }
        egb egbVar = (egb) obj;
        float f = egbVar.a;
        if (kir.b(0.0f, 0.0f)) {
            float f2 = egbVar.b;
            if (kir.b(0.0f, 0.0f)) {
                float f3 = egbVar.c;
                if (kir.b(0.0f, 0.0f)) {
                    float f4 = egbVar.d;
                    if (kir.b(0.0f, 0.0f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(0.0f) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PaddingValues.Absolute(left=" + ((Object) kir.a(0.0f)) + ", top=" + ((Object) kir.a(0.0f)) + ", right=" + ((Object) kir.a(0.0f)) + ", bottom=" + ((Object) kir.a(0.0f)) + ')';
    }
}
