package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejbb implements eora {
    final /* synthetic */ ejbc a;

    public ejbb(ejbc ejbcVar) {
        this.a = ejbcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.set((ejba) obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.setException(th);
    }
}
