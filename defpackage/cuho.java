package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuho {
    public static final /* synthetic */ int a = 0;
    private static final gda b = gdd.d(cuhl.A, cuhl.C, cuhl.B, cuhl.D, cuhl.E, cuhl.F, cuhl.H, cuhl.G, cuhl.I, cuhl.J, cuhl.L, cuhl.K, cuhl.M, cuhl.T, cuhl.U, cuhl.N, cuhl.P, cuhl.O, cuhl.Q, 0, cuhl.R, cuhl.S, cuhl.W, cuhl.Y, cuhl.X, cuhl.Z, cuhl.V, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693440, 15);
    private static final gda c = gdd.e(cuhl.a, cuhl.c, cuhl.b, cuhl.d, cuhl.e, cuhl.f, cuhl.h, cuhl.g, cuhl.i, cuhl.j, cuhl.l, cuhl.k, cuhl.m, cuhl.t, cuhl.u, cuhl.n, cuhl.p, cuhl.o, cuhl.q, 0, cuhl.r, cuhl.s, cuhl.w, cuhl.y, cuhl.x, cuhl.z, cuhl.v, 0, 0, 0, 0, 0, 0, 0, 0, 0, -133693440, 15);

    @fcsv
    public static final void a(final boolean z, final boolean z2, fdat fdatVar, hml hmlVar, final int i) {
        gda gdaVarC;
        gda gdaVarB;
        gda gdaVar;
        final fdat fdatVar2;
        fdatVar.getClass();
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1423714961);
        int i3 = (i2 == 0 ? i | 2 : i) | 48;
        final boolean z3 = true;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdatVar2 = fdatVar;
        } else {
            int i4 = i3 & (-15);
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                z = dlv.a(hmlVarC);
                z2 = true;
            } else {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-1904481863);
            if (z2 && Build.VERSION.SDK_INT >= 31) {
                Context context = (Context) hmlVarC.e(AndroidCompositionLocals_androidKt.b);
                if (z) {
                    gdaVarB = gje.b(context);
                    gdaVar = gdaVarB;
                } else {
                    gdaVarC = gje.c(context);
                    gdaVar = gdaVarC;
                    z3 = false;
                }
            } else if (z) {
                gdaVarB = b;
                gdaVar = gdaVarB;
            } else {
                gdaVarC = c;
                gdaVar = gdaVarC;
                z3 = false;
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            final View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            hmlVarC.v(-1904471456);
            if (!view.isInEditMode()) {
                hmlVarC.v(-1633490746);
                boolean zF = hmlVarC.F(view) | hmlVarC.E(z3);
                Object objS = hmwVar.S();
                if (zF || objS == hmk.a) {
                    objS = new fdae() { // from class: cuhm
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            lhb lhbVar;
                            int i5 = cuho.a;
                            int[] iArr = ley.a;
                            int i6 = Build.VERSION.SDK_INT;
                            View view2 = view;
                            if (i6 >= 30) {
                                lhbVar = let.b(view2);
                            } else {
                                Context context2 = view2.getContext();
                                while (true) {
                                    if (!(context2 instanceof ContextWrapper)) {
                                        break;
                                    }
                                    if (context2 instanceof Activity) {
                                        Window window = ((Activity) context2).getWindow();
                                        if (window != null) {
                                            lhbVar = new lhb(window, view2);
                                        }
                                    } else {
                                        context2 = ((ContextWrapper) context2).getBaseContext();
                                    }
                                }
                                lhbVar = null;
                            }
                            if (lhbVar != null) {
                                lhbVar.b(!z3);
                            }
                            return fctx.a;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                hob.i((fdae) objS, hmlVarC);
            }
            hmwVar.ab();
            fdatVar2 = fdatVar;
            gmg.c(gdaVar, null, cuhp.a, fdatVar2, hmlVarC, ((i4 << 3) & 7168) | 384);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cuhn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    int i5 = i;
                    boolean z5 = z2;
                    int iA = hpy.a(i5 | 1);
                    cuho.a(z4, z5, fdatVar2, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }
}
