package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eee implements ehc {
    private final float a = 0.0f;
    private final float b = 0.0f;
    private final float c = 0.0f;
    private final float d = 0.0f;

    @Override // defpackage.ehc
    public final int a(kio kioVar) {
        return kioVar.ep(0.0f);
    }

    @Override // defpackage.ehc
    public final int b(kio kioVar, kji kjiVar) {
        return kioVar.ep(0.0f);
    }

    @Override // defpackage.ehc
    public final int c(kio kioVar, kji kjiVar) {
        return kioVar.ep(0.0f);
    }

    @Override // defpackage.ehc
    public final int d(kio kioVar) {
        return kioVar.ep(0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eee)) {
            return false;
        }
        eee eeeVar = (eee) obj;
        float f = eeeVar.a;
        if (kir.b(0.0f, 0.0f)) {
            float f2 = eeeVar.b;
            if (kir.b(0.0f, 0.0f)) {
                float f3 = eeeVar.c;
                if (kir.b(0.0f, 0.0f)) {
                    float f4 = eeeVar.d;
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
        return "Insets(left=" + ((Object) kir.a(0.0f)) + ", top=" + ((Object) kir.a(0.0f)) + ", right=" + ((Object) kir.a(0.0f)) + ", bottom=" + ((Object) kir.a(0.0f)) + ')';
    }
}
