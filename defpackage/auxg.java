package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxg extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdax b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    final /* synthetic */ Object h;
    final /* synthetic */ fdci i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxg(fdax fdaxVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdaxVar;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auxg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.b.a(this.c, this.d, this.e, this.f, this.g, this.h);
            this.a = 1;
            if (fdkj.c(1000L, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.i.a = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auxg(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
