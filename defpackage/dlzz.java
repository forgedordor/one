package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlzz(dmaf dmafVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlzz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmaf dmafVar = this.b;
            this.a = 1;
            if (dmafVar.f.i.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlzz(this.b, fcxyVar);
    }
}
