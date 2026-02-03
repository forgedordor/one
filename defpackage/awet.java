package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awet extends cayv {
    public final eksp a = eksp.c("BugleBCM");
    private final awen b;

    public awet(awen awenVar) {
        this.b = awenVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("ConversationDedupingWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = awej.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        ((awej) evuhVar).getClass();
        fdae fdaeVar = new fdae() { // from class: awes
            @Override // defpackage.fdae
            public final Object invoke() {
                ((eksl) this.a.a.h()).q("ConversationDedupingWorkHandler finished proccessing work item");
                return cbcw.i();
            }
        };
        awer awerVar = (awer) this.b;
        return auvw.c(awerVar.a, fcyi.a, fdjz.a, new aweq(awerVar, fdaeVar, null));
    }
}
