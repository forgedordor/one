package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbto implements Runnable {
    final /* synthetic */ fbtq a;
    final /* synthetic */ fbts b;

    public fbto(fbts fbtsVar, fbtq fbtqVar) {
        this.a = fbtqVar;
        this.b = fbtsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.unregisterNetworkCallback(this.a);
    }
}
