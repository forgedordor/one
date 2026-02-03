package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctki extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ctku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctki(ctku ctkuVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = ctkuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctki ctkiVar = new ctki(this.c, (fcxy) obj3);
        ctkiVar.a = (cudx) obj;
        ctkiVar.b = (ctqg) obj2;
        return ctkiVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        if (this.b != null) {
            return null;
        }
        return this.c.f((cudx) obj2);
    }
}
