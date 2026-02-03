package androidx.compose.foundation.selection;

import defpackage.dnk;
import defpackage.ebk;
import defpackage.evc;
import defpackage.evd;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jfz;
import defpackage.jrw;
import defpackage.jue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TriStateToggleableElement extends jdy<evd> {
    private final jue a;
    private final dnk b;
    private final boolean c;
    private final jrw d;
    private final fdae f;
    private final ebk g;

    public /* synthetic */ TriStateToggleableElement(jue jueVar, ebk ebkVar, dnk dnkVar, boolean z, jrw jrwVar, fdae fdaeVar) {
        this.a = jueVar;
        this.g = ebkVar;
        this.b = dnkVar;
        this.c = z;
        this.d = jrwVar;
        this.f = fdaeVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new evd(this.a, this.g, this.b, this.c, this.d, this.f);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        evd evdVar = (evd) icrVar;
        jue jueVar = evdVar.j;
        jue jueVar2 = this.a;
        if (jueVar != jueVar2) {
            evdVar.j = jueVar2;
            jfz.a(evdVar);
        }
        fdae fdaeVar = this.f;
        jrw jrwVar = this.d;
        boolean z = this.c;
        evdVar.z(this.g, this.b, false, z, null, jrwVar, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.a == triStateToggleableElement.a && fdbq.f(this.g, triStateToggleableElement.g) && fdbq.f(this.b, triStateToggleableElement.b) && this.c == triStateToggleableElement.c && fdbq.f(this.d, triStateToggleableElement.d) && this.f == triStateToggleableElement.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ebk ebkVar = this.g;
        int iHashCode2 = (iHashCode + (ebkVar != null ? ebkVar.hashCode() : 0)) * 31;
        dnk dnkVar = this.b;
        return ((((((((iHashCode2 + (dnkVar != null ? dnkVar.hashCode() : 0)) * 31) + evc.a(false)) * 31) + evc.a(this.c)) * 31) + this.d.a) * 31) + this.f.hashCode();
    }
}
