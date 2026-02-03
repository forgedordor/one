package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cynf implements fdat {
    final /* synthetic */ cynm a;

    public cynf(cynm cynmVar) {
        this.a = cynmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            cynm cynmVar = this.a;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar, 48);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            cynk cynkVar = (cynk) cynmVar;
            cyni.b("Queued", cynkVar.c, hmlVar, 6);
            cyni.c(hmlVar, 0);
            cyni.b("Running", cynkVar.d, hmlVar, 6);
            cyni.c(hmlVar, 0);
            cyni.b("Done", cynkVar.e, hmlVar, 6);
            hmlVar.n();
        }
        return fctx.a;
    }
}
