package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxe extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdau b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ fdci f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxe(fdau fdauVar, Object obj, Object obj2, Object obj3, fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdauVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auxe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d, this.e);
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.f.a = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auxe(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
