package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dptc implements fdau {
    final /* synthetic */ fdae a;
    final /* synthetic */ dplv b;
    final /* synthetic */ dpto c;
    final /* synthetic */ dptt d;
    final /* synthetic */ fdap e;
    final /* synthetic */ boolean f;
    final /* synthetic */ hox g;
    final /* synthetic */ hsf h;
    final /* synthetic */ hox i;
    final /* synthetic */ hox j;
    final /* synthetic */ hsf k;

    public dptc(fdae fdaeVar, dplv dplvVar, dpto dptoVar, dptt dpttVar, fdap fdapVar, boolean z, hox hoxVar, hsf hsfVar, hox hoxVar2, hox hoxVar3, hsf hsfVar2) {
        this.a = fdaeVar;
        this.b = dplvVar;
        this.c = dptoVar;
        this.d = dpttVar;
        this.e = fdapVar;
        this.f = z;
        this.g = hoxVar;
        this.h = hsfVar;
        this.i = hoxVar2;
        this.j = hoxVar3;
        this.k = hsfVar2;
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        String strB;
        hox hoxVar;
        dpto dptoVar;
        dpto dptoVar2;
        boolean z;
        ico icoVar;
        boolean z2;
        dpto dptoVar3;
        boolean z3;
        hml hmlVar;
        long jA;
        float fA;
        edk edkVar = (edk) obj;
        hml hmlVar2 = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar2.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            hmlVar2.v(1849434622);
            Object objF = hmlVar2.f();
            Object obj4 = hmk.a;
            if (objF == obj4) {
                objF = new ebk();
                hmlVar2.y(objF);
            }
            ebk ebkVar = (ebk) objF;
            hmlVar2.o();
            hox hoxVar2 = this.g;
            if (dpti.f(hoxVar2)) {
                hmlVar2.v(820170023);
                strB = jqu.b(R.string.video_hide_controls_clickable_content_description, hmlVar2);
                hmlVar2.o();
            } else {
                hmlVar2.v(820267239);
                strB = jqu.b(R.string.video_show_controls_clickable_content_description, hmlVar2);
                hmlVar2.o();
            }
            String str = strB;
            fdae fdaeVar = this.a;
            ico icoVar2 = ics.e;
            ics icsVarC = dli.c(icoVar2, ebkVar, null, false, str, null, fdaeVar, 20);
            dplv dplvVar = this.b;
            ics icsVarA = edkVar.a(icoVar2, ibw.e);
            dpto dptoVar4 = this.c;
            boolean z4 = dptoVar4.d;
            ics icsVarA2 = dpqr.a(iex.a(dplvVar.f(icsVarA, z4), evn.b(20.0f)), edkVar, dptoVar4, hmlVar2);
            final hsf hsfVar = this.h;
            if (dpti.g(hsfVar) || z4) {
                icsVarA2 = icsVarA2.a(icsVarC);
            }
            if (((Boolean) this.i.a()).booleanValue()) {
                hmlVar2.v(821094350);
                dpti.i(joj.a(icsVarA2, "LocalVideoRenderer.Player"), this.d, dpti.g(hsfVar), z4, dpti.b(this.j), hmlVar2, 0);
                hmlVar2.o();
                dptoVar = dptoVar4;
                hoxVar = hoxVar2;
            } else {
                hmlVar2.v(821279637);
                hoxVar = hoxVar2;
                dprw.a(dplvVar, iye.a(icsVarA2, this.e), dptoVar4, null, "LocalVideoRenderer.Preview", hmlVar2, 24576, 4);
                dptoVar = dptoVar4;
                hmlVar2.o();
            }
            boolean z5 = (dptoVar.f && !dpti.g(hsfVar) && dpti.b(this.j) == null) ? false : true;
            hmlVar2.v(1689077908);
            final dptt dpttVar = this.d;
            dpsf dpsfVar = (dpsf) dpttVar;
            if (dpsfVar.d != 0) {
                hmlVar2.v(5004770);
                boolean zD = hmlVar2.D(dpttVar);
                Object objF2 = hmlVar2.f();
                if (zD || objF2 == obj4) {
                    objF2 = new fdae() { // from class: dpsx
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dptt dpttVar2 = dpttVar;
                            if (dpti.g(hsfVar)) {
                                dpttVar2.b();
                            } else {
                                dpttVar2.c();
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar2.y(objF2);
                }
                fdae fdaeVar2 = (fdae) objF2;
                hmlVar2.o();
                hmlVar2.v(1689089013);
                hmlVar2.v(1689089013);
                boolean z6 = dpti.g(hsfVar) && dpti.f(hoxVar) && !diho.b(hmlVar2);
                hmlVar2.o();
                if (z6) {
                    hmlVar2.v(5004770);
                    Object objF3 = hmlVar2.f();
                    if (objF3 == obj4) {
                        objF3 = new dpta(hoxVar, null);
                        hmlVar2.y(objF3);
                    }
                    hmlVar2.o();
                    hob.g(edkVar, (fdat) objF3, hmlVar2);
                }
                hmlVar2.o();
                ics icsVarA3 = dihi.a(joj.a(edkVar.b(icoVar2), "LocalVideoRenderer.Controls"), dptoVar.c, true);
                final hox hoxVar3 = this.j;
                dpts dptsVarB = dpti.b(hoxVar3);
                if (dptsVarB != null) {
                    hmlVar = hmlVar2;
                    jA = (long) (dptsVarB.a * dpsfVar.d);
                } else {
                    hmlVar = hmlVar2;
                    jA = dpti.a(this.k);
                }
                hml hmlVar3 = hmlVar;
                String strJ = dpti.j(jA, hmlVar3);
                String strJ2 = dpti.j(dpsfVar.d, hmlVar3);
                hmlVar3.v(5004770);
                boolean zD2 = hmlVar3.D(dpttVar);
                dpto dptoVar5 = dptoVar;
                Object objF4 = hmlVar3.f();
                if (zD2 || objF4 == obj4) {
                    z2 = z5;
                    hpl hplVar = new hpl(false, hsi.a);
                    hmlVar3.y(hplVar);
                    objF4 = hplVar;
                } else {
                    z2 = z5;
                }
                final hox hoxVar4 = (hox) objF4;
                hmlVar3.o();
                dpts dptsVarB2 = dpti.b(hoxVar3);
                long jA2 = dpti.a(this.k);
                hmlVar3.v(-1633490746);
                boolean zD3 = hmlVar3.D(dptsVarB2) | hmlVar3.C(jA2);
                Object objF5 = hmlVar3.f();
                if (zD3 || objF5 == obj4) {
                    if (dpti.b(hoxVar3) != null) {
                        dpts dptsVarB3 = dpti.b(hoxVar3);
                        if (dptsVarB3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        fA = dptsVarB3.a;
                    } else {
                        fA = dpti.a(r7) / dpsfVar.d;
                        dpts.a(fA);
                    }
                    objF5 = new dpts(fA);
                    hmlVar3.y(objF5);
                }
                float f = ((dpts) objF5).a;
                hmlVar3.o();
                hmlVar3.v(5004770);
                boolean zD4 = hmlVar3.D(dpttVar);
                Object objF6 = hmlVar3.f();
                if (zD4 || objF6 == obj4) {
                    objF6 = new fdap() { // from class: dpsy
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            float fFloatValue = ((Float) obj5).floatValue();
                            if (dpti.g(hsfVar)) {
                                hox hoxVar5 = hoxVar4;
                                dpttVar.b();
                                dptc.b(hoxVar5, true);
                            }
                            hox hoxVar6 = hoxVar3;
                            dpts.a(fFloatValue);
                            dpti.c(hoxVar6, new dpts(fFloatValue));
                            return fctx.a;
                        }
                    };
                    hmlVar3.y(objF6);
                }
                fdap fdapVar = (fdap) objF6;
                hmlVar3.o();
                hmlVar3.v(5004770);
                boolean zD5 = hmlVar3.D(dpttVar);
                Object objF7 = hmlVar3.f();
                if (zD5 || objF7 == obj4) {
                    objF7 = new fdae() { // from class: dpsz
                        @Override // defpackage.fdae
                        public final Object invoke() throws CloneNotSupportedException {
                            dptt dpttVar2 = dpttVar;
                            hox hoxVar5 = hoxVar3;
                            dpts dptsVarB4 = dpti.b(hoxVar5);
                            if (dptsVarB4 != null) {
                                ekrg ekrgVar = dpsf.a;
                                ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "seek-2oFupE4", 127, "HugoVideoPlayer.kt");
                                float f2 = dptsVarB4.a;
                                ekrdVar.t("Seeking to position: %s", Float.valueOf(f2));
                                dpsf dpsfVar2 = (dpsf) dpttVar2;
                                long j = (long) (dpsfVar2.d * f2);
                                dpsfVar2.e.f(Long.valueOf(j));
                                dpsfVar2.a();
                                if (!dpsfVar2.f) {
                                    ((ekrd) ekrgVar.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "seek-2oFupE4", 132, "HugoVideoPlayer.kt")).q("HugoVideoPlayer not prepared. Preparing and then seeking to position.");
                                    dpsfVar2.d(false);
                                }
                                mcg mcgVar = dpsfVar2.h;
                                if (mcgVar != null) {
                                    ((mae) mcgVar).s(j);
                                }
                            }
                            hox hoxVar6 = hoxVar4;
                            dpti.c(hoxVar5, null);
                            if (((Boolean) hoxVar6.a()).booleanValue()) {
                                dpttVar2.c();
                                dptc.b(hoxVar6, false);
                            }
                            return fctx.a;
                        }
                    };
                    hmlVar3.y(objF7);
                }
                hmlVar3.o();
                icoVar = icoVar2;
                dptoVar2 = dptoVar5;
                z = true;
                dpug.e(icsVarA3, dpti.f(hoxVar), z2, this.f, dpti.g(hsfVar), strJ, strJ2, f, fdaeVar2, fdapVar, (fdae) objF7, hmlVar3, 0, 0);
                hmlVar2 = hmlVar3;
            } else {
                dptoVar2 = dptoVar;
                z = true;
                icoVar = icoVar2;
                z2 = z5;
            }
            hmlVar2.o();
            ics icsVarA4 = edkVar.a(icoVar, ibw.g);
            if (z2) {
                dptoVar3 = dptoVar2;
            } else {
                dptoVar3 = dptoVar2;
                if (dptoVar3.e != null) {
                    z3 = z;
                }
                dia diaVar = dptr.a;
                dia diaVar2 = dptr.a;
                cye.b(z3, icsVarA4, dae.l(diaVar2, 2), dae.m(diaVar2, 2), null, hxe.d(-1449455961, new dptb(dptoVar3), hmlVar2), hmlVar2, 196608, 16);
            }
            z3 = false;
            dia diaVar3 = dptr.a;
            dia diaVar22 = dptr.a;
            cye.b(z3, icsVarA4, dae.l(diaVar22, 2), dae.m(diaVar22, 2), null, hxe.d(-1449455961, new dptb(dptoVar3), hmlVar2), hmlVar2, 196608, 16);
        }
        return fctx.a;
    }
}
