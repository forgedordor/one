package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahwu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahwu(ahwx ahwxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahwu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahwx ahwxVar = this.b;
        this.a = 1;
        Object objA = ahwxVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahwu(this.b, fcxyVar);
    }
}
