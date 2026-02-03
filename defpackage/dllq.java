package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dllq implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdau b;

    public dllq(boolean z, fdau fdauVar) {
        this.a = z;
        this.b = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarJ = efy.j(ics.e, 16.0f, 0.0f, true != this.a ? 16.0f : 4.0f, 0.0f, 10);
            fdau fdauVar = this.b;
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
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
            fdauVar.a(egp.a, hmlVar, 6);
            hmlVar.n();
        }
        return fctx.a;
    }
}
