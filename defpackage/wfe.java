package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfe extends fcyz implements fdat {
    int a;
    final /* synthetic */ wfk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfe(wfk wfkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wfkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wfk wfkVar = this.b;
            this.a = 1;
            obj = wfkVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        wfm wfmVar = (wfm) obj;
        ((ains) this.b.d.b()).e("Bugle.DirectSend.FastImageSending.Dismissed.Count", wfn.a(wfmVar, wfmVar) - 1);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wfe(this.b, fcxyVar);
    }
}
