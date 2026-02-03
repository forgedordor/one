package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrn extends fcyz implements fdat {
    int a;
    final /* synthetic */ ccro b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccrn(ccro ccroVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ccroVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccrn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ccro ccroVar = this.b;
        this.a = 1;
        Object objA = ccroVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccrn(this.b, fcxyVar);
    }
}
