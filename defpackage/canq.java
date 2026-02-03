package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canq extends fcyz implements fdat {
    final /* synthetic */ canu a;
    final /* synthetic */ int b;
    final /* synthetic */ cpyy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canq(fcxy fcxyVar, canu canuVar, int i, cpyy cpyyVar) {
        super(2, fcxyVar);
        this.a = canuVar;
        this.b = i;
        this.c = cpyyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((canq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a.n(emec.RESTORE_BACKUP_KEY, this.b, this.c);
        return cpyz.RETRY;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        canq canqVar = new canq(fcxyVar, this.a, this.b, this.c);
        canqVar.d = obj;
        return canqVar;
    }
}
