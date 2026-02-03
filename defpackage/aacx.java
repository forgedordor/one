package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aacx implements fdau {
    final /* synthetic */ djwc a;
    final /* synthetic */ ebk b;

    public aacx(djwc djwcVar, ebk ebkVar) {
        this.a = djwcVar;
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
            ico icoVar = ics.e;
            ics icsVarI = efy.i(egoVar.a(icoVar, 1.0f, true), 0.0f, 0.0f, 2);
            djwc djwcVar = this.a;
            ebk ebkVar = this.b;
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVar, 48);
            int iA = aacw.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA2 = egk.a(ecr.a, ibw.n, hmlVar, 48);
            int iA2 = aacw.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarD);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            aacz.g(djwcVar, ebkVar, hmlVar, 48);
            aacz.d(djwcVar, hmlVar, 0);
            hmlVar.n();
            String str = djwcVar.b;
            hmlVar.v(-627959216);
            if (str != null) {
                egt.a(egq.e(icoVar, 2.0f), hmlVar);
                aacz.c(str, djwcVar.c, efy.j(icoVar, 12.0f, 0.0f, 0.0f, 0.0f, 14), hmlVar, 384);
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
