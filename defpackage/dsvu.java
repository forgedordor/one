package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvu implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, dsxa {
    private static final ekrg e = ekrg.c("com/google/android/libraries/logging/ve/ViewNode");
    public ViewGroup a;
    public final dtbe c;
    private final View f;
    private final dsvd g;
    private final dsxb h;
    private dsvd i;
    private List j;
    private final ViewTreeObserver.OnDrawListener q;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private dsvd n = null;
    public boolean b = false;
    private int r = 2;
    private final Rect o = new Rect();
    public Runnable d = null;
    private boolean p = false;

    private dsvu(View view, dsvd dsvdVar) {
        this.f = view;
        this.g = dsvdVar;
        this.h = dsvdVar.e;
        dtbe dtbeVar = (dtbe) dsvdVar.c.b(dtba.a);
        this.c = dtbeVar;
        int iA = dtbd.a(dtbeVar.b);
        if (iA != 0 && iA == 3) {
            this.q = new ViewTreeObserver.OnDrawListener() { // from class: dsvs
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    final dsvu dsvuVar = this.a;
                    if (!dsvuVar.b && dsvuVar.a.isDirty() && dsvuVar.d == null) {
                        dsvuVar.d = new Runnable() { // from class: dsvt
                            @Override // java.lang.Runnable
                            public final void run() {
                                dsvuVar.m();
                            }
                        };
                        ecem.d(dsvuVar.d, dsvuVar.c.c);
                    }
                }
            };
        } else {
            this.q = null;
        }
    }

    private final int A() {
        View view = this.f;
        if (view.getVisibility() != 0) {
            return 2;
        }
        if (this.m && !view.isShown()) {
            return 2;
        }
        dtbe dtbeVar = this.c;
        int iA = dtbd.a(dtbeVar.b);
        if (iA != 0 && iA != 1) {
            ViewGroup viewGroup = this.a;
            if (viewGroup == null) {
                return 2;
            }
            Rect rect = this.o;
            rect.set(viewGroup.getScrollX(), this.a.getScrollY(), this.a.getWidth() + this.a.getScrollX(), this.a.getHeight() + this.a.getScrollY());
            if (view.getLeft() > rect.left || view.getTop() > rect.top || view.getRight() < rect.right || view.getBottom() < rect.bottom) {
                if (rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    Log.d("GIL", "V=".concat(rect.toString()));
                    int iWidth = ((rect.width() * rect.height()) * 100) / (view.getWidth() * view.getHeight());
                    dtaz dtazVar = dtbeVar.d;
                    if (dtazVar == null) {
                        dtazVar = dtaz.a;
                    }
                    if (iWidth < dtazVar.b) {
                    }
                }
                return 2;
            }
        }
        return 1;
    }

    private final boolean B(int i) {
        int i2 = this.r;
        if (i == i2) {
            return false;
        }
        this.r = i;
        if (!this.l) {
            return true;
        }
        this.h.f(this.g, i2, i);
        return true;
    }

    public static View a(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    public static View b(dsvd dsvdVar) {
        dsxa dsxaVar = dsvdVar.f;
        if (dsxaVar instanceof dsvu) {
            return ((dsvu) dsxaVar).f;
        }
        return null;
    }

    public static dsvd c(View view) {
        return (dsvd) view.getTag(com.google.android.apps.messaging.R.id.ve_tag);
    }

    public static boolean q(View view) {
        return view.getId() == 16908290;
    }

    static void s(View view, dsvd dsvdVar) {
        dsvu dsvuVar = new dsvu(view, dsvdVar);
        dsvdVar.f = dsvuVar;
        View view2 = dsvuVar.f;
        view2.setTag(com.google.android.apps.messaging.R.id.ve_tag, dsvuVar.g);
        if (dsvuVar.h.e()) {
            view2.addOnAttachStateChangeListener(dsvuVar);
            int[] iArr = ley.a;
            if (view2.isAttachedToWindow()) {
                dsvuVar.onViewAttachedToWindow(view2);
            }
        }
    }

    private static String v(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(view.getClass().getSimpleName()).concat("#ResourceNotFoundException");
            }
        }
        return view.getClass().getSimpleName() + "#" + String.valueOf(view.getTag());
    }

    private final void w() {
        Runnable runnable = this.d;
        if (runnable != null) {
            ecem.f(runnable);
            this.d = null;
        }
    }

    private final void x() {
        int iA;
        w();
        dtbe dtbeVar = this.c;
        int iA2 = dtbd.a(dtbeVar.b);
        if (iA2 != 0 && iA2 == 3) {
            this.f.getViewTreeObserver().removeOnDrawListener(this.q);
        }
        if (this.a == null || ((iA = dtbd.a(dtbeVar.b)) != 0 && iA == 2)) {
            this.f.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.a = null;
        }
    }

    private final void y() {
        int iA;
        ejwl.l(this.k);
        if (this.m) {
            ViewGroup viewGroup = (ViewGroup) this.f.getRootView().findViewById(R.id.content);
            viewGroup.getClass();
            this.a = viewGroup;
        } else {
            this.a = (ViewGroup) this.f.getParent();
        }
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        } else if (Log.isLoggable("GIL", 3) && !this.f.isTemporarilyDetached()) {
            Log.d("GIL", "Unexpected null parent: ".concat(String.valueOf(String.valueOf(this.g))));
        }
        if (this.a == null || ((iA = dtbd.a(this.c.b)) != 0 && iA == 2)) {
            this.f.addOnLayoutChangeListener(this);
        }
        int iA2 = dtbd.a(this.c.b);
        if (iA2 != 0 && iA2 == 3) {
            this.f.getViewTreeObserver().addOnDrawListener(this.q);
        }
    }

    private static void z(View view, dswz dswzVar) {
        dsvd dsvdVarC = c(view);
        if (dsvdVarC != null) {
            dsxa dsxaVar = dsvdVarC.f;
            if (dsxaVar instanceof dsvu) {
                dsvu dsvuVar = (dsvu) dsxaVar;
                if (dsvuVar.i != null || dsvuVar.m) {
                    return;
                }
            }
            dswzVar.b(dsvdVarC);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                z(viewGroup.getChildAt(i), dswzVar);
            }
        }
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ Object d() {
        if (p() || this.m) {
            return null;
        }
        dsvd dsvdVar = this.i;
        if (dsvdVar != null) {
            return dsvdVar;
        }
        dsvd dsvdVar2 = this.n;
        if (dsvdVar2 != null) {
            return dsvdVar2;
        }
        for (ViewParent parent = this.f.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
            View view = (View) parent;
            dsvd dsvdVarC = c(view);
            if (dsvdVarC != null) {
                if (!this.k) {
                    return dsvdVarC;
                }
                this.n = dsvdVarC;
                return dsvdVarC;
            }
            if (q(view)) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        dsxa dsxaVar = ((dsvd) obj).f;
        ejwl.a(this.j.add(obj));
        dsxaVar.k(this.g);
        if (this.k) {
            dsxaVar.h();
        }
    }

    @Override // defpackage.dsxa
    public final void f() {
        ejwl.m(this.i != null, "No parent override to unset");
        this.i = null;
        if (this.k) {
            h();
        }
    }

    @Override // defpackage.dsxa
    public final void g() {
        if (this.h.e()) {
            View view = this.f;
            view.removeOnAttachStateChangeListener(this);
            int[] iArr = ley.a;
            if (view.isAttachedToWindow()) {
                onViewDetachedFromWindow(view);
            }
        }
        dsvd dsvdVar = this.i;
        if (dsvdVar != null) {
            dsvdVar.f.j(this.g);
        }
        List<dsvd> list = this.j;
        if (list != null) {
            for (dsvd dsvdVar2 : list) {
                if (this.k) {
                    dsvdVar2.f.i();
                }
                dsvdVar2.f.f();
            }
            this.j.clear();
            this.j = null;
        }
        this.n = null;
        this.f.setTag(com.google.android.apps.messaging.R.id.ve_tag, null);
    }

    @Override // defpackage.dsxa
    public final void h() {
        if (!this.k || this.l) {
            return;
        }
        this.l = true;
        this.h.b(this.g);
        List list = this.j;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dsvd) it.next()).f.h();
            }
        }
    }

    @Override // defpackage.dsxa
    public final void i() {
        if (this.l) {
            this.l = false;
            List list = this.j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dsvd) it.next()).f.i();
                }
            }
            this.h.c(this.g);
            this.n = null;
        }
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        ejwl.a(this.j.remove(obj));
        dsxa dsxaVar = ((dsvd) obj).f;
        if (this.k) {
            dsxaVar.i();
        }
        dsxaVar.f();
    }

    @Override // defpackage.dsxa
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        dsvd dsvdVar = this.i;
        boolean z = dsvdVar == null;
        dsvd dsvdVar2 = this.g;
        ejwl.r(z, "CVE (%s) has a parent override (%s). Swapping prohibited.", dsvdVar2, dsvdVar);
        ejwl.m(!this.m, "Isolated trees cannot have parents.");
        if (this.k) {
            ejwl.i(((dsvd) obj).f.o(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", dsvdVar2, obj);
            i();
        }
        this.i = (dsvd) obj;
    }

    @Override // defpackage.dsxa
    public final void l() {
        throw null;
    }

    public final void m() {
        w();
        if (B(A()) && this.a != null && Log.isLoggable("GIL", 2)) {
            dsvd dsvdVar = this.g;
            Locale locale = Locale.US;
            View view = this.f;
            Log.v("GIL", String.format(locale, "Visibility: %s v=%s\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", dsvdVar, v(view), Integer.valueOf(this.a.getScrollX()), Integer.valueOf(this.a.getScrollY()), Integer.valueOf(this.a.getWidth() + this.a.getScrollX()), Integer.valueOf(this.a.getHeight() + this.a.getScrollY()), Integer.valueOf(view.getLeft()), Integer.valueOf(view.getTop()), Integer.valueOf(view.getRight()), Integer.valueOf(view.getBottom())));
        }
        this.d = null;
    }

    @Override // defpackage.dsxa
    public final void n(dswz dswzVar) {
        View view = this.f;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                z(viewGroup.getChildAt(i), dswzVar);
            }
        }
        List list = this.j;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                dswzVar.b((dsvd) this.j.get(size));
            }
        }
    }

    @Override // defpackage.dsxa
    public final boolean o() {
        return this.l;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iA = dtbd.a(this.c.b);
        if (iA == 0 || iA != 2) {
            View view2 = this.f;
            if (view == view2) {
                ejwl.l(this.a == null);
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                this.a = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
                view2.removeOnLayoutChangeListener(this);
            }
        } else {
            if (this.p && view == this.a) {
                this.p = false;
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", String.format(Locale.US, "LayoutChange: %s (Skipped)", this.g));
                    return;
                }
                return;
            }
            View view3 = this.f;
            boolean z = view != view3;
            if (view == view3) {
                this.p = true;
            } else {
                this.p = false;
            }
            if (this.a == null) {
                ejwl.l(!z);
                ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                this.a = viewGroup2;
                viewGroup2.addOnLayoutChangeListener(this);
            }
        }
        if (Log.isLoggable("GIL", 2)) {
            if (this.a == null) {
                Throwable th = new Throwable();
                th.fillInStackTrace();
                Locale locale = Locale.US;
                dsvd dsvdVar = this.g;
                View view4 = this.f;
                Log.w("GIL", String.format(locale, "You have a bug in your layout code. %s Expected [%s] Got [%s] Parent [%s]", dsvdVar, view4, view, view4.getParent()), th);
                return;
            }
            dsvd dsvdVar2 = this.g;
            Locale locale2 = Locale.US;
            View view5 = this.f;
            Log.v("GIL", String.format(locale2, "LayoutChange: %s v=%s p=%d d=%d lr=%d pd=%d plr=%d\tl=%d,%d t=%d,%d r=%d,%d b=%d,%d\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", dsvdVar2, v(view5), Integer.valueOf(view == this.a ? 1 : 0), Integer.valueOf(view5.isDirty() ? 1 : 0), Integer.valueOf(view5.isLayoutRequested() ? 1 : 0), Integer.valueOf(view.isDirty() ? 1 : 0), Integer.valueOf(view.isLayoutRequested() ? 1 : 0), Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(this.a.getScrollX()), Integer.valueOf(this.a.getScrollY()), Integer.valueOf(this.a.getWidth() + this.a.getScrollX()), Integer.valueOf(this.a.getHeight() + this.a.getScrollY()), Integer.valueOf(view5.getLeft()), Integer.valueOf(view5.getTop()), Integer.valueOf(view5.getRight()), Integer.valueOf(view5.getBottom())));
        }
        if (this.b) {
            return;
        }
        m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((ekrd) ((ekrd) e.e()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 392, "ViewNode.java")).D("onViewAttachedToWindow self=%s, view=%s", this.f, view);
        this.h.a(!this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Attached View had no parent: ".concat(String.valueOf(v(view))));
        }
        this.k = true;
        y();
        h();
        if (this.b) {
            return;
        }
        m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((ekrd) ((ekrd) e.e()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 408, "ViewNode.java")).D("onViewDetachedToWindow self=%s, view=%s", this.f, view);
        dsxb dsxbVar = this.h;
        dsxbVar.a(this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Detached View had no parent: ".concat(String.valueOf(v(view))));
        }
        this.k = false;
        x();
        dsvd dsvdVar = this.i;
        if (dsvdVar == null) {
            i();
            return;
        }
        dsvd dsvdVar2 = this.g;
        dsvdVar.f.j(dsvdVar2);
        boolean z = this.l;
        Object[] objArr = {dsvdVar2, this.i};
        if (z) {
            dsxbVar.d(new IllegalStateException(ejxq.a("CVE (%s) was child of detached CVE (%s).", objArr)));
        }
    }

    @Override // defpackage.dsxa
    public final boolean p() {
        return (this.i == null && q(this.f)) || this.m;
    }

    public final void r(boolean z) {
        if (this.m == z) {
            return;
        }
        ejwl.l(this.i == null);
        ejwl.a((z && q(this.f)) ? false : true);
        ((ekrd) ((ekrd) e.e()).h("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 155, "ViewNode.java")).t("setIsolated %s", this.f);
        if (this.k) {
            x();
        }
        this.m = z;
        if (this.k) {
            y();
        }
    }

    @Override // defpackage.dsxa
    public final int t() {
        return this.b ? this.r : A();
    }

    @Override // defpackage.dsxa
    public final void u(int i) {
        if (i == 1) {
            this.b = false;
            m();
        } else {
            this.b = true;
            B(2);
        }
    }
}
