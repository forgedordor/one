package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import defpackage.dcfq;
import defpackage.dcfr;
import defpackage.dcfs;
import defpackage.dcfu;
import defpackage.dcfx;
import defpackage.dcfy;
import defpackage.dcgv;
import defpackage.dcgw;
import defpackage.dcgx;
import defpackage.dchq;
import defpackage.dcjc;
import defpackage.dcjd;
import defpackage.dclh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends dcfx> extends dcfs<R> {
    public static final ThreadLocal b = new dcgv();
    private final CountDownLatch a;
    public final Object c;
    protected final dcgw d;
    public dcfx e;
    public ICancelToken f;
    public boolean g;
    private final ArrayList h;
    private dcfy i;
    private final AtomicReference j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private boolean n;
    private volatile dcjc o;
    private dcgx resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.d = new dcgw(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final dcfx b() {
        dcfx dcfxVar;
        synchronized (this.c) {
            dclh.i(!this.l, "Result has already been consumed.");
            dclh.i(n(), "Result is not ready.");
            dcfxVar = this.e;
            this.e = null;
            this.i = null;
            this.l = true;
        }
        dcjd dcjdVar = (dcjd) this.j.getAndSet(null);
        if (dcjdVar != null) {
            dcjdVar.a();
        }
        dclh.m(dcfxVar);
        return dcfxVar;
    }

    public static void l(dcfx dcfxVar) {
        if (dcfxVar instanceof dcfu) {
            try {
                ((dcfu) dcfxVar).b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(dcfxVar))), e);
            }
        }
    }

    private final void o(dcfx dcfxVar) {
        this.e = dcfxVar;
        this.k = dcfxVar.a();
        this.f = null;
        this.a.countDown();
        if (this.m) {
            this.i = null;
        } else {
            dcfy dcfyVar = this.i;
            if (dcfyVar != null) {
                dcgw dcgwVar = this.d;
                dcgwVar.removeMessages(2);
                dcgwVar.a(dcfyVar, b());
            } else if (this.e instanceof dcfu) {
                this.resultGuardian = new dcgx(this);
            }
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dcfr) arrayList.get(i)).a(this.k);
        }
        arrayList.clear();
    }

    protected abstract dcfx a(Status status);

    @Override // defpackage.dcfs
    public final void e(dcfr dcfrVar) {
        dclh.b(true, "Callback cannot be null.");
        synchronized (this.c) {
            if (n()) {
                dcfrVar.a(this.k);
            } else {
                this.h.add(dcfrVar);
            }
        }
    }

    @Override // defpackage.dcfs
    public final void f() {
        synchronized (this.c) {
            if (!this.m && !this.l) {
                ICancelToken iCancelToken = this.f;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                l(this.e);
                this.m = true;
                o(a(Status.e));
            }
        }
    }

    @Override // defpackage.dcfs
    public final dcfx g(TimeUnit timeUnit) {
        dclh.i(!this.l, "Result has already been consumed.");
        dclh.i(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                k(Status.d);
            }
        } catch (InterruptedException unused) {
            k(Status.b);
        }
        dclh.i(n(), "Result is not ready.");
        return b();
    }

    @Override // defpackage.dcfs
    public final void h(dcfy dcfyVar, TimeUnit timeUnit) {
        boolean z;
        Object obj = this.c;
        synchronized (obj) {
            dclh.i(!this.l, "Result has already been consumed.");
            dclh.i(true, "Cannot set callbacks if then() has been called.");
            synchronized (obj) {
                z = this.m;
            }
        }
        if (z) {
            return;
        }
        if (n()) {
            this.d.a(dcfyVar, b());
        } else {
            this.i = dcfyVar;
            dcgw dcgwVar = this.d;
            dcgwVar.sendMessageDelayed(dcgwVar.obtainMessage(2, this), timeUnit.toMillis(3L));
        }
    }

    @Deprecated
    public final void k(Status status) {
        synchronized (this.c) {
            if (!n()) {
                m(a(status));
                this.n = true;
            }
        }
    }

    public final void m(dcfx dcfxVar) {
        synchronized (this.c) {
            if (this.n || this.m) {
                l(dcfxVar);
                return;
            }
            n();
            dclh.i(!n(), "Results have already been set");
            dclh.i(!this.l, "Result has already been consumed");
            o(dcfxVar);
        }
    }

    public final boolean n() {
        return this.a.getCount() == 0;
    }

    protected BasePendingResult(dcfq dcfqVar) {
        this.c = new Object();
        this.a = new CountDownLatch(1);
        this.h = new ArrayList();
        this.j = new AtomicReference();
        this.g = false;
        this.d = new dcgw(dcfqVar != null ? ((dchq) dcfqVar).a.i : Looper.getMainLooper());
        new WeakReference(dcfqVar);
    }
}
