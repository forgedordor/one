package androidx.compose.foundation.layout;

import defpackage.ega;
import defpackage.eic;
import defpackage.icr;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends jdy<ega> {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3))) || !(f4 >= 0.0f || Float.isNaN(f4))) {
            eic.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ega(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ega egaVar = (ega) icrVar;
        egaVar.a = this.a;
        egaVar.b = this.b;
        egaVar.c = this.c;
        egaVar.d = this.d;
        egaVar.e = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && kir.b(this.a, paddingElement.a) && kir.b(this.b, paddingElement.b) && kir.b(this.c, paddingElement.c) && kir.b(this.d, paddingElement.d);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + 1231;
    }
}
