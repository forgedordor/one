package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmle implements fdau {
    final /* synthetic */ dmoz a;

    public dmle(dmoz dmozVar) {
        this.a = dmozVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.E(zBooleanValue) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else if (zBooleanValue) {
            hmlVar.v(1262806162);
            ics icsVarD = egq.d(ics.e, 1.0f);
            dmoz dmozVar = this.a;
            ixm ixmVarA = egk.a(ecr.e, ibw.m, hmlVar, 6);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
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
            dmlr.m(dmozVar.d, null, hmlVar, 0);
            hmlVar.n();
            hmlVar.o();
        } else {
            hmlVar.v(1262988256);
            dmoz dmozVar2 = this.a;
            dmoy dmoyVar = dmozVar2.s;
            dmlr.l(dmozVar2.j, hmlVar, 0);
            hmlVar.o();
        }
        return fctx.a;
    }
}
