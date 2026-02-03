package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkn extends ebkh {
    public ebkg e;
    public ebko g;
    public ebka h;
    public ebjz i;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public ebkm d = ebkm.a;
    public ebkp f = ebkp.a;

    public final void a(ebkd ebkdVar) {
        this.c.add(ebkdVar);
    }

    @Override // defpackage.ebkh
    public final void b(StringBuilder sb) {
        this.d.b(sb);
        ebkg ebkgVar = this.e;
        if (ebkgVar != null) {
            ebkgVar.b(sb);
        }
        this.f.b(sb);
        ebko ebkoVar = this.g;
        if (ebkoVar != null) {
            ebkoVar.b(sb);
        }
        ebka ebkaVar = this.h;
        if (ebkaVar != null) {
            ebkaVar.b(sb);
        }
        ebjz ebjzVar = this.i;
        if (ebjzVar != null) {
            ebjzVar.b(sb);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ebkq) it.next()).b(sb);
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((ebkb) it2.next()).b(sb);
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            ((ebkd) it3.next()).b(sb);
        }
    }

    public final void c(ebkq ebkqVar) {
        this.a.add(ebkqVar);
    }

    public final boolean d() {
        return this.h != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebkn)) {
            return false;
        }
        ebkn ebknVar = (ebkn) obj;
        if (!this.d.equals(ebknVar.d) || !this.f.equals(ebknVar.f)) {
            return false;
        }
        ebkg ebkgVar = this.e;
        if (ebkgVar == null && ebknVar.e != null) {
            return false;
        }
        if (ebkgVar != null && !ebkgVar.equals(ebknVar.e)) {
            return false;
        }
        ebko ebkoVar = this.g;
        if (ebkoVar == null && ebknVar.g != null) {
            return false;
        }
        if (ebkoVar != null && !ebkoVar.equals(ebknVar.g)) {
            return false;
        }
        ebka ebkaVar = this.h;
        if (ebkaVar == null && ebknVar.h != null) {
            return false;
        }
        if (ebkaVar != null && !ebkaVar.equals(ebknVar.h)) {
            return false;
        }
        ebjz ebjzVar = this.i;
        if (ebjzVar != null || ebknVar.i == null) {
            return (ebjzVar == null || ebjzVar.equals(ebknVar.i)) && this.b.equals(ebknVar.b) && this.a.equals(ebknVar.a) && this.c.equals(ebknVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() * 37) + this.c.hashCode()) * 37) + this.a.hashCode()) * 37) + this.f.hashCode()) * 37) + this.d.b;
        ebjz ebjzVar = this.i;
        if (ebjzVar != null) {
            iHashCode = (iHashCode * 37) + ebjzVar.hashCode();
        }
        ebka ebkaVar = this.h;
        if (ebkaVar != null) {
            iHashCode = (iHashCode * 37) + ebkaVar.hashCode();
        }
        ebkg ebkgVar = this.e;
        if (ebkgVar != null) {
            iHashCode = (iHashCode * 37) + ebkgVar.hashCode();
        }
        ebko ebkoVar = this.g;
        return ebkoVar != null ? (iHashCode * 37) + ebkoVar.hashCode() : iHashCode;
    }
}
