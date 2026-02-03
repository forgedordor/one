package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xbx extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ xci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbx(xci xciVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xciVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xbx xbxVar = new xbx(this.c, (fcxy) obj3);
        xbxVar.a = (djfy) obj;
        xbxVar.b = zBooleanValue;
        return xbxVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        if (obj2 != null) {
            return obj2;
        }
        if (z) {
            return this.c.c(null, false);
        }
        return null;
    }
}
