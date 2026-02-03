package defpackage;

import java.io.IOException;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcom implements fffz {
    public final fcon c;
    public fffz f;
    public Socket g;
    public int h;
    public int i;
    private final fclc j;
    private boolean l;
    public final Object a = new Object();
    public final ffez b = new ffez();
    public boolean d = false;
    public boolean e = false;
    private boolean k = false;

    public fcom(fclc fclcVar, fcon fconVar) {
        fclcVar.getClass();
        this.j = fclcVar;
        this.c = fconVar;
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return ffgd.j;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.j.execute(new fcoj(this));
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = fcsr.a;
        synchronized (this.a) {
            if (this.e) {
                return;
            }
            this.e = true;
            this.j.execute(new fcoi(this));
        }
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) throws IOException {
        if (this.k) {
            throw new IOException("closed");
        }
        int i = fcsr.a;
        synchronized (this.a) {
            ffez ffezVar2 = this.b;
            ffezVar2.hO(ffezVar, j);
            int i2 = this.i + this.h;
            this.i = i2;
            boolean z = false;
            this.h = 0;
            if (this.l || i2 <= 10000) {
                if (!this.d && !this.e && ffezVar2.h() > 0) {
                    this.d = true;
                }
                return;
            }
            this.l = true;
            z = true;
            if (!z) {
                this.j.execute(new fcoh(this));
                return;
            }
            try {
                this.g.close();
            } catch (IOException e) {
                this.c.a(e);
            }
        }
    }
}
