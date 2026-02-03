package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.lva;
import defpackage.lvb;
import defpackage.lvc;
import defpackage.lvi;
import defpackage.lvj;
import defpackage.rrw;
import defpackage.rrx;
import defpackage.rvk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements rrw, lvi {
    private final Set a = new HashSet();
    private final lvc b;

    public LifecycleLifecycle(lvc lvcVar) {
        this.b = lvcVar;
        lvcVar.c(this);
    }

    @Override // defpackage.rrw
    public final void a(rrx rrxVar) {
        this.a.add(rrxVar);
        lvc lvcVar = this.b;
        if (lvcVar.a() == lvb.a) {
            rrxVar.m();
        } else if (lvcVar.a().a(lvb.d)) {
            rrxVar.n();
        } else {
            rrxVar.o();
        }
    }

    @Override // defpackage.rrw
    public final void b(rrx rrxVar) {
        this.a.remove(rrxVar);
    }

    @OnLifecycleEvent(a = lva.ON_DESTROY)
    public void onDestroy(lvj lvjVar) {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rrx) it.next()).m();
        }
        lvjVar.P().d(this);
    }

    @OnLifecycleEvent(a = lva.ON_START)
    public void onStart(lvj lvjVar) {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rrx) it.next()).n();
        }
    }

    @OnLifecycleEvent(a = lva.ON_STOP)
    public void onStop(lvj lvjVar) {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rrx) it.next()).o();
        }
    }
}
