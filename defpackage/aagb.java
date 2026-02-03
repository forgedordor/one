package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aagb extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagb(fdpl fdplVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aagb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpl fdplVar = this.b;
            aaga aagaVar = aaga.a;
            this.a = 1;
            if (fdplVar.a(aagaVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aagb(this.b, fcxyVar);
    }
}
