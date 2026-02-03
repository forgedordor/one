package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihs implements Runnable {
    final /* synthetic */ eifp a;
    final /* synthetic */ Runnable b;

    public eihs(eifp eifpVar, Runnable runnable) {
        this.a = eifpVar;
        this.b = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eifn, eifp] */
    @Override // java.lang.Runnable
    public final void run() {
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            this.b.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
