package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vsi implements fdau {
    public static final vsi a = new vsi();

    public static final int b(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    public static final void c(hox hoxVar, int i) {
        hoxVar.b(Integer.valueOf(i));
    }

    public static final void d(hox hoxVar, int i) {
        hoxVar.b(Integer.valueOf(i));
    }

    public static final void e(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    private static final int f(hox hoxVar) {
        return ((Number) hoxVar.a()).intValue();
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(-1220299429);
        int height = ((View) hmlVar.e(AndroidCompositionLocals_androidKt.f)).getHeight() / 3;
        hmlVar.v(1849434622);
        Object objF = hmlVar.f();
        Object obj4 = hmk.a;
        if (objF == obj4) {
            hpl hplVar = new hpl(-1, hsi.a);
            hmlVar.y(hplVar);
            objF = hplVar;
        }
        final hox hoxVar = (hox) objF;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF2 = hmlVar.f();
        if (objF2 == obj4) {
            hpl hplVar2 = new hpl(-1, hsi.a);
            hmlVar.y(hplVar2);
            objF2 = hplVar2;
        }
        final hox hoxVar2 = (hox) objF2;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF3 = hmlVar.f();
        if (objF3 == obj4) {
            hpl hplVar3 = new hpl(false, hsi.a);
            hmlVar.y(hplVar3);
            objF3 = hplVar3;
        }
        final hox hoxVar3 = (hox) objF3;
        hmlVar.o();
        int iF = f(hoxVar2);
        dew dewVarB = new dtgd().b();
        hmlVar.v(5004770);
        Object objF4 = hmlVar.f();
        if (objF4 == obj4) {
            objF4 = new fdap() { // from class: vse
                @Override // defpackage.fdap
                public final Object invoke(Object obj5) {
                    ((Integer) obj5).intValue();
                    vsi.e(hoxVar3, false);
                    return fctx.a;
                }
            };
            hmlVar.y(objF4);
        }
        hmlVar.o();
        hsf hsfVarD = ddu.d(iF, dewVarB, (fdap) objF4, hmlVar, 3072, 4);
        if (((Boolean) hoxVar3.a()).booleanValue() || Math.abs(b(hoxVar) - f(hoxVar2)) > height) {
            e(hoxVar3, true);
            iIntValue = ((Number) hsfVarD.a()).intValue();
        } else {
            iIntValue = f(hoxVar2);
        }
        final int iF2 = fddu.f(iIntValue, 0);
        hmlVar.v(-1746271574);
        boolean zB = hmlVar.B(iF2);
        Object objF5 = hmlVar.f();
        if (zB || objF5 == obj4) {
            objF5 = new fdau() { // from class: vsf
                @Override // defpackage.fdau
                public final Object a(Object obj5, Object obj6, Object obj7) {
                    ixp ixpVar = (ixp) obj5;
                    ixk ixkVar = (ixk) obj6;
                    ixpVar.getClass();
                    ixkVar.getClass();
                    final iyl iylVarE = ixkVar.e(((kil) obj7).a);
                    hox hoxVar4 = hoxVar;
                    int iB = vsi.b(hoxVar4);
                    hox hoxVar5 = hoxVar2;
                    if (iB == -1) {
                        vsi.c(hoxVar4, iylVarE.b);
                        vsi.d(hoxVar5, iylVarE.b);
                        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new fdap() { // from class: vsg
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj8) {
                                iyk iykVar = (iyk) obj8;
                                iykVar.getClass();
                                iykVar.s(iylVarE, 0, 0, 0.0f);
                                return fctx.a;
                            }
                        });
                    }
                    int i = iF2;
                    vsi.c(hoxVar4, i);
                    vsi.d(hoxVar5, iylVarE.b);
                    return ixpVar.ej(iylVarE.a, i, fcvp.a, new fdap() { // from class: vsh
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj8) {
                            iyk iykVar = (iyk) obj8;
                            iykVar.getClass();
                            iykVar.s(iylVarE, 0, 0, 0.0f);
                            return fctx.a;
                        }
                    });
                }
            };
            hmlVar.y(objF5);
        }
        hmlVar.o();
        ics icsVarA = iwl.a(icsVar, (fdau) objF5);
        hmlVar.o();
        return icsVarA;
    }
}
