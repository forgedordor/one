package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwiz extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cwiz(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwiz cwizVar = new cwiz((fcxy) obj3);
        cwizVar.a = (eyyv) obj;
        cwizVar.b = (cwjk) obj2;
        return cwizVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        return obj2 == null ? new cwjk(null, 3) : ((cwjk) obj3).a == null ? new cwjk(Boolean.valueOf(((eyyv) obj2).b), 2) : obj3;
    }
}
