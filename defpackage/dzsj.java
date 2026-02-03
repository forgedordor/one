package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzsj extends dzsc implements dzix {
    public final Context a;
    public final eosd b;
    public final eygg c;
    public final Handler d;
    public final dzlm e;
    public final dzjd f;
    public final dzso h;
    private final Executor k;
    private final fcsu l;
    public volatile boolean g = false;
    public final Object i = new Object();
    public volatile dzsn j = null;

    public dzsj(Context context, Executor executor, eosd eosdVar, eygg eyggVar, dzln dzlnVar, dzso dzsoVar, dzjd dzjdVar, fcsu fcsuVar, Handler handler) {
        this.a = context;
        this.b = eosdVar;
        this.k = executor;
        this.c = eyggVar;
        this.l = fcsuVar;
        this.d = handler;
        this.f = dzjdVar;
        this.h = dzsoVar;
        this.e = dzlnVar.a(eosdVar, eyggVar, fcsuVar);
    }

    public final void a() {
        if (!this.e.c(null)) {
            synchronized (this.i) {
                this.f.b(this);
            }
        } else {
            eygg eyggVar = this.c;
            if (((dzsb) eyggVar.b()).h().isEmpty()) {
                ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/stall/StallMetricServiceImpl", "readConfigsAndMaybeStart", 181, "StallMetricServiceImpl.java")).r("Stall thresholds list expected to have size > 0, was %s", ((dzsb) eyggVar.b()).h().size());
            } else {
                this.b.schedule(new Runnable() { // from class: dzsd
                    @Override // java.lang.Runnable
                    public final void run() {
                        dzsj dzsjVar = this.a;
                        dzsb dzsbVar = (dzsb) dzsjVar.c.b();
                        dzso dzsoVar = dzsjVar.h;
                        diep diepVar = (diep) dzsoVar.a.b();
                        diepVar.getClass();
                        eosd eosdVar = (eosd) dzsoVar.b.b();
                        eosdVar.getClass();
                        dzhl dzhlVar = (dzhl) dzsoVar.c.b();
                        dzhlVar.getClass();
                        dzsbVar.getClass();
                        dzsjVar.j = new dzsn(diepVar, eosdVar, dzhlVar, dzsoVar.d, dzsbVar, dzsjVar.e, dzsjVar.d);
                        if (dzsjVar.g) {
                            dzsjVar.j.b();
                        }
                    }
                }, ((dzsb) eyggVar.b()).e(), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        this.g = false;
        if (this.j == null) {
            return;
        }
        eork.l(new Runnable() { // from class: dzsi
            @Override // java.lang.Runnable
            public final void run() {
                dzsj dzsjVar = this.a;
                dzsjVar.j.getClass();
                dzsn dzsnVar = dzsjVar.j;
                if (dzsnVar.i) {
                    AtomicReference atomicReference = dzsnVar.j;
                    if (atomicReference.get() == null) {
                        return;
                    }
                    dzsnVar.i = false;
                    ((Future) atomicReference.get()).cancel(false);
                }
            }
        }, this.b);
    }

    @Override // defpackage.dzix
    public final void j(dzfh dzfhVar) {
        this.g = true;
        if (this.j == null) {
            return;
        }
        eork.l(new Runnable() { // from class: dzsh
            @Override // java.lang.Runnable
            public final void run() {
                dzsj dzsjVar = this.a;
                if (dzsjVar.e.c(null)) {
                    dzsjVar.j.getClass();
                    dzsjVar.j.b();
                } else {
                    synchronized (dzsjVar.i) {
                        dzsjVar.f.b(dzsjVar);
                    }
                }
            }
        }, this.b);
    }

    @Override // defpackage.dzsc, defpackage.dzlo
    public final void n() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            fehf fehfVar = (fehf) this.l.b();
            int iA = fehe.a(fehfVar.d);
            if (iA != 0 && iA == 4 && fehfVar.c == 0) {
                return;
            }
        }
        this.f.a(this);
        eork.l(new Runnable() { // from class: dzsf
            @Override // java.lang.Runnable
            public final void run() {
                final dzsj dzsjVar = this.a;
                Context context = dzsjVar.a;
                if (dqyw.h(context)) {
                    dzsjVar.a();
                } else {
                    dqyw.c(context, new Runnable() { // from class: dzse
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dzsj dzsjVar2 = dzsjVar;
                            eork.l(new Runnable() { // from class: dzsg
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dzsjVar2.a();
                                }
                            }, dzsjVar2.b);
                        }
                    });
                }
            }
        }, this.k);
    }
}
