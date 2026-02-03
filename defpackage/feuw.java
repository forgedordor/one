package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuw extends feou {
    private static final long serialVersionUID = 9144969653829796798L;
    public fenj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuw() {
        super("DURATION");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = new fenj(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feuw(fenj fenjVar) {
        super("DURATION");
        fera feraVar = fera.a;
        this.c = fenjVar;
    }
}
