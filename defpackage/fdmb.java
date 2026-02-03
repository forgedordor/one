package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdmb extends fdlx {
    final /* synthetic */ fdme a;
    private final fear b;

    public fdmb(fdme fdmeVar, fear fearVar) {
        this.a = fdmeVar;
        this.b = fearVar;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        fdme fdmeVar = this.a;
        Object objE = fdmeVar.E();
        if (!(objE instanceof fdjg)) {
            objE = fdmf.b(objE);
        }
        this.b.j(fdmeVar, objE);
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return false;
    }
}
