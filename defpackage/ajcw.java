package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajcw extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajcw(fcxy fcxyVar, ajdy ajdyVar, int i, int i2) {
        super(2, fcxyVar);
        this.b = ajdyVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajcw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ajcx ajcxVar = new ajcx(this.c, this.d);
        this.a = 1;
        Object objB = crrj.b(ajdyVar.a, ajcxVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajcw ajcwVar = new ajcw(fcxyVar, this.b, this.c, this.d);
        ajcwVar.e = obj;
        return ajcwVar;
    }
}
