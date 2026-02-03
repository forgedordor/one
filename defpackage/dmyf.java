package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceView;
import android.widget.photopicker.EmbeddedPhotoPickerSession;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyf {
    public static final /* synthetic */ int a = 0;
    private static final fctc b = fctd.a(new fdae() { // from class: dmxt
        @Override // defpackage.fdae
        public final Object invoke() {
            return ekrg.c("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt");
        }
    });

    public static final long a(hox hoxVar) {
        return ((kjg) hoxVar.a()).a;
    }

    public static final IBinder b(hox hoxVar) {
        return (IBinder) hoxVar.a();
    }

    public static final EmbeddedPhotoPickerSession c(hox hoxVar) {
        return aao$$ExternalSyntheticApiModelOutline4.m13m(hoxVar.a());
    }

    public static final lvb d(hsf hsfVar) {
        return (lvb) hsfVar.a();
    }

    public static final ekrg e() {
        return (ekrg) b.a();
    }

    public static final List f(hsf hsfVar) {
        return (List) hsfVar.a();
    }

    public static final void g(hox hoxVar, EmbeddedPhotoPickerSession embeddedPhotoPickerSession) {
        hoxVar.b(embeddedPhotoPickerSession);
    }

    public static final void h(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void i(hox hoxVar, long j) {
        hoxVar.b(new kjg(j));
    }

    public static final void j(hox hoxVar, IBinder iBinder) {
        hoxVar.b(iBinder);
    }

    public static final void k(EmbeddedPhotoPickerSession embeddedPhotoPickerSession) {
        try {
            embeddedPhotoPickerSession.close();
        } catch (Throwable th) {
            ((ekrd) ((ekrd) e().i()).g(th).h("com/google/android/libraries/compose/cameragallery/ui/gallery/embedded/EmbeddedGalleryKt", "attemptClosing", 306, "EmbeddedGallery.kt")).q("Unable to close embedded picker session");
        }
    }

    public static final boolean l(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    public static final void m(final ics icsVar, dmvk dmvkVar, fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        boolean z;
        Object dmxyVar;
        Object obj;
        int i3;
        Boolean bool;
        hox hoxVar;
        int i4;
        hmw hmwVar;
        int i5;
        IBinder iBinder;
        final hox hoxVar2;
        Boolean bool2;
        final fdae fdaeVar2;
        final hox hoxVar3;
        final hox hoxVar4;
        hml hmlVar2;
        final dmvk dmvkVar2 = dmvkVar;
        int i6 = i & 6;
        hml hmlVarC = hmlVar.c(-1932813064);
        if (i6 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? hmlVarC.D(dmvkVar2) : hmlVarC.F(dmvkVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 128 : 256;
        }
        int i7 = i2;
        if ((i7 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
            hmlVar2 = hmlVarC;
        } else {
            Activity activityB = dpgx.b((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b));
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj2 = hmk.a;
            if (objS == obj2) {
                z = true;
                hpl hplVar = new hpl(new kjg(0L), hsi.a);
                hmwVar2.af(hplVar);
                objS = hplVar;
            } else {
                z = true;
            }
            hox hoxVar5 = (hox) objS;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar2.S();
            if (objS2 == obj2) {
                hpl hplVar2 = new hpl(null, hsi.a);
                hmwVar2.af(hplVar2);
                objS2 = hplVar2;
            }
            hox hoxVar6 = (hox) objS2;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS3 = hmwVar2.S();
            if (objS3 == obj2) {
                hpl hplVar3 = new hpl(null, hsi.a);
                hmwVar2.af(hplVar3);
                objS3 = hplVar3;
            }
            hox hoxVar7 = (hox) objS3;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar2.S();
            boolean z2 = false;
            if (objS4 == obj2) {
                hpl hplVar4 = new hpl(false, hsi.a);
                hmwVar2.af(hplVar4);
                objS4 = hplVar4;
            }
            hox hoxVar8 = (hox) objS4;
            hmwVar2.ab();
            hmlVarC.v(-2007454920);
            if (Build.VERSION.SDK_INT == 35) {
                hsf hsfVarA = hro.a(((lvj) hmlVarC.e(lyj.a)).P().b(), hmlVarC);
                lvb lvbVarD = d(hsfVarA);
                hmlVarC.v(-1633490746);
                boolean zD = hmlVarC.D(hsfVarA);
                Object objS5 = hmwVar2.S();
                if (zD || objS5 == obj2) {
                    objS5 = new dmxu(hsfVarA, hoxVar7, null);
                    hmwVar2.af(objS5);
                }
                hmwVar2.ab();
                hob.g(lvbVarD, (fdat) objS5, hmlVarC);
            }
            hmwVar2.ab();
            Boolean boolValueOf = Boolean.valueOf(!kjg.e(a(hoxVar5), 0L));
            IBinder iBinderB = b(hoxVar6);
            Boolean boolValueOf2 = Boolean.valueOf(c(hoxVar7) == null ? z : false);
            hmlVarC.v(-1224400529);
            int i8 = i7 & 112;
            boolean zF = ((i8 == 32 || ((i7 & 64) != 0 && hmlVarC.F(dmvkVar2))) ? z : false) | hmlVarC.F(activityB);
            boolean z3 = (i7 & 896) == 256 ? z : false;
            Object objS6 = hmwVar2.S();
            if ((zF || z3) || objS6 == obj2) {
                obj = obj2;
                i3 = i8;
                bool = boolValueOf2;
                hoxVar = hoxVar8;
                i4 = i7;
                hmwVar = hmwVar2;
                i5 = -1224400529;
                dmvkVar2 = dmvkVar;
                iBinder = iBinderB;
                hoxVar2 = hoxVar6;
                bool2 = boolValueOf;
                dmxyVar = new dmxy(dmvkVar2, activityB, fdaeVar, hoxVar2, hoxVar5, hoxVar7, hoxVar, null);
                fdaeVar2 = fdaeVar;
                hoxVar3 = hoxVar5;
                hoxVar4 = hoxVar7;
                hmwVar.af(dmxyVar);
            } else {
                fdaeVar2 = fdaeVar;
                dmxyVar = objS6;
                bool = boolValueOf2;
                i3 = i8;
                hoxVar = hoxVar8;
                i4 = i7;
                hmwVar = hmwVar2;
                i5 = -1224400529;
                dmvkVar2 = dmvkVar;
                iBinder = iBinderB;
                hoxVar2 = hoxVar6;
                bool2 = boolValueOf;
                hoxVar3 = hoxVar5;
                hoxVar4 = hoxVar7;
                obj = obj2;
            }
            hmwVar.ab();
            hob.e(bool2, iBinder, bool, (fdat) dmxyVar, hmlVarC);
            hox hoxVar9 = dmvkVar2.b;
            Boolean boolValueOf3 = Boolean.valueOf(l(hoxVar9));
            EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC = c(hoxVar4);
            hmlVarC.v(-1633490746);
            boolean zD2 = hmlVarC.D(hoxVar9);
            Object objS7 = hmwVar.S();
            if (zD2 || objS7 == obj) {
                objS7 = new dmxz(hoxVar4, hoxVar9, null);
                hmwVar.af(objS7);
            }
            hmwVar.ab();
            hob.f(boolValueOf3, embeddedPhotoPickerSessionC, (fdat) objS7, hmlVarC);
            hmlVarC.v(1849434622);
            Object objS8 = hmwVar.S();
            if (objS8 == obj) {
                hpl hplVar5 = new hpl(fcvo.a, hsi.a);
                hmwVar.af(hplVar5);
                objS8 = hplVar5;
            }
            hox hoxVar10 = (hox) objS8;
            hmwVar.ab();
            hsf hsfVarA2 = hro.a(dmvkVar2.a, hmlVarC);
            EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC2 = c(hoxVar4);
            List listF = f(hsfVarA2);
            hmlVarC.v(-1746271574);
            boolean zD3 = hmlVarC.D(hsfVarA2);
            Object objS9 = hmwVar.S();
            if (zD3 || objS9 == obj) {
                objS9 = new dmya(hoxVar4, hoxVar10, hsfVarA2, null);
                hmwVar.af(objS9);
            }
            hmwVar.ab();
            hob.f(embeddedPhotoPickerSessionC2, listF, (fdat) objS9, hmlVarC);
            ics icsVarA = joj.a(egq.c(icsVar, 1.0f), "EMBEDDED_GALLERY");
            hmlVarC.v(5004770);
            Object objS10 = hmwVar.S();
            if (objS10 == obj) {
                objS10 = new fdap() { // from class: dmxo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        ivy ivyVar = (ivy) obj3;
                        int i9 = dmyf.a;
                        ivyVar.getClass();
                        dmyf.i(hoxVar3, ivyVar.g());
                        return fctx.a;
                    }
                };
                hmwVar.af(objS10);
            }
            hmwVar.ab();
            ics icsVarA2 = ixy.a(icsVarA, (fdap) objS10);
            hmlVarC.v(i5);
            if (i3 == 32 || ((i4 & 64) != 0 && hmlVarC.F(dmvkVar2))) {
                z2 = z;
            }
            Object objS11 = hmwVar.S();
            if (z2 || objS11 == obj) {
                objS11 = new fdap() { // from class: dmxp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        Context context = (Context) obj3;
                        int i9 = dmyf.a;
                        context.getClass();
                        Object objInvoke = dmvkVar2.h.invoke(context);
                        SurfaceView surfaceView = (SurfaceView) objInvoke;
                        surfaceView.setZOrderOnTop(true);
                        surfaceView.addOnAttachStateChangeListener(new dmyb(surfaceView, hoxVar2, hoxVar4, hoxVar3));
                        return objInvoke;
                    }
                };
                hmwVar.af(objS11);
            }
            fdap fdapVar = (fdap) objS11;
            hmwVar.ab();
            hmlVarC.v(5004770);
            Object objS12 = hmwVar.S();
            if (objS12 == obj) {
                objS12 = new fdap() { // from class: dmxq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        SurfaceControlViewHost.SurfacePackage surfacePackage;
                        SurfaceView surfaceView = (SurfaceView) obj3;
                        int i9 = dmyf.a;
                        surfaceView.getClass();
                        EmbeddedPhotoPickerSession embeddedPhotoPickerSessionC3 = dmyf.c(hoxVar4);
                        if (embeddedPhotoPickerSessionC3 != null && (surfacePackage = embeddedPhotoPickerSessionC3.getSurfacePackage()) != null) {
                            surfaceView.setChildSurfacePackage(surfacePackage);
                        }
                        return fctx.a;
                    }
                };
                hmwVar.af(objS12);
            }
            hmwVar.ab();
            final hox hoxVar11 = hoxVar;
            final hox hoxVar12 = hoxVar4;
            hox hoxVar13 = hoxVar3;
            hmlVar2 = hmlVarC;
            kli.b(fdapVar, icsVarA2, (fdap) objS12, hmlVar2, 384, 0);
            kjg kjgVar = new kjg(a(hoxVar13));
            hmlVar2.v(-1633490746);
            Object objS13 = hmwVar.S();
            if (objS13 == obj) {
                objS13 = new dmyc(hoxVar12, hoxVar13, null);
                hmwVar.af(objS13);
            }
            hmwVar.ab();
            hob.g(kjgVar, (fdat) objS13, hmlVar2);
            fctx fctxVar = fctx.a;
            hmlVar2.v(-1633490746);
            Object objS14 = hmwVar.S();
            if (objS14 == obj) {
                objS14 = new fdap() { // from class: dmxr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        int i9 = dmyf.a;
                        ((hny) obj3).getClass();
                        return new dmyd(hoxVar12, hoxVar11);
                    }
                };
                hmwVar.af(objS14);
            }
            hmwVar.ab();
            hob.c(fctxVar, (fdap) objS14, hmlVar2);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmxs
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    ics icsVar2 = icsVar;
                    int i9 = i;
                    dmvk dmvkVar3 = dmvkVar2;
                    int iA = hpy.a(i9 | 1);
                    dmyf.m(icsVar2, dmvkVar3, fdaeVar2, (hml) obj3, iA);
                    return fctx.a;
                }
            };
        }
    }
}
