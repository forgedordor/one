package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhi extends fcyz implements fdat {
    float a;
    int b;
    final /* synthetic */ dhk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhi(dhk dhkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dhkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdjx fdjxVar;
        final float fA;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            fA = this.a;
            fdjxVar = (fdjx) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdjxVar = (fdjx) this.d;
            fA = dgv.a(fdjxVar.hE());
        }
        while (fdjy.g(fdjxVar)) {
            final dhk dhkVar = this.c;
            fdap fdapVar = new fdap() { // from class: dhh
                @Override // defpackage.fdap
                public final Object invoke(Object obj2) {
                    long jLongValue = ((Long) obj2).longValue();
                    dhk dhkVar2 = dhkVar;
                    if (!dhkVar2.t()) {
                        if (dhkVar2.c() == Long.MIN_VALUE) {
                            dhkVar2.j(jLongValue);
                        }
                        float f = fA;
                        long jC = jLongValue - dhkVar2.c();
                        boolean z = f != 0.0f;
                        if (f != 0.0f) {
                            jC = fdcu.c(jC / f);
                        }
                        dhkVar2.l(jC);
                        dhkVar2.h(jC, !z);
                    }
                    return fctx.a;
                }
            };
            this.d = fdjxVar;
            this.a = fA;
            this.b = 1;
            if (hos.c(fdapVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dhi dhiVar = new dhi(this.c, fcxyVar);
        dhiVar.d = obj;
        return dhiVar;
    }
}
