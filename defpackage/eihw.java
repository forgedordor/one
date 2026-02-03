package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihw implements Runnable {
    final /* synthetic */ eifn a;
    final /* synthetic */ Runnable b;

    public eihw(eifn eifnVar, Runnable runnable) {
        this.a = eifnVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eifn eifnVarI = eidc.i(eidc.b(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }
}
