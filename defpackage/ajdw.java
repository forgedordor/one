package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajdw extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdw(fcxy fcxyVar, ajdy ajdyVar, int i, int i2) {
        super(2, fcxyVar);
        this.b = ajdyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajdw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajdy ajdyVar = this.b;
        ajdx ajdxVar = new ajdx(this.c, this.d);
        this.a = 1;
        Object objB = crrj.b(ajdyVar.a, ajdxVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajdw ajdwVar = new ajdw(fcxyVar, this.b, this.c, this.d);
        ajdwVar.e = obj;
        return ajdwVar;
    }
}
