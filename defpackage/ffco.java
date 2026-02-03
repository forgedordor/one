package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffco implements ffgb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final fffb f;

    public ffco(fffb fffbVar) {
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
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iG = fezr.g(fffbVar);
                    this.d = iG;
                    this.a = iG;
                    int iA = fezr.A(fffbVar.d());
                    this.b = fezr.A(fffbVar.d());
                    Logger logger = ffcp.a;
                    if (logger.isLoggable(Level.FINE)) {
                        fffd fffdVar = ffbv.a;
                        logger.fine(ffbv.b(true, this.c, this.a, iA, this.b));
                    }
                    iF = fffbVar.f() & Alert.DURATION_SHOW_INDEFINITELY;
                    this.c = iF;
                    if (iA != 9) {
                        throw new IOException(a.D(iA, " != TYPE_CONTINUATION"));
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
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
