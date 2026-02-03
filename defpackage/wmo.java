package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmo extends fcyz implements fdat {
    final /* synthetic */ wmp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmo(wmp wmpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = wmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wmo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ains) this.a.c.b()).c("Bugle.ComposeRow.ConstraintNotices.VideoDurationTooLongDialog.Dismissed.Count");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wmo(this.a, fcxyVar);
    }
}
