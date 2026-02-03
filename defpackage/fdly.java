package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdly extends fdiu {
    private final fdme f;

    public fdly(fcxy fcxyVar, fdme fdmeVar) {
        super(fcxyVar, 1);
        this.f = fdmeVar;
    }

    @Override // defpackage.fdiu
    protected final String q() {
        return "AwaitContinuation";
    }

    @Override // defpackage.fdiu
    public final Throwable r(fdlr fdlrVar) {
        Throwable thD;
        Object objE = this.f.E();
        return (!(objE instanceof fdma) || (thD = ((fdma) objE).d()) == null) ? objE instanceof fdjg ? ((fdjg) objE).b : fdlrVar.p() : thD;
    }
}
