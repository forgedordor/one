package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oov extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public oov(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        oov oovVar = new oov((fcxy) obj3);
        oovVar.b = (orv) obj;
        oovVar.c = (orv) obj2;
        return oovVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            Object obj2 = this.b;
            fctl.b(obj);
            return obj2;
        }
        fctl.b(obj);
        Object obj3 = this.b;
        Object obj4 = this.c;
        this.b = obj4;
        this.a = 1;
        ((orv) obj3).b.d.t(null);
        return fctx.a != fcylVar ? obj4 : fcylVar;
    }
}
