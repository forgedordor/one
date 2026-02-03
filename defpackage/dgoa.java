package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgoa extends fcyz implements fdat {
    int a;
    final /* synthetic */ dgom b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgoa(dgom dgomVar, Object obj, Object obj2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dgomVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgoa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dgom dgomVar = this.b;
            Object obj3 = this.c;
            Object obj4 = this.d;
            this.a = 1;
            Object objA = fdin.a(eicg.a(dgomVar.f), new dgnz(null, dgomVar, obj3, obj4), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dgoa(this.b, this.c, this.d, fcxyVar);
    }
}
