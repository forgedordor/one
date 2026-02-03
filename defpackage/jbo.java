package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jbo {
    private final float a = 10.0f;
    private final float b = 40.0f;
    private final float c = 10.0f;
    private final float d = 40.0f;
    private final boolean e = true;

    public static final long a(kio kioVar) {
        return jgd.b(kioVar.ep(10.0f), kioVar.ep(40.0f), kioVar.ep(10.0f), kioVar.ep(40.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbo)) {
            return false;
        }
        jbo jboVar = (jbo) obj;
        float f = jboVar.a;
        if (!kir.b(10.0f, 10.0f)) {
            return false;
        }
        float f2 = jboVar.b;
        if (!kir.b(40.0f, 40.0f)) {
            return false;
        }
        float f3 = jboVar.c;
        if (!kir.b(10.0f, 10.0f)) {
            return false;
        }
        float f4 = jboVar.d;
        if (!kir.b(40.0f, 40.0f)) {
            return false;
        }
        boolean z = jboVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(10.0f) * 31) + Float.floatToIntBits(40.0f)) * 31) + Float.floatToIntBits(10.0f)) * 31) + Float.floatToIntBits(40.0f)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) kir.a(10.0f)) + ", top=" + ((Object) kir.a(40.0f)) + ", end=" + ((Object) kir.a(10.0f)) + ", bottom=" + ((Object) kir.a(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
