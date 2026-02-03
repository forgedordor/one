package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbyq implements fcan {
    final fcmm a;
    final fbnc b;
    public fcmb c;
    public final fbtk d;
    public int e;
    public final ArrayDeque f = new ArrayDeque();
    public boolean g;
    public boolean h;
    final /* synthetic */ fbyz i;
    private int j;

    public fbyq(fbyz fbyzVar, fbnc fbncVar, fcmm fcmmVar) {
        this.i = fbyzVar;
        this.d = new fbtk(fbyzVar.f.l);
        this.b = fbncVar;
        this.a = fcmmVar;
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        throw null;
    }

    @Override // defpackage.fcan
    public final void c(Status status) {
        fbyz fbyzVar = this.i;
        if (q(fbzb.b(status, fbyzVar.f.d))) {
            fbyzVar.b.q(status);
            fbyzVar.a();
        }
    }

    @Override // defpackage.fcan
    public final void e() {
        synchronized (this) {
            if (this.h) {
                return;
            }
            if (this.f.isEmpty()) {
                this.d.c(new Runnable() { // from class: fbyn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c.b();
                    }
                });
            } else {
                this.g = true;
            }
            this.d.b();
        }
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        final fbyy fbyyVar = this.i.b;
        synchronized (fbyyVar) {
            if (fbyyVar.h) {
                return;
            }
            int i2 = fbyyVar.d;
            fbyyVar.d = i + i2;
            while (fbyyVar.d > 0) {
                ArrayDeque arrayDeque = fbyyVar.e;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                fbyyVar.d--;
                final fcmo fcmoVar = (fcmo) arrayDeque.poll();
                fbyyVar.c.c(new Runnable() { // from class: fbyr
                    @Override // java.lang.Runnable
                    public final void run() {
                        fbyyVar.b.d(fcmoVar);
                    }
                });
            }
            if (fbyyVar.e.isEmpty() && fbyyVar.f != null) {
                fbyyVar.h = true;
                fcmm fcmmVar = fbyyVar.i.a.a;
                fcmmVar.e();
                fcmmVar.n();
                final Status status = fbyyVar.f;
                final fbrg fbrgVar = fbyyVar.g;
                fbyyVar.c.c(new Runnable() { // from class: fbys
                    @Override // java.lang.Runnable
                    public final void run() {
                        fbyyVar.b.a(status, fcao.PROCESSED, fbrgVar);
                    }
                });
            }
            int i3 = fbyyVar.d;
            fbyyVar.c.b();
            if (i2 > 0 || i3 <= 0) {
                return;
            }
            synchronized (this) {
                if (!this.h) {
                    this.d.c(new Runnable() { // from class: fbyk
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c.e();
                        }
                    });
                }
            }
            this.d.b();
        }
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        fbrg fbrgVar = this.i.c;
        fbrb fbrbVar = fcdy.b;
        fbrgVar.f(fbrbVar);
        fbrgVar.h(fbrbVar, Long.valueOf(Math.max(0L, fbolVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.fcan
    public final void m(fcap fcapVar) {
        fbyz fbyzVar = this.i;
        fbyy fbyyVar = fbyzVar.b;
        fbyyVar.p(fcapVar);
        fbzb fbzbVar = fbyzVar.f;
        synchronized (fbzbVar) {
            this.a.a();
            fbzbVar.j.add(fbyzVar);
            if (fcdy.j(this.b)) {
                fbzbVar.m.c(fbyzVar, true);
            }
            fbzbVar.e.a(fbyyVar, fbyzVar.d.b, fbyzVar.c);
        }
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
            fcmm fcmmVar2 = this.i.b.a;
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
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
                this.d.c(new Runnable() { // from class: fbyl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c.d(fbzaVar);
                    }
                });
            } else {
                this.f.add(fbzaVar);
            }
            this.d.b();
        }
    }

    @Override // defpackage.fcmn
    public final synchronized boolean o() {
        if (this.h) {
            return false;
        }
        return this.e > 0;
    }

    public final synchronized void p(fcmb fcmbVar) {
        this.c = fcmbVar;
    }

    public final boolean q(final Status status) {
        synchronized (this) {
            if (this.h) {
                return false;
            }
            this.h = true;
            while (true) {
                fcmo fcmoVar = (fcmo) this.f.poll();
                if (fcmoVar == null) {
                    this.i.b.a.n();
                    this.d.c(new Runnable() { // from class: fbym
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c.a(status);
                        }
                    });
                    this.d.b();
                    return true;
                }
                while (true) {
                    InputStream inputStreamG = fcmoVar.g();
                    if (inputStreamG != null) {
                        try {
                            inputStreamG.close();
                        } catch (Throwable th) {
                            fbzb.a.logp(Level.WARNING, "io.grpc.inprocess.InProcessTransport$InProcessStream$InProcessClientStream", "internalCancel", "Exception closing stream", th);
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

    @Override // defpackage.fcan
    public final void b(fceg fcegVar) {
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
    }

    @Override // defpackage.fcan
    public final void k(int i) {
    }

    @Override // defpackage.fcan
    public final void l(int i) {
    }
}
