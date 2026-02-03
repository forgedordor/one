package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpub implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ fdae b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdap f;
    final /* synthetic */ fdae g;
    final /* synthetic */ String h;
    final /* synthetic */ String i;
    final /* synthetic */ edk j;

    public dpub(edk edkVar, boolean z, fdae fdaeVar, float f, boolean z2, boolean z3, fdap fdapVar, fdae fdaeVar2, String str, String str2) {
        this.j = edkVar;
        this.a = z;
        this.b = fdaeVar;
        this.c = f;
        this.d = z2;
        this.e = z3;
        this.f = fdapVar;
        this.g = fdaeVar2;
        this.h = str;
        this.i = str2;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        ((cyg) obj).getClass();
        ico icoVar = ics.e;
        edk edkVar = this.j;
        ics icsVarM = egq.m(icoVar, edkVar.d(), edkVar.c());
        ixm ixmVarA = ecz.a(ibw.a, false);
        long jB = hmg.b(hmlVar);
        long j = jB ^ (jB >>> 32);
        hxi hxiVarN = hmlVar.N();
        ics icsVarB = icj.b(hmlVar, icsVarM);
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
        String str = this.i;
        String str2 = this.h;
        fdae fdaeVar2 = this.g;
        fdap fdapVar = this.f;
        boolean z = this.e;
        boolean z2 = this.d;
        float f = this.c;
        fdae fdaeVar3 = this.b;
        boolean z3 = this.a;
        hsk.b(hmlVar, icsVarB, jbb.c);
        edf edfVar = edf.a;
        dpug.c(edfVar, z3, fdaeVar3, hmlVar, 6);
        dpug.d(efy.d(edfVar.a(icoVar, ibw.h), 16.0f), f, z2, z, fdapVar, fdaeVar2, hmlVar, 0);
        dpug.a(edfVar, str2, str, z2, hmlVar, 6);
        hmlVar.n();
        return fctx.a;
    }
}
