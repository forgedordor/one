package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duxc implements eora {
    final /* synthetic */ dtom a;
    final /* synthetic */ duxf b;

    public duxc(duxf duxfVar, dtom dtomVar) {
        this.a = dtomVar;
        this.b = duxfVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof dtox) {
            this.b.e((dtox) th, this.a);
            return;
        }
        duxf duxfVar = this.b;
        dtov dtovVarA = dtox.a();
        dtovVarA.c = th;
        dtovVarA.a = dtow.UNKNOWN_ERROR;
        dtovVarA.b = "Refresh failed.";
        duxfVar.e(dtovVarA.a(), this.a);
    }
}
