package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aafk extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ int b;

    public aafk(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        aafk aafkVar = new aafk((fcxy) obj3);
        aafkVar.a = (aafp) obj;
        aafkVar.b = iIntValue;
        return aafkVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        int i = this.b;
        if (obj2 != null) {
            return (bxuv) fcva.Q(((aafp) obj2).b, i);
        }
        return null;
    }
}
