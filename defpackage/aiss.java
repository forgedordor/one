package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiss extends fcyz implements fdat {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ enko c;
    final /* synthetic */ aisw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiss(int i, enko enkoVar, aisw aiswVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = i;
        this.c = enkoVar;
        this.d = aiswVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiss) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsvl dsvlVarA = dsvm.a(this.b);
            dsvlVarA.c(dswc.b());
            enko enkoVar = this.c;
            if (enkoVar != null) {
                dsvlVarA.b(new dsvf(aitc.a, enkoVar));
            }
            aisw aiswVar = this.d;
            dsvlVarA.b(aita.b(aiswVar.a));
            dsvm dsvmVarA = dsvlVarA.a();
            this.a = 1;
            if (aiswVar.c(dsvmVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aiss(this.b, this.c, this.d, fcxyVar);
    }
}
