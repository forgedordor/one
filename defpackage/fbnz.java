package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnz extends fbog implements Closeable {
    public final fbol a;
    public ScheduledFuture b;
    private final fbog h;
    private ArrayList i;
    private fboa j;
    private Throwable k;
    private boolean l;

    public fbnz(fbog fbogVar) {
        super(fbogVar, fbogVar.f);
        this.a = fbogVar.b();
        this.h = new fbog(this, this.f);
    }

    @Override // defpackage.fbog
    public final fbog a() {
        return this.h.a();
    }

    @Override // defpackage.fbog
    public final fbol b() {
        return this.a;
    }

    @Override // defpackage.fbog
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.fbog
    public final void d(fboa fboaVar, Executor executor) {
        m(executor, "executor");
        e(new fboc(executor, fboaVar, this));
    }

    public final void e(fboc fbocVar) {
        synchronized (this) {
            if (i()) {
                fbocVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(fbocVar);
                    fbnz fbnzVar = this.e;
                    if (fbnzVar != null) {
                        this.j = new fbnx(this);
                        fbnzVar.e(new fboc(fbob.a, this.j, this));
                    }
                } else {
                    arrayList.add(fbocVar);
                }
            }
        }
    }

    @Override // defpackage.fbog
    public final void f(fbog fbogVar) {
        this.h.f(fbogVar);
    }

    @Override // defpackage.fbog
    public final void g(fboa fboaVar) {
        h(fboaVar, this);
    }

    public final void h(fboa fboaVar, fbog fbogVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fboc fbocVar = (fboc) this.i.get(size);
                    if (fbocVar.a == fboaVar && fbocVar.b == fbogVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    fbnz fbnzVar = this.e;
                    if (fbnzVar != null) {
                        fbnzVar.h(this.j, fbnzVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.fbog
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                fboa fboaVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    fboc fbocVar = (fboc) arrayList.get(i2);
                    if (fbocVar.b == this) {
                        fbocVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    fboc fbocVar2 = (fboc) arrayList.get(i);
                    if (fbocVar2.b != this) {
                        fbocVar2.a();
                    }
                }
                fbnz fbnzVar = this.e;
                if (fbnzVar != null) {
                    fbnzVar.h(fboaVar, fbnzVar);
                }
            }
        }
    }

    public fbnz(fbog fbogVar, fbol fbolVar) {
        super(fbogVar, fbogVar.f);
        this.a = fbolVar;
        this.h = new fbog(this, this.f);
    }
}
