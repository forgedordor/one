package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspb extends fcyz implements fdat {
    final /* synthetic */ etjv a;
    final /* synthetic */ dspd b;
    final /* synthetic */ dsbi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dspb(etjv etjvVar, dspd dspdVar, dsbi dsbiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = etjvVar;
        this.b = dspdVar;
        this.c = dsbiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dspb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        etjv etjvVar = this.a;
        if (etjvVar != null) {
            dspd dspdVar = this.b;
            dspdVar.i.c(this.c, etjvVar);
        }
        this.b.d(this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dspb(this.a, this.b, this.c, fcxyVar);
    }
}
