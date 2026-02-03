package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fffj implements ffgb {
    private final InputStream a;
    private final ffgd b;

    public fffj(InputStream inputStream, ffgd ffgdVar) {
        this.a = inputStream;
        this.b = ffgdVar;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        try {
            this.b.g();
            fffw fffwVarY = ffezVar.y(1);
            int i = this.a.read(fffwVarY.a, fffwVarY.c, (int) Math.min(j, 8192 - fffwVarY.c));
            if (i != -1) {
                fffwVarY.c += i;
                long j2 = i;
                ffezVar.b += j2;
                return j2;
            }
            if (fffwVarY.b != fffwVarY.c) {
                return -1L;
            }
            ffezVar.a = fffwVarY.a();
            fffx.b(fffwVarY);
            return -1L;
        } catch (AssertionError e) {
            if (fffk.d(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
