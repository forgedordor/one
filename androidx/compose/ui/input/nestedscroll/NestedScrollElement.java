package androidx.compose.ui.input.nestedscroll;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.iqp;
import defpackage.iqt;
import defpackage.iqy;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NestedScrollElement extends jdy<iqy> {
    private final iqp a;
    private final iqt b;

    public NestedScrollElement(iqp iqpVar, iqt iqtVar) {
        this.a = iqpVar;
        this.b = iqtVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iqy(this.a, this.b);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        iqy iqyVar = (iqy) icrVar;
        iqyVar.a = this.a;
        iqyVar.h();
        iqt iqtVar = this.b;
        if (iqtVar == null) {
            iqyVar.b = new iqt();
        } else if (!fdbq.f(iqtVar, iqyVar.b)) {
            iqyVar.b = iqtVar;
        }
        if (iqyVar.C) {
            iqyVar.i();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return fdbq.f(nestedScrollElement.a, this.a) && fdbq.f(nestedScrollElement.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        iqt iqtVar = this.b;
        return iHashCode + (iqtVar != null ? iqtVar.hashCode() : 0);
    }
}
