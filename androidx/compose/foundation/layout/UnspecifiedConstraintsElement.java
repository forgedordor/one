package androidx.compose.foundation.layout;

import defpackage.egz;
import defpackage.icr;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends jdy<egz> {
    private final float a;
    private final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new egz(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        egz egzVar = (egz) icrVar;
        egzVar.a = this.a;
        egzVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return kir.b(this.a, unspecifiedConstraintsElement.a) && kir.b(this.b, unspecifiedConstraintsElement.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
