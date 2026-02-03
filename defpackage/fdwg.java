package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdwg extends fdwa {
    public final fdau e;

    public fdwg(fdau fdauVar, fdpl fdplVar, fcyh fcyhVar, int i, int i2) {
        super(fdplVar, fcyhVar, i, i2);
        this.e = fdauVar;
    }

    @Override // defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdwg(this.e, this.d, fcyhVar, i, i2);
    }

    @Override // defpackage.fdwa
    protected final Object g(fdpm fdpmVar, fcxy fcxyVar) {
        boolean z = fdkb.a;
        Object objA = fdjy.a(new fdwf(this, fdpmVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public /* synthetic */ fdwg(fdau fdauVar, fdpl fdplVar) {
        this(fdauVar, fdplVar, fcyi.a, -2, 1);
    }
}
