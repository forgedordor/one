package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfj extends fcyz implements fdat {
    final /* synthetic */ wfk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfj(wfk wfkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = wfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.d.b()).c("Bugle.DirectSend.FastImageSending.TuneButtonClick.Count");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wfj(this.a, fcxyVar);
    }
}
