package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahd extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ aahh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahd(aahh aahhVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = aahhVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        aahd aahdVar = new aahd(this.d, (fcxy) obj4);
        aahdVar.a = (zqw) obj;
        aahdVar.b = (String) obj2;
        aahdVar.c = zBooleanValue;
        return aahdVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.b != null ? this.d.f : !((zqw) this.a).a.isEmpty() ? this.d.e : this.d.a(this.c);
    }
}
