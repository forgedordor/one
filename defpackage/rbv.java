package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rbv implements ComponentCallbacks2, rrx {
    private static final rtj e;
    private static final rtj f;
    protected final raw a;
    protected final Context b;
    final rrw c;
    public final CopyOnWriteArrayList d;
    private final rsg g;
    private final rsf h;
    private final rsn i;
    private final Runnable j;
    private final rrn k;
    private rtj l;

    static {
        rtj rtjVarC = rtj.c(Bitmap.class);
        rtjVarC.aj();
        e = rtjVarC;
        rtj.c(rqs.class).aj();
        f = (rtj) ((rtj) rtj.d(rha.d).T(rbh.LOW)).ai();
    }

    public rbv(raw rawVar, rrw rrwVar, rsf rsfVar, Context context) {
        rsg rsgVar = new rsg();
        rrp rrpVar = rawVar.g;
        this.i = new rsn();
        rbs rbsVar = new rbs(this);
        this.j = rbsVar;
        this.a = rawVar;
        this.c = rrwVar;
        this.h = rsfVar;
        this.g = rsgVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        rbu rbuVar = new rbu(this, rsgVar);
        int iC = kxj.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", iC == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        rrn rroVar = iC == 0 ? new rro(applicationContext, rbuVar) : new rsb();
        this.k = rroVar;
        synchronized (rawVar.e) {
            if (rawVar.e.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            rawVar.e.add(this);
        }
        if (rvk.m()) {
            rvk.k(rbsVar);
        } else {
            rrwVar.a(this);
        }
        rrwVar.a(rroVar);
        this.d = new CopyOnWriteArrayList(rawVar.c.d);
        s(rawVar.c.b());
    }

    private final synchronized void x() {
        Set set = this.i.a;
        Iterator it = rvk.h(set).iterator();
        while (it.hasNext()) {
            l((rua) it.next());
        }
        set.clear();
    }

    public rbr a(Class cls) {
        return new rbr(this.a, this, cls, this.b);
    }

    public rbr b() {
        return a(Bitmap.class).q(e);
    }

    public rbr c() {
        return a(Drawable.class);
    }

    public rbr d() {
        return a(File.class).q(f);
    }

    public rbr e(Drawable drawable) {
        return c().h(drawable);
    }

    public rbr f(Uri uri) {
        return c().i(uri);
    }

    public rbr g(Integer num) {
        return c().j(num);
    }

    public rbr h(Object obj) {
        return c().k(obj);
    }

    public rbr i(String str) {
        return c().l(str);
    }

    final synchronized rtj j() {
        return this.l;
    }

    public final void k(View view) {
        l(new rbt(view));
    }

    public final void l(rua ruaVar) {
        if (ruaVar == null) {
            return;
        }
        boolean zV = v(ruaVar);
        rte rteVarEW = ruaVar.eW();
        if (zV) {
            return;
        }
        List list = this.a.e;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((rbv) it.next()).v(ruaVar)) {
                    return;
                }
            }
            if (rteVarEW != null) {
                ruaVar.h(null);
                rteVarEW.c();
            }
        }
    }

    @Override // defpackage.rrx
    public final synchronized void m() {
        this.i.m();
        x();
        rsg rsgVar = this.g;
        Iterator it = rvk.h(rsgVar.a).iterator();
        while (it.hasNext()) {
            rsgVar.a((rte) it.next());
        }
        rsgVar.b.clear();
        rrw rrwVar = this.c;
        rrwVar.b(this);
        rrwVar.b(this.k);
        rvk.g().removeCallbacks(this.j);
        List list = this.a.e;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.rrx
    public final synchronized void n() {
        r();
        this.i.n();
    }

    @Override // defpackage.rrx
    public final synchronized void o() {
        this.i.o();
        q();
    }

    public final synchronized void p() {
        rsg rsgVar = this.g;
        rsgVar.c = true;
        for (rte rteVar : rvk.h(rsgVar.a)) {
            if (rteVar.n() || rteVar.l()) {
                rteVar.c();
                rsgVar.b.add(rteVar);
            }
        }
    }

    public final synchronized void q() {
        rsg rsgVar = this.g;
        rsgVar.c = true;
        for (rte rteVar : rvk.h(rsgVar.a)) {
            if (rteVar.n()) {
                rteVar.f();
                rsgVar.b.add(rteVar);
            }
        }
    }

    public final synchronized void r() {
        rsg rsgVar = this.g;
        rsgVar.c = false;
        for (rte rteVar : rvk.h(rsgVar.a)) {
            if (!rteVar.l() && !rteVar.n()) {
                rteVar.b();
            }
        }
        rsgVar.b.clear();
    }

    protected synchronized void s(rtj rtjVar) {
        this.l = (rtj) ((rtj) rtjVar.clone()).x();
    }

    final synchronized void t(rua ruaVar, rte rteVar) {
        this.i.a.add(ruaVar);
        rsg rsgVar = this.g;
        rsgVar.a.add(rteVar);
        if (!rsgVar.c) {
            rteVar.b();
            return;
        }
        rteVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        rsgVar.b.add(rteVar);
    }

    public final synchronized String toString() {
        rsf rsfVar;
        rsg rsgVar;
        rsfVar = this.h;
        rsgVar = this.g;
        return super.toString() + "{tracker=" + String.valueOf(rsgVar) + ", treeNode=" + String.valueOf(rsfVar) + "}";
    }

    public final synchronized boolean u() {
        return this.g.c;
    }

    final synchronized boolean v(rua ruaVar) {
        rte rteVarEW = ruaVar.eW();
        if (rteVarEW == null) {
            return true;
        }
        if (!this.g.a(rteVarEW)) {
            return false;
        }
        this.i.a.remove(ruaVar);
        ruaVar.h(null);
        return true;
    }

    public synchronized void w(rtj rtjVar) {
        s(rtjVar);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
