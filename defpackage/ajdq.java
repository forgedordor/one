package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajdq extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajdy b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdq(fcxy fcxyVar, ajdy ajdyVar, int i, boolean z) {
        super(2, fcxyVar);
        this.b = ajdyVar;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajdq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajdy ajdyVar = this.b;
            int i2 = this.c;
            boolean z = this.d;
            this.a = 1;
            if (ajdyVar.d(i2, z, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajdq ajdqVar = new ajdq(fcxyVar, this.b, this.c, this.d);
        ajdqVar.e = obj;
        return ajdqVar;
    }
}
