package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yjz extends fcyz implements fdat {
    int a;
    final /* synthetic */ yka b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjz(yka ykaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ykaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yjz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fctl.b(obj);
        } else {
            fctl.b(obj);
            yka ykaVar = this.b;
            yjx yjxVar = new yjx(new fdua(ykaVar.b.b, ykaVar.d.e, new yjy(null)));
            yju yjuVar = new yju(ykaVar);
            this.a = 2;
            if (yjxVar.a(yjuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yjz(this.b, fcxyVar);
    }
}
