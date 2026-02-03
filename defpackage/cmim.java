package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmim implements eora {
    final /* synthetic */ cmio a;

    public cmim(cmio cmioVar) {
        this.a = cmioVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((evuh) obj).getClass();
        cmio.a.n().q("Migration is done");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        th.getClass();
        ((eksl) ((eksl) cmio.a.j()).g(th)).q("Failed to run migration");
        cmio cmioVar = this.a;
        synchronized (cmioVar) {
            cmioVar.j = null;
        }
    }
}
