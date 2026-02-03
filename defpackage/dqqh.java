package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqh extends fcyz implements fdau {
    final /* synthetic */ dqqj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqh(dqqj dqqjVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.a = dqqjVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return new dqqh(this.a, (fcxy) obj3).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.close();
        return fctx.a;
    }
}
