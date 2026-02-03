package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbk extends ffbh {
    final /* synthetic */ ffbn c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffbk(ffbn ffbnVar, long j) {
        super(ffbnVar);
        this.c = ffbnVar;
        this.d = j;
        if (j == 0) {
            c();
        }
    }

    @Override // defpackage.ffbh, defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jB = super.b(ffezVar, Math.min(j2, 8192L));
        if (jB == -1) {
            this.c.b.e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j3 = this.d - jB;
        this.d = j3;
        if (j3 == 0) {
            c();
        }
        return jB;
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !fezr.E(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
