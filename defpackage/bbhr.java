package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhr implements bbhl {
    private final fcsu a;

    public bbhr(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.bbhl
    public final void a(dqsy dqsyVar) {
        if (((dqom) ((bwzy) dqsyVar).e).b.equals("$primary")) {
            fcsu fcsuVar = this.a;
            ((cmqf) fcsuVar.b()).n();
            ((cmqf) fcsuVar.b()).k(enqq.DATABASE_CREATED);
        }
    }
}
