package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afpt extends fcyz implements fdav {
    /* synthetic */ int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ afpu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpt(afpu afpuVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = afpuVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        afpt afptVar = new afpt(this.d, (fcxy) obj4);
        afptVar.a = iIntValue;
        afptVar.b = (vvw) obj2;
        afptVar.c = zBooleanValue;
        return afptVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int i = this.a;
        Object obj2 = this.b;
        if (this.c) {
            return new afpp(this.d.c);
        }
        vvw vvwVar = (vvw) obj2;
        String str = vvwVar.a;
        return ((str == null || str.length() == 0) && vvwVar.b.isEmpty()) ? new afpp(this.d.a) : (str == null || str.length() == 0 || str.length() <= i) ? new afpq(vvwVar) : new afpp(this.d.b);
    }
}
