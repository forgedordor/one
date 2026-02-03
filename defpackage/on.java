package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class on {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final oc e;
    private final boolean f;
    private final int g;
    private boolean h;
    private oo i;
    private ol j;
    private final PopupWindow.OnDismissListener k;

    public on(Context context, oc ocVar, View view, boolean z) {
        this(context, ocVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final ol a() {
        if (this.j == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            ol nwVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new nw(context, this.a, this.g, this.f) : new ow(context, this.e, this.a, this.g, this.f);
            nwVar.l(this.e);
            nwVar.s(this.k);
            nwVar.o(this.a);
            nwVar.e(this.i);
            nwVar.p(this.h);
            nwVar.q(this.b);
            this.j = nwVar;
        }
        return this.j;
    }

    public final void b() {
        if (h()) {
            this.j.m();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        ol olVar = this.j;
        if (olVar != null) {
            olVar.p(z);
        }
    }

    public final void e(oo ooVar) {
        this.i = ooVar;
        ol olVar = this.j;
        if (olVar != null) {
            olVar.e(ooVar);
        }
    }

    public final void f() {
        if (!i()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        ol olVarA = a();
        olVarA.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            olVarA.r(i);
            olVarA.u(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            olVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        olVarA.v();
    }

    public final boolean h() {
        ol olVar = this.j;
        return olVar != null && olVar.x();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }

    public on(Context context, oc ocVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new om(this);
        this.d = context;
        this.e = ocVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
