package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfkn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfkp b;
    final /* synthetic */ eozq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkn(cfkp cfkpVar, eozq eozqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfkpVar;
        this.c = eozqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cfkp cfkpVar = this.b;
            eozq eozqVar = this.c;
            this.a = 1;
            obj = fdin.a(eicg.a(cfkpVar.b), new cfkl(null, eozqVar, cfkpVar), this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        aubq aubqVar = (aubq) obj;
        if (aubqVar == null) {
            eozr eozrVar = (eozr) eozs.a.createBuilder();
            eozrVar.getClass();
            eozt.b(false, eozrVar);
            return eozt.a(eozrVar);
        }
        eozq eozqVar2 = this.c;
        cijs cijsVar = (cijs) ciju.a.createBuilder();
        cijsVar.getClass();
        String str = eozqVar2.b;
        str.getClass();
        cijv.b(str, cijsVar);
        cijv.c(aubqVar, cijsVar);
        cfkp cfkpVar2 = this.b;
        ciju cijuVarA = cijv.a(cijsVar);
        this.a = 2;
        Object objD = cfkpVar2.d(cijuVarA, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfkn(this.b, this.c, fcxyVar);
    }
}
