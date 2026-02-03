package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goa implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdae b;
    final /* synthetic */ gsp c;
    final /* synthetic */ ddp d;
    final /* synthetic */ fdjx e;
    final /* synthetic */ fdap f;
    final /* synthetic */ ics g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;
    final /* synthetic */ ikp j;
    final /* synthetic */ long k;
    final /* synthetic */ long l;
    final /* synthetic */ float m;
    final /* synthetic */ fdat n;
    final /* synthetic */ fdat o;
    final /* synthetic */ fdau p;

    public goa(long j, fdae fdaeVar, gsp gspVar, ddp ddpVar, fdjx fdjxVar, fdap fdapVar, ics icsVar, float f, boolean z, ikp ikpVar, long j2, long j3, float f2, fdat fdatVar, fdat fdatVar2, fdau fdauVar) {
        this.a = j;
        this.b = fdaeVar;
        this.c = gspVar;
        this.d = ddpVar;
        this.e = fdjxVar;
        this.f = fdapVar;
        this.g = icsVar;
        this.h = f;
        this.i = z;
        this.j = ikpVar;
        this.k = j2;
        this.l = j3;
        this.m = f2;
        this.n = fdatVar;
        this.o = fdatVar2;
        this.p = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            ics icsVarA = ehr.a(egq.c(ics.e, 1.0f));
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdap() { // from class: gnz
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        jtk.L((jto) obj3);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            ics icsVarC = jsh.c(icsVarA, false, (fdap) objF);
            long j = this.a;
            fdae fdaeVar = this.b;
            gsp gspVar = this.c;
            ddp ddpVar = this.d;
            fdjx fdjxVar = this.e;
            fdap fdapVar = this.f;
            ics icsVar = this.g;
            float f = this.h;
            boolean z = this.i;
            ikp ikpVar = this.j;
            long j2 = this.k;
            long j3 = this.l;
            float f2 = this.m;
            fdat fdatVar = this.n;
            fdat fdatVar2 = this.o;
            fdau fdauVar = this.p;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = hmg.a(hmlVar);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar2 = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar2);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            edf edfVar = edf.a;
            gos.a(j, fdaeVar, gspVar.d() != gsq.a, hmlVar, 0);
            gos.e(edfVar, ddpVar, fdjxVar, fdaeVar, fdapVar, icsVar, gspVar, f, z, ikpVar, j2, j3, f2, fdatVar, fdatVar2, fdauVar, hmlVar, 70, 0);
            hmlVar.n();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
