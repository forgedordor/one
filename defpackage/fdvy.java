package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvy extends fdvt {
    private final fdpl d;
    private final int e;

    public fdvy(fdpl fdplVar, int i, fcyh fcyhVar, int i2, int i3) {
        super(fcyhVar, i2, i3);
        this.d = fdplVar;
        this.e = i;
    }

    @Override // defpackage.fdvt
    protected final Object b(fdos fdosVar, fcxy fcxyVar) {
        int i = febh.a;
        Object objA = this.d.a(new fdvx((fdlr) fcxyVar.u().get(fdlr.c), new febg(this.e), fdosVar, new fdxf(fdosVar)), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdvy(this.d, this.e, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    protected final String d() {
        return "concurrency=" + this.e;
    }

    @Override // defpackage.fdvt
    public final fdou e(fdjx fdjxVar) {
        return fdor.a(fdjxVar, this.a, this.b, new fdvs(this, null));
    }
}
