package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdos extends fcyz implements fdat {
    final /* synthetic */ cdpb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdos(cdpb cdpbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cdpbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdos) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.h.b()).c("Bugle.Kids.AllowlistUpdate.Listener.Notified");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdos(this.a, fcxyVar);
    }
}
