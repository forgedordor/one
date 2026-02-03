package androidx.compose.foundation.layout;

import defpackage.ehb;
import defpackage.fdbq;
import defpackage.icc;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class VerticalAlignElement extends jdy<ehb> {
    private final icc a;

    public VerticalAlignElement(icc iccVar) {
        this.a = iccVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ehb(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((ehb) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return fdbq.f(this.a, verticalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
