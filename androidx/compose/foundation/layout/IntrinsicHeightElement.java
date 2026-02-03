package androidx.compose.foundation.layout;

import defpackage.efl;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntrinsicHeightElement extends jdy<efl> {
    private final int a;

    public IntrinsicHeightElement(int i) {
        this.a = i;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efl(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        efl eflVar = (efl) icrVar;
        eflVar.b = this.a;
        eflVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.a == intrinsicHeightElement.a;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }
}
