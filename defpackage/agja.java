package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agja extends fcyz implements fdat {
    final /* synthetic */ agjd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agja(agjd agjdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agjdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agja) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((aghz) this.a.f.b()).a.c("Bugle.Notification.Mute.Banner.Dismiss.Count");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agja(this.a, fcxyVar);
    }
}
