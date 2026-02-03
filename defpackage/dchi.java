package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchi implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dchl b;

    public dchi(dchl dchlVar, int i) {
        this.a = i;
        this.b = dchlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h(this.a);
    }
}
