package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccuj extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccul b;
    final /* synthetic */ ezny c;
    final /* synthetic */ aubq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccuj(ccul cculVar, ezny eznyVar, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cculVar;
        this.c = eznyVar;
        this.d = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccuj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ccul cculVar = this.b;
        ezny eznyVar = this.c;
        this.a = 1;
        Object objB = cculVar.b(eznyVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccuj(this.b, this.c, this.d, fcxyVar);
    }
}
