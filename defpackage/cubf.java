package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cubf extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cubf(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cubf cubfVar = new cubf((fcxy) obj3);
        cubfVar.a = (String) obj;
        cubfVar.b = (cudx) obj2;
        return cubfVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new fcti(this.a, this.b);
    }
}
