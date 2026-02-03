package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hby implements fdat {
    final /* synthetic */ dhk a;
    final /* synthetic */ fdau b;
    final /* synthetic */ hcf c;

    public hby(dhk dhkVar, fdau fdauVar, hcf hcfVar) {
        this.a = dhkVar;
        this.b = fdauVar;
        this.c = hcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            dhk dhkVar = this.a;
            ico icoVar = ics.e;
            float f = hce.a;
            ics icsVarG = icj.g(icoVar, new hcd(dhkVar));
            fdau fdauVar = this.b;
            hcf hcfVar = this.c;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarG);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(hcfVar, hmlVar, 6);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
