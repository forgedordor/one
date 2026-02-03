package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daro extends fcyz implements fdat {
    int a;
    final /* synthetic */ darp b;
    final /* synthetic */ ctba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daro(darp darpVar, ctba ctbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = darpVar;
        this.c = ctbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daro) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        darp darpVar = this.b;
        ctba ctbaVar = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(darpVar.c), new darn(null, darpVar, ctbaVar), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daro(this.b, this.c, fcxyVar);
    }
}
