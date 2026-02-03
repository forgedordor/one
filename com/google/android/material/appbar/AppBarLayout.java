package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.eecd;
import defpackage.eecm;
import defpackage.eecn;
import defpackage.eeco;
import defpackage.eecq;
import defpackage.eecr;
import defpackage.eecu;
import defpackage.eede;
import defpackage.eedf;
import defpackage.eedg;
import defpackage.eedj;
import defpackage.eehg;
import defpackage.eejo;
import defpackage.eemh;
import defpackage.eenh;
import defpackage.eepx;
import defpackage.eepy;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eexh;
import defpackage.ktx;
import defpackage.kty;
import defpackage.kub;
import defpackage.kzz;
import defpackage.ldi;
import defpackage.len;
import defpackage.ley;
import defpackage.lgt;
import defpackage.ljg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements ktx {
    public boolean a;
    public int b;
    public lgt c;
    public boolean d;
    public boolean e;
    public final List f;
    public final LinkedHashSet g;
    public Drawable h;
    public Integer i;
    public final float j;
    private int k;
    private int l;
    private int m;
    private int n;
    private List o;
    private boolean p;
    private int q;
    private WeakReference r;
    private final boolean s;
    private ValueAnimator t;
    private ValueAnimator.AnimatorUpdateListener u;
    private final long v;
    private final TimeInterpolator w;
    private int[] x;
    private Behavior y;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: PG */
    public static class BaseBehavior<T extends AppBarLayout> extends eede<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private eecq e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((kub) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (ley.a(coordinatorLayout) != null) {
                return;
            }
            ley.p(coordinatorLayout, new eeco(this, appBarLayout, coordinatorLayout));
        }

        private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iG = appBarLayout.g() + appBarLayout.getPaddingTop();
            int iZ = z() - iG;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                eecu eecuVar = (eecu) childAt.getLayoutParams();
                if (M(eecuVar.a, 32)) {
                    top -= eecuVar.topMargin;
                    bottom += eecuVar.bottomMargin;
                }
                int i2 = -iZ;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                eecu eecuVar2 = (eecu) childAt2.getLayoutParams();
                int i3 = eecuVar2.a;
                if ((i3 & 17) == 17) {
                    int iG2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iG2 -= appBarLayout.g();
                    }
                    if (M(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (M(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iZ < minimumHeight2) {
                            iG2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (M(i3, 32)) {
                        iG2 += eecuVar2.topMargin;
                        minimumHeight -= eecuVar2.bottomMargin;
                    }
                    if (iZ < (minimumHeight + iG2) / 2) {
                        iG2 = minimumHeight;
                    }
                    N(coordinatorLayout, appBarLayout, kzz.b(iG2 + iG, -appBarLayout.h(), 0));
                }
            }
        }

        private static boolean M(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float fAbs = Math.abs(z() - i);
            float fAbs2 = Math.abs(0.0f);
            int iRound = fAbs2 > 0.0f ? Math.round((fAbs / fAbs2) * 1000.0f) * 3 : (int) (((fAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iZ = z();
            if (iZ == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(eecd.e);
                this.d.addUpdateListener(new eecn(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(iRound, 600));
            this.d.setIntValues(iZ, i);
            this.d.start();
        }

        private static final View O(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof ldi) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void P(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                eecu r0 = (defpackage.eecu) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5b
                int r1 = r5.getMinimumHeight()
                r3 = 1
                if (r10 <= 0) goto L49
                r10 = r0 & 12
                if (r10 == 0) goto L49
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.g()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L49:
                r10 = r0 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.g()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L5b:
                r3 = r2
            L5c:
                boolean r9 = r8.e
                if (r9 == 0) goto L68
                android.view.View r9 = O(r7)
                boolean r3 = r8.p(r9)
            L68:
                boolean r9 = r8.r(r3)
                if (r11 != 0) goto La4
                if (r9 == 0) goto Lcb
                kug r7 = r7.e
                java.util.ArrayList r7 = r7.a(r8)
                if (r7 != 0) goto L79
                goto L7e
            L79:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r7)
            L7e:
                if (r4 != 0) goto L82
                java.util.List r4 = java.util.Collections.EMPTY_LIST
            L82:
                int r7 = r4.size()
            L86:
                if (r2 >= r7) goto Lcb
                java.lang.Object r9 = r4.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                kub r9 = (defpackage.kub) r9
                kty r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r7 = r9.d
                if (r7 == 0) goto Lcb
                goto La4
            La1:
                int r2 = r2 + 1
                goto L86
            La4:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb1
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb1:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lbe
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lbe:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lcb
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lcb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.P(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
        @Override // defpackage.eede
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ int A(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 331
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        final eecq B(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = ljg.c;
                    }
                    eecq eecqVar = new eecq(parcelable);
                    boolean z = I == 0;
                    eecqVar.b = z;
                    eecqVar.a = !z && (-I) >= appBarLayout.h();
                    eecqVar.e = i;
                    eecqVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.g();
                    eecqVar.f = bottom / childAt.getHeight();
                    return eecqVar;
                }
            }
            return null;
        }

        @Override // defpackage.eede
        public final /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            L(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.r(appBarLayout.p(O(coordinatorLayout)));
            }
        }

        final void D(eecq eecqVar, boolean z) {
            if (this.e == null || z) {
                this.e = eecqVar;
            }
        }

        @Override // defpackage.eede
        public final /* bridge */ /* synthetic */ boolean E(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.eedh, defpackage.kty
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            eecq eecqVar = this.e;
            if (eecqVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.h();
                        if (i3 != 0) {
                            N(coordinatorLayout, appBarLayout, i4);
                        } else {
                            H(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            N(coordinatorLayout, appBarLayout, 0);
                        } else {
                            H(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (eecqVar.a) {
                H(coordinatorLayout, appBarLayout, -appBarLayout.h());
            } else if (eecqVar.b) {
                H(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(eecqVar.e);
                H(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.e.g ? childAt.getMinimumHeight() + appBarLayout.g() : Math.round(childAt.getHeight() * this.e.f)));
            }
            appBarLayout.b = 0;
            this.e = null;
            J(kzz.b(I(), -appBarLayout.h(), 0));
            P(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.k(I());
            K(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((kub) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            if (!(parcelable instanceof eecq)) {
                this.e = null;
            } else {
                D((eecq) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            eecq eecqVarB = B(absSavedState, (AppBarLayout) view);
            return eecqVarB == null ? absSavedState : eecqVarB;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        @Override // defpackage.kty
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L25
                if (r11 >= 0) goto Lf
                int r10 = r8.h()
                int r10 = -r10
                int r13 = r8.d()
                int r13 = r13 + r10
                goto L15
            Lf:
                int r10 = r8.h()
                int r10 = -r10
                r13 = 0
            L15:
                r4 = r10
                r5 = r13
                if (r4 == r5) goto L25
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.G(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L26
            L25:
                r2 = r8
            L26:
                boolean r7 = r2.e
                if (r7 == 0) goto L31
                boolean r7 = r2.p(r9)
                r2.r(r7)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // defpackage.kty
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i6;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i6 = i4;
                iArr[1] = G(coordinatorLayout2, appBarLayout2, i6, -appBarLayout.e(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i6 = i4;
            }
            if (i6 == 0) {
                K(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // defpackage.kty
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.c == 0 || i == 1) {
                L(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.r(appBarLayout.p(view));
                }
            }
            this.f = new WeakReference(view);
        }

        @Override // defpackage.kty
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.h() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        @Override // defpackage.eede
        public final /* bridge */ /* synthetic */ int x(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.e()) + appBarLayout.g();
        }

        @Override // defpackage.eede
        public final /* synthetic */ int y(View view) {
            return ((AppBarLayout) view).h();
        }

        @Override // defpackage.eede
        public final int z() {
            return I() + this.a;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public static class ScrollingViewBehavior extends eedf {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout w(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.eedh, defpackage.kty
        public /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.kty
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutW = w(coordinatorLayout.a(view));
            if (appBarLayoutW != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutW.n(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.kty
        public final boolean k(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.kty
        public void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            kty ktyVar = ((kub) view2.getLayoutParams()).a;
            if (ktyVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) ktyVar).a) + this.c) - x(view2);
                int[] iArr = ley.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.r(appBarLayout.p(view));
                }
            }
        }

        @Override // defpackage.kty
        public final void m(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ley.p(coordinatorLayout, null);
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            lgt lgtVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewV = v(coordinatorLayout.a(view));
            if (viewV == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (viewV.getFitsSystemWindows() && (lgtVar = coordinatorLayout.f) != null) {
                size += lgtVar.d() + lgtVar.a();
            }
            int iU = size + u(viewV);
            int measuredHeight = viewV.getMeasuredHeight();
            if (z()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iU -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iU, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // defpackage.eedf
        public final float t(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iH = appBarLayout.h();
            int iD = appBarLayout.d();
            kty ktyVar = ((kub) appBarLayout.getLayoutParams()).a;
            int iZ = ktyVar instanceof BaseBehavior ? ((BaseBehavior) ktyVar).z() : 0;
            if ((iD == 0 || iH + iZ > iD) && (i = iH - iD) != 0) {
                return (iZ / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.eedf
        public final int u(View view) {
            return ((AppBarLayout) view).h();
        }

        @Override // defpackage.eedf
        public final /* bridge */ /* synthetic */ View v(List list) {
            return w(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eedg.f);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private final void b() {
        Behavior behavior = this.y;
        eecq eecqVarB = null;
        if (behavior != null && this.l != -1 && this.b == 0) {
            eecqVarB = behavior.B(ljg.c, this);
        }
        this.l = -1;
        this.m = -1;
        this.n = -1;
        if (eecqVarB != null) {
            this.y.D(eecqVarB, false);
        }
    }

    private final void c(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    protected static eecu q(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new eecu((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new eecu((ViewGroup.MarginLayoutParams) layoutParams) : new eecu(layoutParams);
    }

    private final void s(float f, float f2) {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.v);
        this.t.setInterpolator(this.w);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.u;
        if (animatorUpdateListener != null) {
            this.t.addUpdateListener(animatorUpdateListener);
        }
        this.t.start();
    }

    private final boolean t() {
        return this.h != null && g() > 0;
    }

    private final boolean u() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    public kty a() {
        Behavior behavior = new Behavior();
        this.y = behavior;
        return behavior;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eecu;
    }

    public final int d() {
        int iMin;
        int minimumHeight;
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                eecu eecuVar = (eecu) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = eecuVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = eecuVar.topMargin + eecuVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - g());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - g());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.m = iMax;
        return iMax;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.k);
            this.h.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.h;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                eecu eecuVar = (eecu) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + eecuVar.topMargin + eecuVar.bottomMargin;
                int i3 = eecuVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.n = iMax;
        return iMax;
    }

    public final int f() {
        int iG = g();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + iG;
    }

    final int g() {
        lgt lgtVar = this.c;
        if (lgtVar != null) {
            return lgtVar.d();
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eecu();
    }

    public final int h() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                eecu eecuVar = (eecu) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = eecuVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + eecuVar.topMargin + eecuVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= g();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.l = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final eecu generateLayoutParams(AttributeSet attributeSet) {
        return new eecu(getContext(), attributeSet);
    }

    public final void j(eecr eecrVar) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        if (eecrVar == null || this.o.contains(eecrVar)) {
            return;
        }
        this.o.add(eecrVar);
    }

    final void k(int i) {
        this.k = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.o;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                eecr eecrVar = (eecr) this.o.get(i2);
                if (eecrVar != null) {
                    eecrVar.gR(this, i);
                }
            }
        }
    }

    public final void l(eecr eecrVar) {
        List list = this.o;
        if (list != null) {
            list.remove(eecrVar);
        }
    }

    public final void m(boolean z) {
        n(z, isLaidOut());
    }

    public final void n(boolean z, boolean z2) {
        c(z, z2, true);
    }

    public final void o() {
        setWillNotDraw(!t());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        eesd.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.x == null) {
            this.x = new int[4];
        }
        int[] iArr = this.x;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.p;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970587 : R.attr.state_liftable;
        if (z2) {
            i = this.d ? R.attr.state_lifted : -2130970588;
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970583;
        int i2 = -2130970582;
        if (z && this.d) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.r = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && u()) {
            int iG = g();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int[] iArr = ley.a;
                childAt.offsetTopAndBottom(iG);
            }
        }
        b();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((eecu) getChildAt(i5).getLayoutParams()).c != null) {
                this.a = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), g());
        }
        if (this.e) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((eecu) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.p != z2) {
            this.p = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && u()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = kzz.b(getMeasuredHeight() + g(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += g();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        b();
    }

    final boolean p(View view) {
        int i;
        if (this.r == null && (i = this.q) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.q);
            }
            if (viewFindViewById != null) {
                this.r = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.r;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    final boolean r(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        refreshDrawableState();
        if (getBackground() instanceof eesc) {
            if (this.s) {
                s(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            } else if (this.e) {
                s(z ? 0.0f : this.j, z ? this.j : 0.0f);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eesd.b(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new eecu();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Throwable th;
        final AppBarLayout appBarLayout;
        super(eexh.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.b = 0;
        this.f = new ArrayList();
        this.g = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = eedj.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = eedj.a;
        Context context3 = getContext();
        TypedArray typedArrayA = eemh.a(context3, attributeSet, eedj.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                try {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayA.recycle();
                    throw th;
                }
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = eemh.a(context2, attributeSet, eedg.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            setBackground(typedArrayA2.getDrawable(0));
            final ColorStateList colorStateListC = eepy.c(context2, typedArrayA2, 6);
            this.s = colorStateListC != null;
            final ColorStateList colorStateListA = eejo.a(getBackground());
            if (colorStateListA != null) {
                final eesc eescVar = new eesc();
                eescVar.P(colorStateListA);
                if (colorStateListC != null) {
                    final Integer numH = eehg.h(getContext(), R.attr.colorSurface);
                    appBarLayout = this;
                    appBarLayout.u = new ValueAnimator.AnimatorUpdateListener() { // from class: eeck
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int iF = eehg.f(colorStateListA.getDefaultColor(), colorStateListC.getDefaultColor(), fFloatValue);
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
                            eesc eescVar2 = eescVar;
                            eescVar2.P(colorStateListValueOf);
                            AppBarLayout appBarLayout2 = this.a;
                            if (appBarLayout2.h != null && (num = appBarLayout2.i) != null && num.equals(numH)) {
                                appBarLayout2.h.setTint(iF);
                            }
                            List<eecv> list = appBarLayout2.f;
                            if (!list.isEmpty()) {
                                for (eecv eecvVar : list) {
                                    if (eescVar2.D() != null) {
                                        eecvVar.a();
                                    }
                                }
                            }
                            LinkedHashSet linkedHashSet = appBarLayout2.g;
                            if (linkedHashSet.isEmpty()) {
                                return;
                            }
                            Iterator it = linkedHashSet.iterator();
                            while (it.hasNext()) {
                                ((eecw) it.next()).a(fFloatValue);
                            }
                        }
                    };
                    setBackground(eescVar);
                } else {
                    appBarLayout = this;
                    eescVar.L(context2);
                    appBarLayout.u = new ValueAnimator.AnimatorUpdateListener() { // from class: eecl
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            eescVar.O(fFloatValue);
                            AppBarLayout appBarLayout2 = this.a;
                            Drawable drawable = appBarLayout2.h;
                            if (drawable instanceof eesc) {
                                ((eesc) drawable).O(fFloatValue);
                            }
                            Iterator it = appBarLayout2.f.iterator();
                            while (it.hasNext()) {
                                ((eecv) it.next()).a();
                            }
                            Iterator it2 = appBarLayout2.g.iterator();
                            while (it2.hasNext()) {
                                ((eecw) it2.next()).a(fFloatValue / appBarLayout2.j);
                            }
                        }
                    };
                    setBackground(eescVar);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.v = eepx.a(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            appBarLayout.w = eenh.a(context2, R.attr.motionEasingStandardInterpolator, eecd.a);
            if (typedArrayA2.hasValue(4)) {
                c(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                eedj.a(this, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            if (typedArrayA2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            appBarLayout.j = getResources().getDimension(R.dimen.design_appbar_elevation);
            appBarLayout.e = typedArrayA2.getBoolean(5, false);
            appBarLayout.q = typedArrayA2.getResourceId(7, -1);
            Drawable drawable = typedArrayA2.getDrawable(8);
            Drawable drawable2 = appBarLayout.h;
            if (drawable2 != drawable) {
                Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                appBarLayout.h = drawableMutate;
                if (drawableMutate instanceof eesc) {
                    numValueOf = Integer.valueOf(((eesc) drawableMutate).w);
                } else {
                    ColorStateList colorStateListA2 = eejo.a(drawableMutate);
                    if (colorStateListA2 != null) {
                        numValueOf = Integer.valueOf(colorStateListA2.getDefaultColor());
                    }
                }
                appBarLayout.i = numValueOf;
                Drawable drawable3 = appBarLayout.h;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        appBarLayout.h.setState(getDrawableState());
                    }
                    appBarLayout.h.setLayoutDirection(getLayoutDirection());
                    appBarLayout.h.setVisible(getVisibility() == 0, false);
                    appBarLayout.h.setCallback(this);
                }
                o();
                postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            eecm eecmVar = new eecm(this);
            int[] iArr3 = ley.a;
            len.k(this, eecmVar);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }
}
