package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbvm implements IBinder.DeathRecipient, fbwc {
    public static final Logger e = Logger.getLogger(fbvm.class.getName());
    public static final fbmv f = new fbmv("internal:remote-uid");
    public static final fbmv g = new fbmv("internal:server-authority");
    public static final fbmv h = new fbmv("internal:inbound-parcelable-policy");
    private final fchy a;
    private final fbpn b;
    public final ScheduledExecutorService i;
    protected fbmw k;
    protected Status l;
    public fbwm m;
    private long p;
    private final LinkedHashSet d = new LinkedHashSet();
    private int q = 1;
    private final fbwd c = new fbwd(this);
    protected final ConcurrentHashMap j = new ConcurrentHashMap();
    private final fbvw n = new fbvw();
    private final AtomicLong o = new AtomicLong();

    public fbvm(fchy fchyVar, fbmw fbmwVar, fbpn fbpnVar) {
        this.a = fchyVar;
        this.k = fbmwVar;
        this.b = fbpnVar;
        this.i = (ScheduledExecutorService) fchyVar.a();
    }

    private static Status b(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? Status.p.d(remoteException) : Status.o.d(remoteException);
    }

    private final void e() {
        fbwm fbwmVar = this.m;
        if (fbwmVar != null) {
            try {
                fbwmVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                fbwq fbwqVarC = fbwq.c();
                try {
                    fbwqVarC.a().writeInt(0);
                    this.m.a(2, fbwqVarC);
                    fbwqVarC.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    final boolean A(int i) {
        return this.q == i;
    }

    protected fbwb C(int i) {
        return null;
    }

    @Override // defpackage.fbwc
    public final boolean D(int i, Parcel parcel) {
        fbwq fbwqVarC;
        fbwp fbwpVar;
        fcmp fcmpVar;
        try {
            if (i < 1001) {
                synchronized (this) {
                    if (i == 1) {
                        i(parcel);
                    } else if (i == 2) {
                        u(Status.p.withDescription("transport shutdown by peer"), true);
                    } else if (i != 3) {
                        if (i == 4) {
                            int i2 = parcel.readInt();
                            if (this.q == 3) {
                                try {
                                    fbwqVarC = fbwq.c();
                                    try {
                                        fbwqVarC.a().writeInt(i2);
                                        this.m.a(5, fbwqVarC);
                                        fbwqVarC.close();
                                    } finally {
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else {
                            if (i != 5) {
                                return false;
                            }
                            h(parcel);
                        }
                    } else if (this.n.a(parcel.readLong())) {
                        e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                        LinkedHashSet linkedHashSet = this.d;
                        ConcurrentHashMap concurrentHashMap = this.j;
                        linkedHashSet.addAll(concurrentHashMap.keySet());
                        Iterator it = linkedHashSet.iterator();
                        while (w() && it.hasNext()) {
                            fbwb fbwbVar = (fbwb) concurrentHashMap.get(it.next());
                            it.remove();
                            if (fbwbVar != null) {
                                synchronized (fbwbVar) {
                                    fbwpVar = fbwbVar.e;
                                    fcmpVar = fbwbVar.g;
                                }
                                if (fcmpVar != null) {
                                    fcmpVar.e();
                                }
                                if (fbwpVar != null) {
                                    try {
                                        synchronized (fbwpVar) {
                                            fbwpVar.g();
                                        }
                                    } catch (StatusException e2) {
                                        synchronized (fbwbVar) {
                                            fbwbVar.h(e2.a);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            } else {
                int iDataSize = parcel.dataSize();
                ConcurrentHashMap concurrentHashMap2 = this.j;
                Integer numValueOf = Integer.valueOf(i);
                fbwb fbwbVarC = (fbwb) concurrentHashMap2.get(numValueOf);
                if (fbwbVarC == null) {
                    synchronized (this) {
                        if (!x() && (fbwbVarC = C(i)) != null) {
                            fbwb fbwbVar2 = (fbwb) this.j.put(numValueOf, fbwbVarC);
                            ejyb.b(fbwbVar2 == null, "impossible appearance of %s", fbwbVar2);
                        }
                    }
                }
                if (fbwbVarC != null) {
                    fbwbVarC.k(parcel);
                }
                if (this.o.addAndGet(iDataSize) - this.p <= 16384) {
                    return true;
                }
                synchronized (this) {
                    fbwm fbwmVar = this.m;
                    fbwmVar.getClass();
                    long j = this.o.get();
                    this.p = j;
                    try {
                        fbwqVarC = fbwq.c();
                    } catch (RemoteException e3) {
                        u(b(e3), true);
                    }
                    try {
                        fbwqVarC.a().writeLong(j);
                        fbwmVar.a(3, fbwqVarC);
                        fbwqVarC.close();
                    } finally {
                    }
                }
            }
            return true;
        } catch (RuntimeException e4) {
            e.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.g(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
            synchronized (this) {
                u(Status.o.d(e4), true);
                return false;
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        u(Status.p.withDescription("Peer process crashed, exited or was killed (binderDied)"), true);
    }

    public final fbpn c() {
        return this.b;
    }

    public abstract void j(Status status);

    public abstract void k();

    public void m() {
        this.a.b(this.i);
    }

    protected void p(fbwb fbwbVar) {
        v(fbwbVar.d);
    }

    public final synchronized fbmw q() {
        return this.k;
    }

    public final ScheduledExecutorService r() {
        return this.i;
    }

    final void s(fbwm fbwmVar) {
        try {
            fbwq fbwqVarC = fbwq.c();
            try {
                fbwqVarC.a().writeInt(1);
                fbwqVarC.a().writeStrongBinder(this.c);
                fbwmVar.a(1, fbwqVarC);
                fbwqVarC.close();
            } finally {
            }
        } catch (RemoteException e2) {
            u(b(e2), true);
        }
    }

    final void t(int i, fbwq fbwqVar) throws StatusException {
        int iDataSize = fbwqVar.a().dataSize();
        try {
            this.m.a(i, fbwqVar);
            if (this.n.b(iDataSize)) {
                e.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw b(e2).asException();
        }
    }

    final void u(final Status status, boolean z) {
        if (!x()) {
            this.l = status;
            z(4);
            j(status);
        }
        if (A(5)) {
            return;
        }
        if (z || this.j.isEmpty()) {
            this.c.a = null;
            z(5);
            e();
            ConcurrentHashMap concurrentHashMap = this.j;
            final ArrayList arrayList = new ArrayList(concurrentHashMap.values());
            concurrentHashMap.clear();
            this.i.execute(new Runnable() { // from class: fbvf
                @Override // java.lang.Runnable
                public final void run() {
                    Status status2 = status;
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        fbwb fbwbVar = (fbwb) arrayList2.get(i);
                        synchronized (fbwbVar) {
                            fbwbVar.h(status2);
                        }
                    }
                    fbvm fbvmVar = this.a;
                    synchronized (fbvmVar) {
                        fbvmVar.k();
                    }
                    fbvmVar.m();
                }
            });
        }
    }

    final void v(int i) {
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap.remove(Integer.valueOf(i)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        this.i.execute(new Runnable() { // from class: fbve
            @Override // java.lang.Runnable
            public final void run() {
                fbvm fbvmVar = this.a;
                synchronized (fbvmVar) {
                    if (fbvmVar.A(4)) {
                        fbvmVar.u(fbvmVar.l, true);
                    }
                }
            }
        });
    }

    final boolean w() {
        return !this.n.a;
    }

    final boolean x() {
        return A(4) || A(5);
    }

    protected final boolean y(fbwm fbwmVar) {
        this.m = fbwmVar;
        try {
            fbwmVar.b.linkToDeath(this, 0);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    final void z(int i) {
        int i2 = this.q;
        int i3 = i - 1;
        if (i3 == 1) {
            ejwl.l(i2 == 1);
        } else if (i3 == 2) {
            ejwl.l(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            ejwl.l(i2 == 4);
        } else {
            ejwl.l(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.q = i;
    }

    protected void h(Parcel parcel) {
    }

    protected void i(Parcel parcel) {
    }
}
