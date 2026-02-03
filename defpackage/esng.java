package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esng implements Runnable {
    final /* synthetic */ esni a;

    public esng(esni esniVar) {
        this.a = esniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.cancel(false);
    }
}
