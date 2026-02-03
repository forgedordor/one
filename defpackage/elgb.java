package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgb extends eooi {
    public static final Logger a = Logger.getLogger(elgb.class.getCanonicalName());
    public static final Object b = new Object();
    static final elga c = new elfu();
    public final ejxr d;
    public final elfq e;
    public final ejwm f;
    public final ejxm g;
    public final eosd h;
    public final elga i;
    private final Executor o;
    public volatile int j = 0;
    private final AtomicReference p = new AtomicReference(eork.i(new Object()));

    public elgb(ejxr ejxrVar, elfq elfqVar, ejwm ejwmVar, Executor executor, ScheduledExecutorService scheduledExecutorService, ejya ejyaVar, elga elgaVar) {
        this.d = ejxrVar;
        this.e = elfqVar;
        this.f = ejwmVar;
        this.o = new elfw(this, executor);
        this.h = eosj.b(scheduledExecutorService);
        this.i = elgaVar;
        this.g = ejxm.c(ejyaVar);
        d(0L, TimeUnit.MILLISECONDS);
        b(new elfv(elgaVar), executor);
    }

    public final void d(final long j, final TimeUnit timeUnit) {
        AtomicReference atomicReference = this.p;
        SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture listenableFutureG = (ListenableFuture) atomicReference.getAndSet(settableFutureCreate);
        if (j != 0) {
            listenableFutureG = eooq.g(listenableFutureG, new eooz() { // from class: elfr
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.h.schedule(new eopa(null), j, timeUnit);
                }
            }, eoqg.a);
        }
        eooz eoozVar = new eooz() { // from class: elfs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                elgb elgbVar = this.a;
                elgbVar.j++;
                try {
                    elgbVar.i.b();
                    return (ListenableFuture) elgbVar.d.get();
                } catch (Exception e) {
                    elgbVar.setException(e);
                    return eork.i(null);
                }
            }
        };
        Executor executor = this.o;
        final ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eoozVar, executor);
        settableFutureCreate.o(eooh.g(listenableFutureG2, Exception.class, new eooz() { // from class: elft
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws elfj {
                ListenableFuture listenableFuture = listenableFutureG2;
                Exception exc = (Exception) obj;
                if (listenableFuture.isCancelled()) {
                    return listenableFuture;
                }
                elgb elgbVar = this.a;
                int i = elgbVar.j;
                elgbVar.g.d().getClass();
                elfq elfqVar = elgbVar.e;
                long millis = (!elfqVar.b(i) ? elfq.d : elfqVar.a(i)).toMillis();
                if (millis < 0 || !elgbVar.f.a(exc)) {
                    elgbVar.i.d(exc);
                    int i2 = elgbVar.j;
                    throw new elfj(exc);
                }
                elgbVar.i.c(exc, millis);
                elgbVar.d(millis, TimeUnit.MILLISECONDS);
                return eork.i(elgb.b);
            }
        }, executor));
        settableFutureCreate.b(new elfx(this, settableFutureCreate), eoqg.a);
    }

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = (ListenableFuture) this.p.get();
        String string = listenableFuture.toString();
        elfq elfqVar = this.e;
        ejwm ejwmVar = this.f;
        return "futureSupplier=[" + this.d.toString() + "], shouldContinue=[" + ejwmVar.toString() + "], strategy=[" + elfqVar.toString() + "], tries=[" + this.j + "]" + (listenableFuture.isDone() ? "" : a.a(string, ", activeTry=[", "]"));
    }

    @Override // defpackage.eooi
    protected final void gv() {
        ListenableFuture listenableFuture = (ListenableFuture) this.p.getAndSet(eork.g());
        if (listenableFuture != null) {
            boolean z = true;
            if (isCancelled() && !p()) {
                z = false;
            }
            listenableFuture.cancel(z);
        }
    }
}
