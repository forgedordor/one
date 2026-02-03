package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzx extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaf b;
    final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlzx(dmaf dmafVar, Exception exc, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmafVar;
        this.c = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlzx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmaf dmafVar = this.b;
            Exception exc = this.c;
            this.a = 1;
            if (dmafVar.e(exc, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlzx(this.b, this.c, fcxyVar);
    }
}
