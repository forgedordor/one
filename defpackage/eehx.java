package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ eeih b;

    public eehx(eeih eeihVar, int i) {
        this.a = i;
        this.b = eeihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.ag.at(this.a);
    }
}
