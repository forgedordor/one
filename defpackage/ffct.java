package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffct {
    public final int a;
    public final ffcl b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ffcr g;
    public final ffcq h;
    public final ffcs i;
    public final ffcs j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private int n;

    public ffct(int i, ffcl ffclVar, boolean z, boolean z2, feyn feynVar) {
        this.a = i;
        this.b = ffclVar;
        this.f = ffclVar.r.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.g = new ffcr(this, ffclVar.q.c(), z2);
        this.h = new ffcq(this, z);
        this.i = new ffcs(this);
        this.j = new ffcs(this);
        if (feynVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(feynVar);
        }
    }

    private final boolean n(int i, IOException iOException) {
        byte[] bArr = fezr.a;
        synchronized (this) {
            if (this.n != 0) {
                return false;
            }
            this.n = i;
            this.k = iOException;
            notifyAll();
            if (this.g.b) {
                if (this.h.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized feyn a() {
        ArrayDeque arrayDeque;
        Object objRemoveFirst;
        ffcs ffcsVar = this.i;
        ffcsVar.e();
        while (true) {
            try {
                arrayDeque = this.l;
                if (!arrayDeque.isEmpty() || this.n != 0) {
                    break;
                }
                g();
            } catch (Throwable th) {
                this.i.b();
                throw th;
            }
        }
        ffcsVar.b();
        if (arrayDeque.isEmpty()) {
            IOException iOException = this.k;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.n;
            if (i == 0) {
                throw null;
            }
            throw new ffda(i);
        }
        objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        return (feyn) objRemoveFirst;
    }

    public final fffz b() {
        synchronized (this) {
            if (!this.m && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final void c(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() {
        boolean z;
        boolean zI;
        byte[] bArr = fezr.a;
        synchronized (this) {
            ffcr ffcrVar = this.g;
            z = false;
            if (!ffcrVar.b && ffcrVar.e) {
                ffcq ffcqVar = this.h;
                if (ffcqVar.a || ffcqVar.b) {
                    z = true;
                }
            }
            zI = i();
        }
        if (z) {
            k(9, null);
        } else {
            if (zI) {
                return;
            }
            this.b.b(this.a);
        }
    }

    public final void e() throws IOException {
        ffcq ffcqVar = this.h;
        if (ffcqVar.b) {
            throw new IOException("stream closed");
        }
        if (ffcqVar.a) {
            throw new IOException("stream finished");
        }
        int i = this.n;
        if (i != 0) {
            IOException iOException = this.k;
            if (iOException == null) {
                throw new ffda(i);
            }
            throw iOException;
        }
    }

    public final void f(feyn feynVar, boolean z) {
        boolean zI;
        feynVar.getClass();
        byte[] bArr = fezr.a;
        synchronized (this) {
            if (this.m) {
                if (!z) {
                    z = false;
                    this.m = true;
                    this.l.add(feynVar);
                    if (z) {
                    }
                    zI = i();
                    notifyAll();
                }
                this.g.b = true;
                zI = i();
                notifyAll();
            } else {
                this.m = true;
                this.l.add(feynVar);
                if (z) {
                    this.g.b = true;
                }
                zI = i();
                notifyAll();
            }
        }
        if (zI) {
            return;
        }
        this.b.b(this.a);
    }

    public final void g() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        return (this.a & 1) == 1;
    }

    public final synchronized boolean i() {
        if (this.n != 0) {
            return false;
        }
        ffcr ffcrVar = this.g;
        if (ffcrVar.b || ffcrVar.e) {
            ffcq ffcqVar = this.h;
            if (ffcqVar.a || ffcqVar.b) {
                if (this.m) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized int j() {
        return this.n;
    }

    public final void k(int i, IOException iOException) {
        if (n(i, iOException)) {
            this.b.m(this.a, i);
        }
    }

    public final void l(int i) {
        if (n(i, null)) {
            this.b.n(this.a, i);
        }
    }

    public final synchronized void m(int i) {
        if (this.n == 0) {
            this.n = i;
            notifyAll();
        }
    }
}
