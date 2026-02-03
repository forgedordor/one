package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayan extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayan(fcxy fcxyVar, aybe aybeVar, long j, String str, int i) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = j;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayan) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.k.u(this.b, this.c, new Integer(this.d));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayan ayanVar = new ayan(fcxyVar, this.a, this.b, this.c, this.d);
        ayanVar.e = obj;
        return ayanVar;
    }
}
