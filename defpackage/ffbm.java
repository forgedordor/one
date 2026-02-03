package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbm extends ffbh {
    private boolean c;

    public ffbm(ffbn ffbnVar) {
        super(ffbnVar);
    }

    @Override // defpackage.ffbh, defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        if (this.a) {
            throw new IllegalStateException("closed");
        }
        if (this.c) {
            return -1L;
        }
        long jB = super.b(ffezVar, 8192L);
        if (jB != -1) {
            return jB;
        }
        this.c = true;
        c();
        return -1L;
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (!this.c) {
            c();
        }
        d();
    }
}
