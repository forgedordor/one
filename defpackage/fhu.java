package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhu implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ boolean b;

    public fhu(fdae fdaeVar, boolean z) {
        this.a = fdaeVar;
        this.b = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-196777734);
        final long j = ((fnp) hmlVar.e(fnr.a)).a;
        boolean zC = hmlVar.C(j);
        final fdae fdaeVar = this.a;
        boolean zD = zC | hmlVar.D(fdaeVar);
        final boolean z = this.b;
        boolean zE = zD | hmlVar.E(z);
        Object objF = hmlVar.f();
        if (zE || objF == hmk.a) {
            objF = new fdap() { // from class: fhs
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    iew iewVar = (iew) obj4;
                    final ijp ijpVarA = fhv.a(iewVar, Float.intBitsToFloat((int) (iewVar.a() >> 32)) / 2.0f);
                    final iit iitVar = new iit(j, 5);
                    final fdae fdaeVar2 = fdaeVar;
                    final boolean z2 = z;
                    return iewVar.p(new fdap() { // from class: fht
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            imw imwVar = (imw) obj5;
                            imwVar.p();
                            if (((Boolean) fdaeVar2.invoke()).booleanValue()) {
                                ijf ijfVar = iitVar;
                                ijp ijpVar = ijpVarA;
                                if (z2) {
                                    long jA = imwVar.a();
                                    imt imtVarT = imwVar.t();
                                    long jA2 = imtVarT.a();
                                    imtVarT.b().l();
                                    try {
                                        imtVarT.c.d(-1.0f, 1.0f, jA);
                                        imwVar.E(ijpVar, inc.a, ijfVar);
                                    } finally {
                                        imtVarT.b().j();
                                        imtVarT.h(jA2);
                                    }
                                } else {
                                    imwVar.E(ijpVar, inc.a, ijfVar);
                                }
                            }
                            return fctx.a;
                        }
                    });
                }
            };
            hmlVar.y(objF);
        }
        ics icsVarB = ifb.b(icsVar, (fdap) objF);
        hmlVar.o();
        return icsVarB;
    }
}
