package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atxc extends fcyz implements fdat {
    int a;
    final /* synthetic */ atxd b;
    final /* synthetic */ aufh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atxc(atxd atxdVar, aufh aufhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atxdVar;
        this.c = aufhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atxc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atxd atxdVar = this.b;
        aufh aufhVar = this.c;
        this.a = 1;
        Object objA = atxdVar.a(aufhVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atxc(this.b, this.c, fcxyVar);
    }
}
