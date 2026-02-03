package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcoo implements fcqq {
    private static final Logger d = Logger.getLogger(fcpj.class.getName());
    public final fcon a;
    public final fcqq b;
    public final fcpm c = new fcpm(Level.FINE, fcpj.class);

    public fcoo(fcon fconVar, fcqq fcqqVar) {
        this.a = fconVar;
        this.b = fcqqVar;
    }

    @Override // defpackage.fcqq
    public final void a(fcrc fcrcVar) {
        throw null;
    }

    @Override // defpackage.fcqq
    public final void b() {
        throw null;
    }

    @Override // defpackage.fcqq
    public final void c(boolean z, int i, ffez ffezVar, int i2) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.fcqq
    public final void d() {
        try {
            this.b.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fcqq
    public final void e(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        if (z) {
            fcpm fcpmVar = this.c;
            if (fcpmVar.a()) {
                long j3 = j | j2;
                fcpmVar.a.logp(fcpmVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", fcpk.a(2) + " PING: ack=true bytes=" + j3);
            }
        } else {
            this.c.d(2, j | j2);
        }
        try {
            fcqq fcqqVar = this.b;
            if (z) {
                ((fcok) fcqqVar).a.h++;
            }
            ((fcop) fcqqVar).b.e(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fcqq
    public final void f(int i, fcqp fcqpVar) {
        this.c.e(2, i, fcqpVar);
        try {
            fcqq fcqqVar = this.b;
            ((fcok) fcqqVar).a.h++;
            ((fcop) fcqqVar).b.f(i, fcqpVar);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fcqq
    public final void g(fcrc fcrcVar) {
        throw null;
    }

    @Override // defpackage.fcqq
    public final void h(int i, long j) {
        this.c.g(2, i, j);
        try {
            ((fcop) this.b).b.h(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fcqq
    public final void i(fcqp fcqpVar, byte[] bArr) {
        this.c.c(2, 0, fcqpVar, fffd.f(bArr));
        try {
            fcqq fcqqVar = this.b;
            ((fcop) fcqqVar).b.i(fcqpVar, bArr);
            fcqqVar.d();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.fcqq
    public final void j(boolean z, int i, List list) {
        throw null;
    }
}
