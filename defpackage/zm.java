package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zm implements st {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private ps m;
    private int n;
    private Drawable o;

    public zm(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.d = toolbar.s;
        this.k = toolbar.t;
        this.j = this.d != null;
        this.i = toolbar.e();
        yx yxVarL = yx.l(toolbar.getContext(), null, kt.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = yxVarL.h(15);
        if (z) {
            CharSequence charSequenceM = yxVarL.m(27);
            if (!TextUtils.isEmpty(charSequenceM)) {
                t(charSequenceM);
            }
            CharSequence charSequenceM2 = yxVarL.m(25);
            if (!TextUtils.isEmpty(charSequenceM2)) {
                s(charSequenceM2);
            }
            Drawable drawableH = yxVarL.h(20);
            if (drawableH != null) {
                l(drawableH);
            }
            Drawable drawableH2 = yxVarL.h(17);
            if (drawableH2 != null) {
                this.g = drawableH2;
                K();
            }
            if (this.i == null && (drawable = this.o) != null) {
                r(drawable);
            }
            k(yxVarL.c(10, 0));
            int iF = yxVarL.f(9, 0);
            if (iF != 0) {
                j(LayoutInflater.from(toolbar.getContext()).inflate(iF, (ViewGroup) toolbar, false));
                k(this.b | 16);
            }
            int iE = yxVarL.e(13, 0);
            if (iE > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iE;
                toolbar.setLayoutParams(layoutParams);
            }
            int iA = yxVarL.a(7, -1);
            int iA2 = yxVarL.a(3, -1);
            if (iA >= 0 || iA2 >= 0) {
                int iMax = Math.max(iA, 0);
                int iMax2 = Math.max(iA2, 0);
                toolbar.m();
                toolbar.r.a(iMax, iMax2);
            }
            int iF2 = yxVarL.f(28, 0);
            if (iF2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = iF2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, iF2);
                }
            }
            int iF3 = yxVarL.f(26, 0);
            if (iF3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = iF3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iF3);
                }
            }
            int iF4 = yxVarL.f(22, 0);
            if (iF4 != 0) {
                toolbar.u(iF4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        yxVarL.o();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.j())) {
                o(this.n);
            }
        }
        this.l = toolbar.j();
        toolbar.t(new zk(this));
    }

    private final void H(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.x(charSequence);
            if (this.j) {
                ley.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void I() {
        if ((this.b & 4) != 0) {
            if (!TextUtils.isEmpty(this.l)) {
                this.a.q(this.l);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.q(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void J() {
        if ((this.b & 4) == 0) {
            this.a.s(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.s(drawable);
    }

    private final void K() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.p(drawable);
    }

    @Override // defpackage.st
    public final boolean A() {
        ps psVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (psVar = actionMenuView.c) == null) {
            return false;
        }
        return psVar.l != null || psVar.o();
    }

    @Override // defpackage.st
    public final boolean B() {
        return this.a.C();
    }

    @Override // defpackage.st
    public final boolean C() {
        return this.a.D();
    }

    @Override // defpackage.st
    public final void G() {
        this.a.requestLayout();
    }

    @Override // defpackage.st
    public final int a() {
        return this.b;
    }

    @Override // defpackage.st
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.st
    public final View c() {
        return this.c;
    }

    @Override // defpackage.st
    public final ViewGroup d() {
        return this.a;
    }

    @Override // defpackage.st
    public final lfn e(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        lfn lfnVarE = ley.e(this.a);
        lfnVarE.b(f);
        lfnVarE.c(j);
        lfnVarE.d(new zl(this, i));
        return lfnVarE;
    }

    @Override // defpackage.st
    public final void f() {
        this.a.l();
    }

    @Override // defpackage.st
    public final void g() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    @Override // defpackage.st
    public final void h() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.st
    public final void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.st
    public final void j(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.st
    public final void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i2 & 3) != 0) {
                K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    Toolbar toolbar = this.a;
                    toolbar.x(this.d);
                    toolbar.v(this.k);
                } else {
                    Toolbar toolbar2 = this.a;
                    toolbar2.x(null);
                    toolbar2.v(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.st
    public final void l(Drawable drawable) {
        this.h = drawable;
        K();
    }

    @Override // defpackage.st
    public final void m(Menu menu, oo ooVar) {
        ps psVar = this.m;
        if (psVar == null) {
            ps psVar2 = new ps(this.a.getContext());
            this.m = psVar2;
            psVar2.g = R.id.action_menu_presenter;
            psVar = psVar2;
        }
        psVar.e = ooVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.n();
        oc ocVar = toolbar.a.a;
        if (ocVar == menu) {
            return;
        }
        if (ocVar != null) {
            ocVar.m(toolbar.y);
            ocVar.m(toolbar.z);
        }
        if (toolbar.z == null) {
            toolbar.z = new zf(toolbar);
        }
        psVar.r();
        if (menu != null) {
            oc ocVar2 = (oc) menu;
            ocVar2.h(psVar, toolbar.i);
            ocVar2.h(toolbar.z, toolbar.i);
        } else {
            psVar.c(toolbar.i, null);
            toolbar.z.c(toolbar.i, null);
            psVar.f(true);
            toolbar.z.f(true);
        }
        toolbar.a.g(toolbar.j);
        toolbar.a.h(psVar);
        toolbar.y = psVar;
        toolbar.z();
    }

    @Override // defpackage.st
    public final void n() {
        this.f = true;
    }

    @Override // defpackage.st
    public final void o(int i) {
        p(i == 0 ? null : b().getString(i));
    }

    @Override // defpackage.st
    public final void p(CharSequence charSequence) {
        this.l = charSequence;
        I();
    }

    @Override // defpackage.st
    public final void q(int i) {
        r(i != 0 ? ku.a(b(), i) : null);
    }

    @Override // defpackage.st
    public final void r(Drawable drawable) {
        this.i = drawable;
        J();
    }

    @Override // defpackage.st
    public final void s(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.v(charSequence);
        }
    }

    @Override // defpackage.st
    public final void t(CharSequence charSequence) {
        this.j = true;
        H(charSequence);
    }

    @Override // defpackage.st
    public final void u(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.st
    public final void v(Window.Callback callback) {
        this.e = callback;
    }

    @Override // defpackage.st
    public final void w(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        H(charSequence);
    }

    @Override // defpackage.st
    public final boolean x() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.st
    public final boolean y() {
        return this.a.A();
    }

    @Override // defpackage.st
    public final boolean z() {
        return this.a.B();
    }

    @Override // defpackage.st
    public final void D() {
    }

    @Override // defpackage.st
    public final void E() {
    }

    @Override // defpackage.st
    public final void F() {
    }
}
