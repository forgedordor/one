package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxx implements fdat {
    final /* synthetic */ zxa a;
    final /* synthetic */ ede b;
    final /* synthetic */ eais c;

    public zxx(zxa zxaVar, ede edeVar, eais eaisVar) {
        this.a = zxaVar;
        this.b = edeVar;
        this.c = eaisVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            zxa zxaVar = this.a;
            hmlVar.v(-1358431330);
            ede edeVar = this.b;
            ico icoVar = ics.e;
            ics icsVarA = edeVar.a(icoVar, ibw.g);
            final eais eaisVar = this.c;
            if (zxaVar.r.c) {
                hpt hptVar = zya.a;
                icoVar.getClass();
                eaisVar.getClass();
                hmlVar.v(1018649385);
                hmlVar.v(5004770);
                boolean zF = hmlVar.F(eaisVar);
                Object objF = hmlVar.f();
                if (zF || objF == hmk.a) {
                    objF = new fdap() { // from class: zxb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj3) {
                            ivy ivyVar = (ivy) obj3;
                            hpt hptVar2 = zya.a;
                            ivyVar.getClass();
                            ihu ihuVarF = ivz.f(ivyVar);
                            ihu ihuVarF2 = ivz.f(ivz.g(ivyVar));
                            hox hoxVar = eaisVar.a;
                            hoxVar.b(ihu.j((ihu) hoxVar.a(), 0.0f, 0.0f, ihuVarF2.e - ihuVarF.c, 7));
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                ics icsVarA2 = ixy.a(icoVar, (fdap) objF);
                hmlVar.o();
                icsVarA = icsVarA.a(icsVarA2);
            }
            vrs vrsVar = zxaVar.c;
            hmlVar.o();
            vsj.d(vrsVar, icsVarA, zxaVar.m, hmlVar, 0);
        }
        return fctx.a;
    }
}
