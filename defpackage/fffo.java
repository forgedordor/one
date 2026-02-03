package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fffo implements fffz {
    private final OutputStream a;
    private final ffgd b;

    public fffo(OutputStream outputStream, ffgd ffgdVar) {
        this.a = outputStream;
        this.b = ffgdVar;
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) throws IOException {
        ffes.b(ffezVar.b, 0L, j);
        while (j > 0) {
            this.b.g();
            fffw fffwVar = ffezVar.a;
            fffwVar.getClass();
            int iMin = (int) Math.min(j, fffwVar.c - fffwVar.b);
            this.a.write(fffwVar.a, fffwVar.b, iMin);
            int i = fffwVar.b + iMin;
            fffwVar.b = i;
            long j2 = iMin;
            ffezVar.b -= j2;
            j -= j2;
            if (i == fffwVar.c) {
                ffezVar.a = fffwVar.a();
                fffx.b(fffwVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
