package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tam extends fcyz implements fdat {
    final /* synthetic */ tbe a;
    final /* synthetic */ dbwo b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tam(fcxy fcxyVar, tbe tbeVar, dbwo dbwoVar) {
        super(2, fcxyVar);
        this.a = tbeVar;
        this.b = dbwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tam) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dbwf dbwfVar = this.b.b;
        if (dbwfVar == null) {
            dbwfVar = dbwf.a;
        }
        dbxg dbxgVar = dbwfVar.c == 3 ? (dbxg) dbwfVar.d : dbxg.a;
        return Boolean.valueOf(szd.c(new Long((dbxgVar.c == 2 ? (dbxe) dbxgVar.d : dbxe.a).c)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tam tamVar = new tam(fcxyVar, this.a, this.b);
        tamVar.c = obj;
        return tamVar;
    }
}
