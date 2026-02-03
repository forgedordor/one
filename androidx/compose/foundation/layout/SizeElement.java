package androidx.compose.foundation.layout;

import defpackage.egs;
import defpackage.icr;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends jdy<egs> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final boolean f;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = z;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new egs(this.a, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        egs egsVar = (egs) icrVar;
        egsVar.a = this.a;
        egsVar.b = this.b;
        egsVar.c = this.c;
        egsVar.d = this.d;
        egsVar.e = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return kir.b(this.a, sizeElement.a) && kir.b(this.b, sizeElement.b) && kir.b(this.c, sizeElement.c) && kir.b(this.d, sizeElement.d) && this.f == sizeElement.f;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + (true != this.f ? 1237 : 1231);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, int i) {
        boolean z2;
        float f5;
        float f6;
        float f7;
        float f8;
        f4 = (i & 8) != 0 ? Float.NaN : f4;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        f2 = (i & 2) != 0 ? Float.NaN : f2;
        if (1 == (i & 1)) {
            z2 = z;
            f5 = f4;
            f6 = f3;
            f7 = f2;
            f8 = Float.NaN;
        } else {
            z2 = z;
            f5 = f4;
            f6 = f3;
            f7 = f2;
            f8 = f;
        }
        this(f8, f7, f6, f5, z2);
    }
}
