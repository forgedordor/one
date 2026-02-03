package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxr extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public vxr(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        vxr vxrVar = new vxr((fcxy) obj4);
        vxrVar.a = (aokl) obj;
        vxrVar.b = (ajna) obj2;
        vxrVar.c = (String) obj3;
        return vxrVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aokl, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r4 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        obj2.getClass();
        return new vzn(r4, (ajna) obj2, (String) obj3);
    }
}
