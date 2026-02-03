package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqv implements ffgb {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final fffb f;

    public fcqv(fffb fffbVar) {
        this.f = fffbVar;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.f.a();
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                fffb fffbVar = this.f;
                fffbVar.D(this.e);
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = fcqz.b(fffbVar);
                    this.d = iB;
                    this.a = iB;
                    int iD = fffbVar.d() & 255;
                    this.b = (byte) (fffbVar.d() & 255);
                    Logger logger = fcqz.a;
                    byte b = (byte) iD;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", fcqw.a(true, this.c, this.a, b, this.b));
                    }
                    iF = fffbVar.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = iF;
                    if (b != 9) {
                        throw fcqz.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    }
                }
            } else {
                long jB = this.f.b(ffezVar, Math.min(8192L, i2));
                if (jB != -1) {
                    this.d -= (int) jB;
                    return jB;
                }
            }
            return -1L;
        } while (iF == i);
        throw fcqz.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
