package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acwt extends dqpi {
    final /* synthetic */ acwu a;

    public acwt(acwu acwuVar) {
        this.a = acwuVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        cqbd cqbdVarD = acwx.a.d();
        cqbdVarD.I("About to invalidate on query change");
        cqbdVarD.A("TriggerQuery", acwx.b(dqsdVar));
        cqbdVarD.r();
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void ga(dqwl dqwlVar) {
        cqbd cqbdVarC = acwx.a.c();
        cqbdVarC.I("Invalidate data source on query changes");
        acwu acwuVar = this.a;
        cqbdVarC.A("loadingStatus", acwuVar.e.w);
        cqbdVarC.r();
        acwuVar.c();
    }
}
