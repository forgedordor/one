package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hlz implements fdap {
    final /* synthetic */ hly a;
    final /* synthetic */ hma b;
    final /* synthetic */ fdcg c;

    public hlz(hly hlyVar, hma hmaVar, fdcg fdcgVar) {
        this.a = hlyVar;
        this.b = hmaVar;
        this.c = fdcgVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hwu hwuVar;
        int i;
        hly hlyVar = this.a;
        hlyVar.a = null;
        hlyVar.b = null;
        int i2 = this.c.a;
        do {
            hwuVar = this.b.b;
            i = hwuVar.get();
        } while (!hwuVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return fctx.a;
    }
}
