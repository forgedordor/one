package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nw extends ol implements View.OnKeyListener, PopupWindow.OnDismissListener, op {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private oo y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new nr(this);
    private final View.OnAttachStateChangeListener m = new ns(this);
    private final ut n = new nu(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = B();

    public nw(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int B() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C(defpackage.oc r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw.C(oc):void");
    }

    @Override // defpackage.op
    public final void d(oc ocVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ocVar == ((nv) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((nv) list.get(i2)).b.i(false);
        }
        nv nvVar = (nv) list.remove(i);
        nvVar.b.m(this);
        if (this.f) {
            uv uvVar = nvVar.a;
            uvVar.r.setExitTransition(null);
            uvVar.r.setAnimationStyle(0);
        }
        nvVar.a.m();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((nv) list.get(size2 - 1)).c;
        } else {
            this.r = B();
        }
        if (size2 != 0) {
            if (z) {
                ((nv) list.get(0)).b.i(false);
                return;
            }
            return;
        }
        m();
        oo ooVar = this.y;
        if (ooVar != null) {
            ooVar.a(ocVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        return null;
    }

    @Override // defpackage.ot
    public final ListView dH() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((nv) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        this.y = ooVar;
    }

    @Override // defpackage.op
    public final void f(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y(((nv) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.op
    public final boolean g() {
        return false;
    }

    @Override // defpackage.op
    public final boolean h(ox oxVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (nv nvVar : this.b) {
            if (oxVar == nvVar.b) {
                nvVar.a().requestFocus();
                return true;
            }
        }
        if (!oxVar.hasVisibleItems()) {
            return false;
        }
        l(oxVar);
        oo ooVar = this.y;
        if (ooVar != null) {
            ooVar.b(oxVar);
        }
        return true;
    }

    @Override // defpackage.ol
    public final void l(oc ocVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ocVar.h(this, this.h);
        if (x()) {
            C(ocVar);
        } else {
            this.l.add(ocVar);
        }
    }

    @Override // defpackage.ot
    public final void m() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        nv[] nvVarArr = (nv[]) list.toArray(new nv[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            uv uvVar = nvVarArr[size].a;
            if (uvVar.x()) {
                uvVar.m();
            }
        }
    }

    @Override // defpackage.ol
    public final void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nv nvVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nvVar = null;
                break;
            }
            nvVar = (nv) list.get(i);
            if (!nvVar.a.x()) {
                break;
            } else {
                i++;
            }
        }
        if (nvVar != null) {
            nvVar.b.i(false);
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
        this.w = z;
    }

    @Override // defpackage.ol
    public final void q(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.ol
    public final void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.ol
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.ol
    public final void t(boolean z) {
        this.x = z;
    }

    @Override // defpackage.ol
    public final void u(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.ot
    public final void v() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (x()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C((oc) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.ol
    protected final boolean w() {
        return false;
    }

    @Override // defpackage.ot
    public final boolean x() {
        List list = this.b;
        return list.size() > 0 && ((nv) list.get(0)).a.x();
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
    }
}
