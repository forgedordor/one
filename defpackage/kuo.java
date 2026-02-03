package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kuo implements Runnable {
    final /* synthetic */ kur a;
    final /* synthetic */ Object b;

    public kuo(kur kurVar, Object obj) {
        this.a = kurVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a = this.b;
    }
}
