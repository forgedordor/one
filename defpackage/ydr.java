package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydr extends fcyz implements fdat {
    final /* synthetic */ fdjx a;
    final /* synthetic */ long b;
    final /* synthetic */ fdpl[] c;
    final /* synthetic */ boolean[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydr(fdjx fdjxVar, long j, fdpl[] fdplVarArr, boolean[] zArr, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdjxVar;
        this.b = j;
        this.c = fdplVarArr;
        this.d = zArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydr) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        auvw.k(this.a, null, null, new ydq(this.b, this.c, this.d, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ydr(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
