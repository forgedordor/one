package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcb implements fdau {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ long c;

    public gcb(fdat fdatVar, fdat fdatVar2, long j) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = j;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        int i = gcj.a;
        Object objD = this.a;
        if (objD != null) {
            hmlVar.v(-1473204016);
            hmlVar.o();
        } else {
            fdat fdatVar = this.b;
            if (fdatVar != null) {
                long j = this.c;
                hmlVar.v(1575389790);
                objD = hxe.d(-237350650, new gch(j, fdatVar), hmlVar);
                hmlVar.o();
            } else {
                hmlVar.v(1575616275);
                hmlVar.o();
                objD = null;
            }
        }
        hsf hsfVarB = gcj.b(objD, hmlVar);
        iby ibyVar = ibw.e;
        ico icoVar = ics.e;
        ixm ixmVarA = ecz.a(ibyVar, false);
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
        fdat fdatVar2 = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
            Integer numValueOf = Integer.valueOf(iA);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar2);
        }
        hsk.b(hmlVar, icsVarB, jbb.c);
        fdat fdatVar3 = (fdat) hsfVarB.a();
        if (fdatVar3 == null) {
            hmlVar.v(-1538103400);
        } else {
            hmlVar.v(-326710903);
            fdatVar3.a(hmlVar, 0);
        }
        hmlVar.o();
        hmlVar.n();
        return fctx.a;
    }
}
