package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvny extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bvmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvny(bvmw bvmwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bvmwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvny) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b;
        bvmw bvmwVar = this.c;
        this.a = 1;
        Object objF = bvmwVar.f(str, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bvny bvnyVar = new bvny(this.c, fcxyVar);
        bvnyVar.b = obj;
        return bvnyVar;
    }
}
