package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayav extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ lh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayav(fcxy fcxyVar, aybe aybeVar, byte[] bArr, lh lhVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = bArr;
        this.c = lhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.M.d(this.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayav ayavVar = new ayav(fcxyVar, this.a, this.b, this.c);
        ayavVar.d = obj;
        return ayavVar;
    }
}
