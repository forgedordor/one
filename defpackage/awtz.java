package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awtz extends fcyz implements fdat {
    int a;
    final /* synthetic */ awuo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awtz(awuo awuoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awuoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awtz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awuo awuoVar = this.b;
        this.a = 1;
        Object objE = awuoVar.e(this);
        return objE == fcylVar ? fcylVar : objE;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awtz(this.b, fcxyVar);
    }
}
