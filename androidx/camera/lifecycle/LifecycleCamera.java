package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.ayv;
import defpackage.ayx;
import defpackage.azd;
import defpackage.bcp;
import defpackage.bdr;
import defpackage.brb;
import defpackage.lva;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvj;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleCamera implements lvi, ayv {
    public final lvj b;
    public final brb c;
    public final Object a = new Object();
    private volatile boolean f = false;
    public boolean d = false;
    public bcp e = null;

    public LifecycleCamera(lvj lvjVar, brb brbVar) {
        this.b = lvjVar;
        this.c = brbVar;
        if (lvjVar.P().a().a(lvb.d)) {
            brbVar.e();
        } else {
            brbVar.f();
        }
        lvjVar.P().c(this);
    }

    public final lvj a() {
        lvj lvjVar;
        synchronized (this.a) {
            lvjVar = this.b;
        }
        return lvjVar;
    }

    @Override // defpackage.ayv
    public final ayx b() {
        return this.c.a.b;
    }

    @Override // defpackage.ayv
    public final azd c() {
        return this.c.a.a;
    }

    public final List d() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.c.a());
        }
        return listUnmodifiableList;
    }

    public final void e() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            onStop(this.b);
            this.d = true;
        }
    }

    public final boolean f(bdr bdrVar) {
        boolean zContains;
        synchronized (this.a) {
            zContains = this.c.a().contains(bdrVar);
        }
        return zContains;
    }

    @OnLifecycleEvent(a = lva.ON_DESTROY)
    public void onDestroy(lvj lvjVar) {
        synchronized (this.a) {
            brb brbVar = this.c;
            brbVar.g(brbVar.a());
        }
    }

    @OnLifecycleEvent(a = lva.ON_PAUSE)
    public void onPause(lvj lvjVar) {
        this.c.h(false);
    }

    @OnLifecycleEvent(a = lva.ON_RESUME)
    public void onResume(lvj lvjVar) {
        this.c.h(true);
    }

    @OnLifecycleEvent(a = lva.ON_START)
    public void onStart(lvj lvjVar) {
        synchronized (this.a) {
            if (!this.d) {
                this.c.e();
                this.f = true;
            }
        }
    }

    @OnLifecycleEvent(a = lva.ON_STOP)
    public void onStop(lvj lvjVar) {
        synchronized (this.a) {
            if (!this.d) {
                this.c.f();
                this.f = false;
            }
        }
    }
}
