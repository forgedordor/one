package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpce extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public dpce(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dpce dpceVar = new dpce((fcxy) obj3);
        dpceVar.a = (dpzj) obj;
        dpceVar.b = (dpxe) obj2;
        return dpceVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        return (obj3 == null || !(obj2 instanceof dpzh)) ? !(obj2 instanceof dpzb) ? obj2 : dpyw.a : dpzh.a((dpzh) obj2, null, (dpxe) obj3, 13);
    }
}
