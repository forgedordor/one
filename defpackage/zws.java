package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zws extends fcyz implements fdau {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    final /* synthetic */ zww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zws(zww zwwVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = zwwVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        zws zwsVar = new zws(this.c, (fcxy) obj3);
        zwsVar.a = zBooleanValue;
        zwsVar.b = zBooleanValue2;
        return zwsVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = false;
        if (!z && z2) {
            this.c.g.isPresent();
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
