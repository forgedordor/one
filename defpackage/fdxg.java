package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxg implements fcxy, fcyw {
    private final fcxy a;
    private final fcyh b;

    public fdxg(fcxy fcxyVar, fcyh fcyhVar) {
        this.a = fcxyVar;
        this.b = fcyhVar;
    }

    @Override // defpackage.fcyw
    public final fcyw dJ() {
        fcxy fcxyVar = this.a;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.b;
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        this.a.w(obj);
    }

    @Override // defpackage.fcyw
    public final void dK() {
    }
}
