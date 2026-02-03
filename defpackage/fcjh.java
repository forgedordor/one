package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcjh implements Runnable {
    final /* synthetic */ fcji a;

    public fcjh(fcji fcjiVar) {
        this.a = fcjiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.a.f;
        fckpVar.G = true;
        fcap fcapVar = fckpVar.C;
        fckc fckcVar = fckpVar.A;
        fcapVar.a(fckcVar.a, fckcVar.b, fckcVar.c);
    }
}
