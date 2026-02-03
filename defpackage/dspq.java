package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspq extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsps b;
    final /* synthetic */ dsbi c;
    final /* synthetic */ etjv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dspq(dsps dspsVar, dsbi dsbiVar, etjv etjvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dspsVar;
        this.c = dsbiVar;
        this.d = etjvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dspq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dsps dspsVar = this.b;
            dsbi dsbiVar = this.c;
            etjv etjvVar = this.d;
            this.a = 1;
            if (dspsVar.a.a(dsbiVar, etjvVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dspq(this.b, this.c, this.d, fcxyVar);
    }
}
