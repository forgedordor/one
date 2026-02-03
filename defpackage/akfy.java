package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfy extends fcyz implements fdat {
    int a;
    final /* synthetic */ akgi b;
    final /* synthetic */ aoer c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akfy(akgi akgiVar, aoer aoerVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akgiVar;
        this.c = aoerVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akfy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akgi akgiVar = this.b;
        aoer aoerVar = this.c;
        int i2 = this.d;
        this.a = 1;
        Object objH = akgiVar.h(akgiVar.c.a, aoerVar, i2, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akfy(this.b, this.c, this.d, fcxyVar);
    }
}
