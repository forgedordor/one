package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdpg extends fdvt {
    private final fdat d;

    public fdpg(fdat fdatVar, fcyh fcyhVar, int i, int i2) {
        super(fcyhVar, i, i2);
        this.d = fdatVar;
    }

    static /* synthetic */ Object g(fdpg fdpgVar, fdos fdosVar, fcxy fcxyVar) {
        Object objA = fdpgVar.d.a(fdosVar, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.fdvt
    protected Object b(fdos fdosVar, fcxy fcxyVar) {
        return g(this, fdosVar, fcxyVar);
    }

    @Override // defpackage.fdvt
    protected fdvt c(fcyh fcyhVar, int i, int i2) {
        return new fdpg(this.d, fcyhVar, i, i2);
    }

    @Override // defpackage.fdvt
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public /* synthetic */ fdpg(fdat fdatVar) {
        this(fdatVar, fcyi.a, -2, 1);
    }
}
