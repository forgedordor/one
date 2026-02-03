package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gso extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gsp d;
    final /* synthetic */ float e;
    final /* synthetic */ dew f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gso(gsp gspVar, float f, dew dewVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = gspVar;
        this.e = f;
        this.f = dewVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        gso gsoVar = new gso(this.d, this.e, this.f, (fcxy) obj4);
        gsoVar.g = (hgj) obj;
        gsoVar.b = (hjj) obj2;
        gsoVar.c = (gsq) obj3;
        return gsoVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.g;
            float fB = ((hjj) this.b).b(this.c);
            if (!Float.isNaN(fB)) {
                final fdcf fdcfVar = new fdcf();
                gsp gspVar = this.d;
                float fA = Float.isNaN(gspVar.a()) ? 0.0f : gspVar.a();
                fdcfVar.a = fA;
                float f = this.e;
                dew dewVar = this.f;
                final hgj hgjVar = (hgj) obj2;
                fdat fdatVar = new fdat() { // from class: gsn
                    @Override // defpackage.fdat
                    public final Object a(Object obj3, Object obj4) {
                        float fFloatValue = ((Float) obj3).floatValue();
                        hgjVar.a(fFloatValue, ((Float) obj4).floatValue());
                        fdcfVar.a = fFloatValue;
                        return fctx.a;
                    }
                };
                this.g = null;
                this.b = null;
                this.a = 1;
                if (dgv.c(fA, fB, f, dewVar, fdatVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }
}
