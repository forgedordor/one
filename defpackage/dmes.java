package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmes implements fdat {
    final /* synthetic */ ddp a;
    final /* synthetic */ long b;
    final /* synthetic */ dmhi c;
    final /* synthetic */ float d;
    final /* synthetic */ hox e;

    public dmes(ddp ddpVar, long j, dmhi dmhiVar, float f, hox hoxVar) {
        this.a = ddpVar;
        this.b = j;
        this.c = dmhiVar;
        this.d = f;
        this.e = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            hmlVar.v(5004770);
            final ddp ddpVar = this.a;
            boolean zF = hmlVar.F(ddpVar);
            Object objF = hmlVar.f();
            if (zF || objF == hmk.a) {
                objF = new fdap() { // from class: dmeq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ikl iklVar = (ikl) obj3;
                        iklVar.getClass();
                        iklVar.a(((Number) ddpVar.d()).floatValue());
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarA = dkl.a(ijn.a(icoVar, (fdap) objF), this.b, ikj.a);
            dmhi dmhiVar = this.c;
            float f = this.d;
            final hox hoxVar = this.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(hoxVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: dmer
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        hoxVar.b(true);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            dmgk.j(dmhiVar, f, (fdae) objF2, hmlVar, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
