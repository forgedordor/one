package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djua implements fdat {
    final /* synthetic */ djue a;

    public djua(djue djueVar) {
        this.a = djueVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = efm.a(efy.e(icoVar, 16.0f, 18.0f), 1);
            djue djueVar = this.a;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
            int iA = djtz.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
            ics icsVarB2 = egq.b(icoVar, 1.0f);
            ixm ixmVarA2 = ecz.a(ibw.a, false);
            int iA2 = djtz.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB3 = icj.b(hmlVar, icsVarB2);
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
            hsk.b(hmlVar, icsVarB3, fdatVar4);
            djuc.a(djueVar.a, djueVar.d, hmlVar, 0);
            hmlVar.n();
            ics icsVarJ = efy.j(icoVar, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            ixm ixmVarA3 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA3 = djtz.a(hmg.b(hmlVar));
            hxi hxiVarN3 = hmlVar.N();
            ics icsVarB4 = icj.b(hmlVar, icsVarJ);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA3, fdatVar);
            hsk.b(hmlVar, hxiVarN3, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmlVar.y(numValueOf3);
                hmlVar.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB4, fdatVar4);
            djuc.c(djueVar.b, hmlVar, 0);
            String str = djueVar.c;
            hmlVar.v(-1419621798);
            if (str != null) {
                djuc.b(str, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
