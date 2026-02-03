package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deff implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ defg b;

    public deff(defg defgVar, defn defnVar) {
        this.a = defnVar;
        this.b = defgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defg defgVar = this.b;
        synchronized (defgVar.a) {
            defgVar.b.e(this.a.i());
        }
    }
}
