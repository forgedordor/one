package androidx.compose.foundation.selection;

import defpackage.dnk;
import defpackage.ebk;
import defpackage.euv;
import defpackage.evb;
import defpackage.fdap;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.jdy;
import defpackage.jfz;
import defpackage.jrw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ToggleableElement extends jdy<evb> {
    private final boolean a;
    private final dnk b;
    private final boolean c;
    private final boolean d;
    private final jrw f;
    private final fdap g;
    private final ebk h;

    public ToggleableElement(boolean z, ebk ebkVar, dnk dnkVar, boolean z2, boolean z3, jrw jrwVar, fdap fdapVar) {
        this.a = z;
        this.h = ebkVar;
        this.b = dnkVar;
        this.c = z2;
        this.d = z3;
        this.f = jrwVar;
        this.g = fdapVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new evb(this.a, this.h, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        evb evbVar = (evb) icrVar;
        boolean z = evbVar.j;
        boolean z2 = this.a;
        if (z != z2) {
            evbVar.j = z2;
            jfz.a(evbVar);
        }
        fdap fdapVar = this.g;
        jrw jrwVar = this.f;
        boolean z3 = this.d;
        boolean z4 = this.c;
        dnk dnkVar = this.b;
        ebk ebkVar = this.h;
        evbVar.k = fdapVar;
        evbVar.z(ebkVar, dnkVar, z4, z3, null, jrwVar, evbVar.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.a == toggleableElement.a && fdbq.f(this.h, toggleableElement.h) && fdbq.f(this.b, toggleableElement.b) && this.c == toggleableElement.c && this.d == toggleableElement.d && fdbq.f(this.f, toggleableElement.f) && this.g == toggleableElement.g;
    }

    public final int hashCode() {
        ebk ebkVar = this.h;
        int iHashCode = ebkVar != null ? ebkVar.hashCode() : 0;
        boolean z = this.a;
        dnk dnkVar = this.b;
        int iHashCode2 = dnkVar != null ? dnkVar.hashCode() : 0;
        int iA = (euv.a(z) * 31) + iHashCode;
        boolean z2 = this.c;
        boolean z3 = this.d;
        jrw jrwVar = this.f;
        return (((((((((iA * 31) + iHashCode2) * 31) + euv.a(z2)) * 31) + euv.a(z3)) * 31) + (jrwVar != null ? jrwVar.a : 0)) * 31) + this.g.hashCode();
    }
}
