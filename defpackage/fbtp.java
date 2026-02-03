package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbtp implements Runnable {
    final /* synthetic */ fbtr a;
    final /* synthetic */ fbts b;

    public fbtp(fbts fbtsVar, fbtr fbtrVar) {
        this.a = fbtrVar;
        this.b = fbtsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.unregisterReceiver(this.a);
    }
}
