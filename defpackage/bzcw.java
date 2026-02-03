package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzcw extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzda c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzcw(bzda bzdaVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = bzdaVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bzcw bzcwVar = new bzcw(this.c, (fcxy) obj3);
        bzcwVar.b = (String) obj2;
        return bzcwVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarN = this.c.a.n((String) this.b);
            this.a = 1;
            obj = fdxs.c(eijuVarN, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ((eqjv) obj).c;
    }
}
