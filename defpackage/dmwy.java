package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmwy implements fdau {
    final /* synthetic */ hsf a;
    final /* synthetic */ dmvm b;
    final /* synthetic */ gak c;
    final /* synthetic */ fdae d;
    final /* synthetic */ edk e;
    final /* synthetic */ hrg f;
    final /* synthetic */ dmxn g;

    public dmwy(hsf hsfVar, dmxn dmxnVar, edk edkVar, dmvm dmvmVar, gak gakVar, fdae fdaeVar, hrg hrgVar) {
        this.a = hsfVar;
        this.g = dmxnVar;
        this.e = edkVar;
        this.b = dmvmVar;
        this.c = gakVar;
        this.d = fdaeVar;
        this.f = hrgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final kio kioVar = (kio) hmlVar.e(jmh.e);
            final hsf hsfVar = this.a;
            ics icsVarB = ehr.b(egq.u(ics.e, 0.0f, dmxg.b(hsfVar), 1));
            hmlVar.v(-1224400529);
            boolean zD = hmlVar.D(kioVar) | hmlVar.D(hsfVar);
            final dmxn dmxnVar = this.g;
            boolean zF = zD | hmlVar.F(dmxnVar);
            final edk edkVar = this.e;
            boolean zD2 = zF | hmlVar.D(edkVar);
            final hrg hrgVar = this.f;
            Object objF = hmlVar.f();
            if (zD2 || objF == hmk.a) {
                fdap fdapVar = new fdap() { // from class: dmwv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        ivy ivyVar = (ivy) obj4;
                        ivyVar.getClass();
                        dmxn dmxnVar2 = dmxnVar;
                        float fB = dmxg.b(hsfVar);
                        float f = dmxnVar2.a;
                        float fC = edkVar.c() - kioVar.eh(Float.intBitsToFloat((int) (ivz.a(ivyVar) & 4294967295L)));
                        egc egcVar = dmuj.a;
                        hrgVar.h(fddu.e(((fC - f) + 36.0f) / (fB - f), 0.0f, 1.0f));
                        return fctx.a;
                    }
                };
                hmlVar.y(fdapVar);
                objF = fdapVar;
            }
            hmlVar.o();
            ics icsVarA = ixy.a(icsVarB, (fdap) objF);
            final dmvm dmvmVar = this.b;
            if (dmvmVar instanceof dmvk) {
                hmlVar.v(1021204312);
                gak gakVar = this.c;
                gsq gsqVarD = gakVar.a.d();
                hmlVar.v(-1633490746);
                boolean zF2 = hmlVar.F(dmvmVar) | hmlVar.D(gakVar);
                Object objF2 = hmlVar.f();
                if (zF2 || objF2 == hmk.a) {
                    objF2 = new dmwx(dmvmVar, gakVar, null);
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                hob.g(gsqVarD, (fdat) objF2, hmlVar);
                int i = adc.a;
                final ach achVarA = adc.a(hmlVar);
                dmvk dmvkVar = (dmvk) dmvmVar;
                hmlVar.v(-1746271574);
                boolean zF3 = hmlVar.F(dmvmVar) | hmlVar.F(achVarA);
                final fdae fdaeVar = this.d;
                boolean zD3 = zF3 | hmlVar.D(fdaeVar);
                Object objF3 = hmlVar.f();
                if (zD3 || objF3 == hmk.a) {
                    objF3 = new fdae() { // from class: dmww
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            ach achVar;
                            if (((Boolean) ((dmvk) dmvmVar).b.a()).booleanValue() || (achVar = achVarA) == null) {
                                fdaeVar.invoke();
                            } else {
                                achVar.c().d();
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF3);
                }
                hmlVar.o();
                dmyf.m(icsVarA, dmvkVar, (fdae) objF3, hmlVar, 64);
                hmlVar.o();
            } else {
                if (!(dmvmVar instanceof dmvl)) {
                    hmlVar.v(-521248748);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(1022561647);
                dmxm.h(icsVarA, (dmvl) dmvmVar, false, this.d, hmlVar, 448, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
