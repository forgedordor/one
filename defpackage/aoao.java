package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoao extends fcyz implements fdat {
    final /* synthetic */ aoap a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoao(aoap aoapVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aoapVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoao) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.a.b()).e("Bugle.Recipient.Sync.ParticipantContactSync.Status.Count", this.b - 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoao(this.a, this.b, fcxyVar);
    }
}
