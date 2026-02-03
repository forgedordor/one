package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfg extends fcyz implements fdat {
    final /* synthetic */ cyfu a;
    final /* synthetic */ egbe b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfg(cyfu cyfuVar, egbe egbeVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cyfuVar;
        this.b = egbeVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyfg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        egbe egbeVar = this.b;
        String str = egbeVar.b().g;
        str.getClass();
        this.a.b.e = str;
        this.c.b("Successfully set the account to " + egbeVar.b().g + ".");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyfg(this.a, this.b, this.c, fcxyVar);
    }
}
