package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtb extends fcyz implements fdat {
    final /* synthetic */ cmte a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmtb(cmte cmteVar, String str, long j, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cmteVar;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmtb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cmte cmteVar = this.a;
        auvw.k(cmteVar.b, null, null, new cmta(cmteVar, this.b, this.c, this.d, null), 3);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmtb(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
