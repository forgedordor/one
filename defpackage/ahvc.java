package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvc(ahwd ahwdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ahwd ahwdVar = this.b;
        this.a = 1;
        Object objK = ahwdVar.k(this);
        return objK == fcylVar ? fcylVar : objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahvc(this.b, fcxyVar);
    }
}
