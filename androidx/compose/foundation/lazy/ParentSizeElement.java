package androidx.compose.foundation.lazy;

import defpackage.ekd;
import defpackage.fdbq;
import defpackage.hsf;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ParentSizeElement extends jdy<ekd> {
    private final hsf b;
    private final float a = 1.0f;
    private final hsf c = null;

    public ParentSizeElement(hsf hsfVar) {
        this.b = hsfVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new ekd(this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ekd ekdVar = (ekd) icrVar;
        ekdVar.a = 1.0f;
        ekdVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        float f = parentSizeElement.a;
        if (fdbq.f(this.b, parentSizeElement.b)) {
            hsf hsfVar = parentSizeElement.c;
            if (fdbq.f(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 961) + Float.floatToIntBits(1.0f);
    }
}
