package androidx.compose.material3;

import defpackage.ebk;
import defpackage.fdbq;
import defpackage.fdil;
import defpackage.fdlr;
import defpackage.gkf;
import defpackage.gkm;
import defpackage.gkn;
import defpackage.gxi;
import defpackage.icr;
import defpackage.ikp;
import defpackage.jdy;
import defpackage.kir;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndicatorLineElement extends jdy<gkn> {
    private final boolean a;
    private final boolean b;
    private final gxi c;
    private final ikp d;
    private final float f = 2.0f;
    private final float g = 1.0f;
    private final ebk h;

    public IndicatorLineElement(boolean z, boolean z2, ebk ebkVar, gxi gxiVar, ikp ikpVar) {
        this.a = z;
        this.b = z2;
        this.h = ebkVar;
        this.c = gxiVar;
        this.d = ikpVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new gkn(this.a, this.b, this.h, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        boolean z;
        gkn gknVar = (gkn) icrVar;
        boolean z2 = gknVar.a;
        boolean z3 = this.a;
        boolean z4 = true;
        if (z2 != z3) {
            gknVar.a = z3;
            z = true;
        } else {
            z = false;
        }
        boolean z5 = this.b;
        if (gknVar.b != z5) {
            gknVar.b = z5;
            z = true;
        }
        ebk ebkVar = this.h;
        if (gknVar.l != ebkVar) {
            gknVar.l = ebkVar;
            fdlr fdlrVar = gknVar.f;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            gknVar.f = fdil.d(gknVar.E(), null, null, new gkm(gknVar, null), 3);
        }
        gxi gxiVar = this.c;
        if (!fdbq.f(gknVar.g, gxiVar)) {
            gknVar.g = gxiVar;
            z = true;
        }
        ikp ikpVar = this.d;
        if (!fdbq.f(gknVar.i, ikpVar)) {
            if (!fdbq.f(gknVar.i, ikpVar)) {
                gknVar.i = ikpVar;
                gknVar.k.a();
            }
            z = true;
        }
        if (kir.b(gknVar.c, 2.0f)) {
            z4 = z;
        } else {
            gknVar.c = 2.0f;
        }
        if (!kir.b(gknVar.d, 1.0f)) {
            gknVar.d = 1.0f;
        } else if (!z4) {
            return;
        }
        gknVar.f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        if (this.a != indicatorLineElement.a || this.b != indicatorLineElement.b || !fdbq.f(this.h, indicatorLineElement.h) || !fdbq.f(this.c, indicatorLineElement.c) || !fdbq.f(this.d, indicatorLineElement.d)) {
            return false;
        }
        float f = indicatorLineElement.f;
        if (!kir.b(2.0f, 2.0f)) {
            return false;
        }
        float f2 = indicatorLineElement.g;
        return kir.b(1.0f, 1.0f);
    }

    public final int hashCode() {
        int iA = (((gkf.a(this.a) * 31) + gkf.a(this.b)) * 31) + this.h.hashCode();
        gxi gxiVar = this.c;
        int iHashCode = ((iA * 31) + (gxiVar == null ? 0 : gxiVar.hashCode())) * 31;
        ikp ikpVar = this.d;
        return ((((iHashCode + (ikpVar != null ? ikpVar.hashCode() : 0)) * 31) + Float.floatToIntBits(2.0f)) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.a + ", isError=" + this.b + ", interactionSource=" + this.h + ", colors=" + this.c + ", textFieldShape=" + this.d + ", focusedIndicatorLineThickness=" + ((Object) kir.a(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) kir.a(1.0f)) + ')';
    }
}
