package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdic extends fdme implements fdlr, fcxy, fdjx {
    public final fcyh a;

    public fdic(fcyh fcyhVar, boolean z) {
        super(z);
        L((fdlr) fcyhVar.get(fdlr.c));
        this.a = fcyhVar.plus(this);
    }

    @Override // defpackage.fdme
    protected final String g() {
        return String.valueOf(fdkc.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.fdme
    public String h() {
        String str = null;
        if (fdkb.a) {
            fcyh fcyhVar = this.a;
            fdju fdjuVar = (fdju) fcyhVar.get(fdju.a);
            if (fdjuVar != null) {
                fdjw fdjwVar = (fdjw) fcyhVar.get(fdjw.a);
                str = (fdjwVar != null ? fdjwVar.b : "coroutine") + "#" + fdjuVar.b;
            }
        }
        if (str == null) {
            return fdkc.a(this);
        }
        return "\"" + str + "\":" + fdkc.a(this);
    }

    @Override // defpackage.fdjx
    public final fcyh hE() {
        return this.a;
    }

    protected void hG(Object obj) {
        hC(obj);
    }

    @Override // defpackage.fdme
    public final void hH(Throwable th) {
        fdjs.b(this.a, th);
    }

    @Override // defpackage.fdme
    protected final void hI(Object obj) {
        if (!(obj instanceof fdjg)) {
            l(obj);
        } else {
            fdjg fdjgVar = (fdjg) obj;
            k(fdjgVar.b, fdjgVar.c.b());
        }
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.a;
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) throws Throwable {
        Object objF = F(fdji.b(obj));
        if (objF == fdmf.b) {
            return;
        }
        hG(objF);
    }

    protected void l(Object obj) {
    }

    protected void k(Throwable th, boolean z) {
    }
}
