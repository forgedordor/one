package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dta extends fcyz implements fdat {
    int a;
    final /* synthetic */ dtd b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dta(dtd dtdVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dtdVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dta) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dwy dwyVar = (dwy) this.d;
                this.b.d.b(true);
                fdat fdatVar = this.c;
                this.a = 1;
                if (fdatVar.a(dwyVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
            this.b.d.b(false);
            return fctx.a;
        } catch (Throwable th) {
            this.b.d.b(false);
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dta dtaVar = new dta(this.b, this.c, fcxyVar);
        dtaVar.d = obj;
        return dtaVar;
    }
}
