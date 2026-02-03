package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqy implements fcqq {
    public int a;
    private final fffa b;
    private final ffez c;
    private final fcqt d;
    private boolean e;

    public fcqy(fffa fffaVar) {
        this.b = fffaVar;
        ffez ffezVar = new ffez();
        this.c = ffezVar;
        this.d = new fcqt(ffezVar);
        this.a = 16384;
    }

    @Override // defpackage.fcqq
    public final synchronized void a(fcrc fcrcVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = this.a;
        if ((fcrcVar.a & 32) != 0) {
            i = fcrcVar.b[5];
        }
        this.a = i;
        k(0, 0, (byte) 4, (byte) 1);
        this.b.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void b() {
        if (this.e) {
            throw new IOException("closed");
        }
        Logger logger = fcqz.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", fcqz.b.d()));
        }
        fffa fffaVar = this.b;
        fffaVar.aa(fcqz.b.k());
        fffaVar.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void c(boolean z, int i, ffez ffezVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.b.hO(ffezVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.fcqq
    public final synchronized void d() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void e(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        fffa fffaVar = this.b;
        fffaVar.S(i);
        fffaVar.S(i2);
        fffaVar.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void f(int i, fcqp fcqpVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = fcqpVar.s;
        if (i2 == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        fffa fffaVar = this.b;
        fffaVar.S(i2);
        fffaVar.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void g(fcrc fcrcVar) {
        int i;
        if (this.e) {
            throw new IOException("closed");
        }
        int i2 = 0;
        k(0, Integer.bitCount(fcrcVar.a) * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (fcrcVar.c(i2)) {
                if (i2 == 4) {
                    int i3 = i2;
                    i2 = 3;
                    i = i3;
                } else {
                    i = 7;
                    if (i2 == 7) {
                        i2 = 4;
                    } else {
                        i = i2;
                    }
                }
                fffa fffaVar = this.b;
                fffaVar.T(i2);
                fffaVar.S(fcrcVar.a(i));
                i2 = i;
            }
            i2++;
        }
        this.b.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw fcqz.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", 0L);
        }
        k(i, 4, (byte) 8, (byte) 0);
        fffa fffaVar = this.b;
        fffaVar.S((int) j);
        fffaVar.flush();
    }

    @Override // defpackage.fcqq
    public final synchronized void i(fcqp fcqpVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        int i = fcqpVar.s;
        if (i == -1) {
            throw fcqz.d("errorCode.httpCode == -1", new Object[0]);
        }
        k(0, 8, (byte) 7, (byte) 0);
        fffa fffaVar = this.b;
        fffaVar.S(0);
        fffaVar.S(i);
        fffaVar.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // defpackage.fcqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(boolean r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcqy.j(boolean, int, java.util.List):void");
    }

    final void k(int i, int i2, byte b, byte b2) {
        Logger logger = fcqz.a;
        if (logger.isLoggable(Level.FINE)) {
            logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", fcqw.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 > i3) {
            throw fcqz.d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw fcqz.d("reserved bit set: %s", Integer.valueOf(i));
        }
        fffa fffaVar = this.b;
        fffaVar.Q((i2 >>> 16) & 255);
        fffaVar.Q((i2 >>> 8) & 255);
        fffaVar.Q(i2 & 255);
        fffaVar.Q(b);
        fffaVar.Q(b2);
        fffaVar.S(i & Alert.DURATION_SHOW_INDEFINITELY);
    }
}
