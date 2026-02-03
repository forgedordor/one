package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcl implements Closeable {
    public static final ffcz a;
    public final ffby b;
    public final Map c = new LinkedHashMap();
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final ffaa h;
    public final fezx i;
    public final fezx j;
    public final fezx k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public final ffcz q;
    public ffcz r;
    public long s;
    public long t;
    public final ffcu u;
    public final ffcd v;
    public final Set w;
    private long x;
    private long y;
    private final Socket z;

    static {
        ffcz ffczVar = new ffcz();
        ffczVar.g(7, 65535);
        ffczVar.g(5, 16384);
        a = ffczVar;
    }

    public ffcl(ffbw ffbwVar) {
        this.b = ffbwVar.f;
        String str = ffbwVar.c;
        fffb fffbVar = null;
        if (str == null) {
            fdbq.c("connectionName");
            str = null;
        }
        this.d = str;
        this.f = 3;
        ffaa ffaaVar = ffbwVar.a;
        this.h = ffaaVar;
        this.i = ffaaVar.a();
        this.j = ffaaVar.a();
        this.k = ffaaVar.a();
        ffcz ffczVar = new ffcz();
        ffczVar.g(7, 16777216);
        this.q = ffczVar;
        this.r = a;
        this.t = r0.c();
        Socket socket = ffbwVar.b;
        if (socket == null) {
            fdbq.c("socket");
            socket = null;
        }
        this.z = socket;
        fffa fffaVar = ffbwVar.e;
        if (fffaVar == null) {
            fdbq.c("sink");
            fffaVar = null;
        }
        this.u = new ffcu(fffaVar);
        fffb fffbVar2 = ffbwVar.d;
        if (fffbVar2 == null) {
            fdbq.c("source");
        } else {
            fffbVar = fffbVar2;
        }
        this.v = new ffcd(this, new ffcp(fffbVar));
        this.w = new LinkedHashSet();
    }

    public static final boolean j(int i) {
        return (i & 1) == 0;
    }

    public final synchronized ffct a(int i) {
        return (ffct) this.c.get(Integer.valueOf(i));
    }

    public final synchronized ffct b(int i) {
        ffct ffctVar;
        ffctVar = (ffct) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return ffctVar;
    }

    public final void c(IOException iOException) throws IOException {
        k(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        k(1, 9, null);
    }

    public final void d() {
        this.u.d();
    }

    public final synchronized void e(long j) {
        long j2 = this.x + j;
        this.x = j2;
        long j3 = j2 - this.y;
        if (j3 >= this.q.c() / 2) {
            h(0, j3);
            this.y += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = (int) java.lang.Math.min(r13, r6 - r4);
        r4 = r9.u;
        r2 = java.lang.Math.min(r2, r4.a);
        r7 = r2;
        r9.s += r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r10, boolean r11, defpackage.ffez r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L61
        L7:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L60
            monitor-enter(r9)
        Lc:
            long r4 = r9.s     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            long r6 = r9.t     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r9.c     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            if (r2 == 0) goto L24
            r9.wait()     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            goto Lc
        L24:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
            throw r10     // Catch: java.lang.Throwable -> L4f java.lang.InterruptedException -> L51
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r13, r6)     // Catch: java.lang.Throwable -> L4f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L4f
            ffcu r4 = r9.u     // Catch: java.lang.Throwable -> L4f
            int r5 = r4.a     // Catch: java.lang.Throwable -> L4f
            int r2 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L4f
            long r5 = r9.s     // Catch: java.lang.Throwable -> L4f
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L4f
            long r5 = r5 + r7
            r9.s = r5     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r9)
            long r13 = r13 - r7
            if (r11 == 0) goto L4a
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = r3
        L4b:
            r4.c(r5, r10, r12, r2)
            goto L7
        L4f:
            r10 = move-exception
            goto L5e
        L51:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L4f
            r10.interrupt()     // Catch: java.lang.Throwable -> L4f
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L4f
            r10.<init>()     // Catch: java.lang.Throwable -> L4f
            throw r10     // Catch: java.lang.Throwable -> L4f
        L5e:
            monitor-exit(r9)
            throw r10
        L60:
            return
        L61:
            ffcu r13 = r9.u
            r13.c(r11, r10, r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffcl.f(int, boolean, ffez, long):void");
    }

    public final void g(boolean z, int i, int i2) throws IOException {
        try {
            this.u.g(z, i, i2);
        } catch (IOException e) {
            c(e);
        }
    }

    public final void h(int i, long j) {
        this.i.f(new ffck(this.d + "[" + i + "] windowUpdate", this, i, j));
    }

    public final synchronized boolean i(long j) {
        if (this.g) {
            return false;
        }
        if (this.n < this.m) {
            if (j >= this.p) {
                return false;
            }
        }
        return true;
    }

    public final void k(int i, int i2, IOException iOException) throws IOException {
        int i3;
        Object[] array;
        byte[] bArr = fezr.a;
        try {
            l(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            Map map = this.c;
            if (map.isEmpty()) {
                array = null;
            } else {
                array = map.values().toArray(new ffct[0]);
                map.clear();
            }
        }
        ffct[] ffctVarArr = (ffct[]) array;
        if (ffctVarArr != null) {
            for (ffct ffctVar : ffctVarArr) {
                try {
                    ffctVar.k(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.u.close();
        } catch (IOException unused3) {
        }
        try {
            this.z.close();
        } catch (IOException unused4) {
        }
        this.i.b();
        this.j.b();
        this.k.b();
    }

    public final void l(int i) {
        synchronized (this.u) {
            fdcg fdcgVar = new fdcg();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                fdcgVar.a = this.e;
                ffcu ffcuVar = this.u;
                int i2 = fdcgVar.a;
                byte[] bArr = fezr.a;
                ffcuVar.k(i2, i);
            }
        }
    }

    public final void m(int i, int i2) {
        this.u.j(i, i2);
    }

    public final void n(int i, int i2) {
        this.i.f(new ffcj(this.d + "[" + i + "] writeSynReset", this, i, i2));
    }
}
