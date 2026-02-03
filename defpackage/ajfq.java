package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajfq implements AutoCloseable {
    public final ajfo a;
    public final dzfh b;
    public boolean c = false;

    public ajfq(ajfo ajfoVar, dzfh dzfhVar) {
        this.a = ajfoVar;
        this.b = dzfhVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        ajfo ajfoVar = this.a;
        ajfoVar.H.b().c(this.b);
    }
}
