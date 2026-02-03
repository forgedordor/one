package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxr extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnxs b;
    final /* synthetic */ cnxo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnxr(fcxy fcxyVar, cnxs cnxsVar, cnxo cnxoVar) {
        super(2, fcxyVar);
        this.b = cnxsVar;
        this.c = cnxoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnxr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                cnxs.a.m("Start processing batches.");
                cnxs cnxsVar = this.b;
                cnyi cnyiVar = (cnyi) cnxsVar.b.b();
                Object objB = cnxsVar.c.b();
                objB.getClass();
                this.a = 1;
                if (cnyiVar.b((cnxb) objB, this) == fcylVar) {
                    return fcylVar;
                }
            }
            return cbcw.i();
        } catch (cnxw unused) {
            cqbd cqbdVarC = cnxs.a.c();
            cqbdVarC.I("Work Organizer requested a delay before retrying this batch");
            cqbdVarC.r();
            cnxo cnxoVar = this.c;
            caxr caxrVar = new caxr();
            Object objE = cnrt.j.e();
            objE.getClass();
            caxrVar.c = Duration.ofMillis(((Number) objE).longValue());
            return cbcw.j(ekgb.r(cbcu.g("forward_sync_engine", cnxoVar, caxrVar.a())));
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cnxr cnxrVar = new cnxr(fcxyVar, this.b, this.c);
        cnxrVar.d = obj;
        return cnxrVar;
    }
}
