package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcju implements Runnable {
    final /* synthetic */ fckp a;

    public fcju(fckp fckpVar) {
        this.a = fckpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.a;
        if (fckpVar.G) {
            return;
        }
        fckpVar.C.e();
    }
}
