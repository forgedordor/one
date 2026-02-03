package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjc implements dpir, dpje {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int k = 0;
    public final Activity b;
    public final dpkv c;
    public final fdjx d;
    public WeakReference e;
    public fdlr f;
    public final Set g;
    public boolean h;
    public int i;
    public int j;
    private final dpji l;
    private final dngc m;
    private final InputMethodManager n;
    private WeakReference o;
    private final fdcz p;
    private final fdcz q;
    private final dngn r;
    private int s;
    private final fctc t;

    static {
        fdbv fdbvVar = new fdbv(dpjc.class, "detectionState", "getDetectionState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardManagerImpl$Companion$DetectionState;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar, new fdbv(dpjc.class, "keyboardState", "getKeyboardState()Lcom/google/android/libraries/compose/ui/keyboard/KeyboardState;", 0)};
    }

    public dpjc(Activity activity, dpji dpjiVar, dpkv dpkvVar, dngc dngcVar, fdjx fdjxVar, final Optional optional) {
        activity.getClass();
        dngcVar.getClass();
        fdjxVar.getClass();
        this.b = activity;
        this.l = dpjiVar;
        this.c = dpkvVar;
        this.m = dngcVar;
        this.d = fdjxVar;
        Object systemService = activity.getSystemService("input_method");
        systemService.getClass();
        this.n = (InputMethodManager) systemService;
        this.g = new LinkedHashSet();
        this.p = new dpja(dpiw.a, this);
        this.q = new dpjb(dpjd.d, this);
        this.r = new dngn(new dpiz(activity), new fdap() { // from class: dpit
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((Integer) obj).intValue();
                return Integer.valueOf(this.a.n());
            }
        });
        this.s = n();
        this.i = -1;
        this.j = -1;
        this.t = fctd.a(new fdae() { // from class: dpiu
            @Override // defpackage.fdae
            public final Object invoke() {
                int i = dpjc.k;
                Boolean bool = (Boolean) fdct.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
    }

    static /* synthetic */ void p(dpjc dpjcVar, dpjd dpjdVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            dpjdVar = dpjcVar.q();
        }
        if ((i2 & 2) != 0) {
            i = dpjcVar.s;
        }
        if (dpjdVar == dpjd.a && i >= 0) {
            if (dpgx.f(dpjcVar.b)) {
                dpjcVar.i = i;
            } else {
                dpjcVar.j = i;
            }
        }
        if (dpjdVar != dpjd.d) {
            dpjcVar.h = true;
        }
    }

    private final dpjd q() {
        return (dpjd) this.q.c(a[1]);
    }

    private final void r(dpix dpixVar) {
        this.p.d(a[0], dpixVar);
    }

    @Override // defpackage.dpje
    public final void a(int i) {
        o(i);
        p(this, null, i, 1);
        this.c.a(i);
    }

    @Override // defpackage.dpje
    public final void b(dpjd dpjdVar) {
        dpjdVar.getClass();
        this.q.d(a[1], dpjdVar);
        p(this, dpjdVar, 0, 2);
        this.c.b(dpjdVar);
    }

    @Override // defpackage.dpir
    public final int c() {
        Integer numValueOf = Integer.valueOf(dpgx.f(this.b) ? this.i : this.j);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : ((Number) this.r.a()).intValue();
    }

    @Override // defpackage.dpir
    public final int d() {
        return e(q());
    }

    @Override // defpackage.dpir
    public final int e(dpjd dpjdVar) {
        dpjdVar.getClass();
        int iOrdinal = dpjdVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return this.s;
        }
        if (iOrdinal == 3) {
            return 0;
        }
        throw new fctg();
    }

    @Override // defpackage.dpir
    public final dpjd f() {
        return q();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // defpackage.dpir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            r4.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L42
            android.app.Activity r0 = r3.b
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 != r1) goto L1a
            android.view.Display r0 = defpackage.dpgx.d(r0)
            int r0 = r0.getDisplayId()
            if (r0 <= 0) goto L26
            goto L42
        L1a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L26
            boolean r0 = defpackage.air$$ExternalSyntheticApiModelOutline1.m(r0)
            if (r0 != 0) goto L42
        L26:
            android.view.WindowInsetsController r0 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r0 == 0) goto L42
            int r1 = defpackage.aee$$ExternalSyntheticApiModelOutline0.m$1()
            defpackage.aee$$ExternalSyntheticApiModelOutline0.m(r0, r1)
            fctc r0 = r3.t
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4c
            goto L57
        L42:
            android.view.inputmethod.InputMethodManager r0 = r3.n
            android.os.IBinder r1 = r4.getWindowToken()
            r2 = 0
            r0.hideSoftInputFromWindow(r1, r2)
        L4c:
            if (r5 == 0) goto L57
            boolean r5 = r4.hasFocus()
            if (r5 == 0) goto L57
            r4.clearFocus()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpjc.g(android.view.View, boolean):void");
    }

    @Override // defpackage.dpir
    public final void h(View view, boolean z) {
        view.getClass();
        this.e = z ? new WeakReference(view) : null;
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (Build.VERSION.SDK_INT <= 32) {
                this.n.isActive(view);
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
                return;
            }
        }
        this.n.showSoftInput(view, 0);
    }

    @Override // defpackage.dpir
    public final void i() {
        c();
    }

    @Override // defpackage.dpir
    public final void j() {
        Activity activity = this.b;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            this.o = new WeakReference(currentFocus);
        } else {
            currentFocus = activity.getWindow().getDecorView().getRootView();
        }
        this.n.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // defpackage.dpir
    public final void k() {
        View rootView;
        WeakReference weakReference = this.o;
        if (weakReference == null || (rootView = (View) weakReference.get()) == null) {
            rootView = this.b.getWindow().getDecorView().getRootView();
        }
        this.o = null;
        this.n.showSoftInput(rootView, 0);
    }

    @Override // defpackage.dpir
    public final void l(dpje dpjeVar) {
        dpjeVar.getClass();
        Set set = this.g;
        if (set.isEmpty()) {
            this.h = false;
            this.m.d("KeyboardManagerImpl#attach", new fdae() { // from class: dpis
                @Override // defpackage.fdae
                public final Object invoke() {
                    dpjc dpjcVar = this.a;
                    dpjcVar.f = fdil.d(dpjcVar.d, null, null, new dpiy(dpjcVar, null), 3);
                    return fctx.a;
                }
            });
            r(new dpiv(this.l));
        }
        set.add(dpjeVar);
    }

    @Override // defpackage.dpir
    public final void m(dpje dpjeVar) {
        dpjeVar.getClass();
        Set set = this.g;
        if (set.remove(dpjeVar) && set.isEmpty()) {
            fdlr fdlrVar = this.f;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            this.f = null;
            r(dpiw.a);
        }
    }

    public final int n() {
        return this.b.getResources().getDimensionPixelSize(R.dimen.keyboard_height_fallback);
    }

    public final void o(int i) {
        if (this.s != i) {
            this.s = i;
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((dpje) it.next()).a(i);
            }
        }
    }
}
