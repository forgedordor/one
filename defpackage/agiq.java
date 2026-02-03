package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agiq extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public agiq(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        agiq agiqVar = new agiq((fcxy) obj3);
        agiqVar.a = (cgra) obj;
        agiqVar.b = zBooleanValue;
        return agiqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new fcti(this.a, Boolean.valueOf(this.b));
    }
}
