package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpfl extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;

    public cpfl(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        cpfl cpflVar = new cpfl((fcxy) obj3);
        cpflVar.a = zBooleanValue;
        cpflVar.b = zBooleanValue2;
        return cpflVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
