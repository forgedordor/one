package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxx extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxz b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxx(dxz dxzVar, float f, float f2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxzVar;
        this.c = f;
        this.d = f2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dxz dxzVar = this.b;
            float f = this.c;
            float f2 = this.d;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.a = 1;
            if (dxk.a(dxzVar.b, (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxx(this.b, this.c, this.d, fcxyVar);
    }
}
