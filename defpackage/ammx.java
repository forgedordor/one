package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ammx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ammy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ammx(ammy ammyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ammyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ammx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ammy ammyVar = this.b;
        this.a = 1;
        Object objA = ammyVar.a(this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ammx(this.b, fcxyVar);
    }
}
