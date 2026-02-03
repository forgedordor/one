package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbt extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzbx b;
    final /* synthetic */ boolean c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbt(bzbx bzbxVar, boolean z, String str, String str2, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzbxVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        bzbt bzbtVar;
        Object objG;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objG = ((fctk) obj).a;
            bzbtVar = this;
        } else {
            bzbx bzbxVar = this.b;
            boolean z = this.c;
            String str = this.d;
            String str2 = this.e;
            int i2 = this.f;
            this.a = 1;
            bzbtVar = this;
            objG = bzbxVar.g(z, str, str2, i2, bzbtVar);
            if (objG == fcylVar) {
                return fcylVar;
            }
        }
        int i3 = bzbtVar.f;
        Throwable thC = fctk.c(objG);
        return thC == null ? new byqt() : byqp.a(thC, i3);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbt(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
