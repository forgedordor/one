package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evu implements fdau {
    public static final evu a = new evu();

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-2126899193);
        final long j = ((fnp) hmlVar.e(fnr.a)).a;
        ico icoVar = ics.e;
        boolean zC = hmlVar.C(j);
        Object objF = hmlVar.f();
        if (zC || objF == hmk.a) {
            objF = new fdap() { // from class: evs
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    iew iewVar = (iew) obj4;
                    final float fIntBitsToFloat = Float.intBitsToFloat((int) (iewVar.a() >> 32)) / 2.0f;
                    final ijp ijpVarA = fhv.a(iewVar, fIntBitsToFloat);
                    final iit iitVar = new iit(j, 5);
                    return iewVar.p(new fdap() { // from class: evt
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            imw imwVar = (imw) obj5;
                            imwVar.p();
                            imt imtVarT = imwVar.t();
                            long jA = imtVarT.a();
                            imtVarT.b().l();
                            ijp ijpVar = ijpVarA;
                            ijf ijfVar = iitVar;
                            float f = fIntBitsToFloat;
                            try {
                                imv imvVar = imtVarT.c;
                                imvVar.e(f, 0.0f);
                                imvVar.c(45.0f, 0L);
                                imwVar.E(ijpVar, inc.a, ijfVar);
                                imtVarT.b().j();
                                imtVarT.h(jA);
                                return fctx.a;
                            } catch (Throwable th) {
                                imtVarT.b().j();
                                imtVarT.h(jA);
                                throw th;
                            }
                        }
                    });
                }
            };
            hmlVar.y(objF);
        }
        ics icsVarA = icsVar.a(ifb.b(icoVar, (fdap) objF));
        hmlVar.o();
        return icsVarA;
    }
}
