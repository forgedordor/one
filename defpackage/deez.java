package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deez implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ defa b;

    public deez(defa defaVar, defn defnVar) {
        this.a = defnVar;
        this.b = defaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defa defaVar = this.b;
        synchronized (defaVar.a) {
            defaVar.b.a(this.a);
        }
    }
}
