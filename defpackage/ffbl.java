package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffbl implements fffz {
    final /* synthetic */ ffbn a;
    private final fffg b;
    private boolean c;

    public ffbl(ffbn ffbnVar) {
        this.a = ffbnVar;
        this.b = new fffg(ffbnVar.d.a());
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.b;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        ffbn ffbnVar = this.a;
        ffbn.l(this.b);
        ffbnVar.e = 3;
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fezr.C(ffezVar.b, j);
        this.a.d.hO(ffezVar, j);
    }
}
