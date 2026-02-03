package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etq extends fcyz implements fdat {
    int a;
    final /* synthetic */ etv b;
    final /* synthetic */ int c;
    final /* synthetic */ float d;
    final /* synthetic */ ddz e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etq(etv etvVar, int i, float f, ddz ddzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = etvVar;
        this.c = i;
        this.d = f;
        this.e = ddzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((etq) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dwy dwyVar = (dwy) this.f;
            final etv etvVar = this.b;
            final eth ethVar = new eth(dwyVar, etvVar);
            int i2 = this.c;
            float f = this.d;
            ddz ddzVar = this.e;
            fdat fdatVar = new fdat() { // from class: etp
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    etvVar.A(((Integer) obj4).intValue());
                    return fctx.a;
                }
            };
            this.a = 1;
            etd etdVar = eua.a;
            fdatVar.a(ethVar, new Integer(i2));
            int iB = ethVar.b();
            int iD = ethVar.d() - ethVar.b();
            boolean z = i2 > iB;
            if (((z && i2 > ethVar.d()) || (!z && i2 < ethVar.b())) && Math.abs(i2 - ethVar.b()) >= 3) {
                int i3 = iD + 1;
                int iF = z ? fddu.f(i2 - i3, ethVar.b()) : fddu.g(i3 + i2, ethVar.b());
                ethVar.a.u(iF, 0.0f / r5.l(), true);
            }
            float f2 = ethVar.f(i2) + f;
            final fdcf fdcfVar = new fdcf();
            Object objH = dgv.h(0.0f, f2, ddzVar, new fdat() { // from class: etx
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    float fFloatValue = ((Float) obj3).floatValue();
                    ((Float) obj4).floatValue();
                    etd etdVar2 = eua.a;
                    fdcf fdcfVar2 = fdcfVar;
                    fdcfVar2.a += ethVar.a(fFloatValue - fdcfVar2.a);
                    return fctx.a;
                }
            }, this, 4);
            if (objH != obj2) {
                objH = fctx.a;
            }
            if (objH == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        etq etqVar = new etq(this.b, this.c, this.d, this.e, fcxyVar);
        etqVar.f = obj;
        return etqVar;
    }
}
