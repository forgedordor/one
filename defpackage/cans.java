package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cans extends fcyz implements fdat {
    final /* synthetic */ canu a;
    final /* synthetic */ cajn b;
    final /* synthetic */ Exception c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cans(fcxy fcxyVar, canu canuVar, cajn cajnVar, Exception exc) {
        super(2, fcxyVar);
        this.a = canuVar;
        this.b = cajnVar;
        this.c = exc;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cans) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a.n(emec.RESTORE_BACKUP_KEY, this.b.b, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cans cansVar = new cans(fcxyVar, this.a, this.b, this.c);
        cansVar.d = obj;
        return cansVar;
    }
}
