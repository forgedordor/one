package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuz extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahwd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahuz(ahwd ahwdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahuz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        Object objJ = ahwdVar.j(this);
        return objJ == fcylVar ? fcylVar : objJ;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahuz(this.b, fcxyVar);
    }
}
