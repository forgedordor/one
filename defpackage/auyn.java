package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyn implements auyl {
    public final Object a;
    private final fdpl b;

    public auyn(fdpl fdplVar, Object obj) {
        this.b = fdplVar;
        this.a = obj;
        if (fdplVar instanceof fduj) {
            throw new IllegalArgumentException("Shared flows are not allowed here. Consider `InitialValuedStateFlow` for state flows.");
        }
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        Object objA = new fdqz(new auym(this, null), this.b).a(fdpmVar, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.auyl
    public final Object b() {
        return this.a;
    }
}
