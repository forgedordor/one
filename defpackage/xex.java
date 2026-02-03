package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xex extends fcyz implements fdav {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public xex(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        xex xexVar = new xex((fcxy) obj4);
        xexVar.a = zBooleanValue;
        xexVar.b = (cljh) obj2;
        xexVar.c = (aoer) obj3;
        return xexVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        Object obj2 = this.b;
        ?? r1 = this.c;
        boolean z2 = true;
        if (!z && (!((cljh) obj2).b() || r1 == 0 || r1.v())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
