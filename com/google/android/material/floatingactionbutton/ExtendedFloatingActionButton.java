package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.eeci;
import defpackage.eejt;
import defpackage.eejy;
import defpackage.eejz;
import defpackage.eeka;
import defpackage.eekb;
import defpackage.eekc;
import defpackage.eekd;
import defpackage.eeke;
import defpackage.eekf;
import defpackage.eekg;
import defpackage.eekh;
import defpackage.eeki;
import defpackage.eekj;
import defpackage.eekk;
import defpackage.eekt;
import defpackage.eeku;
import defpackage.eeld;
import defpackage.eemh;
import defpackage.eesj;
import defpackage.eexh;
import defpackage.ktx;
import defpackage.kty;
import defpackage.kub;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements ktx {
    public static final Property k = new eekd(Float.class);
    public static final Property l = new eeke(Float.class);
    public static final Property m = new eekf(Float.class);
    public static final Property n = new eekg(Float.class);
    public static final /* synthetic */ int w = 0;
    private final eekt A;
    private final eekt B;
    private final eekt C;
    private final int D;
    private final kty E;
    private final int F;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public ColorStateList t;
    public int u;
    public int v;
    private boolean x;
    private final eejt y;
    private final eekt z;

    /* compiled from: PG */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends kty<T> {
        private Rect a;
        private final boolean b;
        private final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        private static boolean v(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof kub) {
                return ((kub) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean w(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((kub) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!w(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            eeld.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                u(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        private final boolean y(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!w(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((kub) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                u(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        @Override // defpackage.kty
        public final void a(kub kubVar) {
            if (kubVar.h == 0) {
                kubVar.h = 80;
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List listA = coordinatorLayout.a(extendedFloatingActionButton);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) listA.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (v(view2) && y(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (x(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(extendedFloatingActionButton, i);
            return true;
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else if (v(view2)) {
                y(view2, extendedFloatingActionButton);
            }
        }

        @Override // defpackage.kty
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            return false;
        }

        protected final void t(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.v(true != this.c ? 0 : 3);
        }

        protected final void u(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.v(true == this.c ? 2 : 1);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eeku.b);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    private final void w() {
        this.t = getTextColors();
    }

    @Override // defpackage.ktx
    public final kty a() {
        return this.E;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r && TextUtils.isEmpty(getText()) && ((MaterialButton) this).d != null) {
            this.r = false;
            this.z.i();
        }
    }

    public final int p() {
        return (q() - this.e) / 2;
    }

    public final int q() {
        int i = this.D;
        if (i >= 0) {
            return i;
        }
        int iMin = Math.min(getPaddingStart(), getPaddingEnd());
        return iMin + iMin + this.e;
    }

    public final void r() {
        v(1);
    }

    public final void s() {
        v(2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = i;
        this.q = i3;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        w();
    }

    public final void t(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final boolean u() {
        return getVisibility() != 0 ? this.o == 2 : this.o != 1;
    }

    public final void v(int i) {
        eekt eektVar = i != 0 ? i != 1 ? i != 2 ? this.A : this.z : this.C : this.B;
        if (eektVar.j()) {
            return;
        }
        if (this.x) {
            if (!isLaidOut()) {
                u();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.u = layoutParams.width;
                        this.v = layoutParams.height;
                    } else {
                        this.u = getWidth();
                        this.v = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet animatorSetA = eektVar.a();
                animatorSetA.addListener(new eekc(eektVar));
                Iterator it = eektVar.d().iterator();
                while (it.hasNext()) {
                    animatorSetA.addListener((Animator.AnimatorListener) it.next());
                }
                animatorSetA.start();
                return;
            }
        }
        eektVar.i();
        eektVar.k();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(eexh.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.o = 0;
        this.x = true;
        eejt eejtVar = new eejt();
        this.y = eejtVar;
        eekj eekjVar = new eekj(this, eejtVar);
        this.B = eekjVar;
        eeki eekiVar = new eeki(this, eejtVar);
        this.C = eekiVar;
        this.r = true;
        this.s = false;
        Context context2 = getContext();
        this.E = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eeku.a, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        eeci eeciVarB = eeci.b(context2, typedArrayA, 5);
        eeci eeciVarB2 = eeci.b(context2, typedArrayA, 4);
        eeci eeciVarB3 = eeci.b(context2, typedArrayA, 2);
        eeci eeciVarB4 = eeci.b(context2, typedArrayA, 6);
        this.D = typedArrayA.getDimensionPixelSize(0, -1);
        int i2 = typedArrayA.getInt(3, 1);
        this.F = i2;
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
        eejt eejtVar2 = new eejt();
        eekk eejzVar = new eejz(this);
        eekk eekaVar = new eeka(this, eejzVar);
        eekk eekbVar = new eekb(this, eekaVar, eejzVar);
        boolean z = true;
        if (i2 != 1) {
            eejzVar = i2 != 2 ? eekbVar : eekaVar;
            z = true;
        }
        eekh eekhVar = new eekh(this, eejtVar2, eejzVar, z);
        this.A = eekhVar;
        eekh eekhVar2 = new eekh(this, eejtVar2, new eejy(this), false);
        this.z = eekhVar2;
        eekjVar.b = eeciVarB;
        eekiVar.b = eeciVarB2;
        eekhVar.b = eeciVarB3;
        eekhVar2.b = eeciVarB4;
        typedArrayA.recycle();
        fx(new eesj(eesj.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, eesj.a)));
        w();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        w();
    }
}
