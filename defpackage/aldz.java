package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aldz implements cqto {
    final /* synthetic */ alec a;

    public aldz(alec alecVar) {
        this.a = alecVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        alec alecVar = this.a;
        auvw.k(alecVar.a, null, null, new aldy(alecVar, null), 3);
    }

    @Override // defpackage.cqto
    public final void fK() {
        alec alecVar = this.a;
        alecVar.f.set(false);
        synchronized (alecVar.e) {
            cquc cqucVar = alecVar.c;
            if (cqucVar != null) {
                cqucVar.a();
            }
            alecVar.c = null;
        }
    }
}
