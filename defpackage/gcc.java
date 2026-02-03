package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcc implements fdau {
    final /* synthetic */ fdat a;
    final /* synthetic */ long b;

    public gcc(fdat fdatVar, long j) {
        this.a = fdatVar;
        this.b = j;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hwv hwvVarD;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        int i = gcj.a;
        fdat fdatVar = this.a;
        if (fdatVar != null) {
            long j = this.b;
            hmlVar.v(-1219056599);
            hwvVarD = hxe.d(-566924201, new gci(j, fdatVar), hmlVar);
            hmlVar.o();
        } else {
            hmlVar.v(-1218865515);
            hmlVar.o();
            hwvVarD = null;
        }
        hsf hsfVarB = gcj.b(hwvVarD, hmlVar);
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
            hmlVar.v(-2101783313);
        } else {
            hmlVar.v(-344894126);
            fdatVar3.a(hmlVar, 0);
        }
        hmlVar.o();
        hmlVar.n();
        return fctx.a;
    }
}
