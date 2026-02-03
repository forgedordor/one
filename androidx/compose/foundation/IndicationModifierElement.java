package androidx.compose.foundation;

import defpackage.dnj;
import defpackage.dnk;
import defpackage.ebk;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jbf;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IndicationModifierElement extends jdy<dnj> {
    private final dnk a;
    private final ebk b;

    public IndicationModifierElement(ebk ebkVar, dnk dnkVar) {
        this.b = ebkVar;
        this.a = dnkVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dnj(this.a.a(this.b));
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        dnj dnjVar = (dnj) icrVar;
        jbf jbfVarA = this.a.a(this.b);
        dnjVar.M(dnjVar.a);
        dnjVar.a = jbfVarA;
        dnjVar.N(jbfVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return fdbq.f(this.b, indicationModifierElement.b) && fdbq.f(this.a, indicationModifierElement.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
