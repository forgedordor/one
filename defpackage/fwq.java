package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwq extends fcyz implements fdap {
    int a;
    final /* synthetic */ fws b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwq(fws fwsVar, float f, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fwsVar;
        this.c = f;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final fws fwsVar = this.b;
            float f = this.c;
            float fC = fwsVar.d.c();
            fdat fdatVar = new fdat() { // from class: fwp
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    fwsVar.e(fFloatValue);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dgv.h(fC, f, null, fdatVar, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fwq(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
