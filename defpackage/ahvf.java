package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvf(ahwd ahwdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objL = ahwdVar.l(this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahvf(this.b, fcxyVar);
    }
}
