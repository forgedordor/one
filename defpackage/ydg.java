package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydg extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;

    public ydg(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ydg ydgVar = new ydg((fcxy) obj3);
        ydgVar.a = (oux) obj;
        ydgVar.b = zBooleanValue;
        return ydgVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new fcti(this.a, Boolean.valueOf(this.b));
    }
}
