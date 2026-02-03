package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdze extends fdic implements fcyw {
    public final fcxy e;

    public fdze(fcyh fcyhVar, fcxy fcxyVar) {
        super(fcyhVar, true);
        this.e = fcxyVar;
    }

    @Override // defpackage.fcyw
    public final fcyw dJ() {
        fcxy fcxyVar = this.e;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    @Override // defpackage.fdme
    protected void hC(Object obj) {
        fcxy fcxyVar = this.e;
        fdyf.a(fcym.c(fcxyVar), fdji.a(obj, fcxyVar));
    }

    @Override // defpackage.fdme
    protected final boolean hD() {
        return true;
    }

    @Override // defpackage.fdic
    protected void hG(Object obj) {
        fcxy fcxyVar = this.e;
        fcxyVar.w(fdji.a(obj, fcxyVar));
    }

    public void d() {
    }

    @Override // defpackage.fcyw
    public final void dK() {
    }
}
