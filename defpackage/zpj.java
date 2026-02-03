package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zpj extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ zpw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpj(zpw zpwVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = zpwVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        zpj zpjVar = new zpj(this.d, (fcxy) obj4);
        zpjVar.a = (ekgb) obj;
        zpjVar.b = (ajlt) obj2;
        zpjVar.c = zBooleanValue;
        return zpjVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (this.c) {
            return new fcti(obj2, obj3);
        }
        this.d.k.a(null);
        int i = ekgb.d;
        return new fcti(ekoe.a, null);
    }
}
