package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdkm extends fdze {
    public final fdhx b;

    public fdkm(fcyh fcyhVar, fcxy fcxyVar) {
        super(fcyhVar, fcxyVar);
        this.b = new fdhx(0, fdia.a);
    }

    @Override // defpackage.fdze, defpackage.fdme
    protected final void hC(Object obj) {
        hG(obj);
    }

    @Override // defpackage.fdze, defpackage.fdic
    protected final void hG(Object obj) {
        fdhx fdhxVar;
        do {
            fdhxVar = this.b;
            int i = fdhxVar.c;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                fcxy fcxyVar = this.e;
                fdyf.a(fcym.c(fcxyVar), fdji.a(obj, fcxyVar));
                return;
            }
        } while (!fdhxVar.c(0, 2));
    }
}
