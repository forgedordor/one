package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckl implements Runnable {
    final /* synthetic */ fckm a;

    public fckl(fckm fckmVar) {
        this.a = fckmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.a.b;
        if (fckpVar.G) {
            return;
        }
        fckpVar.C.e();
    }
}
