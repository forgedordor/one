package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class darj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dark b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public darj(dark darkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = darkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((darj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dark darkVar = this.b;
            fdap fdapVar = new fdap() { // from class: dari
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    dard dardVar = (dard) dare.a.createBuilder();
                    dardVar.getClass();
                    evvp evvpVarA = cssu.a(darkVar.b.f().toEpochMilli());
                    evvpVarA.getClass();
                    dardVar.copyOnWrite();
                    dare dareVar = (dare) dardVar.instance;
                    dareVar.c = evvpVarA;
                    dareVar.b |= 1;
                    return darg.a(dardVar);
                }
            };
            this.a = 1;
            obj = darkVar.a.d(fdapVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return new ctao(true != this.b.c((dare) obj) ? 2 : 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new darj(this.b, fcxyVar);
    }
}
