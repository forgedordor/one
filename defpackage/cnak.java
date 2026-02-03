package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnak extends fcyz implements fdat {
    int a;
    final /* synthetic */ cnam b;
    final /* synthetic */ eqds c;
    final /* synthetic */ aubq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnak(cnam cnamVar, eqds eqdsVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cnamVar;
        this.c = eqdsVar;
        this.d = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cnam cnamVar = this.b;
        eqds eqdsVar = this.c;
        aubq aubqVar = this.d;
        this.a = 1;
        Object objA = cnamVar.a(eqdsVar, aubqVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnak(this.b, this.c, this.d, fcxyVar);
    }
}
