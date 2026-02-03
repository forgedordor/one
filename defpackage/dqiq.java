package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqiq extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ dqir b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqiq(dqir dqirVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqiq) c((dqgo) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dqgo dqgoVar = (dqgo) this.a;
        dqir dqirVar = this.b;
        if (dqgoVar == dqgo.b) {
            fduf fdufVar = dqirVar.f;
            dqbv dqbvVar = (dqbv) dqbw.a.createBuilder();
            dqbvVar.getClass();
            fdufVar.f(dqbx.a(dqbvVar));
        }
        dqirVar.c(dqgoVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqiq dqiqVar = new dqiq(this.b, fcxyVar);
        dqiqVar.a = obj;
        return dqiqVar;
    }
}
