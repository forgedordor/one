package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egd implements egc {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public egd(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            eic.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.egc
    public final float a() {
        return this.b;
    }

    @Override // defpackage.egc
    public final float b(kji kjiVar) {
        return kjiVar == kji.a ? this.c : this.d;
    }

    @Override // defpackage.egc
    public final float c(kji kjiVar) {
        return kjiVar == kji.a ? this.d : this.c;
    }

    @Override // defpackage.egc
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof egd)) {
            return false;
        }
        egd egdVar = (egd) obj;
        return kir.b(this.c, egdVar.c) && kir.b(this.a, egdVar.a) && kir.b(this.d, egdVar.d) && kir.b(this.b, egdVar.b);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) kir.a(this.c)) + ", top=" + ((Object) kir.a(this.a)) + ", end=" + ((Object) kir.a(this.d)) + ", bottom=" + ((Object) kir.a(this.b)) + ')';
    }
}
