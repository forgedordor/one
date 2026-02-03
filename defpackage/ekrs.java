package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekrs implements Runnable {
    final /* synthetic */ ekrr a;
    final /* synthetic */ ekrt b;

    public ekrs(ekrt ekrtVar, ekrr ekrrVar) {
        this.a = ekrrVar;
        this.b = ekrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.remove(this.a);
    }
}
