package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvik implements eora {
    final /* synthetic */ bvil a;

    public bvik(bvil bvilVar) {
        this.a = bvilVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bvil.a.m("Settings update processed.");
        bvil bvilVar = this.a;
        synchronized (bvilVar) {
            if (bvilVar.r) {
                bvilVar.a();
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        bvil.a.o("Settings update failed to process.", th);
    }
}
