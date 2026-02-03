package androidx.compose.foundation.layout;

import defpackage.efu;
import defpackage.icr;
import defpackage.jci;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends jdy<efu> {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efu(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        efu efuVar = (efu) icrVar;
        float f = efuVar.a;
        float f2 = this.a;
        boolean zB = kir.b(f, f2);
        float f3 = this.b;
        if (!zB || !kir.b(efuVar.b, f3) || !efuVar.c) {
            jci.c(efuVar);
        }
        efuVar.a = f2;
        efuVar.b = f3;
        efuVar.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && kir.b(this.a, offsetElement.a) && kir.b(this.b, offsetElement.b);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) kir.a(this.a)) + ", y=" + ((Object) kir.a(this.b)) + ", rtlAware=true)";
    }
}
