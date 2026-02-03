package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgfs implements ebkw {
    public static final /* synthetic */ int h = 0;
    private static final long i = TimeUnit.MINUTES.toMillis(1);
    public final dfht a;
    public final dhip b;
    public long f;
    private final diep j;
    private final eosd k;
    private final fcsu o;
    private final AtomicReference l = new AtomicReference();
    private final dgfr m = new dgfr(this);
    private final dgfq n = new dgfq(this);
    public fcsu c = new fcsu() { // from class: dgfo
        @Override // defpackage.fcsu
        public final Object b() {
            return Optional.empty();
        }
    };
    public int d = 180;
    public int e = 180;
    private final AtomicBoolean p = new AtomicBoolean(false);
    public final Collection g = new CopyOnWriteArrayList();

    public dgfs(diep diepVar, Context context, fcsu fcsuVar, dhip dhipVar, eosd eosdVar) {
        this.j = diepVar;
        this.b = dhipVar;
        this.o = fcsuVar;
        this.k = eosdVar;
        this.a = dfht.a(context, dhipVar.a.concat(".keep_alive_manager"));
    }

    private final String l() {
        dfyu dfyuVarA = a();
        return dfyuVarA == null ? "Unknown Network Interface" : String.valueOf(dfyuVarA.h);
    }

    private final void m() {
        this.p.set(true);
        if (craf.d) {
            DesugarAtomicReference.updateAndGet(this.l, new UnaryOperator() { // from class: dgfp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) obj;
                    int i2 = dgfs.h;
                    if (scheduledFuture == null) {
                        return null;
                    }
                    scheduledFuture.cancel(false);
                    return null;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            this.a.b();
        }
    }

    private final void n() {
        i(this.d);
    }

    private final void o(Runnable runnable, long j) {
        this.l.set(this.k.schedule(runnable, j, TimeUnit.SECONDS));
    }

    private final synchronized void p() {
        eblf eblfVar = ((eblg) this.o).a;
        try {
            dhja.d(this.b, "Sending keep-alive response on i/f = %s", l());
            try {
                dhja.d(eblfVar.a(), "Sending keepAlive response message", new Object[0]);
                eblfVar.c().d(new eboz());
                dhja.d(eblfVar.a(), "KeepAliveResponse sent", new Object[0]);
            } catch (ebmn e) {
                dhja.j(e, eblfVar.a(), "Can't send keep alive response", new Object[0]);
                throw e;
            }
        } catch (ebmn e2) {
            dhja.t(e2, this.b, "Sending keep-alive response has failed. Restarting IMS connection.", new Object[0]);
        }
    }

    public final dfyu a() {
        return (dfyu) ((Optional) this.c.b()).orElse(null);
    }

    public final void b(dgft dgftVar) {
        this.g.add(dgftVar);
    }

    public final synchronized void c() {
        m();
    }

    public final synchronized void d(int i2) {
        this.d = i2;
        dhja.l(this.b, "Enabling keep-alives. Period = %ds", Integer.valueOf(i2));
        n();
    }

    @Override // defpackage.ebkw
    public final synchronized void e() {
        dhja.d(this.b, "Received keep-alive request on i/f = %s", l());
        p();
        h();
    }

    @Override // defpackage.ebkw
    public final synchronized void f() {
        dhja.d(this.b, "Received keep-alive response on i/f = %s", l());
        m();
        n();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dgft) it.next()).a();
        }
    }

    public final void g(dgft dgftVar) {
        this.g.remove(dgftVar);
    }

    public final synchronized void h() {
        if (k()) {
            dhja.l(this.b, "Resetting keep-alive timer. Next ping in %ds on i/f = %s", Integer.valueOf((int) (this.d * 0.9d)), l());
            this.f = this.j.f().toEpochMilli();
            m();
            n();
        }
    }

    public final void i(int i2) {
        this.p.set(false);
        dgfq dgfqVar = this.n;
        Thread threadB = dhlc.a().b("keep_alive_sender", dgfqVar, i);
        if (i2 <= 0) {
            dhja.r(this.b, "Starting keep-alive immediately. %d", Integer.valueOf(i2));
            threadB.start();
            return;
        }
        long j = (long) (i2 * 0.9d);
        if (craf.d) {
            o(dgfqVar, j);
        } else {
            this.a.d(threadB, j);
        }
    }

    public final synchronized void j() {
        eblf eblfVar = ((eblg) this.o).a;
        if (!eblfVar.v()) {
            if (this.p.get()) {
                dhja.d(this.b, "Canceled", new Object[0]);
                return;
            }
            try {
                dhja.d(this.b, "Sending keep-alive request on i/f = %s", l());
                if (craf.d) {
                    o(this.m, dfpo.d());
                } else {
                    this.a.d(dhlc.a().b("keep_alive_timeout", this.m, i), dfpo.d());
                }
                try {
                    dhja.d(eblfVar.a(), "Sending keepAlive request message", new Object[0]);
                    eblfVar.c().d(new eboy());
                    dhja.d(eblfVar.a(), "KeepAliveRequest sent", new Object[0]);
                    this.f = this.j.f().toEpochMilli();
                } catch (ebmn e) {
                    dhja.j(e, eblfVar.a(), "Can't send keep alive", new Object[0]);
                    throw e;
                }
            } catch (Exception e2) {
                dhja.t(e2, this.b, "Sending keep-alive request has failed. Restarting IMS connection.", new Object[0]);
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((dgft) it.next()).c();
                }
            }
        }
    }

    public final boolean k() {
        if (!craf.d) {
            return this.a.e();
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.l.get();
        return (scheduledFuture == null || scheduledFuture.isDone()) ? false : true;
    }
}
