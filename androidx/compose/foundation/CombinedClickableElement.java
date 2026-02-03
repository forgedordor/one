package androidx.compose.foundation;

import defpackage.dkd;
import defpackage.dln;
import defpackage.dlu;
import defpackage.dnk;
import defpackage.ebk;
import defpackage.fdae;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.ith;
import defpackage.jdy;
import defpackage.jfz;
import defpackage.jrw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CombinedClickableElement extends jdy<dlu> {
    private final dnk a;
    private final boolean b;
    private final boolean c;
    private final jrw d;
    private final fdae f;
    private final fdae g;
    private final ebk h;

    public /* synthetic */ CombinedClickableElement(ebk ebkVar, dnk dnkVar, boolean z, boolean z2, jrw jrwVar, fdae fdaeVar, fdae fdaeVar2) {
        this.h = ebkVar;
        this.a = dnkVar;
        this.b = z;
        this.c = z2;
        this.d = jrwVar;
        this.f = fdaeVar;
        this.g = fdaeVar2;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new dlu(this.f, this.g, this.h, this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        boolean z;
        ith ithVar;
        dlu dluVar = (dlu) icrVar;
        dluVar.k = true;
        if (!fdbq.f(null, null)) {
            jfz.a(dluVar);
        }
        fdae fdaeVar = this.g;
        if ((dluVar.j == null) != (fdaeVar == null)) {
            dluVar.i();
            jfz.a(dluVar);
            z = true;
        } else {
            z = false;
        }
        jrw jrwVar = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        boolean z4 = false;
        dnk dnkVar = this.a;
        ebk ebkVar = this.h;
        fdae fdaeVar2 = this.f;
        dluVar.j = fdaeVar;
        if (((dkd) dluVar).b == z2) {
            z4 = true;
        }
        dluVar.z(ebkVar, dnkVar, z3, z2, null, jrwVar, fdaeVar2);
        if ((!(true ^ z4) && !z) || (ithVar = dluVar.e) == null) {
            return;
        }
        ithVar.r();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return fdbq.f(this.h, combinedClickableElement.h) && fdbq.f(this.a, combinedClickableElement.a) && this.b == combinedClickableElement.b && this.c == combinedClickableElement.c && fdbq.f(null, null) && fdbq.f(this.d, combinedClickableElement.d) && this.f == combinedClickableElement.f && fdbq.f(null, null) && this.g == combinedClickableElement.g;
    }

    public final int hashCode() {
        ebk ebkVar = this.h;
        int iHashCode = ebkVar != null ? ebkVar.hashCode() : 0;
        dnk dnkVar = this.a;
        int iHashCode2 = dnkVar != null ? dnkVar.hashCode() : 0;
        int i = iHashCode * 31;
        boolean z = this.b;
        boolean z2 = this.c;
        jrw jrwVar = this.d;
        int iA = ((((((((i + iHashCode2) * 31) + dln.a(z)) * 31) + dln.a(z2)) * 961) + (jrwVar != null ? jrwVar.a : 0)) * 31) + this.f.hashCode();
        fdae fdaeVar = this.g;
        return (((iA * 961) + (fdaeVar != null ? fdaeVar.hashCode() : 0)) * 961) + dln.a(true);
    }
}
