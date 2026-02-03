package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmlg extends fcyz implements fdat {
    final /* synthetic */ add a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmlg(add addVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = addVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmlg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c("android.permission.CAMERA");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmlg(this.a, fcxyVar);
    }
}
