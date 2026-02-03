package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dyk b;
    final /* synthetic */ long c;
    final /* synthetic */ fdcf d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxj(dyk dykVar, long j, fdcf fdcfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dykVar;
        this.c = j;
        this.d = fdcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxj) c((dyh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dyh dyhVar = (dyh) this.e;
            final dyk dykVar = this.b;
            long j = this.c;
            final fdcf fdcfVar = this.d;
            float fC = dykVar.c(j);
            fdat fdatVar = new fdat() { // from class: dxi
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    fdcf fdcfVar2 = fdcfVar;
                    float f = fFloatValue - fdcfVar2.a;
                    dyk dykVar2 = dykVar;
                    fdcfVar2.a += dykVar2.b(dykVar2.c(dyhVar.b(dykVar2.g(dykVar2.b(f)))));
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dgv.h(0.0f, fC, null, fdatVar, this, 12) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dxj dxjVar = new dxj(this.b, this.c, this.d, fcxyVar);
        dxjVar.e = obj;
        return dxjVar;
    }
}
