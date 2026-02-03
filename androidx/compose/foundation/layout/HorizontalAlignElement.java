package androidx.compose.foundation.layout;

import defpackage.efe;
import defpackage.fdbq;
import defpackage.ibx;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends jdy<efe> {
    private final ibx a;

    public HorizontalAlignElement(ibx ibxVar) {
        this.a = ibxVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new efe(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((efe) icrVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return fdbq.f(this.a, horizontalAlignElement.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
