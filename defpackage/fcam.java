package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcam extends fbnh {
    public static final double a;
    private static final Logger l = Logger.getLogger(fcam.class.getName());
    public final fbrk b;
    public final Executor c;
    public final fcab d;
    public final fbog e;
    public fcag f;
    public fbnc g;
    public fcan h;
    public final ScheduledExecutorService i;
    public fboo j = fboo.b;
    public fbns k = fbns.a;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final fcfx q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public fcam(fbrk fbrkVar, Executor executor, fbnc fbncVar, fcfx fcfxVar, ScheduledExecutorService scheduledExecutorService, fcab fcabVar) {
        this.b = fbrkVar;
        String str = fbrkVar.b;
        System.identityHashCode(this);
        int i = fcsr.a;
        if (executor == eoqg.a) {
            this.c = new fcky();
            this.m = true;
        } else {
            this.c = new fclc(executor);
            this.m = false;
        }
        this.d = fcabVar;
        this.e = fbog.k();
        fbrj fbrjVar = fbrkVar.a;
        this.n = fbrjVar == fbrj.UNARY || fbrjVar == fbrj.SERVER_STREAMING;
        this.g = fbncVar;
        this.q = fcfxVar;
        this.i = scheduledExecutorService;
    }

    public static final void g(fbng fbngVar, Status status, fbrg fbrgVar) {
        try {
            fbngVar.a(status, fbrgVar);
        } catch (RuntimeException e) {
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    private final void h(Object obj) {
        ejwl.m(this.h != null, "Not started");
        ejwl.m(!this.o, "call was cancelled");
        ejwl.m(!this.p, "call was half-closed");
        try {
            fcan fcanVar = this.h;
            if (fcanVar instanceof fckp) {
                fckp fckpVar = (fckp) fcanVar;
                fcke fckeVar = fckpVar.w;
                if (fckeVar.a) {
                    fckeVar.f.a.n(fckpVar.j.b(obj));
                } else {
                    fckpVar.v(new fcjs(fckpVar, obj));
                }
            } else {
                fcanVar.n(this.b.b(obj));
            }
            if (this.n) {
                return;
            }
            this.h.d();
        } catch (Error e) {
            this.h.c(Status.c.withDescription("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.h.c(Status.c.d(e2).withDescription("Failed to stream message"));
        }
    }

    @Override // defpackage.fbnh
    public final void a(fbng fbngVar, fbrg fbrgVar) {
        fbnr fbnrVar;
        fcan fcfwVar;
        ScheduledExecutorService scheduledExecutorService;
        fbnc fbncVar;
        int i = fcsr.a;
        ejwl.m(this.h == null, "Already started");
        ejwl.m(!this.o, "call was cancelled");
        fbngVar.getClass();
        fbrgVar.getClass();
        fbog fbogVar = this.e;
        if (fbogVar.i()) {
            this.h = fchx.c;
            this.c.execute(new fcae(this, fbngVar));
            return;
        }
        fchi fchiVar = (fchi) this.g.h(fchi.a);
        if (fchiVar != null) {
            Long l2 = fchiVar.b;
            if (l2 != null) {
                fbol fbolVarC = fbol.c(l2.longValue(), TimeUnit.NANOSECONDS);
                fbol fbolVar = this.g.b;
                if (fbolVar == null || fbolVarC.compareTo(fbolVar) < 0) {
                    this.g = this.g.b(fbolVarC);
                }
            }
            Boolean bool = fchiVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    fbna fbnaVarA = fbnc.a(this.g);
                    fbnaVarA.g = Boolean.TRUE;
                    fbncVar = new fbnc(fbnaVarA);
                } else {
                    fbna fbnaVarA2 = fbnc.a(this.g);
                    fbnaVarA2.g = Boolean.FALSE;
                    fbncVar = new fbnc(fbnaVarA2);
                }
                this.g = fbncVar;
            }
            Integer num = fchiVar.d;
            if (num != null) {
                fbnc fbncVar2 = this.g;
                Integer num2 = fbncVar2.h;
                if (num2 != null) {
                    this.g = fbncVar2.d(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.g = fbncVar2.d(num.intValue());
                }
            }
            Integer num3 = fchiVar.e;
            if (num3 != null) {
                fbnc fbncVar3 = this.g;
                Integer num4 = fbncVar3.i;
                if (num4 != null) {
                    this.g = fbncVar3.e(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.g = fbncVar3.e(num3.intValue());
                }
            }
        }
        String str = this.g.f;
        if (str != null) {
            fbnrVar = (fbnr) this.k.b.get(str);
            if (fbnrVar == null) {
                this.h = fchx.c;
                this.c.execute(new fcaf(this, fbngVar, str));
                return;
            }
        } else {
            fbnrVar = fbnp.a;
        }
        fboo fbooVar = this.j;
        fbrgVar.f(fcdy.g);
        fbrb fbrbVar = fcdy.c;
        fbrgVar.f(fbrbVar);
        if (fbnrVar != fbnp.a) {
            fbrgVar.h(fbrbVar, fbnrVar.c());
        }
        fbrb fbrbVar2 = fcdy.d;
        fbrgVar.f(fbrbVar2);
        byte[] bArr = fbooVar.c;
        if (bArr.length != 0) {
            fbrgVar.h(fbrbVar2, bArr);
        }
        fbrgVar.f(fcdy.e);
        fbrgVar.f(fcdy.f);
        fbol fbolVarB = b();
        boolean z = fbolVarB != null && fbolVarB.equals(fbogVar.b());
        fcag fcagVar = new fcag(this, fbolVarB, z);
        this.f = fcagVar;
        if (fbolVarB == null || fcagVar.c > 0) {
            fcfx fcfxVar = this.q;
            fbrk fbrkVar = this.b;
            fbnc fbncVar4 = this.g;
            fcgx fcgxVar = fcfxVar.b;
            if (fcgxVar.R) {
                fchi fchiVar2 = (fchi) fbncVar4.h(fchi.a);
                fcfwVar = new fcfw(fcfxVar, fbrkVar, fbrgVar, fbncVar4, fchiVar2 == null ? null : fchiVar2.f, fchiVar2 != null ? fchiVar2.g : null, fbogVar);
            } else {
                fbnm[] fbnmVarArrL = fcdy.l(fbncVar4);
                fbog fbogVarA = fbogVar.a();
                try {
                    fcfwVar = fcgxVar.z.d(fbrkVar, fbrgVar, fbncVar4, fbnmVarArrL);
                } finally {
                    fbogVar.f(fbogVarA);
                }
            }
            this.h = fcfwVar;
        } else {
            fbnm[] fbnmVarArrL2 = fcdy.l(this.g);
            String str2 = true != z ? "CallOptions" : "Context";
            Long l3 = (Long) this.g.h(fbnm.f);
            double d = this.f.c;
            double d2 = a;
            this.h = new fcdh(Status.f.withDescription(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str2, Double.valueOf(d / d2), Double.valueOf(l3 == null ? 0.0d : l3.longValue() / d2))), fbnmVarArrL2);
        }
        if (this.m) {
            this.h.f();
        }
        fbnc fbncVar5 = this.g;
        String str3 = fbncVar5.d;
        Integer num5 = fbncVar5.h;
        if (num5 != null) {
            this.h.k(num5.intValue());
        }
        Integer num6 = this.g.i;
        if (num6 != null) {
            this.h.l(num6.intValue());
        }
        if (fbolVarB != null) {
            this.h.i(fbolVarB);
        }
        this.h.h(fbnrVar);
        this.h.j(this.j);
        this.d.b();
        this.h.m(new fcal(this, fbngVar));
        fcag fcagVar2 = this.f;
        if (fcagVar2.e) {
            return;
        }
        if (fcagVar2.b && !fcagVar2.a && (scheduledExecutorService = fcagVar2.f.i) != null) {
            fcagVar2.d = scheduledExecutorService.schedule(new fcfl(fcagVar2), fcagVar2.c, TimeUnit.NANOSECONDS);
        }
        fcagVar2.f.e.d(fcagVar2, eoqg.a);
        if (fcagVar2.e) {
            fcagVar2.c();
        }
    }

    public final fbol b() {
        fbol fbolVar = this.g.b;
        fbol fbolVarB = this.e.b();
        if (fbolVar != null) {
            if (fbolVarB != null) {
                fbolVar.e(fbolVarB);
                if (true != fbolVar.f(fbolVarB)) {
                }
            }
            return fbolVar;
        }
        return fbolVarB;
    }

    @Override // defpackage.fbnh
    public final void c(String str, Throwable th) {
        int i = fcsr.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        try {
            if (this.h != null) {
                Status status = Status.c;
                Status statusWithDescription = str != null ? status.withDescription(str) : status.withDescription("Call cancelled without message");
                if (th != null) {
                    statusWithDescription = statusWithDescription.d(th);
                }
                this.h.c(statusWithDescription);
            }
            fcag fcagVar = this.f;
            if (fcagVar != null) {
                fcagVar.c();
            }
        } finally {
        }
    }

    @Override // defpackage.fbnh
    public final void d() {
        int i = fcsr.a;
        ejwl.m(this.h != null, "Not started");
        ejwl.m(!this.o, "call was cancelled");
        ejwl.m(!this.p, "call already half-closed");
        this.p = true;
        this.h.e();
    }

    @Override // defpackage.fbnh
    public final void e(int i) {
        int i2 = fcsr.a;
        ejwl.m(this.h != null, "Not started");
        ejwl.b(i >= 0, "Number requested must be non-negative");
        this.h.g(i);
    }

    @Override // defpackage.fbnh
    public final void f(Object obj) {
        int i = fcsr.a;
        h(obj);
    }

    @Override // defpackage.fbnh
    public final boolean k() {
        if (this.p) {
            return false;
        }
        return this.h.o();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("method", this.b);
        return ejwfVarB.toString();
    }
}
