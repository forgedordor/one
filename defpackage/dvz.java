package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvz extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdoa b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvz(fdoa fdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdlr fdlrVar;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdlrVar = (fdlr) this.c;
            try {
                fctl.b(obj);
            } catch (Throwable th2) {
                th = th2;
                fdlrVar.t(null);
                throw th;
            }
        } else {
            fctl.b(obj);
            fdlr fdlrVarD = fdil.d((fdjx) this.c, null, null, new dvy(null), 3);
            try {
                fdoa fdoaVar = this.b;
                this.c = fdlrVarD;
                this.a = 1;
                Object objI = fdoaVar.i(this);
                if (objI == fcylVar) {
                    return fcylVar;
                }
                fdlrVar = fdlrVarD;
                obj = objI;
            } catch (Throwable th3) {
                fdlrVar = fdlrVarD;
                th = th3;
                fdlrVar.t(null);
                throw th;
            }
        }
        dvw dvwVar = (dvw) obj;
        fdlrVar.t(null);
        return dvwVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dvz dvzVar = new dvz(this.b, fcxyVar);
        dvzVar.c = obj;
        return dvzVar;
    }
}
