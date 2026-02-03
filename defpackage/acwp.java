package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acwp extends dqpi {
    final /* synthetic */ acwx a;

    public acwp(acwx acwxVar) {
        this.a = acwxVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        cqbd cqbdVarD = acwx.a.d();
        cqbdVarD.I("About to invalidate on prefetch");
        cqbdVarD.A("TriggerQuery", acwx.b(dqsdVar));
        cqbdVarD.r();
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void ga(dqwl dqwlVar) {
        cqbd cqbdVarC = acwx.a.c();
        cqbdVarC.I("Invalidate data source during prefetch");
        acwx acwxVar = this.a;
        cqbdVarC.A("loadingStatus", acwxVar.w);
        cqbdVarC.r();
        acwxVar.y = null;
        oqw oqwVar = acwxVar.s;
        if (oqwVar != null) {
            oqwVar.c();
        }
    }
}
