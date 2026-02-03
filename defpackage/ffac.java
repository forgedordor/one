package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffac extends fffe {
    final /* synthetic */ ffae a;
    private final long c;
    private boolean d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffac(ffae ffaeVar, fffz fffzVar, long j) {
        super(fffzVar);
        fffzVar.getClass();
        this.a = ffaeVar;
        this.c = j;
    }

    private final IOException c(IOException iOException) {
        if (this.d) {
            return iOException;
        }
        this.d = true;
        return this.a.e(false, true, iOException);
    }

    @Override // defpackage.fffe, defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        long j = this.c;
        if (j != -1 && this.e != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.b.close();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.fffe, defpackage.fffz, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.b.flush();
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.fffe, defpackage.fffz
    public final void hO(ffez ffezVar, long j) throws IOException {
        if (this.f) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.c;
        if (j2 == -1 || this.e + j <= j2) {
            try {
                this.b.hO(ffezVar, j);
                this.e += j;
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.e + j));
    }
}
