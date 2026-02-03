package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snn implements eora {
    final /* synthetic */ snq a;

    public snn(snq snqVar) {
        this.a = snqVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        snq snqVar = this.a;
        synchronized (snqVar.f) {
            snqVar.g = null;
        }
    }
}
