package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.setupcompat.ISetupCompatService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsa {
    public static final efte a = new efte("SetupCompatServiceProvider");
    static final Intent b = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    private static volatile efsa d;
    private final Context f;
    final ServiceConnection c = new efrx(this);
    private volatile efry e = new efry(1);
    private final AtomicReference g = new AtomicReference();

    public efsa(Context context) {
        this.f = context.getApplicationContext();
    }

    public static ISetupCompatService a(Context context, long j, TimeUnit timeUnit) {
        efrt.c(context, "Context object cannot be null.");
        efsa efsaVar = d;
        if (efsaVar == null) {
            synchronized (efsa.class) {
                efsaVar = d;
                if (efsaVar == null) {
                    efsaVar = new efsa(context.getApplicationContext());
                    d = efsaVar;
                    d.e();
                }
            }
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
        efry efryVarD = efsaVar.d();
        int i = efryVarD.b - 1;
        if (i == 0) {
            a.f("NOT_STARTED state only possible before instance is created.");
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return efryVarD.a;
                }
                if (i != 4) {
                    if (i != 5) {
                        efsaVar.e();
                        return efsaVar.c(j, timeUnit);
                    }
                }
            }
            return efsaVar.c(j, timeUnit);
        }
        return null;
    }

    private final ISetupCompatService c(long j, TimeUnit timeUnit) throws TimeoutException {
        CountDownLatch countDownLatch;
        efry efryVarD = d();
        if (efryVarD.b == 4) {
            return efryVarD.a;
        }
        loop0: while (true) {
            AtomicReference atomicReference = this.g;
            countDownLatch = (CountDownLatch) atomicReference.get();
            if (countDownLatch == null) {
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                while (!atomicReference.compareAndSet(null, countDownLatch2)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                countDownLatch = countDownLatch2;
                break loop0;
            }
            break;
        }
        efte efteVar = a;
        efteVar.b("Waiting for service to get connected");
        if (!countDownLatch.await(j, timeUnit)) {
            e();
            throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
        }
        efry efryVarD2 = d();
        efteVar.b(String.format("Finished waiting for service to get connected. Current state = %s", efrz.a(efryVarD2.b)));
        return efryVarD2.a;
    }

    private final synchronized efry d() {
        return this.e;
    }

    private final synchronized void e() {
        int i = d().b;
        if (i == 4) {
            a.b("Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            a.b("Unbinding existing service connection.");
            this.f.unbindService(this.c);
        }
        try {
            if (this.f.bindService(b, this.c, 1)) {
                if (this.e.b != 4) {
                    b(new efry(3));
                    a.b("Context#bindService went through, now waiting for service connection");
                    return;
                }
                return;
            }
        } catch (SecurityException e) {
            a.d("Unable to bind to compat service. ".concat(e.toString()));
        }
        b(new efry(2));
        a.d("Context#bindService did not succeed.");
    }

    final void b(efry efryVar) {
        a.b(String.format("State changed: %s -> %s", efrz.a(this.e.b), efrz.a(efryVar.b)));
        this.e = efryVar;
        CountDownLatch countDownLatch = (CountDownLatch) this.g.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
