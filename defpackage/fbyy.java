package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyy implements fcma {
    final fcmm a;
    public fcap b;
    public final fbtk c;
    public int d;
    public final ArrayDeque e = new ArrayDeque();
    public Status f;
    public fbrg g;
    public boolean h;
    final /* synthetic */ fbyz i;
    private int j;

    public fbyy(fbyz fbyzVar) {
        this.i = fbyzVar;
        this.c = new fbtk(fbyzVar.f.l);
        this.a = fcmm.m(fbyzVar.f.k);
    }

    private final void r(Status status, final fbrg fbrgVar) {
        final Status statusB = fbzb.b(status, this.i.f.d);
        synchronized (this) {
            if (this.h) {
                return;
            }
            if (this.e.isEmpty()) {
                this.h = true;
                fcmm fcmmVar = this.i.a.a;
                fcmmVar.e();
                fcmmVar.n();
                this.c.c(new Runnable() { // from class: fbyw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b.a(statusB, fcao.PROCESSED, fbrgVar);
                    }
                });
            } else {
                this.f = statusB;
                this.g = fbrgVar;
            }
            this.c.b();
            this.i.a();
        }
    }

    @Override // defpackage.fcma
    public final fbmw a() {
        return this.i.f.f;
    }

    @Override // defpackage.fcma
    public final fcmm b() {
        return this.a;
    }

    @Override // defpackage.fcma
    public final void c(Status status) {
        if (q(Status.c.withDescription("server cancelled stream"))) {
            fbyz fbyzVar = this.i;
            fbyzVar.a.q(status);
            fbyzVar.a();
        }
    }

    @Override // defpackage.fcma
    public final void e(Status status, fbrg fbrgVar) {
        fbyz fbyzVar = this.i;
        fbyzVar.a.q(Status.b);
        int i = fbyzVar.f.c;
        if (i != Integer.MAX_VALUE) {
            int iA = fbzb.a(fbrgVar) + (status.getDescription() == null ? 0 : status.getDescription().length());
            if (iA > i) {
                status = Status.k.withDescription(String.format(Locale.US, "Response header metadata larger than %d: %d", Integer.valueOf(i), Integer.valueOf(iA)));
                fbrgVar = new fbrg();
            }
        }
        r(status, fbrgVar);
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        final fbyq fbyqVar = this.i.a;
        synchronized (fbyqVar) {
            if (!fbyqVar.h) {
                int i2 = fbyqVar.e;
                fbyqVar.e = i + i2;
                while (fbyqVar.e > 0) {
                    ArrayDeque arrayDeque = fbyqVar.f;
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    fbyqVar.e--;
                    final fcmo fcmoVar = (fcmo) arrayDeque.poll();
                    fbyqVar.d.c(new Runnable() { // from class: fbyo
                        @Override // java.lang.Runnable
                        public final void run() {
                            fbyqVar.c.d(fcmoVar);
                        }
                    });
                }
                if (fbyqVar.f.isEmpty() && fbyqVar.g) {
                    fbyqVar.g = false;
                    fbyqVar.d.c(new Runnable() { // from class: fbyp
                        @Override // java.lang.Runnable
                        public final void run() {
                            fbyqVar.c.b();
                        }
                    });
                }
                int i3 = fbyqVar.e;
                fbyqVar.d.b();
                if (i2 <= 0 && i3 > 0) {
                    synchronized (this) {
                        if (!this.h) {
                            this.c.c(new Runnable() { // from class: fbyx
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b.e();
                                }
                            });
                        }
                    }
                }
            }
        }
        this.c.b();
    }

    @Override // defpackage.fcma
    public final void i(fcmb fcmbVar) {
        this.i.a.p(fcmbVar);
    }

    @Override // defpackage.fcma
    public final void l(final fbrg fbrgVar) {
        int iA;
        fbyz fbyzVar = this.i;
        int i = fbyzVar.f.c;
        if (i != Integer.MAX_VALUE && (iA = fbzb.a(fbrgVar)) > i) {
            fbyzVar.a.q(Status.c.withDescription("Client cancelled the RPC"));
            r(Status.k.withDescription(String.format(Locale.US, "Response header metadata larger than %d: %d", Integer.valueOf(i), Integer.valueOf(iA))), new fbrg());
            return;
        }
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.i.a.a.d();
            this.c.c(new Runnable() { // from class: fbyu
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.c(fbrgVar);
                }
            });
            this.c.b();
        }
    }

    @Override // defpackage.fcma
    public final void m() {
        String str = this.i.e;
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        long jAvailable;
        if (fbzb.b) {
            try {
                jAvailable = this.i.f.h;
                if (jAvailable == -1) {
                    jAvailable = inputStream.available();
                }
            } catch (Exception e) {
                throw new RuntimeException("Error processing the message length", e);
            }
        } else {
            jAvailable = 0;
        }
        synchronized (this) {
            if (this.h) {
                return;
            }
            fcmm fcmmVar = this.a;
            fcmmVar.i();
            fcmmVar.j();
            fcmm fcmmVar2 = this.i.a.a;
            fcmmVar2.f();
            fcmmVar2.g();
            if (fbzb.b) {
                fcmmVar.k();
                fcmmVar.c(jAvailable);
                fcmmVar2.h();
                fcmmVar2.b(jAvailable);
            }
            this.j++;
            final fbza fbzaVar = new fbza(inputStream);
            int i = this.d;
            if (i > 0) {
                this.d = i - 1;
                this.c.c(new Runnable() { // from class: fbyv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b.d(fbzaVar);
                    }
                });
            } else {
                this.e.add(fbzaVar);
            }
            this.c.b();
        }
    }

    @Override // defpackage.fcmn
    public final synchronized boolean o() {
        if (this.h) {
            return false;
        }
        return this.d > 0;
    }

    public final synchronized void p(fcap fcapVar) {
        this.b = fcapVar;
    }

    public final boolean q(final Status status) {
        synchronized (this) {
            if (this.h) {
                return false;
            }
            this.h = true;
            while (true) {
                fcmo fcmoVar = (fcmo) this.e.poll();
                if (fcmoVar == null) {
                    this.i.a.a.n();
                    this.c.c(new Runnable() { // from class: fbyt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b.a(status, fcao.PROCESSED, new fbrg());
                        }
                    });
                    this.c.b();
                    return true;
                }
                while (true) {
                    InputStream inputStreamG = fcmoVar.g();
                    if (inputStreamG != null) {
                        try {
                            inputStreamG.close();
                        } catch (Throwable th) {
                            fbzb.a.logp(Level.WARNING, "io.grpc.inprocess.InProcessTransport$InProcessStream$InProcessServerStream", "internalCancel", "Exception closing stream", th);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fcmn
    public final void d() {
    }

    @Override // defpackage.fcmn
    public final void f() {
    }

    @Override // defpackage.fcma
    public final void j() {
    }

    @Override // defpackage.fcma
    public final void k() {
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
    }
}
