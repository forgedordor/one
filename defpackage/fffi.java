package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffi implements ffgb {
    private final fffb a;
    private final Inflater b;
    private int c;
    private boolean d;

    public fffi(fffb fffbVar, Inflater inflater) {
        this.a = fffbVar;
        this.b = inflater;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.a.a();
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws DataFormatException, IOException {
        do {
            long jC = c(ffezVar);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.E());
        throw new EOFException("source exhausted prematurely");
    }

    public final long c(ffez ffezVar) throws DataFormatException, IOException {
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        try {
            fffw fffwVarY = ffezVar.y(1);
            int iMin = (int) Math.min(8192L, 8192 - fffwVarY.c);
            Inflater inflater = this.b;
            if (inflater.needsInput()) {
                fffb fffbVar = this.a;
                if (!fffbVar.E()) {
                    fffw fffwVar = ((fffv) fffbVar).b.a;
                    fffwVar.getClass();
                    int i = fffwVar.c;
                    int i2 = fffwVar.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(fffwVar.a, i2, i3);
                }
            }
            int iInflate = inflater.inflate(fffwVarY.a, fffwVarY.c, iMin);
            int i4 = this.c;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.c -= remaining;
                this.a.D(remaining);
            }
            if (iInflate > 0) {
                fffwVarY.c += iInflate;
                long j = iInflate;
                ffezVar.b += j;
                return j;
            }
            if (fffwVarY.b != fffwVarY.c) {
                return 0L;
            }
            ffezVar.a = fffwVarY.a();
            fffx.b(fffwVarY);
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
