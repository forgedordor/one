package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class han extends fcyz implements fdat {
    int a;
    final /* synthetic */ fyf b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hox e;
    final /* synthetic */ hox f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public han(fyf fyfVar, float f, boolean z, hox hoxVar, hox hoxVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fyfVar;
        this.c = f;
        this.d = z;
        this.e = hoxVar;
        this.f = hoxVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((han) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fyf fyfVar = this.b;
            hox hoxVar = this.e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (hbj.c(hoxVar) >> 32));
            long jC = hbj.c(hoxVar) & 4294967295L;
            float f = this.c;
            boolean z = this.d;
            hox hoxVar2 = this.f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) jC);
            long j = ((kjb) hoxVar2.a()).a;
            dgg dggVar = new dgg((byte[]) null);
            this.a = 1;
            if (hbj.j(fyfVar, fIntBitsToFloat, fIntBitsToFloat2, f, z, j, dggVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new han(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
