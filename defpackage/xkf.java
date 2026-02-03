package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xkf extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public xkf(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xkf xkfVar = new xkf((fcxy) obj3);
        xkfVar.a = (Integer) obj;
        xkfVar.b = zBooleanValue;
        return xkfVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.b ? (Integer) xks.a.e() : this.a;
    }
}
