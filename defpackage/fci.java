package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fci extends fcyz implements fdau {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ hox d;
    final /* synthetic */ ebk e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fci(fdjx fdjxVar, hox hoxVar, ebk ebkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = fdjxVar;
        this.d = hoxVar;
        this.e = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        fci fciVar = new fci(this.c, this.d, this.e, (fcxy) obj3);
        fciVar.f = (dwn) obj;
        fciVar.b = j;
        return fciVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [dwn, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r11 = this.f;
            fdil.d(this.c, null, null, new fcg(this.d, this.b, this.e, null), 3);
            this.a = 1;
            obj = r11.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        fdil.d(this.c, null, null, new fch(this.d, ((Boolean) obj).booleanValue(), this.e, null), 3);
        return fctx.a;
    }
}
