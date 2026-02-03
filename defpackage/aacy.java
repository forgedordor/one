package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aacy implements fdau {
    final /* synthetic */ djzw a;
    final /* synthetic */ ebk b;

    public aacy(djzw djzwVar, ebk ebkVar) {
        this.a = djzwVar;
        this.b = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ego egoVar = (ego) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egoVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egoVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djzw djzwVar = this.a;
            dtgo.a(djzwVar.d, djzwVar.e, null, false, null, this.b, hmlVar, 196608, 28);
            ics icsVarJ = efy.j(egoVar.a(ics.e, 1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            ixm ixmVarA = edl.a(ecr.e, ibw.j, hmlVar, 6);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarJ);
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
            aacz.f(djzwVar.a, hmlVar, 0);
            String str = djzwVar.b;
            hmlVar.v(-1841390576);
            if (str != null) {
                aacz.e(str, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
