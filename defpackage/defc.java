package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class defc implements Runnable {
    final /* synthetic */ defn a;
    final /* synthetic */ defd b;

    public defc(defd defdVar, defn defnVar) {
        this.a = defnVar;
        this.b = defdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defd defdVar = this.b;
        synchronized (defdVar.a) {
            defe defeVar = defdVar.b;
            Exception excH = this.a.h();
            dclh.m(excH);
            defeVar.d(excH);
        }
    }
}
