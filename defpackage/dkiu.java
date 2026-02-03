package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkiu implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;
    final /* synthetic */ dkkr c;
    final /* synthetic */ ddp d;
    final /* synthetic */ dkgn e;
    final /* synthetic */ float f;
    final /* synthetic */ dklt g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;
    final /* synthetic */ fdau j;

    public dkiu(hox hoxVar, kph kphVar, dkkr dkkrVar, ddp ddpVar, dkgn dkgnVar, float f, dklt dkltVar, float f2, boolean z, fdau fdauVar) {
        this.a = hoxVar;
        this.b = kphVar;
        this.c = dkkrVar;
        this.d = ddpVar;
        this.e = dkgnVar;
        this.f = f;
        this.g = dkltVar;
        this.h = f2;
        this.i = z;
        this.j = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(fctx.a);
            kph kphVar = this.b;
            kphVar.c();
            hmlVar.v(-663155086);
            kpg kpgVarB = kphVar.b();
            kow kowVarA = kpgVarB.a();
            kow kowVarB = kpgVarB.b();
            kow kowVarC = kpgVarB.c();
            kpgVarB.d();
            hmlVar.v(671344415);
            hmlVar.o();
            ico icoVar = ics.e;
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = dkim.a;
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarD = egq.d(kph.d(icoVar, kowVarA, (fdap) objF), 1.0f);
            ixm ixmVarA = ecz.a(ibw.a, false);
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
            dkkr dkkrVar = this.c;
            boolean z = this.i;
            dkgn dkgnVar = this.e;
            ddp ddpVar = this.d;
            float f = this.f;
            dkke.f(dkkrVar, z, dkgnVar, ddpVar, efs.b(icoVar, f, 0.0f), this.j, hmlVar, 4096, 0);
            hmlVar.n();
            hmlVar.v(671399609);
            if (dkgnVar.b()) {
                hmlVar.v(-1633490746);
                boolean zD = hmlVar.D(kowVarA) | hmlVar.D(dkkrVar);
                Object objF2 = hmlVar.f();
                if (zD || objF2 == obj3) {
                    objF2 = new dkin(kowVarA, dkkrVar);
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                ics icsVarD2 = kph.d(icoVar, kowVarC, (fdap) objF2);
                if (dkks.f(dkkrVar)) {
                    icsVarD2 = icsVarD2.a(efy.i(icoVar, 19.0f, 0.0f, 2));
                }
                dkke.g(efs.b(icsVarD2, f, 0.0f), dkkrVar, dkkrVar.f, this.g, hmlVar, 0);
            }
            hmlVar.o();
            ics icsVarX = egq.x(icoVar, 0.0f, 70.0f, 1);
            hmlVar.v(5004770);
            boolean zD2 = hmlVar.D(kowVarA);
            Object objF3 = hmlVar.f();
            if (zD2 || objF3 == obj3) {
                objF3 = new dkio(kowVarA);
                hmlVar.y(objF3);
            }
            hmlVar.o();
            eeq.b(efs.b(kph.d(icsVarX, kowVarB, (fdap) objF3), this.h, 0.0f), ecr.g(2.0f), null, null, 2, 0, hxe.d(1851344230, new dkip(ddpVar, dkkrVar), hmlVar), hmlVar, 1597488, 44);
            hmlVar.o();
            hmlVar.v(1659148056);
            hmlVar.o();
        }
        return fctx.a;
    }
}
