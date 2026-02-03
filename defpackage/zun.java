package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zun extends fcyz implements fdat {
    final /* synthetic */ zup a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zun(zup zupVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zupVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a.c("Bugle.RcsEdit.Ui.Cancelled");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zun(this.a, fcxyVar);
    }
}
