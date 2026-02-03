package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xew extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;

    public xew(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xew xewVar = new xew((fcxy) obj4);
        xewVar.a = (aoff) obj;
        xewVar.b = zBooleanValue;
        xewVar.c = (aoer) obj3;
        return xewVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        boolean z2 = true;
        if (!z && (!((aoff) obj2).a() || r1 == 0 || r1.v())) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
