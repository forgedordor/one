package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camf extends fcyz implements fdat {
    final /* synthetic */ cams a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camf(fcxy fcxyVar, cams camsVar) {
        super(2, fcxyVar);
        this.a = camsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.f.h();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camf camfVar = new camf(fcxyVar, this.a);
        camfVar.b = obj;
        return camfVar;
    }
}
