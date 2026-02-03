package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vzj extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vzk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzj(vzk vzkVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = vzkVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        vzj vzjVar = new vzj(this.d, (fcxy) obj4);
        vzjVar.a = (vwu) obj;
        vzjVar.b = (ajlj) obj2;
        vzjVar.c = (waf) obj3;
        return vzjVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        return vzk.a((ajlj) this.b, (vwu) obj2, (waf) this.c);
    }
}
