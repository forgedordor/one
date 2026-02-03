package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvgj implements eora {
    final /* synthetic */ bvgl a;

    public bvgj(bvgl bvglVar) {
        this.a = bvglVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bvgl.a.m("Settings update processed.");
        bvgl bvglVar = this.a;
        synchronized (bvglVar) {
            if (bvglVar.j) {
                bvglVar.e();
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        bvgl.a.o("Settings update failed to process.", th);
    }
}
