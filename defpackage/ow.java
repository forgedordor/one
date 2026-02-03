package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ow extends ol implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, op {
    final uv a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final oc f;
    private final nz h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private oo o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new ou(this);
    private final View.OnAttachStateChangeListener l = new ov(this);
    private int s = 0;

    public ow(Context context, oc ocVar, View view, int i, boolean z) {
        this.e = context;
        this.f = ocVar;
        this.i = z;
        this.h = new nz(ocVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new uv(context, i);
        ocVar.h(this, context);
    }

    @Override // defpackage.op
    public final void d(oc ocVar, boolean z) {
        if (ocVar != this.f) {
            return;
        }
        m();
        oo ooVar = this.o;
        if (ooVar != null) {
            ooVar.a(ocVar, z);
        }
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        return null;
    }

    @Override // defpackage.ot
    public final ListView dH() {
        return this.a.e;
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        this.o = ooVar;
    }

    @Override // defpackage.op
    public final void f(boolean z) {
        this.q = false;
        nz nzVar = this.h;
        if (nzVar != null) {
            nzVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.op
    public final boolean g() {
        return false;
    }

    @Override // defpackage.op
    public final boolean h(ox oxVar) {
        if (oxVar.hasVisibleItems()) {
            on onVar = new on(this.e, oxVar, this.c, this.i, this.k);
            onVar.e(this.o);
            onVar.d(ol.z(oxVar));
            onVar.c = this.m;
            this.m = null;
            this.f.i(false);
            uv uvVar = this.a;
            int width = uvVar.g;
            int iB = uvVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!onVar.h()) {
                if (onVar.a != null) {
                    onVar.g(width, iB, true, true);
                }
            }
            oo ooVar = this.o;
            if (ooVar != null) {
                ooVar.b(oxVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ot
    public final void m() {
        if (x()) {
            this.a.m();
        }
    }

    @Override // defpackage.ol
    public final void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.ol
    public final void p(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.ol
    public final void q(int i) {
        this.s = i;
    }

    @Override // defpackage.ol
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.ol
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.ol
    public final void t(boolean z) {
        this.t = z;
    }

    @Override // defpackage.ol
    public final void u(int i) {
        this.a.j(i);
    }

    @Override // defpackage.ot
    public final void v() {
        View view;
        if (x()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        uv uvVar = this.a;
        uvVar.t(this);
        uvVar.m = this;
        uvVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        uvVar.l = view2;
        uvVar.j = this.s;
        if (!this.q) {
            this.r = A(this.h, this.e, this.j);
            this.q = true;
        }
        uvVar.r(this.r);
        uvVar.w();
        uvVar.s(this.g);
        uvVar.v();
        tm tmVar = uvVar.e;
        tmVar.setOnKeyListener(this);
        if (this.t) {
            oc ocVar = this.f;
            if (ocVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) tmVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ocVar.e);
                }
                frameLayout.setEnabled(false);
                tmVar.addHeaderView(frameLayout, null, false);
            }
        }
        uvVar.e(this.h);
        uvVar.v();
    }

    @Override // defpackage.ot
    public final boolean x() {
        return !this.p && this.a.x();
    }

    @Override // defpackage.ol
    public final void l(oc ocVar) {
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
    }
}
