package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzy extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzy(fcxy fcxyVar, aybe aybeVar, int i, String str, String str2, long j) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aybe aybeVar = this.a;
        aybeVar.n.c(aybeVar.d, this.b, this.c, this.d, 131, this.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axzy axzyVar = new axzy(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        axzyVar.f = obj;
        return axzyVar;
    }
}
