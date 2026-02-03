package androidx.compose.foundation;

import defpackage.dmm;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FocusableElement extends jdy<dmm> {
    private final ebk a;

    public FocusableElement(ebk ebkVar) {
        this.a = ebkVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dmm(this.a, 1, null);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((dmm) icrVar).j(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && fdbq.f(this.a, ((FocusableElement) obj).a);
    }

    public final int hashCode() {
        ebk ebkVar = this.a;
        if (ebkVar != null) {
            return ebkVar.hashCode();
        }
        return 0;
    }
}
