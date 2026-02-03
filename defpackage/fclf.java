package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fclf extends fbsm {
    private static final Logger d = Logger.getLogger(fclf.class.getName());
    public final fbrk a;
    public final fbnz b;
    public volatile boolean c;
    private final fcma e;
    private final byte[] f;
    private final fboo g;
    private final fcab h;
    private boolean i;
    private boolean j;
    private fbnr k;
    private boolean l;

    public fclf(fcma fcmaVar, fbrk fbrkVar, fbrg fbrgVar, fbnz fbnzVar, fboo fbooVar, fcab fcabVar) {
        this.e = fcmaVar;
        this.a = fbrkVar;
        this.b = fbnzVar;
        this.f = (byte[]) fbrgVar.c(fcdy.d);
        this.g = fbooVar;
        this.h = fcabVar;
        fcabVar.b();
    }

    private final void i(Throwable th) {
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.e.c(th instanceof fbtf ? ((fbtf) th).a : Status.o.d(th).withDescription("Internal error so cancelling stream."));
        this.h.a(false);
    }

    private final void j(Object obj) {
        ejwl.m(this.i, "sendHeaders has not been called");
        ejwl.m(!this.j, "call is closed");
        fbrk fbrkVar = this.a;
        fbrj fbrjVar = fbrkVar.a;
        if (fbrjVar.b() && this.l) {
            i(new fbtf(Status.o.withDescription("Too many responses")));
            return;
        }
        this.l = true;
        try {
            InputStream inputStreamA = fbrkVar.e.a(obj);
            fcma fcmaVar = this.e;
            fcmaVar.n(inputStreamA);
            if (fbrjVar.b()) {
                return;
            }
            fcmaVar.d();
        } catch (Error e) {
            a(Status.c.withDescription("Server sendMessage() failed with Error"), new fbrg());
            throw e;
        } catch (RuntimeException e2) {
            i(e2);
        }
    }

    @Override // defpackage.fbsm
    public final void a(Status status, fbrg fbrgVar) {
        fcab fcabVar;
        int i = fcsr.a;
        ejwl.m(!this.j, "call already closed");
        try {
            this.j = true;
            if (status.f() && this.a.a.b() && !this.l) {
                i(new fbtf(Status.o.withDescription("Completed without a response")));
                fcabVar = this.h;
            } else {
                this.e.e(status, fbrgVar);
                fcabVar = this.h;
            }
            fcabVar.a(status.f());
        } catch (Throwable th) {
            this.h.a(status.f());
            throw th;
        }
    }

    @Override // defpackage.fbsm
    public final void b(fbrg fbrgVar) {
        byte[] bArr;
        int i = fcsr.a;
        ejwl.m(!this.i, "sendHeaders has already been called");
        ejwl.m(!this.j, "call is closed");
        fbrgVar.f(fcdy.g);
        fbrb fbrbVar = fcdy.c;
        fbrgVar.f(fbrbVar);
        if (this.k != null && (bArr = this.f) != null) {
            Iterator it = fcdy.k.g(new String(bArr, fcdy.a)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.k = fbnp.a;
                    break;
                } else if (ejwh.a(it.next(), "identity")) {
                    break;
                }
            }
        } else {
            this.k = fbnp.a;
        }
        fbrgVar.h(fbrbVar, "identity");
        fcma fcmaVar = this.e;
        fcmaVar.h(this.k);
        fbrb fbrbVar2 = fcdy.d;
        fbrgVar.f(fbrbVar2);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            fbrgVar.h(fbrbVar2, bArr2);
        }
        this.i = true;
        fbrj fbrjVar = this.a.a;
        fcmaVar.l(fbrgVar);
    }

    @Override // defpackage.fbsm
    public final fbrk d() {
        return this.a;
    }

    @Override // defpackage.fbsm
    public final void e(Object obj) {
        int i = fcsr.a;
        j(obj);
    }

    @Override // defpackage.fbsm
    public final fbmw f() {
        return this.e.a();
    }

    @Override // defpackage.fbsm
    public final void g(int i) {
        int i2 = fcsr.a;
        this.e.g(i);
    }

    @Override // defpackage.fbsm
    public final boolean h() {
        if (this.j) {
            return false;
        }
        return this.e.o();
    }
}
