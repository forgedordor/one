package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aagr extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ aags c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aagr(aags aagsVar, boolean z, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = aagsVar;
        this.d = z;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        aagr aagrVar = new aagr(this.c, this.d, (fcxy) obj3);
        aagrVar.a = (xsi) obj;
        aagrVar.b = zBooleanValue;
        return aagrVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        return new aagu((obj2 == null || !z) ? dlkk.a : new aagh(((xsi) obj2).b), z, this.d);
    }
}
