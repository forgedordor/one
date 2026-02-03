package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daqv extends fcyz implements fdat {
    final /* synthetic */ daqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daqv(daqz daqzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = daqzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daqv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) ((dapz) this.a.c.b()).a.b()).c("Bugle.Wear.Phone.LoadConversation.Error");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daqv(this.a, fcxyVar);
    }
}
