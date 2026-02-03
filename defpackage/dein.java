package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dein implements deih {
    final /* synthetic */ deio a;
    private final deic b;
    private final dehz c;

    public dein(deio deioVar, deic deicVar, final dehz dehzVar) {
        this.a = deioVar;
        deicVar.getClass();
        this.b = deicVar;
        this.c = dehzVar;
        deicVar.d(new deig() { // from class: deim
            @Override // defpackage.deig
            public final void a(deib deibVar) {
                dehzVar.f(deibVar);
            }
        });
    }

    @Override // defpackage.deih
    public final defn a() {
        deio deioVar = this.a;
        synchronized (deioVar.b) {
            int i = deioVar.d - 1;
            deioVar.d = i;
            if (i != 0) {
                return degc.c(null);
            }
            deioVar.c = null;
            deht.a.n().q("Disposing of shared InternalTimeSignalSupplier instance");
            this.c.e();
            return this.b.a();
        }
    }

    @Override // defpackage.deih
    public final void b(deig deigVar) {
        this.c.d(deigVar);
    }

    @Override // defpackage.deih
    public final void c(deig deigVar) {
        dehz dehzVar = this.c;
        synchronized (dehzVar) {
            dehzVar.a.remove(deigVar);
        }
    }

    public final String toString() {
        String str;
        deio deioVar = this.a;
        synchronized (deioVar.b) {
            str = "ShareableTimeSignalSupplierAdapter{ShareableTimeSignalSupplierManager.this=" + deioVar.toString() + ",delegate=" + this.b.toString() + ", internalListenersManager=" + this.c.toString() + "}";
        }
        return str;
    }
}
