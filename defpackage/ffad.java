package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffad extends ffff {
    final /* synthetic */ ffae a;
    private final long c;
    private long d;
    private boolean e;
    private boolean f;
    private boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffad(ffae ffaeVar, ffgb ffgbVar, long j) {
        super(ffgbVar);
        ffgbVar.getClass();
        this.a = ffaeVar;
        this.c = j;
        this.e = true;
        if (j == 0) {
            c(null);
        }
    }

    @Override // defpackage.ffff, defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        if (this.g) {
            throw new IllegalStateException("closed");
        }
        try {
            long jB = this.b.b(ffezVar, 8192L);
            if (this.e) {
                this.e = false;
            }
            if (jB == -1) {
                c(null);
                return -1L;
            }
            long j2 = this.d + jB;
            long j3 = this.c;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException(a.F(j2, j3, "expected ", " bytes but received "));
            }
            this.d = j2;
            if (j2 == j3) {
                c(null);
            }
            return jB;
        } catch (IOException e) {
            throw c(e);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f) {
            return iOException;
        }
        this.f = true;
        if (iOException == null && this.e) {
            this.e = false;
        }
        return this.a.e(true, false, iOException);
    }

    @Override // defpackage.ffff, defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            super.close();
        } catch (IOException e) {
            throw c(e);
        }
    }
}
