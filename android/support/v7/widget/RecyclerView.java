package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import defpackage.a;
import defpackage.cvw;
import defpackage.lcx;
import defpackage.lcy;
import defpackage.ldi;
import defpackage.ldj;
import defpackage.ldv;
import defpackage.leq;
import defpackage.ley;
import defpackage.lfd;
import defpackage.lih;
import defpackage.ljc;
import defpackage.ma;
import defpackage.qk;
import defpackage.ql;
import defpackage.sm;
import defpackage.te;
import defpackage.tr;
import defpackage.tw;
import defpackage.ty;
import defpackage.vh;
import defpackage.vi;
import defpackage.vj;
import defpackage.vk;
import defpackage.vl;
import defpackage.vm;
import defpackage.vn;
import defpackage.vo;
import defpackage.vs;
import defpackage.vu;
import defpackage.vv;
import defpackage.vw;
import defpackage.vx;
import defpackage.wb;
import defpackage.wc;
import defpackage.wd;
import defpackage.we;
import defpackage.wf;
import defpackage.wg;
import defpackage.wh;
import defpackage.wi;
import defpackage.wj;
import defpackage.wl;
import defpackage.wn;
import defpackage.wr;
import defpackage.ws;
import defpackage.wt;
import defpackage.wu;
import defpackage.wv;
import defpackage.wx;
import defpackage.zq;
import defpackage.zr;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ldi {
    public static final /* synthetic */ int aa = 0;
    private static final Class[] ad;
    public static final Interpolator c;
    static final wt d;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public vv E;
    public int F;
    public we G;
    public final int H;
    public float I;
    public float J;
    public final wu K;
    public ty L;
    public tw M;
    public final ws N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public wx R;
    public final int[] S;
    final List T;
    boolean U;
    lcx V;
    ldv W;
    private final int[] aA;
    private ldj aB;
    private final int[] aC;
    private final int[] aD;
    private Runnable aE;
    private boolean aF;
    private int aG;
    private int aH;
    private final lcy aI;
    private vw aJ;
    private final vk aK;
    private final float ae;
    private final wl af;
    private final Rect ag;
    private final ArrayList ah;
    private wf ai;
    private int aj;
    private boolean ak;
    private int al;
    private final AccessibilityManager am;
    private int an;
    private int ao;
    private vs ap;
    private int aq;
    private VelocityTracker ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private final int ax;
    private boolean ay;
    private List az;
    public final wj e;
    public wn f;
    public ql g;
    public sm h;
    public final zr i;
    public boolean j;
    public final Runnable k;
    public final Rect l;
    public final RectF m;
    public vo n;
    public wb o;
    public final List p;
    public final ArrayList q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;
    private static final int[] ab = {R.attr.nestedScrollingEnabled};
    private static final float ac = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean a = true;
    public static final boolean b = true;

    static {
        Class cls = Integer.TYPE;
        ad = new Class[]{Context.class, AttributeSet.class, cls, cls};
        c = new vj();
        d = new wt();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void A(wv wvVar) {
        WeakReference weakReference = wvVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == wvVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            wvVar.b = null;
        }
    }

    public static void P(View view, Rect rect) {
        wc wcVar = (wc) view.getLayoutParams();
        Rect rect2 = wcVar.d;
        rect.set((view.getLeft() - rect2.left) - wcVar.leftMargin, (view.getTop() - rect2.top) - wcVar.topMargin, view.getRight() + rect2.right + wcVar.rightMargin, view.getBottom() + rect2.bottom + wcVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float width = i / getWidth();
        float height = f / getHeight();
        EdgeEffect edgeEffect = this.A;
        float f2 = 0.0f;
        if (edgeEffect == null || lih.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && lih.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C.onRelease();
                } else {
                    float fB = lih.b(this.C, width, height);
                    if (lih.a(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A.onRelease();
            } else {
                float f3 = -lih.b(this.A, -width, 1.0f - height);
                if (lih.a(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public static final int aG(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && lih.a(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * lih.b(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || lih.a(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * lih.b(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static final long aH() {
        if (b) {
            return System.nanoTime();
        }
        return 0L;
    }

    private final int aO(int i, float f) {
        float height = i / getHeight();
        float width = f / getWidth();
        EdgeEffect edgeEffect = this.B;
        float f2 = 0.0f;
        if (edgeEffect == null || lih.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && lih.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D.onRelease();
                } else {
                    float fB = lih.b(this.D, height, 1.0f - width);
                    if (lih.a(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f2 = fB;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B.onRelease();
            } else {
                float f3 = -lih.b(this.B, -height, width);
                if (lih.a(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private final ldj aP() {
        if (this.aB == null) {
            this.aB = new ldj(this);
        }
        return this.aB;
    }

    private final ldv aQ() {
        if (this.W == null) {
            this.W = new ldv(this);
        }
        return this.W;
    }

    private final void aR() {
        ba();
        aq(0);
    }

    private final void aS() {
        View viewN;
        ws wsVar = this.N;
        wsVar.b(1);
        O(wsVar);
        wsVar.i = false;
        au();
        zr zrVar = this.i;
        zrVar.f();
        V();
        aW();
        wv wvVarJ = null;
        View focusedChild = (this.ay && hasFocus() && this.n != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewN = n(focusedChild)) != null) {
            wvVarJ = j(viewN);
        }
        if (wvVarJ == null) {
            aZ();
        } else {
            wsVar.m = this.n.b ? wvVarJ.e : -1L;
            wsVar.l = this.y ? -1 : wvVarJ.v() ? wvVarJ.d : wvVarJ.fs();
            View focusedChild2 = wvVarJ.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            wsVar.n = id;
        }
        wsVar.h = wsVar.j && this.P;
        this.P = false;
        this.O = false;
        wsVar.g = wsVar.k;
        wsVar.e = this.n.a();
        aU(this.aA);
        if (wsVar.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                wv wvVarK = k(this.h.d(i));
                if (!wvVarK.A() && (!wvVarK.t() || this.n.b)) {
                    vv.t(wvVarK);
                    wvVarK.gm();
                    zrVar.e(wvVarK, vv.s(wvVarK));
                    if (wsVar.h && wvVarK.y() && !wvVarK.v() && !wvVarK.A() && !wvVarK.t()) {
                        zrVar.c(f(wvVarK), wvVarK);
                    }
                }
            }
        }
        if (wsVar.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                wv wvVarK2 = k(this.h.e(i2));
                if (!wvVarK2.A() && wvVarK2.d == -1) {
                    wvVarK2.d = wvVarK2.c;
                }
            }
            boolean z = wsVar.f;
            wsVar.f = false;
            this.o.o(this.e, wsVar);
            wsVar.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                wv wvVarK3 = k(this.h.d(i3));
                if (!wvVarK3.A()) {
                    cvw cvwVar = zrVar.a;
                    zq zqVar = (zq) cvwVar.get(wvVarK3);
                    if (zqVar == null || (zqVar.b & 4) == 0) {
                        vv.t(wvVarK3);
                        boolean zQ = wvVarK3.q(8192);
                        wvVarK3.gm();
                        vu vuVarS = vv.s(wvVarK3);
                        if (zQ) {
                            ab(wvVarK3, vuVarS);
                        } else {
                            zq zqVarA = (zq) cvwVar.get(wvVarK3);
                            if (zqVarA == null) {
                                zqVarA = zq.a();
                                cvwVar.put(wvVarK3, zqVarA);
                            }
                            zqVarA.b |= 2;
                            zqVarA.c = vuVarS;
                        }
                    }
                }
            }
            B();
        } else {
            B();
        }
        W();
        av(false);
        wsVar.d = 2;
    }

    private final void aT() {
        au();
        V();
        ws wsVar = this.N;
        wsVar.b(6);
        this.g.e();
        wsVar.e = this.n.a();
        wsVar.c = 0;
        if (this.f != null && this.n.D()) {
            Parcelable parcelable = this.f.a;
            if (parcelable != null) {
                this.o.Z(parcelable);
            }
            this.f = null;
        }
        wsVar.g = false;
        this.o.o(this.e, wsVar);
        wsVar.f = false;
        wsVar.j = wsVar.j && this.E != null;
        wsVar.d = 4;
        W();
        av(false);
    }

    private final void aU(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < iA; i3++) {
            wv wvVarK = k(this.h.d(i3));
            if (!wvVarK.A()) {
                int iGl = wvVarK.gl();
                if (iGl < i2) {
                    i2 = iGl;
                }
                if (iGl > i) {
                    i = iGl;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aV(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aq) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aq = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.au = x;
            this.as = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.av = y;
            this.at = y;
        }
    }

    private final void aW() {
        boolean z;
        if (this.y) {
            this.g.j();
            if (this.z) {
                this.o.y();
            }
        }
        if (be()) {
            this.g.g();
        } else {
            this.g.e();
        }
        boolean z2 = this.O || this.P;
        ws wsVar = this.N;
        boolean z3 = this.t && this.E != null && ((z = this.y) || z2 || this.o.y) && (!z || this.n.b);
        wsVar.j = z3;
        wsVar.k = z3 && z2 && !this.y && be();
    }

    private final void aX() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aY(View view, View view2) {
        boolean z;
        RecyclerView recyclerView;
        View view3;
        View view4 = view2 != null ? view2 : view;
        Rect rect = this.l;
        rect.set(0, 0, view4.getWidth(), view4.getHeight());
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        if (layoutParams instanceof wc) {
            wc wcVar = (wc) layoutParams;
            if (!wcVar.e) {
                Rect rect2 = wcVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        wb wbVar = this.o;
        boolean z2 = !this.t;
        if (view2 == null) {
            z = true;
            view3 = view;
            recyclerView = this;
        } else {
            z = false;
            recyclerView = this;
            view3 = view;
        }
        wbVar.bm(recyclerView, view3, rect, z2, z);
    }

    private final void aZ() {
        ws wsVar = this.N;
        wsVar.m = -1L;
        wsVar.l = -1;
        wsVar.n = -1;
    }

    private final void ba() {
        VelocityTracker velocityTracker = this.ar;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        aw(0);
        aX();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bb(int i) {
        boolean zAe = this.o.ae();
        int i2 = zAe;
        if (this.o.af()) {
            i2 = (zAe ? 1 : 0) | 2;
        }
        aN(i2, i);
    }

    private final void bc() {
        wr wrVar;
        this.K.d();
        wb wbVar = this.o;
        if (wbVar == null || (wrVar = wbVar.x) == null) {
            return;
        }
        wrVar.n();
    }

    private final boolean bd(MotionEvent motionEvent) {
        ArrayList arrayList = this.ah;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wf wfVar = (wf) arrayList.get(i);
            if (wfVar.j(this, motionEvent) && action != 3) {
                this.ai = wfVar;
                return true;
            }
        }
        return false;
    }

    private final boolean be() {
        return this.E != null && this.o.v();
    }

    private final boolean bf(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fA = lih.a(edgeEffect) * i2;
        float fAbs = Math.abs(-i);
        float f = this.ae * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d2 = ac;
        return ((float) (((double) f) * Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fA;
    }

    private final void bg(Context context, String str, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = String.valueOf(context.getPackageName()).concat(String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(wb.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ad);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(a.k(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ao((wb) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(a.k(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(a.k(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(a.k(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(a.k(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(a.k(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    public static wv k(View view) {
        if (view == null) {
            return null;
        }
        return ((wc) view.getLayoutParams()).c;
    }

    public static RecyclerView l(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewL = l(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    final void B() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            wv wvVarK = k(this.h.e(i));
            if (!wvVarK.A()) {
                wvVarK.g();
            }
        }
        wj wjVar = this.e;
        ArrayList arrayList = wjVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wv) arrayList.get(i2)).g();
        }
        ArrayList arrayList2 = wjVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((wv) arrayList2.get(i3)).g();
        }
        ArrayList arrayList3 = wjVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((wv) wjVar.b.get(i4)).g();
            }
        }
    }

    public final void C() {
        List list = this.az;
        if (list != null) {
            list.clear();
        }
    }

    public final void D(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void E() {
        if (!this.t || this.y) {
            Trace.beginSection("RV FullInvalidate");
            fl();
            Trace.endSection();
            return;
        }
        if (this.g.l()) {
            if (!this.g.k(4) || this.g.k(11)) {
                if (this.g.l()) {
                    Trace.beginSection("RV FullInvalidate");
                    fl();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            au();
            V();
            this.g.g();
            if (!this.u) {
                int iA = this.h.a();
                int i = 0;
                while (true) {
                    if (i < iA) {
                        wv wvVarK = k(this.h.d(i));
                        if (wvVarK != null && !wvVarK.A() && wvVarK.y()) {
                            fl();
                            break;
                        }
                        i++;
                    } else {
                        this.g.d();
                        break;
                    }
                }
            }
            av(true);
            W();
            Trace.endSection();
        }
    }

    public final void G(View view) {
        wv wvVarK = k(view);
        vo voVar = this.n;
        if (voVar != null && wvVarK != null) {
            voVar.j(wvVarK);
        }
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wd) this.x.get(size)).d(view);
            }
        }
    }

    public final void I(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aP().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void J(int i, int i2) {
        this.ao++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        List list = this.az;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((wg) this.az.get(size)).a(this, i, i2);
                }
            }
        }
        this.ao--;
    }

    public final void K() {
        if (this.D != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.ap.a(this);
        this.D = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void L() {
        if (this.A != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.ap.a(this);
        this.A = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void M() {
        if (this.C != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.ap.a(this);
        this.C = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void N() {
        if (this.B != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.ap.a(this);
        this.B = edgeEffectA;
        if (this.j) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void O(ws wsVar) {
        if (this.F != 2) {
            wsVar.o = 0;
            wsVar.p = 0;
        } else {
            OverScroller overScroller = this.K.a;
            wsVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            wsVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void Q() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void R() {
        if (this.q.size() == 0) {
            return;
        }
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.U("Cannot invalidate item decorations during a scroll or layout");
        }
        T();
        requestLayout();
    }

    public final void S(int i) {
        if (this.o == null) {
            return;
        }
        aq(2);
        this.o.aa(i);
        awakenScrollBars();
    }

    final void T() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((wc) this.h.e(i).getLayoutParams()).e = true;
        }
        ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wc wcVar = (wc) ((wv) arrayList.get(i2)).a.getLayoutParams();
            if (wcVar != null) {
                wcVar.e = true;
            }
        }
    }

    public final void U(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            wv wvVarK = k(this.h.e(i4));
            if (wvVarK != null && !wvVarK.A()) {
                int i5 = wvVarK.c;
                if (i5 >= i3) {
                    wvVarK.k(-i2, z);
                    this.N.f = true;
                } else if (i5 >= i) {
                    wvVarK.f(8);
                    wvVarK.k(-i2, z);
                    wvVarK.c = i - 1;
                    this.N.f = true;
                }
            }
            i4++;
        }
        wj wjVar = this.e;
        ArrayList arrayList = wjVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            wv wvVar = (wv) arrayList.get(size);
            if (wvVar != null) {
                int i6 = wvVar.c;
                if (i6 >= i3) {
                    wvVar.k(-i2, z);
                } else if (i6 >= i) {
                    wvVar.f(8);
                    wjVar.k(size);
                }
            }
        }
    }

    public final void V() {
        this.an++;
    }

    final void W() {
        X(true);
    }

    public final void X(boolean z) {
        int i;
        int i2 = this.an - 1;
        this.an = i2;
        if (i2 <= 0) {
            this.an = 0;
            if (z) {
                int i3 = this.al;
                this.al = 0;
                if (i3 != 0 && aD()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                List list = this.T;
                for (int size = list.size() - 1; size >= 0; size--) {
                    wv wvVar = (wv) list.get(size);
                    View view = wvVar.a;
                    if (view.getParent() == this && !wvVar.A() && (i = wvVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        wvVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void Z() {
        if (this.Q || !this.r) {
            return;
        }
        Runnable runnable = this.aE;
        int[] iArr = ley.a;
        postOnAnimation(runnable);
        this.Q = true;
    }

    public final boolean aA(int i, int i2) {
        return aB(i, i2, this.H, this.ax);
    }

    public final boolean aB(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zAe = wbVar.ae();
        boolean zAf = this.o.af();
        if (!zAe || Math.abs(i) < i3) {
            i = 0;
        }
        if (!zAf || Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || lih.a(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && lih.a(edgeEffect2) != 0.0f) {
                    if (bf(this.C, i, getWidth())) {
                        this.C.onAbsorb(i);
                        i = 0;
                    }
                    i5 = i;
                    i = 0;
                }
                i5 = 0;
            } else {
                int i7 = -i;
                if (bf(this.A, i7, getWidth())) {
                    this.A.onAbsorb(i7);
                    i = 0;
                }
                i5 = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || lih.a(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 != null && lih.a(edgeEffect4) != 0.0f) {
                    if (bf(this.D, i2, getHeight())) {
                        this.D.onAbsorb(i2);
                        i2 = 0;
                    }
                    i6 = 0;
                }
                i6 = i2;
                i2 = 0;
            } else {
                int i8 = -i2;
                if (bf(this.B, i8, getHeight())) {
                    this.B.onAbsorb(i8);
                    i2 = 0;
                }
                i6 = 0;
            }
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = Math.max(i9, Math.min(i5, i4));
            iMax2 = Math.max(i9, Math.min(i2, i4));
            bb(1);
            this.K.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i92 = -i4;
            iMax = Math.max(i92, Math.min(i5, i4));
            iMax2 = Math.max(i92, Math.min(i2, i4));
            bb(1);
            this.K.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zAe || zAf;
            dispatchNestedFling(f, f2, z);
            we weVar = this.G;
            if (weVar != null && weVar.e(i, i6)) {
                return true;
            }
            if (z) {
                int i10 = -i4;
                bb(1);
                this.K.a(Math.max(i10, Math.min(i, i4)), Math.max(i10, Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean aC() {
        return !this.t || this.y || this.g.l();
    }

    public final boolean aD() {
        AccessibilityManager accessibilityManager = this.am;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean aE() {
        return this.an > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean aF(int r22, int r23, int r24, int r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aF(int, int, int, int, android.view.MotionEvent, int):boolean");
    }

    public final void aI(int i, int i2, int i3, int i4, MotionEvent motionEvent) {
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        int[] iArr = this.S;
        int i5 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zAe = wbVar.ae();
        boolean zAf = this.o.af();
        int i6 = zAf ? (zAe ? 1 : 0) | 2 : zAe ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iA = i - a(i, height);
        int iAO = i2 - aO(i2, width);
        aN(i6, 1);
        if (az(true != zAe ? 0 : iA, true != zAf ? 0 : iAO, iArr, this.aC, 1)) {
            iA -= iArr[0];
            iAO -= iArr[1];
        }
        aF(true != zAe ? 0 : iA, true != zAf ? 0 : iAO, i3, i4, motionEvent, 1);
        ty tyVar = this.L;
        if (tyVar != null) {
            if (iA != 0) {
                i5 = iA;
            } else if (iAO != 0) {
            }
            tyVar.a(this, i5, iAO);
        }
        aw(1);
    }

    public final void aJ(wv wvVar, int i) {
        if (!aE()) {
            wvVar.a.setImportantForAccessibility(i);
        } else {
            wvVar.p = i;
            this.T.add(wvVar);
        }
    }

    public final void aK() {
        this.s = true;
    }

    public final void aL(int i, int i2, Interpolator interpolator) {
        aM(i, i2, interpolator, false);
    }

    public final void aM(int i, int i2, Interpolator interpolator, boolean z) {
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != wbVar.ae()) {
            i = 0;
        }
        if (true != this.o.af()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aN(i3, 1);
        }
        this.K.c(i, i2, Integer.MIN_VALUE, interpolator);
    }

    public final void aN(int i, int i2) {
        aP().m(i, i2);
    }

    public final void aa(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            wv wvVarK = k(this.h.e(i));
            if (wvVarK != null && !wvVarK.A()) {
                wvVarK.f(6);
            }
        }
        T();
        wj wjVar = this.e;
        ArrayList arrayList = wjVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wv wvVar = (wv) arrayList.get(i2);
            if (wvVar != null) {
                wvVar.f(6);
                wvVar.e(null);
            }
        }
        vo voVar = wjVar.h.n;
        if (voVar == null || !voVar.b) {
            wjVar.j();
        }
    }

    public final void ab(wv wvVar, vu vuVar) {
        wvVar.m(0, 8192);
        if (this.N.h && wvVar.y() && !wvVar.v() && !wvVar.A()) {
            this.i.c(f(wvVar), wvVar);
        }
        this.i.e(wvVar, vuVar);
    }

    public final void ac() {
        vv vvVar = this.E;
        if (vvVar != null) {
            vvVar.c();
        }
        wb wbVar = this.o;
        if (wbVar != null) {
            wj wjVar = this.e;
            wbVar.aW(wjVar);
            this.o.aX(wjVar);
        }
        this.e.e();
    }

    public final void ad(vx vxVar) {
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.U("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.q;
        arrayList.remove(vxVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    public final void ae(int i) {
        int iE = e();
        if (i >= 0 && i < iE) {
            ad(h(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + iE);
    }

    public final void af(wd wdVar) {
        List list = this.x;
        if (list == null) {
            return;
        }
        list.remove(wdVar);
    }

    public final void ag(wf wfVar) {
        this.ah.remove(wfVar);
        if (this.ai == wfVar) {
            this.ai = null;
        }
    }

    public final void ah(wg wgVar) {
        List list = this.az;
        if (list != null) {
            list.remove(wgVar);
        }
    }

    public final void ai(int i, int i2, int[] iArr) {
        wv wvVar;
        au();
        V();
        Trace.beginSection("RV Scroll");
        ws wsVar = this.N;
        O(wsVar);
        int iD = i != 0 ? this.o.d(i, this.e, wsVar) : 0;
        int iE = i2 != 0 ? this.o.e(i2, this.e, wsVar) : 0;
        Trace.endSection();
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            View viewD = this.h.d(i3);
            wv wvVarJ = j(viewD);
            if (wvVarJ != null && (wvVar = wvVarJ.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                View view = wvVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W();
        av(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public void aj(int i) {
        if (this.v) {
            return;
        }
        ax();
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wbVar.aa(i);
            awakenScrollBars();
        }
    }

    public final void ak(wx wxVar) {
        this.R = wxVar;
        ley.p(this, wxVar);
    }

    public void al(vo voVar) {
        suppressLayout(false);
        vo voVar2 = this.n;
        if (voVar2 != null) {
            voVar2.C(this.af);
            this.n.h(this);
        }
        ac();
        this.g.j();
        vo voVar3 = this.n;
        this.n = voVar;
        if (voVar != null) {
            voVar.A(this.af);
            voVar.gI(this);
        }
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.bz();
        }
        wj wjVar = this.e;
        vo voVar4 = this.n;
        wjVar.e();
        wjVar.h(voVar3, true);
        wi wiVarB = wjVar.b();
        if (voVar3 != null) {
            wiVarB.d();
        }
        if (wiVarB.b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = wiVarB.a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ArrayList arrayList = ((wh) sparseArray.valueAt(i)).a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ljc.b(((wv) arrayList.get(i2)).a);
                }
                arrayList.clear();
                i++;
            }
        }
        if (voVar4 != null) {
            wiVarB.c();
        }
        wjVar.f();
        this.N.f = true;
        aa(false);
        requestLayout();
    }

    public final void am(vv vvVar) {
        vv vvVar2 = this.E;
        if (vvVar2 != null) {
            vvVar2.c();
            this.E.j = null;
        }
        this.E = vvVar;
        if (vvVar != null) {
            vvVar.j = this.aJ;
        }
    }

    public final void an(int i) {
        wj wjVar = this.e;
        wjVar.e = i;
        wjVar.p();
    }

    public void ao(wb wbVar) {
        if (wbVar == this.o) {
            return;
        }
        ax();
        if (this.o != null) {
            vv vvVar = this.E;
            if (vvVar != null) {
                vvVar.c();
            }
            wb wbVar2 = this.o;
            wj wjVar = this.e;
            wbVar2.aW(wjVar);
            this.o.aX(wjVar);
            wjVar.e();
            if (this.r) {
                this.o.aO(this, wjVar);
            }
            this.o.bh(null);
            this.o = null;
        } else {
            this.e.e();
        }
        sm smVar = this.h;
        smVar.a.d();
        List list = smVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            smVar.e.d((View) list.get(size));
            list.remove(size);
        }
        vm vmVar = smVar.e;
        int iA = vmVar.a();
        for (int i = 0; i < iA; i++) {
            View viewC = vmVar.c(i);
            vmVar.a.G(viewC);
            viewC.clearAnimation();
        }
        vmVar.a.removeAllViews();
        this.o = wbVar;
        if (wbVar != null) {
            if (wbVar.u != null) {
                throw new IllegalArgumentException("LayoutManager " + wbVar + " is already attached to a RecyclerView:" + wbVar.u.o());
            }
            this.o.bh(this);
            if (this.r) {
                this.o.aN(this);
            }
        }
        this.e.p();
        requestLayout();
    }

    public final void ap(wi wiVar) {
        wj wjVar = this.e;
        RecyclerView recyclerView = wjVar.h;
        wjVar.g(recyclerView.n);
        wi wiVar2 = wjVar.g;
        if (wiVar2 != null) {
            wiVar2.d();
        }
        wjVar.g = wiVar;
        wi wiVar3 = wjVar.g;
        if (wiVar3 != null && recyclerView.n != null) {
            wiVar3.c();
        }
        wjVar.f();
    }

    public final void aq(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        if (i != 2) {
            bc();
        }
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.aU(i);
        }
        Y(i);
        List list = this.az;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wg) this.az.get(size)).b(this, i);
            }
        }
    }

    public final void ar(int i, int i2) {
        as(i, i2, null);
    }

    public void as(int i, int i2, Interpolator interpolator) {
        aL(i, i2, null);
    }

    public void at(int i) {
        if (this.v) {
            return;
        }
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wbVar.aq(this, i);
        }
    }

    public final void au() {
        int i = this.aj + 1;
        this.aj = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void av(boolean z) {
        int i = this.aj;
        if (i <= 0) {
            this.aj = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.o != null && this.n != null) {
                fl();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.aj--;
    }

    public final void aw(int i) {
        aP().c(i);
    }

    public final void ax() {
        aq(0);
        bc();
    }

    public final boolean az(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aP().g(i, i2, iArr, iArr2, i3);
    }

    public final int b(wv wvVar) {
        if (wvVar.q(524) || !wvVar.s()) {
            return -1;
        }
        ql qlVar = this.g;
        int i = wvVar.c;
        ArrayList arrayList = qlVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            qk qkVar = (qk) arrayList.get(i2);
            int i3 = qkVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = qkVar.b;
                    if (i4 <= i) {
                        int i5 = qkVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = qkVar.b;
                    if (i6 == i) {
                        i = qkVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (qkVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (qkVar.b <= i) {
                i += qkVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        wv wvVarK = k(view);
        if (wvVarK != null) {
            return wvVarK.fs();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof wc) && this.o.t((wc) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.ae()) {
            return this.o.C(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.ae()) {
            return this.o.D(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.ae()) {
            return this.o.E(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.af()) {
            return this.o.F(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.af()) {
            return this.o.G(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        wb wbVar = this.o;
        if (wbVar != null && wbVar.af()) {
            return this.o.H(this.N);
        }
        return 0;
    }

    public final int d(View view) {
        wv wvVarK = k(view);
        if (wvVarK != null) {
            return wvVarK.gl();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        wb wbVar = this.o;
        int iA = 0;
        if (wbVar == null) {
            return false;
        }
        if (wbVar.af()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    aL(0, measuredHeight, null);
                } else {
                    aL(0, -measuredHeight, null);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAi = wbVar.ai();
                if (keyCode == 122) {
                    if (zAi) {
                        iA = this.n.a();
                    }
                } else if (!zAi) {
                    iA = this.n.a();
                }
                at(iA);
                return true;
            }
        } else if (wbVar.ae()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    aL(measuredWidth, 0, null);
                } else {
                    aL(-measuredWidth, 0, null);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAi2 = wbVar.ai();
                if (keyCode2 == 122) {
                    if (zAi2) {
                        iA = this.n.a();
                    }
                } else if (!zAi2) {
                    iA = this.n.a();
                }
                at(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aP().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aP().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aP().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aP().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((vx) arrayList.get(i)).k(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.j ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.j) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.j ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.j) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.i())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e() {
        return this.q.size();
    }

    final long f(wv wvVar) {
        return this.n.b ? wvVar.e : wvVar.c;
    }

    public final void fk(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = ley.a;
        setMeasuredDimension(wb.ar(i, paddingLeft, getMinimumWidth()), wb.ar(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031d  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void fl() {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.fl():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0166, code lost:
    
        if (r16 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0184, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0187, code lost:
    
        if (r16 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018a, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x019a, code lost:
    
        if ((r5 * r13) >= 0) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final Rect g(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        if (!wcVar.e) {
            return wcVar.d;
        }
        ws wsVar = this.N;
        if (wsVar.g && (wcVar.b() || wcVar.c.t())) {
            return wcVar.d;
        }
        Rect rect = wcVar.d;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.l;
            rect2.set(0, 0, 0, 0);
            ((vx) arrayList.get(i)).a(rect2, view, this, wsVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        wcVar.e = false;
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        wb wbVar = this.o;
        if (wbVar != null) {
            return wbVar.f();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        wb wbVar = this.o;
        if (wbVar != null) {
            return wbVar.h(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.o != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.j;
    }

    public final vx h(int i) {
        int iE = e();
        if (i >= 0 && i < iE) {
            return (vx) this.q.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + iE);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aP().j();
    }

    public final wv i(int i) {
        wv wvVar = null;
        if (this.y) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            wv wvVarK = k(this.h.e(i2));
            if (wvVarK != null && !wvVarK.v() && b(wvVarK) == i) {
                if (!this.h.k(wvVarK.a)) {
                    return wvVarK;
                }
                wvVar = wvVarK;
            }
        }
        return wvVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aP().a;
    }

    public final wv j(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return k(view);
        }
        throw new IllegalArgumentException(a.i(this, view, "View ", " is not a direct child of "));
    }

    public final View m(float f, float f2) {
        int iA = this.h.a();
        while (true) {
            iA--;
            if (iA < 0) {
                return null;
            }
            View viewD = this.h.d(iA);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f >= viewD.getLeft() + translationX && f <= viewD.getRight() + translationX && f2 >= viewD.getTop() + translationY && f2 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
    }

    public final View n(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final String o() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.an = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        this.e.f();
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.aN(this);
        }
        this.Q = false;
        if (b) {
            ThreadLocal threadLocal = ty.a;
            ty tyVar = (ty) threadLocal.get();
            this.L = tyVar;
            if (tyVar == null) {
                this.L = new ty();
                int[] iArr = ley.a;
                Display display = getDisplay();
                float f = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                ty tyVar2 = this.L;
                tyVar2.e = (long) (1.0E9f / f);
                threadLocal.set(tyVar2);
            }
            this.L.c.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ty tyVar;
        super.onDetachedFromWindow();
        vv vvVar = this.E;
        if (vvVar != null) {
            vvVar.c();
        }
        ax();
        int i = 0;
        this.r = false;
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.aO(this, this.e);
        }
        this.T.clear();
        removeCallbacks(this.aE);
        while (zq.a.a() != null) {
        }
        wj wjVar = this.e;
        while (true) {
            ArrayList arrayList = wjVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            ljc.b(((wv) arrayList.get(i)).a);
            i++;
        }
        wjVar.g(wjVar.h.n);
        Iterator itA = new lfd(this).a();
        while (itA.hasNext()) {
            ljc.a((View) itA.next()).a();
        }
        if (!b || (tyVar = this.L) == null) {
            return;
        }
        tyVar.c.remove(this);
        this.L = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((vx) arrayList.get(i)).b(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        float axisValue;
        int i3;
        float f;
        int i4;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        int i5;
        float f2;
        if (this.o != null && !this.v && motionEvent.getAction() == 8) {
            float f3 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.o.af()) {
                    i5 = 9;
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    i5 = 0;
                    f2 = 0.0f;
                }
                if (this.o.ae()) {
                    i2 = i5;
                    z = false;
                    z2 = false;
                    i = 10;
                    f3 = f2;
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    float f4 = f2;
                    axisValue = 0.0f;
                    f3 = f4;
                    i2 = i5;
                    z = false;
                    z2 = false;
                    i = 0;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.o.af()) {
                    f = -axisValue2;
                    i3 = 26;
                    axisValue = 0.0f;
                    i4 = 0;
                } else if (this.o.ae()) {
                    axisValue = axisValue2;
                    i3 = 0;
                    f = 0.0f;
                    i4 = 26;
                } else {
                    i3 = 0;
                    axisValue = 0.0f;
                    f = 0.0f;
                    i4 = 0;
                }
                z2 = this.U;
                i2 = i3;
                z = 26;
                i = i4;
                f3 = f;
            } else {
                z = false;
                z2 = false;
                i = 0;
                i2 = 0;
                axisValue = 0.0f;
            }
            float f5 = f3 * this.J;
            int i6 = (int) (axisValue * this.I);
            int i7 = (int) f5;
            if (z2) {
                OverScroller overScroller = this.K.a;
                aM(i6 + (overScroller.getFinalX() - overScroller.getCurrX()), i7 + (overScroller.getFinalY() - overScroller.getCurrY()), null, true);
                recyclerView = this;
                motionEvent2 = motionEvent;
            } else {
                recyclerView = this;
                motionEvent2 = motionEvent;
                recyclerView.aI(i6, i7, i, i2, motionEvent2);
            }
            if (z && !z2) {
                recyclerView.V.a(motionEvent2, 26);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.ai = null;
        if (bd(motionEvent)) {
            aR();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            ArrayList arrayList = this.ah;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                wf wfVar = (wf) arrayList.get(i);
                if (wfVar != null && wfVar != this.ai) {
                    wfVar.j(this, motionEventObtain);
                }
            }
            return true;
        }
        wb wbVar = this.o;
        if (wbVar == null) {
            return false;
        }
        boolean zAe = wbVar.ae();
        boolean zAf = this.o.af();
        if (this.ar == null) {
            this.ar = VelocityTracker.obtain();
        }
        this.ar.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ak) {
                this.ak = false;
            }
            this.aq = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.au = x;
            this.as = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.av = y;
            this.at = y;
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || lih.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                lih.b(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && lih.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                lih.b(this.C, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && lih.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                lih.b(this.B, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.D;
            if (edgeEffect4 == null || lih.a(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.F == 2) {
                }
                int[] iArr = this.aD;
                iArr[1] = 0;
                iArr[0] = 0;
                bb(0);
            } else {
                lih.b(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            aq(1);
            aw(1);
            int[] iArr2 = this.aD;
            iArr2[1] = 0;
            iArr2[0] = 0;
            bb(0);
        } else if (actionMasked == 1) {
            this.ar.clear();
            aw(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.aq);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.aq + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.F != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.as;
                int i5 = i2 - this.at;
                if (!zAe || Math.abs(i4) <= this.aw) {
                    z2 = false;
                } else {
                    this.au = i3;
                    z2 = true;
                }
                if (zAf && Math.abs(i5) > this.aw) {
                    this.av = i2;
                } else if (z2) {
                }
                aq(1);
            }
        } else if (actionMasked == 3) {
            aR();
        } else if (actionMasked == 5) {
            this.aq = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.au = x3;
            this.as = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.av = y3;
            this.at = y3;
        } else if (actionMasked == 6) {
            aV(motionEvent);
        }
        return this.F == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        fl();
        Trace.endSection();
        this.t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        wb wbVar = this.o;
        if (wbVar == null) {
            fk(i, i2);
            return;
        }
        boolean z = false;
        if (wbVar.ag()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            wb wbVar2 = this.o;
            ws wsVar = this.N;
            wbVar2.bA(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aF = z;
            if (z || this.n == null) {
                return;
            }
            if (wsVar.d == 1) {
                aS();
            }
            this.o.be(i, i2);
            wsVar.i = true;
            aT();
            this.o.bg(i, i2);
            if (this.o.ak()) {
                this.o.be(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                wsVar.i = true;
                aT();
                this.o.bg(i, i2);
            }
            this.aG = getMeasuredWidth();
            this.aH = getMeasuredHeight();
            return;
        }
        if (this.s) {
            this.o.bA(i, i2);
            return;
        }
        if (this.w) {
            au();
            V();
            aW();
            W();
            ws wsVar2 = this.N;
            if (wsVar2.k) {
                wsVar2.g = true;
            } else {
                this.g.e();
                wsVar2.g = false;
            }
            this.w = false;
            av(false);
        } else if (this.N.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        vo voVar = this.n;
        if (voVar != null) {
            this.N.e = voVar.a();
        } else {
            this.N.e = 0;
        }
        au();
        wb wbVar3 = this.o;
        ws wsVar3 = this.N;
        wbVar3.bA(i, i2);
        av(false);
        wsVar3.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (aE()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof wn)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        wn wnVar = (wn) parcelable;
        this.f = wnVar;
        super.onRestoreInstanceState(wnVar.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        wn wnVar = new wn(super.onSaveInstanceState());
        wn wnVar2 = this.f;
        if (wnVar2 != null) {
            wnVar.a = wnVar2.a;
            return wnVar;
        }
        wb wbVar = this.o;
        if (wbVar != null) {
            wnVar.a = wbVar.Q();
            return wnVar;
        }
        wnVar.a = null;
        return wnVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        wv wvVarK = k(view);
        if (wvVarK != null) {
            if (wvVarK.x()) {
                wvVarK.j();
            } else if (!wvVarK.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + wvVarK + o());
            }
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.o.bl() && !aE() && view2 != null) {
            aY(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.o.bm(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.ah;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wf) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aj != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        wb wbVar = this.o;
        if (wbVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zAe = wbVar.ae();
        boolean zAf = this.o.af();
        if (!zAe) {
            if (!zAf) {
                return;
            } else {
                zAf = true;
            }
        }
        aF(true != zAe ? 0 : i, true != zAf ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!aE()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.al |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.j) {
            Q();
        }
        this.j = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aP().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aP().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aP().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            z("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ak = true;
                ax();
                return;
            }
            this.v = false;
            if (this.u && this.o != null && this.n != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void u(wv wvVar) {
        View view = wvVar.a;
        ViewParent parent = view.getParent();
        this.e.o(j(view));
        if (wvVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.h.f(view, -1, true);
            return;
        }
        sm smVar = this.h;
        int iB = smVar.e.b(view);
        if (iB < 0) {
            Objects.toString(view);
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        smVar.a.e(iB);
        smVar.i(view);
    }

    public final void v(vx vxVar) {
        wb wbVar = this.o;
        if (wbVar != null) {
            wbVar.U("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.q;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(vxVar);
        T();
        requestLayout();
    }

    public final void w(wd wdVar) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(wdVar);
    }

    public final void x(wf wfVar) {
        this.ah.add(wfVar);
    }

    public final void y(wg wgVar) {
        if (this.az == null) {
            this.az = new ArrayList();
        }
        this.az.add(wgVar);
    }

    public final void z(String str) {
        if (aE()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(o()));
        }
        if (this.ao > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("".concat(o())));
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i);
        RecyclerView recyclerView = this;
        recyclerView.af = new wl(recyclerView);
        recyclerView.e = new wj(recyclerView);
        recyclerView.i = new zr();
        recyclerView.k = new vh(recyclerView);
        recyclerView.l = new Rect();
        recyclerView.ag = new Rect();
        recyclerView.m = new RectF();
        recyclerView.p = new ArrayList();
        recyclerView.q = new ArrayList();
        recyclerView.ah = new ArrayList();
        recyclerView.aj = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.an = 0;
        recyclerView.ao = 0;
        recyclerView.ap = d;
        recyclerView.E = new te();
        recyclerView.F = 0;
        recyclerView.aq = -1;
        recyclerView.I = Float.MIN_VALUE;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.ay = true;
        recyclerView.K = new wu(recyclerView);
        recyclerView.M = b ? new tw() : null;
        recyclerView.N = new ws();
        recyclerView.O = false;
        recyclerView.P = false;
        recyclerView.aJ = new vw(recyclerView);
        recyclerView.Q = false;
        recyclerView.aA = new int[2];
        recyclerView.aC = new int[2];
        recyclerView.aD = new int[2];
        recyclerView.S = new int[2];
        recyclerView.T = new ArrayList();
        recyclerView.aE = new vi(recyclerView);
        recyclerView.aG = 0;
        recyclerView.aH = 0;
        recyclerView.aK = new vk(recyclerView);
        vl vlVar = new vl(recyclerView);
        recyclerView.aI = vlVar;
        recyclerView.V = new lcx(recyclerView.getContext(), vlVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        recyclerView.aw = viewConfiguration.getScaledTouchSlop();
        recyclerView.I = viewConfiguration.getScaledHorizontalScrollFactor();
        recyclerView.J = viewConfiguration.getScaledVerticalScrollFactor();
        recyclerView.H = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.ax = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ae = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.j = recyclerView.aJ;
        recyclerView.g = new ql(new vn(recyclerView));
        recyclerView.h = new sm(new vm(recyclerView));
        int[] iArr = ley.a;
        if (leq.a(recyclerView) == 0) {
            leq.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.am = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.ak(new wx(recyclerView));
        int[] iArr2 = ma.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ley.o(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.j = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = recyclerView.getContext().getResources();
                new tr(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.fastscroll_margin));
                recyclerView = this;
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.o()));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.U = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.bg(context, string, attributeSet, i);
        int[] iArr3 = ab;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        ley.o(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(com.google.android.apps.messaging.R.id.is_pooling_container_tag, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        wb wbVar = this.o;
        if (wbVar != null) {
            return wbVar.bU(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager".concat(o()));
    }

    public void Y(int i) {
    }
}
