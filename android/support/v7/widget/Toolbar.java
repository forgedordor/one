package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import defpackage.ik;
import defpackage.kt;
import defpackage.ku;
import defpackage.ldd;
import defpackage.ldf;
import defpackage.ley;
import defpackage.ni;
import defpackage.oa;
import defpackage.oc;
import defpackage.of;
import defpackage.oo;
import defpackage.pn;
import defpackage.ps;
import defpackage.st;
import defpackage.xc;
import defpackage.yx;
import defpackage.za;
import defpackage.zb;
import defpackage.zc;
import defpackage.zf;
import defpackage.zg;
import defpackage.zh;
import defpackage.zj;
import defpackage.zm;
import defpackage.zy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ldd {
    public oo A;
    public oa B;
    public boolean C;
    private ImageButton D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private zm O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final za S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public xc r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public final ldf v;
    public ArrayList w;
    public zh x;
    public ps y;
    public zf z;

    public Toolbar(Context context) {
        this(context, null);
    }

    protected static final zg E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zg ? new zg((zg) layoutParams) : layoutParams instanceof ik ? new zg((ik) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new zg((ViewGroup.MarginLayoutParams) layoutParams) : new zg(layoutParams);
    }

    private final int F(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int G(View view, int i) {
        zg zgVar = (zg) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = zgVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - zgVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < zgVar.topMargin) {
            iMax = zgVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < zgVar.bottomMargin) {
                iMax = Math.max(0, iMax - (zgVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int H(View view, int i, int[] iArr, int i2) {
        zg zgVar = (zg) view.getLayoutParams();
        int i3 = zgVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iG = G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iG, iMax + measuredWidth, view.getMeasuredHeight() + iG);
        return iMax + measuredWidth + zgVar.rightMargin;
    }

    private final int I(View view, int i, int[] iArr, int i2) {
        zg zgVar = (zg) view.getLayoutParams();
        int i3 = zgVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iG = G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iG, iMax, view.getMeasuredHeight() + iG);
        return iMax - (measuredWidth + zgVar.leftMargin);
    }

    private final int J(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void K(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                zg zgVar = (zg) childAt.getLayoutParams();
                if (zgVar.b == 0 && Q(childAt) && F(zgVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            zg zgVar2 = (zg) childAt2.getLayoutParams();
            if (zgVar2.b == 0 && Q(childAt2) && F(zgVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void L(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        zg zgVar = layoutParams == null ? new zg() : !checkLayoutParams(layoutParams) ? E(layoutParams) : (zg) layoutParams;
        zgVar.b = 1;
        if (!z || this.h == null) {
            addView(view, zgVar);
        } else {
            view.setLayoutParams(zgVar);
            this.u.add(view);
        }
    }

    private final void M() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void N() {
        n();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuD = actionMenuView.d();
            if (this.z == null) {
                this.z = new zf(this);
            }
            this.a.c.r();
            ((oc) menuD).h(this.z, this.i);
            z();
        }
    }

    private final void O() {
        if (this.D == null) {
            this.D = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            zg zgVar = new zg();
            zgVar.a = (this.m & 112) | 8388611;
            this.D.setLayoutParams(zgVar);
        }
    }

    private final boolean P(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int R(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int S(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void T(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean A() {
        zf zfVar = this.z;
        return (zfVar == null || zfVar.b == null) ? false : true;
    }

    public final boolean B() {
        ps psVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (psVar = actionMenuView.c) == null || !psVar.m()) ? false : true;
    }

    public final boolean C() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.j();
    }

    public final boolean D() {
        ps psVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (psVar = actionMenuView.c) == null || !psVar.p()) ? false : true;
    }

    public final int b() {
        xc xcVar = this.r;
        if (xcVar != null) {
            return xcVar.g ? xcVar.b : xcVar.a;
        }
        return 0;
    }

    public final int c() {
        oc ocVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ocVar = actionMenuView.a) == null || !ocVar.hasVisibleItems()) ? hj() : Math.max(hj(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof zg);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Drawable f() {
        N();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.d();
        pn pnVar = actionMenuView.c.h;
        if (pnVar != null) {
            return pnVar.getDrawable();
        }
        return null;
    }

    public final st g() {
        if (this.O == null) {
            this.O = new zm(this, true);
        }
        return this.O;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zg();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zg(getContext(), attributeSet);
    }

    public final Menu h() {
        N();
        return this.a.d();
    }

    public final int hj() {
        xc xcVar = this.r;
        if (xcVar != null) {
            return xcVar.g ? xcVar.a : xcVar.b;
        }
        return 0;
    }

    public final MenuInflater i() {
        return new ni(getContext());
    }

    public final CharSequence j() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        Menu menuH = h();
        for (int i = 0; i < menuH.size(); i++) {
            arrayList.add(menuH.getItem(i));
        }
        return arrayList;
    }

    public final void l() {
        zf zfVar = this.z;
        of ofVar = zfVar == null ? null : zfVar.b;
        if (ofVar != null) {
            ofVar.collapseActionView();
        }
    }

    public final void m() {
        if (this.r == null) {
            this.r = new xc();
        }
    }

    public final void n() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.g(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.f(this.A, new zc(this));
            zg zgVar = new zg();
            zgVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(zgVar);
            L(this.a, false);
        }
    }

    public void o(int i) {
        i().inflate(i, h());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        z();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.L = r1
            r0 = r2
        Lc:
            boolean r3 = r5.L
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.L = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.L = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02be A[LOOP:0: B:113:0x02bc->B:114:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d6 A[LOOP:1: B:116:0x02d4->B:117:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7 A[LOOP:2: B:119:0x02f5->B:120:0x02f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0345 A[LOOP:3: B:128:0x0343->B:129:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        boolean zA = zy.a(this);
        int i3 = !zA ? 1 : 0;
        int iMax2 = 0;
        if (Q(this.D)) {
            T(this.D, i, 0, i2, this.E);
            measuredWidth = this.D.getMeasuredWidth() + R(this.D);
            iMax = Math.max(0, this.D.getMeasuredHeight() + S(this.D));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.g)) {
            T(this.g, i, 0, i2, this.E);
            measuredWidth = this.g.getMeasuredWidth() + R(this.g);
            iMax = Math.max(iMax, this.g.getMeasuredHeight() + S(this.g));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int[] iArr = this.N;
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zA ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (Q(this.a)) {
            T(this.a, i, iMax3, i2, this.E);
            measuredWidth2 = this.a.getMeasuredWidth() + R(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + S(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i3] = Math.max(0, iC - measuredWidth2);
        if (Q(this.h)) {
            iMax4 += J(this.h, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + S(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        if (Q(this.d)) {
            iMax4 += J(this.d, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.d.getMeasuredHeight() + S(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((zg) childAt.getLayoutParams()).b == 0 && Q(childAt)) {
                iMax4 += J(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + S(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.p + this.q;
        int i7 = this.n + this.o;
        if (Q(this.b)) {
            J(this.b, i, i5 + i7, i2, i6, iArr);
            iMax2 = this.b.getMeasuredWidth() + R(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + S(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (Q(this.c)) {
            iMax2 = Math.max(iMax2, J(this.c, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + S(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof zj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zj zjVar = (zj) parcelable;
        super.onRestoreInstanceState(zjVar.d);
        ActionMenuView actionMenuView = this.a;
        oc ocVar = actionMenuView != null ? actionMenuView.a : null;
        int i = zjVar.a;
        if (i != 0 && this.z != null && ocVar != null && (menuItemFindItem = ocVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (zjVar.b) {
            Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m();
        xc xcVar = this.r;
        boolean z = xcVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        xcVar.g = z2;
        if (!xcVar.h) {
            xcVar.a = xcVar.e;
            xcVar.b = xcVar.f;
            return;
        }
        if (z2) {
            int i2 = xcVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xcVar.e;
            }
            xcVar.a = i2;
            int i3 = xcVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xcVar.f;
            }
            xcVar.b = i3;
            return;
        }
        int i4 = xcVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xcVar.e;
        }
        xcVar.a = i4;
        int i5 = xcVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xcVar.f;
        }
        xcVar.b = i5;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        of ofVar;
        zj zjVar = new zj(super.onSaveInstanceState());
        zf zfVar = this.z;
        if (zfVar != null && (ofVar = zfVar.b) != null) {
            zjVar.a = ofVar.a;
        }
        zjVar.b = C();
        return zjVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(Drawable drawable) {
        if (drawable != null) {
            M();
            if (!P(this.d)) {
                L(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && P(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void q(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            O();
        }
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.D.setTooltipText(charSequence);
        }
    }

    public final void r(int i) {
        s(ku.a(getContext(), i));
    }

    public void s(Drawable drawable) {
        if (drawable != null) {
            O();
            if (!P(this.D)) {
                L(this.D, true);
            }
        } else {
            ImageButton imageButton = this.D;
            if (imageButton != null && P(imageButton)) {
                removeView(this.D);
                this.u.remove(this.D);
            }
        }
        ImageButton imageButton2 = this.D;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void t(View.OnClickListener onClickListener) {
        O();
        this.D.setOnClickListener(onClickListener);
    }

    public final void u(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void v(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && P(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!P(this.c)) {
                L(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void w(int i) {
        x(getContext().getText(i));
    }

    public void x(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && P(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!P(this.b)) {
                L(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void y(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void z() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!A() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.C) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    final Runnable runnable = new Runnable() { // from class: yy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.l();
                        }
                    };
                    this.P = new OnBackInvokedCallback() { // from class: ze
                        public final void onBackInvoked() {
                            runnable.run();
                        }
                    };
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                this.Q = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return E(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.u = new ArrayList();
        this.N = new int[2];
        this.v = new ldf(new Runnable() { // from class: yz
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar toolbar = this.a;
                ArrayList arrayList = toolbar.w;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    toolbar.h().removeItem(((MenuItem) arrayList.get(i2)).getItemId());
                }
                Menu menuH = toolbar.h();
                ArrayList arrayListK = toolbar.k();
                toolbar.v.a(menuH, toolbar.i());
                ArrayList arrayListK2 = toolbar.k();
                arrayListK2.removeAll(arrayListK);
                toolbar.w = arrayListK2;
            }
        });
        this.w = new ArrayList();
        this.S = new za(this);
        this.R = new zb(this);
        Context context2 = getContext();
        int[] iArr = kt.A;
        yx yxVarL = yx.l(context2, attributeSet, iArr, i, 0);
        ley.o(this, context, iArr, attributeSet, yxVarL.b, i, 0);
        this.k = yxVarL.f(28, 0);
        this.l = yxVarL.f(19, 0);
        this.H = yxVarL.d(0, this.H);
        this.m = yxVarL.d(2, 48);
        int iA = yxVarL.a(22, 0);
        iA = yxVarL.q(27) ? yxVarL.a(27, iA) : iA;
        this.q = iA;
        this.p = iA;
        this.o = iA;
        this.n = iA;
        int iA2 = yxVarL.a(25, -1);
        if (iA2 >= 0) {
            this.n = iA2;
        }
        int iA3 = yxVarL.a(24, -1);
        if (iA3 >= 0) {
            this.o = iA3;
        }
        int iA4 = yxVarL.a(26, -1);
        if (iA4 >= 0) {
            this.p = iA4;
        }
        int iA5 = yxVarL.a(23, -1);
        if (iA5 >= 0) {
            this.q = iA5;
        }
        this.E = yxVarL.b(13, -1);
        int iA6 = yxVarL.a(9, Integer.MIN_VALUE);
        int iA7 = yxVarL.a(5, Integer.MIN_VALUE);
        int iB = yxVarL.b(7, 0);
        int iB2 = yxVarL.b(8, 0);
        m();
        xc xcVar = this.r;
        xcVar.h = false;
        if (iB != Integer.MIN_VALUE) {
            xcVar.e = iB;
            xcVar.a = iB;
        }
        if (iB2 != Integer.MIN_VALUE) {
            xcVar.f = iB2;
            xcVar.b = iB2;
        }
        if (iA6 != Integer.MIN_VALUE || iA7 != Integer.MIN_VALUE) {
            xcVar.a(iA6, iA7);
        }
        this.F = yxVarL.a(10, Integer.MIN_VALUE);
        this.G = yxVarL.a(6, Integer.MIN_VALUE);
        this.e = yxVarL.h(4);
        this.f = yxVarL.m(3);
        CharSequence charSequenceM = yxVarL.m(21);
        if (!TextUtils.isEmpty(charSequenceM)) {
            x(charSequenceM);
        }
        CharSequence charSequenceM2 = yxVarL.m(18);
        if (!TextUtils.isEmpty(charSequenceM2)) {
            v(charSequenceM2);
        }
        this.i = getContext();
        u(yxVarL.f(17, 0));
        Drawable drawableH = yxVarL.h(16);
        if (drawableH != null) {
            s(drawableH);
        }
        CharSequence charSequenceM3 = yxVarL.m(15);
        if (!TextUtils.isEmpty(charSequenceM3)) {
            q(charSequenceM3);
        }
        Drawable drawableH2 = yxVarL.h(11);
        if (drawableH2 != null) {
            p(drawableH2);
        }
        CharSequence charSequenceM4 = yxVarL.m(12);
        if (!TextUtils.isEmpty(charSequenceM4)) {
            if (!TextUtils.isEmpty(charSequenceM4)) {
                M();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceM4);
            }
        }
        if (yxVarL.q(29)) {
            y(yxVarL.g(29));
        }
        if (yxVarL.q(20)) {
            ColorStateList colorStateListG = yxVarL.g(20);
            this.J = colorStateListG;
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(colorStateListG);
            }
        }
        if (yxVarL.q(14)) {
            o(yxVarL.f(14, 0));
        }
        yxVarL.o();
    }
}
