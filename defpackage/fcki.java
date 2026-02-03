package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcki implements Runnable {
    final /* synthetic */ fckm a;

    public fcki(fckm fckmVar) {
        this.a = fckmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.a.b;
        fckpVar.G = true;
        fcap fcapVar = fckpVar.C;
        fckc fckcVar = fckpVar.A;
        fcapVar.a(fckcVar.a, fckcVar.b, fckcVar.c);
    }
}
