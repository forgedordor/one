package defpackage;

import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcu implements Closeable {
    private static final Logger b = Logger.getLogger(ffbv.class.getName());
    public int a;
    private final fffa c;
    private final ffez d;
    private boolean e;
    private final ffbt f;

    public ffcu(fffa fffaVar) {
        fffaVar.getClass();
        this.c = fffaVar;
        ffez ffezVar = new ffez();
        this.d = ffezVar;
        this.a = 16384;
        this.f = new ffbt(ffezVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        r0 = r3.f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.ffcz r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L60
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L60
            if (r0 != 0) goto L58
            int r0 = r3.a     // Catch: java.lang.Throwable -> L60
            int r1 = r4.a     // Catch: java.lang.Throwable -> L60
            r1 = r1 & 32
            if (r1 == 0) goto L15
            int[] r0 = r4.b     // Catch: java.lang.Throwable -> L60
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L60
        L15:
            r3.a = r0     // Catch: java.lang.Throwable -> L60
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L60
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4c
            ffbt r0 = r3.f     // Catch: java.lang.Throwable -> L60
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L60
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L60
            int r1 = r0.d     // Catch: java.lang.Throwable -> L60
            if (r1 != r4) goto L30
            goto L4c
        L30:
            if (r4 >= r1) goto L3a
            int r1 = r0.b     // Catch: java.lang.Throwable -> L60
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L60
            r0.b = r1     // Catch: java.lang.Throwable -> L60
        L3a:
            r0.c = r2     // Catch: java.lang.Throwable -> L60
            r0.d = r4     // Catch: java.lang.Throwable -> L60
            int r1 = r0.h     // Catch: java.lang.Throwable -> L60
            if (r4 >= r1) goto L4c
            if (r4 != 0) goto L48
            r0.a()     // Catch: java.lang.Throwable -> L60
            goto L4c
        L48:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L60
        L4c:
            r4 = 4
            r0 = 0
            r3.e(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L60
            fffa r4 = r3.c     // Catch: java.lang.Throwable -> L60
            r4.flush()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r3)
            return
        L58:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L60
            throw r4     // Catch: java.lang.Throwable -> L60
        L60:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L60
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffcu.a(ffcz):void");
    }

    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(fezr.k(">> CONNECTION ".concat(ffbv.a.d()), new Object[0]));
        }
        fffa fffaVar = this.c;
        fffaVar.L(ffbv.a);
        fffaVar.flush();
    }

    public final synchronized void c(boolean z, int i, ffez ffezVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            fffa fffaVar = this.c;
            ffezVar.getClass();
            fffaVar.hO(ffezVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.c.close();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public final void e(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            fffd fffdVar = ffbv.a;
            logger.fine(ffbv.b(false, i, i2, i3, i4));
        }
        int i5 = this.a;
        if (i2 > i5) {
            throw new IllegalArgumentException(a.s(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(a.g(i, "reserved bit set: "));
        }
        fffa fffaVar = this.c;
        byte[] bArr = fezr.a;
        fffaVar.Q((i2 >>> 16) & 255);
        fffaVar.Q((i2 >>> 8) & 255);
        fffaVar.Q(i2 & 255);
        fffaVar.Q(i3);
        fffaVar.Q(i4);
        fffaVar.S(i & Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(boolean r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffcu.f(boolean, int, java.util.List):void");
    }

    public final synchronized void g(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(0, 8, 6, z ? 1 : 0);
        fffa fffaVar = this.c;
        fffaVar.S(i);
        fffaVar.S(i2);
        fffaVar.flush();
    }

    public final synchronized void h(ffcz ffczVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = 0;
        e(0, Integer.bitCount(ffczVar.a) * 6, 4, 0);
        while (i < 10) {
            if (ffczVar.f(i)) {
                int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                fffa fffaVar = this.c;
                fffaVar.T(i2);
                fffaVar.S(ffczVar.a(i));
            }
            i++;
        }
        this.c.flush();
    }

    public final synchronized void i(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(a.u(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
        }
        e(i, 4, 8, 0);
        fffa fffaVar = this.c;
        fffaVar.S((int) j);
        fffaVar.flush();
    }

    public final synchronized void j(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(i, 4, 3, 0);
        fffa fffaVar = this.c;
        fffaVar.S(i2 - 1);
        fffaVar.flush();
    }

    public final synchronized void k(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        e(0, 8, 7, 0);
        fffa fffaVar = this.c;
        fffaVar.S(i);
        fffaVar.S(i2 - 1);
        fffaVar.flush();
    }
}
