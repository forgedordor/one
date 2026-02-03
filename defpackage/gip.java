package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gip implements fdat {
    final /* synthetic */ gss a;

    public gip(gss gssVar) {
        this.a = gssVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gss gssVar = this.a;
            eci eciVar = ecr.b;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(eciVar, iccVar, hmlVar, 54);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
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
            fdau fdauVar = gssVar.g;
            hsk.b(hmlVar, icsVarB, jbb.c);
            fdauVar.a(egp.a, hmlVar, 6);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
