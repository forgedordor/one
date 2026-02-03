package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqx extends fcyz implements fdat {
    final /* synthetic */ carc a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caqx(fcxy fcxyVar, carc carcVar, String str) {
        super(2, fcxyVar);
        this.a = carcVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caqx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        carc carcVar = this.a;
        return cqbz.c(carcVar.c, carcVar.d, "backup_timing_stats", this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        caqx caqxVar = new caqx(fcxyVar, this.a, this.b);
        caqxVar.c = obj;
        return caqxVar;
    }
}
