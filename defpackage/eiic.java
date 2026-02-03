package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiic implements Runnable {
    final /* synthetic */ fdci a;
    final /* synthetic */ eifn b;
    final /* synthetic */ Runnable c;

    public eiic(fdci fdciVar, eifn eifnVar, Runnable runnable) {
        this.a = fdciVar;
        this.b = eifnVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((eijh) this.a.a) != null) {
            throw null;
        }
        eifn eifnVar = this.b;
        Runnable runnable = this.c;
        eifn eifnVarH = eidc.h(eidc.b(), eifnVar);
        try {
            runnable.run();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.c + "]";
    }
}
