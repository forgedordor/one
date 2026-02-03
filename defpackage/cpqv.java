package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpqv extends fcyz implements fdat {
    final /* synthetic */ cprd a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpqv(fcxy fcxyVar, cprd cprdVar) {
        super(2, fcxyVar);
        this.a = cprdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpqv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cprd cprdVar = this.a;
        cprdVar.b.d("CmsDeltaSyncManager#clearBugleDbFields#backupReferences", new cpqx(cprdVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cpqv cpqvVar = new cpqv(fcxyVar, this.a);
        cpqvVar.b = obj;
        return cpqvVar;
    }
}
