package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcz {
    public static final dtcz a = new dtcz();

    private dtcz() {
    }

    public static final long a(hml hmlVar) {
        return dtdu.c(40, hmlVar);
    }

    public static final ikp b(hml hmlVar) {
        return dtgs.b(4, hmlVar);
    }

    public final void c(ics icsVar, float f, float f2, ikp ikpVar, long j, hml hmlVar, final int i) throws Resources.NotFoundException {
        ics icsVar2;
        float f3;
        float f4;
        ikp ikpVar2;
        long jC;
        final String string;
        hml hmlVar2;
        final ics icsVar3;
        final float f5;
        final float f6;
        final ikp ikpVar3;
        final long j2;
        hml hmlVarC = hmlVar.c(1578277453);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 = i | 22;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((i2 & 9363) == 9362 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            f6 = f;
            f5 = f2;
            ikpVar3 = ikpVar;
            j2 = j;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                f3 = 4.0f;
                f4 = 32.0f;
                ikpVar2 = glz.c(hmlVarC).e;
                jC = dtdu.c(19, hmlVarC);
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                f4 = f;
                f3 = f2;
                ikpVar2 = ikpVar;
                jC = j;
            }
            hmlVarC.l();
            hmlVarC.v(-482266667);
            hmlVarC.e(AndroidCompositionLocals_androidKt.a);
            Resources resources = ((Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b)).getResources();
            if (dthd.a(0)) {
                string = resources.getString(R.string.navigation_menu);
                string.getClass();
            } else if (dthd.a(1)) {
                string = resources.getString(R.string.close_drawer);
                string.getClass();
            } else if (dthd.a(2)) {
                string = resources.getString(R.string.close_sheet);
                string.getClass();
            } else if (dthd.a(3)) {
                string = resources.getString(R.string.default_error_message);
                string.getClass();
            } else if (dthd.a(4)) {
                string = resources.getString(R.string.dropdown_menu);
                string.getClass();
            } else if (dthd.a(5)) {
                string = resources.getString(R.string.range_start);
                string.getClass();
            } else if (dthd.a(6)) {
                string = resources.getString(R.string.range_end);
                string.getClass();
            } else if (dthd.a(8)) {
                string = resources.getString(R.string.expanded);
                string.getClass();
            } else if (dthd.a(9)) {
                string = resources.getString(R.string.collapsed);
                string.getClass();
            } else if (dthd.a(10)) {
                string = resources.getString(R.string.dismiss);
                string.getClass();
            } else if (dthd.a(11)) {
                string = resources.getString(R.string.bottom_sheet_drag_handle_description);
                string.getClass();
            } else {
                string = "";
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarI = efy.i(icsVar2, 0.0f, 22.0f, 1);
            hmlVarC.v(5004770);
            boolean zD = hmlVarC.D(string);
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: dtcw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.k(jtoVar, string);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmlVar2 = hmlVarC;
            gvk.c(jsh.c(icsVarI, false, (fdap) objS), ikpVar2, jC, 0L, 0.0f, 0.0f, null, hxe.d(2095541970, new dtcy(f4, f3), hmlVarC), hmlVar2, 120);
            icsVar3 = icsVar2;
            f5 = f3;
            f6 = f4;
            ikpVar3 = ikpVar2;
            j2 = jC;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtcx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    dtcz dtczVar = this.a;
                    ics icsVar4 = icsVar3;
                    float f7 = f6;
                    float f8 = f5;
                    ikp ikpVar4 = ikpVar3;
                    dtczVar.c(icsVar4, f7, f8, ikpVar4, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
