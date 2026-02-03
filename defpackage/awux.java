package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awux extends fcyz implements fdat {
    int a;
    final /* synthetic */ awvh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awux(awvh awvhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awvhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awux) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awvh awvhVar = this.b;
        this.a = 1;
        Object objL = awvhVar.l(this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awux(this.b, fcxyVar);
    }
}
