package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppv implements fdav {
    final /* synthetic */ ics a;
    final /* synthetic */ etv b;
    final /* synthetic */ fdap c;
    final /* synthetic */ dplv d;
    final /* synthetic */ fdaw e;
    final /* synthetic */ boolean f;
    final /* synthetic */ fdap g;
    final /* synthetic */ fdap h;

    public dppv(ics icsVar, etv etvVar, fdap fdapVar, dplv dplvVar, fdaw fdawVar, boolean z, fdap fdapVar2, fdap fdapVar3) {
        this.a = icsVar;
        this.b = etvVar;
        this.c = fdapVar;
        this.d = dplvVar;
        this.e = fdawVar;
        this.f = z;
        this.g = fdapVar2;
        this.h = fdapVar3;
    }

    public static final void b(hox hoxVar, long j) {
        hoxVar.b(new kjg(j));
    }

    @Override // defpackage.fdav
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hwv hwvVarD;
        final int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((ete) obj).getClass();
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj5 = hmk.a;
        if (objF == obj5) {
            hpl hplVar = new hpl(new kjg(0L), hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        final hox hoxVar = (hox) objF;
        hmlVar.o();
        hmlVar.v(-1523096408);
        ics icsVar = this.a;
        final dplv dplvVar = this.d;
        final etv etvVar = this.b;
        ics icsVarC = egq.c(icsVar, 1.0f);
        ico icoVar = ics.e;
        hmlVar.v(-1224400529);
        boolean zF = ((((iIntValue2 & 112) ^ 48) > 32 && hmlVar.B(iIntValue)) || (iIntValue2 & 48) == 32) | hmlVar.F(dplvVar) | hmlVar.D(etvVar) | hmlVar.E(false);
        Object objF2 = hmlVar.f();
        if (zF || objF2 == obj5) {
            objF2 = new fdap() { // from class: dppo
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    ((kio) obj6).getClass();
                    long j = ((kjg) hoxVar.a()).a;
                    int iB = kil.b(dplvVar.a());
                    final etv etvVar2 = etvVar;
                    int i = etvVar2.x().c;
                    final int iF = fddu.f(((iB - ((int) (j >> 32))) / 2) - (i + i), 0);
                    final int i2 = iIntValue;
                    fdae fdaeVar = new fdae() { // from class: dppn
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            float fC;
                            float fC2;
                            float f;
                            int i3 = i2;
                            etv etvVar3 = etvVar2;
                            if (i3 == etvVar3.j()) {
                                fC = etvVar3.c();
                            } else {
                                if (i3 == etvVar3.j() + 1) {
                                    fC2 = etvVar3.c();
                                    f = -1.0f;
                                } else if (i3 == etvVar3.j() - 1) {
                                    fC2 = etvVar3.c();
                                    f = 1.0f;
                                } else {
                                    fC = 0.0f;
                                }
                                fC = fC2 + f;
                            }
                            return Integer.valueOf(fdcu.b(fC * iF));
                        }
                    };
                    hxn hxnVar = hrp.a;
                    return new kjb(((Number) new hnt(fdaeVar, null).a()).intValue() << 32);
                }
            };
            hmlVar.y(objF2);
        }
        hmlVar.o();
        ics icsVarA = icsVarC.a(efs.a(icoVar, (fdap) objF2));
        hmlVar.o();
        ics icsVarA2 = idb.a(icsVarA, iIntValue == etvVar.j() ? 1.0f : 0.0f);
        final dppx dppxVar = (dppx) this.c.invoke(Integer.valueOf(iIntValue));
        if (dppxVar instanceof dpsb) {
            hmlVar.v(28981326);
            dpsb dpsbVar = (dpsb) dppxVar;
            hmlVar.v(5004770);
            Object objF3 = hmlVar.f();
            if (objF3 == obj5) {
                objF3 = new fdap() { // from class: dppp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        dppv.b(hoxVar, ((kjg) obj6).a);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            fdap fdapVar = (fdap) objF3;
            hmlVar.o();
            fdaw fdawVar = this.e;
            hmlVar.v(-1523079831);
            hwvVarD = fdawVar != null ? hxe.d(1069076023, new dpps(fdawVar, dppxVar), hmlVar) : null;
            hmlVar.o();
            dprw.c(dplvVar, icsVarA2, dpsbVar, fdapVar, hwvVarD, this.f, hmlVar, 3584);
            hmlVar.o();
        } else {
            if (!(dppxVar instanceof dpto)) {
                hmlVar.v(-1523061698);
                hmlVar.o();
                throw new UnsupportedOperationException("Unknown media type.");
            }
            hmlVar.v(29383241);
            dpto dptoVar = (dpto) dppxVar;
            boolean z = iIntValue == etvVar.j();
            hmlVar.v(5004770);
            Object objF4 = hmlVar.f();
            if (objF4 == obj5) {
                objF4 = new fdap() { // from class: dppq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        dppv.b(hoxVar, ((kjg) obj6).a);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF4);
            }
            fdap fdapVar2 = (fdap) objF4;
            hmlVar.o();
            fdaw fdawVar2 = this.e;
            hmlVar.v(-1523065169);
            hwvVarD = fdawVar2 != null ? hxe.d(-631223860, new dppt(fdawVar2, dppxVar), hmlVar) : null;
            hmlVar.o();
            dpti.k(dplvVar, icsVarA2, dptoVar, z, fdapVar2, hwvVarD, hmlVar, 197120);
            hmlVar.o();
        }
        String strB = dppxVar.b();
        hmlVar.v(-1746271574);
        final fdap fdapVar3 = this.g;
        boolean zD = hmlVar.D(fdapVar3) | hmlVar.F(dppxVar);
        final fdap fdapVar4 = this.h;
        boolean zD2 = zD | hmlVar.D(fdapVar4);
        Object objF5 = hmlVar.f();
        if (zD2 || objF5 == obj5) {
            objF5 = new fdap() { // from class: dppr
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    ((hny) obj6).getClass();
                    fdap fdapVar5 = fdapVar3;
                    dppx dppxVar2 = dppxVar;
                    fdapVar5.invoke(dppxVar2.b());
                    return new dppu(fdapVar4, dppxVar2);
                }
            };
            hmlVar.y(objF5);
        }
        hmlVar.o();
        hob.c(strB, (fdap) objF5, hmlVar);
        return fctx.a;
    }
}
