package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awuf extends fcyz implements fdat {
    int a;
    final /* synthetic */ awuo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awuf(awuo awuoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awuoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awuf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        awuo awuoVar = this.b;
        this.a = 1;
        if (awuoVar.j(this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awuf(this.b, fcxyVar);
    }
}
