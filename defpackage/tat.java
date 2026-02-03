package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tat extends fcyz implements fdat {
    final /* synthetic */ dbwt a;
    final /* synthetic */ tbe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tat(fcxy fcxyVar, dbwt dbwtVar, tbe tbeVar) {
        super(2, fcxyVar);
        this.a = dbwtVar;
        this.b = tbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dbwt dbwtVar = this.a;
        dbwtVar.copyOnWrite();
        dbwu dbwuVar = (dbwu) dbwtVar.instance;
        dbwu dbwuVar2 = dbwu.a;
        dbwuVar.b |= 1;
        dbwuVar.c = Long.MAX_VALUE;
        return dbwtVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tat tatVar = new tat(fcxyVar, this.a, this.b);
        tatVar.c = obj;
        return tatVar;
    }
}
