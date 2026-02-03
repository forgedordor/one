package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxw implements fdat {
    final /* synthetic */ djyn a;
    final /* synthetic */ long b;

    public djxw(djyn djynVar, long j) {
        this.a = djynVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar;
        hml hmlVar2 = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            djyn djynVar = this.a;
            long j = this.b;
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ixm ixmVarA = egk.a(ecr.a, iccVar, hmlVar2, 48);
            int iA = djxv.a(hmg.b(hmlVar2));
            hxi hxiVarN = hmlVar2.N();
            ics icsVarB = icj.b(hmlVar2, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar2, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar2, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar2.y(numValueOf);
                hmlVar2.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar2, icsVarB, fdatVar4);
            ics icsVarA = egp.a.a(icoVar, 1.0f, true);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar2, 0);
            int iA2 = djxv.a(hmg.b(hmlVar2));
            hxi hxiVarN2 = hmlVar2.N();
            ics icsVarB2 = icj.b(hmlVar2, icsVarA);
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar);
            } else {
                hmlVar2.z();
            }
            hsk.b(hmlVar2, ixmVarA2, fdatVar);
            hsk.b(hmlVar2, hxiVarN2, fdatVar2);
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar2.y(numValueOf2);
                hmlVar2.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar2, icsVarB2, fdatVar4);
            dthx.b(djynVar.a, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).k, hmlVar2, 0, 0, 65530);
            dthx.b(djynVar.b, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).l, hmlVar2, 0, 0, 65530);
            hmlVar2.n();
            String str = djynVar.c;
            hmlVar2.v(-1884571451);
            if (str != null) {
                hmlVar = hmlVar2;
                dthx.b(str, efy.j(icoVar, 24.0f, 0.0f, 0.0f, 0.0f, 14), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar2).o, hmlVar, 48, 0, 65528);
            } else {
                hmlVar = hmlVar2;
            }
            hmlVar.o();
            hmlVar.n();
        }
        return fctx.a;
    }
}
