package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aalf extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public aalf(fcxy fcxyVar) {
        super(5, fcxyVar);
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        aalf aalfVar = new aalf((fcxy) obj5);
        aalfVar.a = (ajlk) obj2;
        aalfVar.b = (ekgb) obj3;
        aalfVar.c = (ajlh) obj4;
        return aalfVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new fcto(this.a, this.b, this.c);
    }
}
