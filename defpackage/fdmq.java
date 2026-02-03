package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdmq implements Runnable {
    private final fdjq a;
    private final fdis b;

    public fdmq(fdjq fdjqVar, fdis fdisVar) {
        this.a = fdjqVar;
        this.b = fdisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.g(this.a, fctx.a);
    }
}
