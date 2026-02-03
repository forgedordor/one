package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egpb implements Runnable {
    public eooy a;
    public Executor b;

    public egpb(eooy eooyVar, Executor executor) {
        this.a = eooyVar;
        executor.getClass();
        this.b = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = null;
        this.b = null;
    }
}
