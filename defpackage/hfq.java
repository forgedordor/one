package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfq extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ hgn d;
    final /* synthetic */ float e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfq(hgn hgnVar, float f, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = hgnVar;
        this.e = f;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        hfq hfqVar = new hfq(this.d, this.e, (fcxy) obj4);
        hfqVar.f = (hgj) obj;
        hfqVar.b = (hjj) obj2;
        hfqVar.c = obj3;
        return hfqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.f;
            float fB = ((hjj) this.b).b(this.c);
            if (!Float.isNaN(fB)) {
                final fdcf fdcfVar = new fdcf();
                hgn hgnVar = this.d;
                float fB2 = Float.isNaN(hgnVar.b()) ? 0.0f : hgnVar.b();
                fdcfVar.a = fB2;
                float f = this.e;
                ddz ddzVar = (ddz) hgnVar.a.invoke();
                final hgj hgjVar = (hgj) obj2;
                fdat fdatVar = new fdat() { // from class: hfp
                    @Override // defpackage.fdat
                    public final Object a(Object obj3, Object obj4) {
                        float fFloatValue = ((Float) obj3).floatValue();
                        hgjVar.a(fFloatValue, ((Float) obj4).floatValue());
                        fdcfVar.a = fFloatValue;
                        return fctx.a;
                    }
                };
                this.f = null;
                this.b = null;
                this.a = 1;
                if (dgv.c(fB2, fB, f, ddzVar, fdatVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }
}
