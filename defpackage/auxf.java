package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxf extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdav b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ fdci g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxf(fdav fdavVar, Object obj, Object obj2, Object obj3, Object obj4, fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdavVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auxf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d, this.e, this.f);
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.g.a = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auxf(this.b, this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
