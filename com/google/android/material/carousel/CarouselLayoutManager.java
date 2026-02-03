package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import defpackage.a;
import defpackage.eecd;
import defpackage.eefs;
import defpackage.eefv;
import defpackage.eefw;
import defpackage.eefx;
import defpackage.eefy;
import defpackage.eefz;
import defpackage.eega;
import defpackage.eegb;
import defpackage.eegc;
import defpackage.eegf;
import defpackage.eegg;
import defpackage.eegh;
import defpackage.eegi;
import defpackage.eegk;
import defpackage.eegl;
import defpackage.kzz;
import defpackage.ma;
import defpackage.wb;
import defpackage.wc;
import defpackage.wj;
import defpackage.wq;
import defpackage.ws;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarouselLayoutManager extends wb implements eefs, wq {
    int a;
    int b;
    int c;
    public eegh d;
    private final eefx e;
    private eegc f;
    private eegg g;
    private int h;
    private Map i;
    private eegb j;
    private final View.OnLayoutChangeListener k;
    private int l;
    private int m;
    private int n;

    public CarouselLayoutManager() {
        eegk eegkVar = new eegk();
        this.e = new eefx();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: eefu
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                final CarouselLayoutManager carouselLayoutManager = this.a;
                view.post(new Runnable() { // from class: eeft
                    @Override // java.lang.Runnable
                    public final void run() {
                        carouselLayoutManager.I();
                    }
                });
            }
        };
        this.m = -1;
        this.n = 0;
        J(eegkVar);
        K(0);
    }

    private final float M(float f, float f2) {
        return L() ? f - f2 : f + f2;
    }

    private final float N(float f, float f2) {
        return L() ? f + f2 : f - f2;
    }

    private final float O(float f, eefy eefyVar) {
        eegf eegfVar = eefyVar.b;
        eegf eegfVar2 = eefyVar.a;
        float f2 = eegfVar2.b;
        float f3 = eegfVar.b;
        float f4 = eegfVar2.a;
        float f5 = eegfVar.a;
        float fA = eecd.a(f2, f3, f4, f5, f);
        return (eegfVar == this.g.b() || eegfVar2 == this.g.d()) ? fA + ((f - f5) * (1.0f - eegfVar.c)) : fA;
    }

    private final float R(int i) {
        return M(ab() - this.a, this.g.a * i);
    }

    private final float S(View view) {
        RecyclerView.P(view, new Rect());
        return g() ? r0.centerX() : r0.centerY();
    }

    private static int V(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private final int W() {
        return g() ? this.H : this.I;
    }

    private final int ab() {
        return this.j.d();
    }

    private final int ac(int i, eegg eeggVar) {
        float f = i;
        if (!L()) {
            float f2 = eeggVar.a;
            return (int) (((f * f2) - eeggVar.a().a) + (f2 / 2.0f));
        }
        float fW = W() - eeggVar.c().a;
        float f3 = eeggVar.a;
        return (int) ((fW - (f * f3)) - (f3 / 2.0f));
    }

    private final int ad(int i, eegg eeggVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (eegf eegfVar : eeggVar.c.subList(eeggVar.d, eeggVar.e + 1)) {
            float f = eeggVar.a;
            float f2 = (i * f) + (f / 2.0f);
            int iW = (L() ? (int) ((W() - eegfVar.a) - f2) : (int) (f2 - eegfVar.a)) - this.a;
            if (Math.abs(i2) > Math.abs(iW)) {
                i2 = iW;
            }
        }
        return i2;
    }

    private final int ah(int i, wj wjVar, ws wsVar) {
        if (as() != 0 && i != 0) {
            if (this.d == null) {
                bH(wjVar);
            }
            if (au() > an(this.d).b) {
                int i2 = this.a;
                int iV = V(i, i2, this.b, this.c);
                this.a = i2 + iV;
                bJ(this.d);
                float f = this.g.a / 2.0f;
                float fR = R(bu(aE(0)));
                Rect rect = new Rect();
                float f2 = L() ? this.g.c().b : this.g.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i3 = 0; i3 < as(); i3++) {
                    View viewAE = aE(i3);
                    float fM = M(fR, f);
                    eefy eefyVarAj = aj(this.g.c, fM, false);
                    float fO = O(fM, eefyVarAj);
                    RecyclerView.P(viewAE, rect);
                    bI(viewAE, fM, eefyVarAj);
                    this.j.j(viewAE, rect, f, fO);
                    float fAbs = Math.abs(f2 - fO);
                    if (viewAE != null && fAbs < f3) {
                        this.m = bu(viewAE);
                        f3 = fAbs;
                    }
                    fR = M(fR, this.g.a);
                }
                bG(wjVar, wsVar);
                return iV;
            }
        }
        return 0;
    }

    private static eefy aj(List list, float f, boolean z) {
        float f2 = -3.4028235E38f;
        float f3 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            eegf eegfVar = (eegf) list.get(i5);
            float f6 = z ? eegfVar.b : eegfVar.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f3) {
                i = i5;
                f3 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i2 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                f5 = f6;
            }
            if (f6 <= f5) {
                i3 = i5;
            }
            if (f6 > f2) {
                f2 = f6;
            }
            if (f6 > f2) {
                i4 = i5;
            }
        }
        if (i == -1) {
            i = i3;
        }
        if (i2 == -1) {
            i2 = i4;
        }
        return new eefy((eegf) list.get(i), (eegf) list.get(i2));
    }

    private final eegg an(eegh eeghVar) {
        return L() ? eeghVar.a() : eeghVar.c();
    }

    private final eegg ao(int i) {
        eegg eeggVar;
        Map map = this.i;
        return (map == null || (eeggVar = (eegg) map.get(Integer.valueOf(kzz.b(i, 0, Math.max(0, au() + (-1)))))) == null) ? this.d.a : eeggVar;
    }

    private final void ap(View view, int i, eefw eefwVar) {
        float f = this.g.a / 2.0f;
        aJ(view, i);
        by(view);
        eegb eegbVar = this.j;
        float f2 = eefwVar.c;
        eegbVar.h(view, (int) (f2 - f), (int) (f2 + f));
        bI(view, eefwVar.b, eefwVar.d);
    }

    private final void bD(wj wjVar, int i, int i2) {
        if (i < 0 || i >= au()) {
            return;
        }
        float fR = R(i);
        View viewC = wjVar.c(i);
        by(viewC);
        float fM = M(fR, this.g.a / 2.0f);
        eefy eefyVarAj = aj(this.g.c, fM, false);
        eefw eefwVar = new eefw(viewC, fM, O(fM, eefyVarAj), eefyVarAj);
        ap(eefwVar.a, i2, eefwVar);
    }

    private final void bE(wj wjVar, ws wsVar, int i) {
        float fR = R(i);
        while (i < wsVar.a()) {
            float fM = M(fR, this.g.a / 2.0f);
            eefy eefyVarAj = aj(this.g.c, fM, false);
            float fO = O(fM, eefyVarAj);
            if (bL(fO, eefyVarAj)) {
                return;
            }
            fR = M(fR, this.g.a);
            if (!bM(fO, eefyVarAj)) {
                View viewC = wjVar.c(i);
                ap(viewC, -1, new eefw(viewC, fM, fO, eefyVarAj));
            }
            i++;
        }
    }

    private final void bF(wj wjVar, int i) {
        float fR = R(i);
        while (i >= 0) {
            float fM = M(fR, this.g.a / 2.0f);
            eefy eefyVarAj = aj(this.g.c, fM, false);
            float fO = O(fM, eefyVarAj);
            if (bM(fO, eefyVarAj)) {
                return;
            }
            fR = N(fR, this.g.a);
            if (!bL(fO, eefyVarAj)) {
                View viewC = wjVar.c(i);
                ap(viewC, 0, new eefw(viewC, fM, fO, eefyVarAj));
            }
            i--;
        }
    }

    private final void bG(wj wjVar, ws wsVar) {
        while (as() > 0) {
            View viewAE = aE(0);
            float fS = S(viewAE);
            if (!bM(fS, aj(this.g.c, fS, true))) {
                break;
            } else {
                aY(viewAE, wjVar);
            }
        }
        while (as() - 1 >= 0) {
            View viewAE2 = aE(as() - 1);
            float fS2 = S(viewAE2);
            if (!bL(fS2, aj(this.g.c, fS2, true))) {
                break;
            } else {
                aY(viewAE2, wjVar);
            }
        }
        if (as() == 0) {
            bF(wjVar, this.h - 1);
            bE(wjVar, wsVar, this.h);
        } else {
            int iBu = bu(aE(0));
            int iBu2 = bu(aE(as() - 1));
            bF(wjVar, iBu - 1);
            bE(wjVar, wsVar, iBu2 + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111 A[PHI: r2
      0x0111: PHI (r2v46 int A[IMMUTABLE_TYPE]) = (r2v7 int), (r2v50 int) binds: [B:41:0x010f, B:39:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bH(defpackage.wj r30) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.bH(wj):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bI(View view, float f, eefy eefyVar) {
        if (view instanceof eegi) {
            eegf eegfVar = eefyVar.a;
            eegf eegfVar2 = eefyVar.b;
            float fA = eecd.a(eegfVar.c, eegfVar2.c, eegfVar.a, eegfVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.j.f(height, width, eecd.a(0.0f, height / 2.0f, 0.0f, 1.0f, fA), eecd.a(0.0f, width / 2.0f, 0.0f, 1.0f, fA));
            float fO = O(f, eefyVar);
            RectF rectF = new RectF(fO - (rectFF.width() / 2.0f), fO - (rectFF.height() / 2.0f), fO + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fO);
            RectF rectF2 = new RectF(r(), w(), s(), l());
            this.j.g(rectFF, rectF, rectF2);
            this.j.i(rectFF, rectF, rectF2);
            ((eegi) view).a(rectFF);
        }
    }

    private final void bJ(eegh eeghVar) {
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            this.g = an(eeghVar);
        } else {
            this.g = eeghVar.b(this.a, i2, i);
        }
        this.e.a = DesugarCollections.unmodifiableList(this.g.c);
    }

    private final void bK() {
        int iAu = au();
        int i = this.l;
        if (iAu == i || this.d == null) {
            return;
        }
        eegk eegkVar = (eegk) this.f;
        if ((i < eegkVar.e && au() >= eegkVar.e) || (i >= eegkVar.e && au() < eegkVar.e)) {
            I();
        }
        this.l = iAu;
    }

    private final boolean bL(float f, eefy eefyVar) {
        float fN = N(f, bN(f, eefyVar) / 2.0f);
        return L() ? fN < 0.0f : fN > ((float) W());
    }

    private final boolean bM(float f, eefy eefyVar) {
        float fM = M(f, bN(f, eefyVar) / 2.0f);
        return L() ? fM > ((float) W()) : fM < 0.0f;
    }

    private static final float bN(float f, eefy eefyVar) {
        eegf eegfVar = eefyVar.b;
        eegf eegfVar2 = eefyVar.a;
        return eecd.a(eegfVar2.d, eegfVar.d, eegfVar2.b, eegfVar.b, f);
    }

    @Override // defpackage.wb
    public final void A(int i, int i2) {
        bK();
    }

    @Override // defpackage.wb
    public final int C(ws wsVar) {
        if (as() == 0 || this.d == null || au() <= 1) {
            return 0;
        }
        return (int) (this.H * (this.d.a.a / E(wsVar)));
    }

    @Override // defpackage.wb
    public final int D(ws wsVar) {
        return this.a;
    }

    @Override // defpackage.wb
    public final int E(ws wsVar) {
        return this.c - this.b;
    }

    @Override // defpackage.wb
    public final int F(ws wsVar) {
        if (as() == 0 || this.d == null || au() <= 1) {
            return 0;
        }
        return (int) (this.I * (this.d.a.a / H(wsVar)));
    }

    @Override // defpackage.wb
    public final int G(ws wsVar) {
        return this.a;
    }

    @Override // defpackage.wb
    public final int H(ws wsVar) {
        return this.c - this.b;
    }

    public final void I() {
        this.d = null;
        bb();
    }

    public final void J(eegc eegcVar) {
        this.f = eegcVar;
        I();
    }

    public final void K(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.g(i, "invalid orientation:"));
        }
        U(null);
        eegb eegbVar = this.j;
        if (eegbVar == null || i != eegbVar.b) {
            this.j = i != 0 ? new eefz(this) : new eega(this);
            I();
        }
    }

    public final boolean L() {
        return g() && av() == 1;
    }

    @Override // defpackage.wq
    public final PointF P(int i) {
        if (this.d == null) {
            return null;
        }
        float fAc = ac(i, ao(i)) - this.a;
        return g() ? new PointF(fAc, 0.0f) : new PointF(0.0f, fAc);
    }

    @Override // defpackage.wb
    public final void X(RecyclerView recyclerView, wj wjVar) {
        recyclerView.removeOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.wb
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            accessibilityEvent.setFromIndex(bu(aE(0)));
            accessibilityEvent.setToIndex(bu(aE(as() - 1)));
        }
    }

    @Override // defpackage.eefs
    public final int a() {
        return this.n;
    }

    @Override // defpackage.wb
    public final void aP(View view, Rect rect) {
        RecyclerView.P(view, rect);
        float fCenterY = rect.centerY();
        if (g()) {
            fCenterY = rect.centerX();
        }
        float fBN = bN(fCenterY, aj(this.g.c, fCenterY, true));
        float fWidth = g() ? (rect.width() - fBN) / 2.0f : 0.0f;
        float fHeight = g() ? 0.0f : (rect.height() - fBN) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @Override // defpackage.wb
    public final void aS(RecyclerView recyclerView) throws Resources.NotFoundException {
        eegc eegcVar = this.f;
        Context context = recyclerView.getContext();
        float dimension = eegcVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        eegcVar.a = dimension;
        float dimension2 = eegcVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        eegcVar.b = dimension2;
        I();
        recyclerView.addOnLayoutChangeListener(this.k);
    }

    @Override // defpackage.wb
    public final void aa(int i) {
        this.m = i;
        if (this.d == null) {
            return;
        }
        this.a = ac(i, ao(i));
        this.h = kzz.b(i, 0, Math.max(0, au() - 1));
        bJ(this.d);
        bb();
    }

    @Override // defpackage.wb
    public final boolean ae() {
        return g();
    }

    @Override // defpackage.wb
    public final boolean af() {
        return !g();
    }

    @Override // defpackage.wb
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.wb
    public final void aq(RecyclerView recyclerView, int i) {
        eefv eefvVar = new eefv(this, recyclerView.getContext());
        eefvVar.g = i;
        bi(eefvVar);
    }

    @Override // defpackage.eefs
    public final int b() {
        return this.I;
    }

    @Override // defpackage.wb
    public final boolean bm(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iAd;
        if (this.d == null || (iAd = ad(bu(view), ao(bu(view)))) == 0) {
            return false;
        }
        int i = this.a;
        int iAd2 = ad(bu(view), this.d.b(i + V(iAd, i, r0, r1), this.b, this.c));
        if (g()) {
            recyclerView.scrollBy(iAd2, 0);
            return true;
        }
        recyclerView.scrollBy(0, iAd2);
        return true;
    }

    @Override // defpackage.wb
    public final void by(View view) {
        if (!(view instanceof eegi)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        wc wcVar = (wc) view.getLayoutParams();
        Rect rect = new Rect();
        aK(view, rect);
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        eegh eeghVar = this.d;
        float f = (eeghVar == null || this.j.b != 0) ? wcVar.width : eeghVar.a.a;
        eegh eeghVar2 = this.d;
        view.measure(at(this.H, this.F, az() + aA() + wcVar.leftMargin + wcVar.rightMargin + i, (int) f, g()), at(this.I, this.G, aB() + ay() + wcVar.topMargin + wcVar.bottomMargin + i2, (int) ((eeghVar2 == null || this.j.b != 1) ? wcVar.height : eeghVar2.a.a), af()));
    }

    @Override // defpackage.eefs
    public final int c() {
        return this.H;
    }

    @Override // defpackage.wb
    public final int d(int i, wj wjVar, ws wsVar) {
        if (g()) {
            return ah(i, wjVar, wsVar);
        }
        return 0;
    }

    @Override // defpackage.wb
    public final int e(int i, wj wjVar, ws wsVar) {
        if (af()) {
            return ah(i, wjVar, wsVar);
        }
        return 0;
    }

    @Override // defpackage.wb
    public final wc f() {
        return new wc(-2, -2);
    }

    @Override // defpackage.eefs
    public final boolean g() {
        return this.j.b == 0;
    }

    public final int i(int i) {
        return (int) (this.a - ac(i, ao(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View j(android.view.View r6, int r7, defpackage.wj r8, defpackage.ws r9) {
        /*
            r5 = this;
            int r9 = r5.as()
            r0 = 0
            if (r9 == 0) goto La4
            int r9 = r5.k()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r7 == r2) goto L4a
            r4 = 2
            if (r7 == r4) goto L48
            r4 = 17
            if (r7 == r4) goto L40
            r4 = 33
            if (r7 == r4) goto L3d
            r4 = 66
            if (r7 == r4) goto L34
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L31
            java.lang.String r9 = "Unknown focus request:"
            java.lang.String r7 = defpackage.a.g(r7, r9)
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L2f:
            r7 = r1
            goto L4b
        L31:
            if (r9 != r2) goto L2f
            goto L48
        L34:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L48
            goto L4a
        L3d:
            if (r9 != r2) goto L2f
            goto L4a
        L40:
            if (r9 != 0) goto L2f
            boolean r7 = r5.L()
            if (r7 == 0) goto L4a
        L48:
            r7 = r2
            goto L4b
        L4a:
            r7 = r3
        L4b:
            if (r7 != r1) goto L4e
            return r0
        L4e:
            r9 = 0
            if (r7 != r3) goto L75
            int r6 = bu(r6)
            if (r6 != 0) goto L58
            return r0
        L58:
            android.view.View r6 = r5.aE(r9)
            int r6 = bu(r6)
            int r6 = r6 + r3
            r5.bD(r8, r6, r9)
            boolean r6 = r5.L()
            if (r6 == 0) goto L70
            int r6 = r5.as()
            int r9 = r6 + (-1)
        L70:
            android.view.View r6 = r5.aE(r9)
            return r6
        L75:
            int r6 = bu(r6)
            int r7 = r5.au()
            int r7 = r7 + r3
            if (r6 != r7) goto L81
            return r0
        L81:
            int r6 = r5.as()
            int r6 = r6 + r3
            android.view.View r6 = r5.aE(r6)
            int r6 = bu(r6)
            int r6 = r6 + r2
            r5.bD(r8, r6, r3)
            boolean r6 = r5.L()
            if (r6 == 0) goto L99
            goto L9f
        L99:
            int r6 = r5.as()
            int r9 = r6 + (-1)
        L9f:
            android.view.View r6 = r5.aE(r9)
            return r6
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.j(android.view.View, int, wj, ws):android.view.View");
    }

    public final int k() {
        return this.j.b;
    }

    public final int l() {
        return this.j.a();
    }

    @Override // defpackage.wb
    public final void o(wj wjVar, ws wsVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (wsVar.a() <= 0 || W() <= 0.0f) {
            aW(wjVar);
            this.h = 0;
            return;
        }
        boolean zL = L();
        eegh eeghVar = this.d;
        int i6 = 1;
        boolean z2 = eeghVar == null;
        if (z2 || eeghVar.a.f != W()) {
            bH(wjVar);
        }
        eegh eeghVar2 = this.d;
        boolean zL2 = L();
        eegg eeggVarA = zL2 ? eeghVar2.a() : eeghVar2.c();
        float fAb = ab() - N((zL2 ? eeggVarA.c() : eeggVarA.a()).a, eeggVarA.a / 2.0f);
        eegh eeghVar3 = this.d;
        boolean zL3 = L();
        eegg eeggVarC = zL3 ? eeghVar3.c() : eeghVar3.a();
        eegf eegfVarA = zL3 ? eeggVarC.a() : eeggVarC.c();
        int i7 = -1;
        int iA = (int) (((((wsVar.a() - 1) * eeggVarC.a) * (true != zL3 ? 1.0f : -1.0f)) - (eegfVarA.a - ab())) + (((true != zL3 ? 1 : -1) * eegfVarA.d) / 2.0f));
        int iMin = zL3 ? Math.min(0, iA) : Math.max(0, iA);
        int i8 = (int) fAb;
        this.b = true != zL ? i8 : iMin;
        if (true == zL) {
            iMin = i8;
        }
        this.c = iMin;
        if (z2) {
            this.a = i8;
            eegh eeghVar4 = this.d;
            int iAu = au();
            int i9 = this.b;
            int i10 = this.c;
            boolean zL4 = L();
            float f = eeghVar4.a.a;
            HashMap map = new HashMap();
            int i11 = 0;
            int i12 = 0;
            while (i11 < iAu) {
                if (zL4) {
                    i3 = (iAu - i11) + i7;
                    i2 = i6;
                } else {
                    i2 = 0;
                    i3 = i11;
                }
                float f2 = i3 * f;
                if (i6 != i2) {
                    i4 = i6;
                    i5 = i7;
                } else {
                    i4 = i7;
                    i5 = i4;
                }
                if (f2 * i4 > i10 - eeghVar4.e || i11 >= iAu - eeghVar4.c.size()) {
                    map.put(Integer.valueOf(i3), (eegg) eeghVar4.c.get(kzz.b(i12, 0, r11.size() - 1)));
                    i12++;
                }
                i11++;
                i7 = i5;
                i6 = 1;
            }
            int i13 = i7;
            int i14 = 0;
            for (int i15 = iAu - 1; i15 >= 0; i15--) {
                if (zL4) {
                    i = (iAu - i15) - 1;
                    z = true;
                } else {
                    z = false;
                    i = i15;
                }
                if (i * f * (true != z ? 1 : i13) < i9 + eeghVar4.d || i15 < eeghVar4.b.size()) {
                    map.put(Integer.valueOf(i), (eegg) eeghVar4.b.get(kzz.b(i14, 0, r11.size() - 1)));
                    i14++;
                }
            }
            this.i = map;
            int i16 = this.m;
            if (i16 != i13) {
                this.a = ac(i16, ao(i16));
            }
        }
        int i17 = this.a;
        this.a = i17 + V(0, i17, this.b, this.c);
        this.h = kzz.b(this.h, 0, wsVar.a());
        bJ(this.d);
        aL(wjVar);
        bG(wjVar, wsVar);
        this.l = au();
    }

    @Override // defpackage.wb
    public final void p(ws wsVar) {
        if (as() == 0) {
            this.h = 0;
        } else {
            this.h = bu(aE(0));
        }
    }

    public final int r() {
        return this.j.b();
    }

    public final int s() {
        return this.j.c();
    }

    public final int w() {
        return this.j.e();
    }

    @Override // defpackage.wb
    public final void x(int i, int i2) {
        bK();
    }

    @Override // defpackage.wb
    public final void y() {
        bK();
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new eefx();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: eefu
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                final CarouselLayoutManager carouselLayoutManager = this.a;
                view.post(new Runnable() { // from class: eeft
                    @Override // java.lang.Runnable
                    public final void run() {
                        carouselLayoutManager.I();
                    }
                });
            }
        };
        this.m = -1;
        this.n = 0;
        J(new eegk());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eegl.a);
            this.n = typedArrayObtainStyledAttributes.getInt(0, 0);
            I();
            int[] iArr = ma.a;
            K(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
