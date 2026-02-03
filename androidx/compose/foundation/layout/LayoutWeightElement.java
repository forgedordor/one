package androidx.compose.foundation.layout;

import defpackage.efq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends jdy<efq> {
    private final float a;
    private final boolean b;

    public LayoutWeightElement(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efq(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        efq efqVar = (efq) icrVar;
        efqVar.a = this.a;
        efqVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.a == layoutWeightElement.a && this.b == layoutWeightElement.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
