package androidx.compose.ui.input.pointer;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.irc;
import defpackage.irm;
import defpackage.isa;
import defpackage.itd;
import defpackage.jbo;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends jdy<itd> {
    private final isa a;
    private final boolean b = false;
    private final jbo c;

    public StylusHoverIconModifierElement(isa isaVar, jbo jboVar) {
        this.a = isaVar;
        this.c = jboVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new itd(this.a, this.c);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        itd itdVar = (itd) icrVar;
        itdVar.g(this.a);
        ((irm) itdVar).a = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        if (!fdbq.f(this.a, stylusHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = stylusHoverIconModifierElement.b;
        return fdbq.f(this.c, stylusHoverIconModifierElement.c);
    }

    public final int hashCode() {
        isa isaVar = this.a;
        return (((((irc) isaVar).a * 31) + 1237) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false, touchBoundsExpansion=" + this.c + ')';
    }
}
