package androidx.compose.foundation.layout;

import defpackage.ecu;
import defpackage.eic;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AspectRatioElement extends jdy<ecu> {
    private final float a;
    private final boolean b;

    public AspectRatioElement(float f, boolean z) {
        this.a = f;
        this.b = z;
        if (f > 0.0f) {
            return;
        }
        eic.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ecu(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ecu ecuVar = (ecu) icrVar;
        ecuVar.a = this.a;
        ecuVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.a == aspectRatioElement.a && this.b == ((AspectRatioElement) obj).b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
