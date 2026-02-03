package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejbc extends eooi implements Runnable {
    public final eosa a;

    public ejbc(eosa eosaVar, ejbd ejbdVar) {
        this.a = eosaVar;
        eoqg eoqgVar = eoqg.a;
        eosaVar.b(ejbdVar, eoqgVar);
        eork.r(eosaVar, new ejbb(this), eoqgVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
