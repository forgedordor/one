package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcv extends fcyz implements fdat {
    int a;
    final /* synthetic */ fyf b;
    final /* synthetic */ ddz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcv(fyf fyfVar, ddz ddzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fyfVar;
        this.c = ddzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gcv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fyf fyfVar = this.b;
            ddz ddzVar = this.c;
            this.a = 1;
            if ((hbk.b(fyfVar.f(), 0) && fyf.l(((Number) fyfVar.e.c()).floatValue()) == fyf.l(fyfVar.c)) || (hbk.b(fyfVar.f(), 1) && fyf.l(((Number) fyfVar.e.c()).floatValue()) == fyf.l(fyfVar.d))) {
                objA = fctx.a;
            } else {
                objA = fyfVar.f.a(dod.c, new fyc(fyfVar, hbk.b(fyfVar.f(), 0) ? fyfVar.a(fyfVar.c) : fyfVar.a(fyfVar.d), ddzVar, null), this);
                if (objA != fcylVar) {
                    objA = fctx.a;
                }
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gcv(this.b, this.c, fcxyVar);
    }
}
