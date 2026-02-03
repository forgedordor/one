package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafm extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aafo c;
    final /* synthetic */ bxun d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafm(aafo aafoVar, bxun bxunVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aafoVar;
        this.d = bxunVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aafm) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String str;
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            String str2 = (String) this.b;
            if (str2 == null) {
                aafo aafoVar = this.c;
                aafoVar.f.f(null);
                aafoVar.g.f(-1);
                aafoVar.f(aafj.c);
            } else if (fdgn.H(str2)) {
                aafo aafoVar2 = this.c;
                int i = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                ekgbVar.getClass();
                aafoVar2.g(str2, ekgbVar);
                aafoVar2.f(aafj.b);
            } else {
                aafo aafoVar3 = this.c;
                aafoVar3.f(aafj.a);
                bxun bxunVar = this.d;
                this.b = str2;
                this.a = 1;
                Object objA = bxunVar.a(aafoVar3.b, str2, this);
                if (objA == fcylVar) {
                    return fcylVar;
                }
                str = str2;
                obj = objA;
            }
            return fctx.a;
        }
        str = (String) this.b;
        fctl.b(obj);
        aafo aafoVar4 = this.c;
        aafoVar4.g(str, (ekgb) obj);
        aafoVar4.f(aafj.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aafm aafmVar = new aafm(this.c, this.d, fcxyVar);
        aafmVar.b = obj;
        return aafmVar;
    }
}
