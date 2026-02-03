package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ygr extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ ygs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygr(ygs ygsVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = ygsVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ygr ygrVar = new ygr(this.c, (fcxy) obj3);
        ygrVar.a = (ajlk) obj;
        ygrVar.b = zBooleanValue;
        return ygrVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r5 = this.a;
        boolean z = this.b;
        ygs ygsVar = this.c;
        boolean z2 = false;
        if ((!ygsVar.a.a() || r5.c() != ajlj.RBM) && (!ygsVar.b.a() || !z)) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
