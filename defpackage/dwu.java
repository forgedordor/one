package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwu extends fcyz implements fdat {
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ ddz c;
    final /* synthetic */ fdcf d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwu(float f, ddz ddzVar, fdcf fdcfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = f;
        this.c = ddzVar;
        this.d = fdcfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dwu) c((dwy) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            final dwy dwyVar = (dwy) this.e;
            float f = this.b;
            ddz ddzVar = this.c;
            final fdcf fdcfVar = this.d;
            fdat fdatVar = new fdat() { // from class: dwt
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    fdcf fdcfVar2 = fdcfVar;
                    float f2 = fdcfVar2.a;
                    fdcfVar2.a = f2 + dwyVar.a(fFloatValue - f2);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (dgv.h(0.0f, f, ddzVar, fdatVar, this, 4) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dwu dwuVar = new dwu(this.b, this.c, this.d, fcxyVar);
        dwuVar.e = obj;
        return dwuVar;
    }
}
