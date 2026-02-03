package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdwb extends fdwa {
    public fdwb(fdpl fdplVar, fcyh fcyhVar, int i, int i2) {
        super(fdplVar, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    protected final fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdwb(this.d, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    public final fdpl f() {
        return this.d;
    }

    @Override // defpackage.fdwa
    protected final Object g(fdpm fdpmVar, fcxy fcxyVar) {
        Object objA = this.d.a(fdpmVar, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public /* synthetic */ fdwb(fdpl fdplVar, fcyh fcyhVar, int i, int i2, int i3) {
        super(fdplVar, (i3 & 2) != 0 ? fcyi.a : fcyhVar, (i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
