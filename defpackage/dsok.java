package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsok extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsom b;
    final /* synthetic */ dsbi c;
    final /* synthetic */ etjv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsok(dsom dsomVar, dsbi dsbiVar, etjv etjvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsomVar;
        this.c = dsbiVar;
        this.d = etjvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsok) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsom dsomVar = this.b;
            dsbi dsbiVar = this.c;
            etjv etjvVar = this.d;
            this.a = 1;
            if (dsomVar.a.a(dsbiVar, etjvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsok(this.b, this.c, this.d, fcxyVar);
    }
}
