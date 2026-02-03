package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bveu implements cmnq {
    public static final cqce a = cqce.g("Bugle", "DittoContactsRefreshListener");
    public static final cczi b = cdag.e(cdag.b, "conversation_update_threshold", 50);
    private final eygg c;

    public bveu(eygg eyggVar) {
        this.c = eyggVar;
    }

    @Override // defpackage.cmnq
    public final void a(int i) {
        if (i > ((Integer) b.e()).intValue()) {
            eiju eijuVarR = ((bvit) this.c.b()).r(1);
            ejvr ejvrVar = new ejvr() { // from class: bvet
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    cqce cqceVar = bveu.a;
                    if (bool.booleanValue()) {
                        bveu.a.m("Successfully resumed the Bugle to the Ditto push stream.");
                    }
                    return bool;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eijuVarR.h(ejvrVar, eoqgVar).k(auvh.b(), eoqgVar);
        }
    }

    @Override // defpackage.cmnq
    public final void b(int i) {
        if (i > ((Integer) b.e()).intValue()) {
            eiju eijuVarQ = ((bvit) this.c.b()).q(1);
            ejvr ejvrVar = new ejvr() { // from class: bves
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    cqce cqceVar = bveu.a;
                    if (bool.booleanValue()) {
                        bveu.a.m("Successfully paused the Bugle to the Ditto push stream.");
                    }
                    return bool;
                }
            };
            eoqg eoqgVar = eoqg.a;
            eijuVarQ.h(ejvrVar, eoqgVar).k(auvh.b(), eoqgVar);
        }
    }
}
