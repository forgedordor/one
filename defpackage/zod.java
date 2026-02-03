package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zod extends fcyz implements fdat {
    final /* synthetic */ zog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zod(zog zogVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = zogVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a.c("Bugle.Conv2.Paging.GenericError.Count");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zod(this.a, fcxyVar);
    }
}
