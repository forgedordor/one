package androidx.compose.foundation.layout;

import defpackage.efp;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicWidthElement extends jdy<efp> {
    private final int a;

    public IntrinsicWidthElement(int i) {
        this.a = i;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efp(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        efp efpVar = (efp) icrVar;
        efpVar.b = this.a;
        efpVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.a == intrinsicWidthElement.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
