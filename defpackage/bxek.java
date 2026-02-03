package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxek implements Closeable {
    final /* synthetic */ bxel a;
    private final dqtx b;
    private final long c;

    public bxek(bxel bxelVar, dqtx dqtxVar) {
        this.a = bxelVar;
        this.b = dqtxVar;
        this.c = bxelVar.b.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bxel bxelVar = this.a;
        long jA = bxelVar.b.a() - this.c;
        if (((dqov) this.b).b.equals(dqus.BEGIN_TRANSACTION)) {
            bxelVar.c.g("Bugle.Datamodel.DatabaseTransactionStartLatency.Duration", jA);
        }
    }
}
