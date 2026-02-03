package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xox extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;

    public xox(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        xox xoxVar = new xox((fcxy) obj3);
        xoxVar.a = zBooleanValue;
        xoxVar.b = zBooleanValue2;
        return xoxVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (z && !z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
