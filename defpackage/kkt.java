package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kkt extends ViewGroup implements ldl, hmh, jfi, ldn {
    public static final fdap a = kkb.a;
    public final iqt b;
    public final View c;
    public final jfh d;
    public fdae e;
    public boolean f;
    public final fdae g;
    public fdae h;
    public ics i;
    public final fdap j;
    public kio k;
    public final fdap l;
    public lvj m;
    public pjb n;
    public final int[] o;
    public long p;
    public lgt q;
    public final fdae r;
    public final fdap s;
    public int t;
    public int u;
    public boolean v;
    public final jcr w;
    private final fdae x;
    private final int[] y;
    private final ldm z;

    public kkt(Context context, hnb hnbVar, iqt iqtVar, View view, jfh jfhVar) {
        super(context);
        this.b = iqtVar;
        this.c = view;
        this.d = jfhVar;
        jpq.b(this, hnbVar);
        setSaveFromParentEnabled(false);
        addView(view);
        kjz kjzVar = new kjz(this);
        int[] iArr = ley.a;
        lgb.d(this, kjzVar);
        len.k(this, this);
        this.e = kks.a;
        this.g = kkp.a;
        this.h = kko.a;
        ico icoVar = ics.e;
        this.i = icoVar;
        this.k = new kip(1.0f);
        this.o = new int[2];
        this.p = 0L;
        this.r = new kkr(this);
        this.x = new kkq(this);
        this.y = new int[2];
        this.t = Integer.MIN_VALUE;
        this.u = Integer.MIN_VALUE;
        this.z = new ldm();
        jcr jcrVar = new jcr(false, 3, null);
        jcrVar.h = true;
        jcrVar.l = this;
        ics icsVarC = jsh.c(iqu.a(icoVar, kkv.a, iqtVar), true, kkj.a);
        iss issVar = new iss();
        issVar.a = new isw(this);
        itc itcVar = new itc();
        issVar.e(itcVar);
        this.s = itcVar;
        ics icsVarA = ixy.a(ifb.a(ijn.c(icsVarC.a(issVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 524287), new kkk(this, jcrVar, this)), new kkl(this, jcrVar));
        jcrVar.i(this.i.a(icsVarA));
        this.j = new kkc(jcrVar, icsVarA);
        jcrVar.ag(this.k);
        this.l = new kkd(jcrVar);
        jcrVar.y = new kke(this, jcrVar);
        jcrVar.z = new kkf(this);
        jcrVar.h(new kki(this, jcrVar));
        this.w = jcrVar;
    }

    public static final kzc l(kzc kzcVar, int i, int i2, int i3, int i4) {
        int i5 = kzcVar.b - i;
        int i6 = kzcVar.c - i2;
        int i7 = kzcVar.d - i3;
        int i8 = kzcVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return kzc.d(i5, i6, i7, i8);
    }

    public static final int m(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(fddu.i(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.jfi
    public final boolean B() {
        return isAttachedToWindow();
    }

    @Override // defpackage.hmh
    public final void b() {
        removeAllViewsInLayout();
    }

    @Override // defpackage.hmh
    public final void c() {
        this.h.invoke();
    }

    @Override // defpackage.ldk
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            iqt iqtVar = this.b;
            float fA = kkv.a(i);
            float fA2 = kkv.a(i2);
            long jB = iqtVar.b((Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32), kkv.c(i3));
            iArr[0] = jnr.a(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = jnr.a(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // defpackage.ldk
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            iqt iqtVar = this.b;
            float fA = kkv.a(i);
            float fA2 = kkv.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = kkv.a(i3);
            float fA4 = kkv.a(i4);
            iqtVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fA3) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L), kkv.c(i5));
        }
    }

    @Override // defpackage.ldn
    public final lgt ez(View view, lgt lgtVar) {
        this.q = new lgt(lgtVar);
        return j(lgtVar);
    }

    @Override // defpackage.ldl
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            iqt iqtVar = this.b;
            float fA = kkv.a(i);
            float fA2 = kkv.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = kkv.a(i3);
            float fA4 = kkv.a(i4);
            long jA = iqtVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fA3) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L), kkv.c(i5));
            iArr[0] = jnr.a(Float.intBitsToFloat((int) (jA >> 32)));
            iArr[1] = jnr.a(Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    @Override // defpackage.ldk
    public final void g(View view, View view2, int i, int i2) {
        this.z.b(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.y;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.z.a();
    }

    @Override // defpackage.ldk
    public final void h(View view, int i) {
        this.z.c(i);
    }

    public final jfr i() {
        if (!isAttachedToWindow()) {
            itw.d("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.j();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        k();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final lgt j(lgt lgtVar) {
        kzc kzcVarF = lgtVar.f(-1);
        kzc kzcVar = kzc.a;
        if (kzcVarF.equals(kzcVar) && lgtVar.g(-9).equals(kzcVar) && lgtVar.j() == null) {
            return lgtVar;
        }
        jer jerVarW = this.w.w();
        if (!jerVarW.u()) {
            return lgtVar;
        }
        long jC = kjc.c(ivz.a(jerVarW));
        int iA = kjb.a(jC);
        if (iA < 0) {
            iA = 0;
        }
        int iB = kjb.b(jC);
        if (iB < 0) {
            iB = 0;
        }
        long jG = ivz.g(jerVarW).g();
        long j = jG >> 32;
        long j2 = jG & 4294967295L;
        long j3 = jerVarW.c;
        long jC2 = kjc.c(jerVarW.j((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
        int iA2 = ((int) j) - kjb.a(jC2);
        if (iA2 < 0) {
            iA2 = 0;
        }
        int iB2 = ((int) j2) - kjb.b(jC2);
        int i = iB2 >= 0 ? iB2 : 0;
        return (iA == 0 && iB == 0 && iA2 == 0 && i == 0) ? lgtVar : lgtVar.n(iA, iB, iA2, i);
    }

    public final void k() {
        if (!this.v) {
            this.w.O();
            return;
        }
        View view = this.c;
        final fdae fdaeVar = this.x;
        view.postOnAnimation(new Runnable() { // from class: kjy
            @Override // java.lang.Runnable
            public final void run() {
                fdaeVar.invoke();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.c;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.t = i;
        this.u = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float fB = kkv.b(f);
        float fB2 = kkv.b(f2);
        fdil.d(this.b.f(), null, null, new kkm(z, this, kjp.a(fB, fB2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float fB = kkv.b(f);
        float fB2 = kkv.b(f2);
        fdil.d(this.b.f(), null, null, new kkn(this, kjp.a(fB, fB2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        fdap fdapVar = this.s;
        if (fdapVar != null) {
            fdapVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.ldk
    public final boolean t(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }
}
