package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjh extends rvf implements rjj {
    public rji a;

    public rjh(long j) {
        super(j);
    }

    @Override // defpackage.rvf
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        rhy rhyVar = (rhy) obj;
        if (rhyVar == null) {
            return 1;
        }
        return rhyVar.a();
    }

    @Override // defpackage.rjj
    public final /* bridge */ /* synthetic */ rhy b(res resVar) {
        return (rhy) super.j(resVar);
    }

    @Override // defpackage.rvf
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        rhy rhyVar = (rhy) obj2;
        rji rjiVar = this.a;
        if (rjiVar == null || rhyVar == null) {
            return;
        }
        ((rhh) rjiVar).e.a(rhyVar, true);
    }

    @Override // defpackage.rjj
    public final /* bridge */ /* synthetic */ void d(res resVar, rhy rhyVar) {
    }
}
