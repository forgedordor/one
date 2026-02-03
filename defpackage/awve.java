package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awve extends fcyz implements fdat {
    int a;
    final /* synthetic */ awvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awve(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awve) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awvh awvhVar = this.b;
            awye awyeVar = awvhVar.b;
            awyeVar.a = ekon.a;
            awyeVar.b = ekoj.a;
            awzo awzoVar = (awzo) awvhVar.d.b();
            this.a = 1;
            if (awzoVar.j(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awve(this.b, fcxyVar);
    }
}
