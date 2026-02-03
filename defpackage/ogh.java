package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Formatter;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogh extends FrameLayout {
    private static final float[] L;
    public final Formatter A;
    public final Drawable B;
    public final Drawable C;
    public final String D;
    public final String E;
    public mcg F;
    public boolean G;
    public final boolean H;
    public boolean I;
    public int J;
    public boolean K;
    private final Resources M;
    private final ofu N;
    private final RecyclerView O;
    private final TextView P;
    private final TextView Q;
    private final ImageView R;
    private final TextView S;
    private final ohq T;
    private final mcj U;
    private final mck V;
    private final Runnable W;
    public final ohe a;
    private final Drawable aa;
    private final Drawable ab;
    private final Drawable ac;
    private final Drawable ad;
    private final float ae;
    private final float af;
    private final String ag;
    private final String ah;
    private final Drawable ai;
    private final Drawable aj;
    private final String ak;
    private final String al;
    private boolean am;
    private final int an;
    private long[] ao;
    private boolean[] ap;
    private final long[] aq;
    private final boolean[] ar;
    private long as;
    private final ofi at;
    public final Class b;
    public final Method c;
    public final Method d;
    public final CopyOnWriteArrayList e;
    public final ofz f;
    public final ofw g;
    public final ogc h;
    public final oft i;
    public final PopupWindow j;
    public final int k;
    public final ImageView l;
    public final ImageView m;
    public final ImageView n;
    public final View o;
    public final View p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final ImageView t;
    public final ImageView u;
    public final View v;
    public final View w;
    public final View x;
    public final TextView y;
    public final StringBuilder z;

    static {
        mbp.b("media3.ui");
        L = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ogh(android.content.Context r18) throws java.lang.NoSuchMethodException, android.content.res.Resources.NotFoundException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogh.<init>(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ekgb s(defpackage.mcs r20, int r21) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogh.s(mcs, int):ekgb");
    }

    private static void t(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private final void u(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.ae : this.af);
    }

    private final void v() {
        ofz ofzVar = this.f;
        boolean z = true;
        if (!ofzVar.F(1) && !ofzVar.F(0)) {
            z = false;
        }
        u(z, this.v);
    }

    public final void a(vo voVar, View view) {
        this.O.al(voVar);
        l();
        this.K = false;
        PopupWindow popupWindow = this.j;
        popupWindow.dismiss();
        this.K = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = -popupWindow.getHeight();
        int i2 = this.k;
        popupWindow.showAsDropDown(view, width - i2, i - i2);
    }

    public final void b() {
        ohe oheVar = this.a;
        int i = oheVar.s;
        if (i == 3 || i == 2) {
            return;
        }
        oheVar.h();
        if (!oheVar.v) {
            oheVar.e();
        } else if (oheVar.s == 1) {
            oheVar.f();
        } else {
            oheVar.d();
        }
    }

    public final void c(mcg mcgVar, long j) {
        if (mcgVar.m(5)) {
            ((mae) mcgVar).s(j);
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.mcg r5) throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            defpackage.mee.c(r0)
            if (r5 == 0) goto L1f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1 = r5
            mrn r1 = (defpackage.mrn) r1
            android.os.Looper r1 = r1.k
            if (r1 != r0) goto L20
        L1f:
            r2 = r3
        L20:
            defpackage.mee.a(r2)
            mcg r0 = r4.F
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L2f
            ofu r1 = r4.N
            r0.P(r1)
        L2f:
            r4.F = r5
            if (r5 == 0) goto L38
            ofu r0 = r4.N
            r5.M(r0)
        L38:
            r4.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogh.d(mcg):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    final void e() throws Resources.NotFoundException {
        h();
        g();
        k();
        m();
        o();
        i();
        n();
    }

    public final void f(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.ai);
            imageView.setContentDescription(this.ak);
        } else {
            imageView.setImageDrawable(this.aj);
            imageView.setContentDescription(this.al);
        }
    }

    public final void g() {
        boolean zM;
        boolean zM2;
        boolean zM3;
        boolean zM4;
        boolean zM5;
        if (r() && this.am) {
            mcg mcgVar = this.F;
            if (mcgVar != null) {
                zM2 = mcgVar.m(5);
                zM3 = mcgVar.m(7);
                zM4 = mcgVar.m(11);
                zM5 = mcgVar.m(12);
                zM = mcgVar.m(9);
            } else {
                zM = false;
                zM2 = false;
                zM3 = false;
                zM4 = false;
                zM5 = false;
            }
            if (zM4) {
                mcg mcgVar2 = this.F;
                long jB = mcgVar2 != null ? mcgVar2.B() : 5000L;
                TextView textView = this.Q;
                int i = (int) (jB / 1000);
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                View view = this.p;
                if (view != null) {
                    view.setContentDescription(this.M.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            if (zM5) {
                mcg mcgVar3 = this.F;
                long jC = mcgVar3 != null ? mcgVar3.C() : 15000L;
                TextView textView2 = this.P;
                int i2 = (int) (jC / 1000);
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                View view2 = this.o;
                if (view2 != null) {
                    view2.setContentDescription(this.M.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            u(zM3, this.l);
            u(zM4, this.p);
            u(zM5, this.o);
            u(zM, this.m);
            ohq ohqVar = this.T;
            if (ohqVar != null) {
                ohqVar.setEnabled(zM2);
            }
        }
    }

    public final void h() {
        ImageView imageView;
        if (r() && this.am && (imageView = this.n) != null) {
            boolean zAe = mgb.ae(this.F, this.H);
            Drawable drawable = zAe ? this.aa : this.ab;
            boolean z = true;
            int i = true != zAe ? R.string.exo_controls_pause_description : R.string.exo_controls_play_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.M.getString(i));
            mcg mcgVar = this.F;
            if (mcgVar == null || !mcgVar.m(1) || (mcgVar.m(17) && mcgVar.H().q())) {
                z = false;
            }
            u(z, imageView);
        }
    }

    public final void i() {
        mcg mcgVar = this.F;
        if (mcgVar == null) {
            return;
        }
        ofw ofwVar = this.g;
        float f = mcgVar.F().b;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = ofwVar.d;
            int length = fArr.length;
            if (i >= 7) {
                ofwVar.e = i2;
                this.f.l(0, ofwVar.a[i2]);
                v();
                return;
            } else {
                float fAbs = Math.abs(f - fArr[i]);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
                if (fAbs < f2) {
                    i2 = i;
                }
                i++;
            }
        }
    }

    public final void j() {
        long jW;
        if (r() && this.am) {
            mcg mcgVar = this.F;
            long jX = 0;
            if (mcgVar == null || !mcgVar.m(16)) {
                jW = 0;
            } else {
                jX = this.as + mcgVar.x();
                jW = this.as + mcgVar.w();
            }
            TextView textView = this.y;
            if (textView != null && !this.I) {
                textView.setText(mgb.L(this.z, this.A, jX));
            }
            ohq ohqVar = this.T;
            if (ohqVar != null) {
                ohqVar.g(jX);
                ohqVar.e(jW);
            }
            Runnable runnable = this.W;
            removeCallbacks(runnable);
            int iT = mcgVar == null ? 1 : mcgVar.t();
            if (mcgVar != null && mcgVar.q()) {
                long jMin = Math.min(ohqVar != null ? ohqVar.a() : 1000L, 1000 - (jX % 1000));
                float f = mcgVar.F().b;
                postDelayed(runnable, mgb.s(f > 0.0f ? (long) (jMin / f) : 1000L, this.an, 1000L));
            } else {
                if (iT == 4 || iT == 1) {
                    return;
                }
                postDelayed(runnable, 1000L);
            }
        }
    }

    public final void k() {
        ImageView imageView;
        if (r() && this.am && (imageView = this.q) != null) {
            u(false, imageView);
        }
    }

    public final void l() {
        RecyclerView recyclerView = this.O;
        recyclerView.measure(0, 0);
        int i = this.k;
        int i2 = i + i;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), getWidth() - i2);
        PopupWindow popupWindow = this.j;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - i2, recyclerView.getMeasuredHeight()));
    }

    public final void m() {
        ImageView imageView;
        if (r() && this.am && (imageView = this.r) != null) {
            mcg mcgVar = this.F;
            if (!this.a.m(imageView)) {
                u(false, imageView);
                return;
            }
            if (mcgVar == null || !mcgVar.m(14)) {
                u(false, imageView);
                imageView.setImageDrawable(this.ad);
                imageView.setContentDescription(this.ah);
            } else {
                u(true, imageView);
                imageView.setImageDrawable(mcgVar.X() ? this.ac : this.ad);
                imageView.setContentDescription(mcgVar.X() ? this.ag : this.ah);
            }
        }
    }

    public final void n() {
        mcg mcgVar = this.F;
        if (mcgVar == null) {
            return;
        }
        long jW = 0;
        this.as = 0L;
        mcl mclVarH = mcgVar.m(17) ? mcgVar.H() : mcl.a;
        if (!mclVarH.q()) {
            int iAE = mcgVar.aE();
            int i = iAE;
            while (true) {
                if (i > iAE) {
                    break;
                }
                if (i == iAE) {
                    this.as = mgb.B(jW);
                }
                mck mckVar = this.V;
                mclVarH.p(i, mckVar);
                if (mckVar.m == -9223372036854775807L) {
                    mee.c(true);
                    break;
                }
                for (int i2 = mckVar.n; i2 <= mckVar.o; i2++) {
                    mcj mcjVar = this.U;
                    mclVarH.n(i2, mcjVar);
                    mcjVar.j();
                    mcjVar.m();
                }
                jW += mckVar.m;
                i++;
            }
        } else if (mcgVar.m(16)) {
            long jC = mcgVar.c();
            if (jC != -9223372036854775807L) {
                jW = mgb.w(jC);
            }
        }
        TextView textView = this.S;
        long jB = mgb.B(jW);
        if (textView != null) {
            textView.setText(mgb.L(this.z, this.A, jB));
        }
        ohq ohqVar = this.T;
        if (ohqVar != null) {
            ohqVar.f(jB);
            long[] jArr = this.aq;
            int length = jArr.length;
            long[] jArr2 = this.ao;
            if (jArr2.length < 0) {
                this.ao = Arrays.copyOf(jArr2, 0);
                this.ap = Arrays.copyOf(this.ap, 0);
            }
            System.arraycopy(jArr, 0, this.ao, 0, 0);
            System.arraycopy(this.ar, 0, this.ap, 0, 0);
            ohqVar.d(this.ao, this.ap, 0);
        }
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() throws Resources.NotFoundException {
        ogc ogcVar = this.h;
        ogcVar.I();
        oft oftVar = this.i;
        oftVar.I();
        mcg mcgVar = this.F;
        if (mcgVar != null && mcgVar.m(30) && this.F.m(29)) {
            mcs mcsVarJ = this.F.J();
            ekgb ekgbVarS = s(mcsVarJ, 1);
            oftVar.d = ekgbVarS;
            ogh oghVar = oftVar.a;
            mcg mcgVar2 = oghVar.F;
            mee.f(mcgVar2);
            mcq mcqVarI = mcgVar2.I();
            if (!ekgbVarS.isEmpty()) {
                if (oftVar.G(mcqVarI)) {
                    int i = 0;
                    while (true) {
                        if (i >= ((ekoe) ekgbVarS).c) {
                            break;
                        }
                        ogd ogdVar = (ogd) ekgbVarS.get(i);
                        if (ogdVar.a()) {
                            oghVar.f.l(1, ogdVar.c);
                            break;
                        }
                        i++;
                    }
                } else {
                    oghVar.f.l(1, oghVar.getResources().getString(R.string.exo_track_selection_auto));
                }
            } else {
                oghVar.f.l(1, oghVar.getResources().getString(R.string.exo_track_selection_none));
            }
            if (this.a.m(this.s)) {
                ogcVar.G(s(mcsVarJ, 3));
            } else {
                int i2 = ekgb.d;
                ogcVar.G(ekoe.a);
            }
        }
        u(ogcVar.a() > 0, this.s);
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        ohe oheVar = this.a;
        oheVar.a.addOnLayoutChangeListener(oheVar.q);
        this.am = true;
        if (q()) {
            oheVar.i();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ohe oheVar = this.a;
        oheVar.a.removeOnLayoutChangeListener(oheVar.q);
        this.am = false;
        removeCallbacks(this.W);
        oheVar.h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final boolean p(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        mcg mcgVar = this.F;
        if (mcgVar == null) {
            return false;
        }
        int i = 89;
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87) {
            if (keyCode != 88) {
                return false;
            }
            keyCode = 88;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (mcgVar.t() == 4 || !mcgVar.m(12)) {
                return true;
            }
            mcgVar.g();
            return true;
        }
        if (keyCode != 89) {
            i = keyCode;
        } else if (mcgVar.m(11)) {
            mcgVar.f();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (i == 79 || i == 85) {
            mgb.am(mcgVar, this.H);
            return true;
        }
        if (i == 87) {
            if (!mcgVar.m(9)) {
                return true;
            }
            mcgVar.i();
            return true;
        }
        if (i == 88) {
            if (!mcgVar.m(7)) {
                return true;
            }
            mcgVar.j();
            return true;
        }
        if (i == 126) {
            mgb.aq(mcgVar);
            return true;
        }
        if (i != 127) {
            return true;
        }
        mgb.ap(mcgVar);
        return true;
    }

    public final boolean q() {
        ohe oheVar = this.a;
        return oheVar.s == 0 && oheVar.a.r();
    }

    public final boolean r() {
        return getVisibility() == 0;
    }
}
