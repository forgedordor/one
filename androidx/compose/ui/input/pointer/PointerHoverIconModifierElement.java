package androidx.compose.ui.input.pointer;

import defpackage.fdbq;
import defpackage.icr;
import defpackage.irc;
import defpackage.iry;
import defpackage.isa;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends jdy<iry> {
    private final isa a;
    private final boolean b = false;

    public PointerHoverIconModifierElement(isa isaVar) {
        this.a = isaVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new iry(this.a);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        ((iry) icrVar).g(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        if (!fdbq.f(this.a, pointerHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = pointerHoverIconModifierElement.b;
        return true;
    }

    public final int hashCode() {
        return (((irc) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
