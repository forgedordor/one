package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyu implements ciys {
    public static final cqce a = cqce.g("BugleRcs", "GetMessagesMethod");
    private final cjfz b;
    private final cogw c;
    private final eosc d;

    public ciyu(cjfz cjfzVar, cogw cogwVar, eosc eoscVar) {
        this.b = cjfzVar;
        this.c = cogwVar;
        this.d = eoscVar;
    }

    @Override // defpackage.ciys
    public final eiju a(auib auibVar) {
        cjga cjgaVar = (cjga) cjgb.a.createBuilder();
        evvp evvpVarB = evwz.b(this.c.f());
        cjgaVar.copyOnWrite();
        cjgb cjgbVar = (cjgb) cjgaVar.instance;
        evvpVarB.getClass();
        cjgbVar.c = evvpVarB;
        cjgbVar.b |= 1;
        cjgaVar.copyOnWrite();
        cjgb cjgbVar2 = (cjgb) cjgaVar.instance;
        auibVar.getClass();
        cjgbVar2.e = auibVar;
        cjgbVar2.b |= 4;
        return ((cazj) this.b.a.b()).a(cbcu.f("rcs_engine_get_single_message", (cjgb) cjgaVar.build())).a().h(new ejvr() { // from class: ciyt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (cbcwVar.e()) {
                    cqbd cqbdVarA = ciyu.a.a();
                    cqbdVarA.I("GetMessagesMethod processing done.");
                    cqbdVarA.r();
                    return null;
                }
                cqbd cqbdVarE = ciyu.a.e();
                cqbdVarE.I("GetMessagesMethod processing failed");
                cqbdVarE.B("isRetryable", cbcwVar.f());
                cqbdVarE.r();
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.ciys
    public final void b() {
        cjga cjgaVar = (cjga) cjgb.a.createBuilder();
        evvp evvpVarB = evwz.b(this.c.f());
        cjgaVar.copyOnWrite();
        cjgb cjgbVar = (cjgb) cjgaVar.instance;
        evvpVarB.getClass();
        cjgbVar.c = evvpVarB;
        cjgbVar.b |= 1;
        cjgaVar.copyOnWrite();
        cjgb cjgbVar2 = (cjgb) cjgaVar.instance;
        cjgbVar2.b |= 2;
        cjgbVar2.d = true;
        cjgb cjgbVar3 = (cjgb) cjgaVar.build();
        caxr caxrVar = new caxr();
        caxrVar.b = "perform_catch_up_work_item_dedup_tag";
        this.b.a(cjgbVar3, caxrVar.a());
    }
}
