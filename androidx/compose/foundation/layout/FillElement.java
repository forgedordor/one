package androidx.compose.foundation.layout;

import defpackage.eed;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends jdy<eed> {
    private final float a;
    private final int b;

    public FillElement(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new eed(this.b, this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        eed eedVar = (eed) icrVar;
        eedVar.b = this.b;
        eedVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.a == fillElement.a;
    }

    public final int hashCode() {
        return (this.b * 31) + Float.floatToIntBits(this.a);
    }
}
