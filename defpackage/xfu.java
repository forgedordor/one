package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfu extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public xfu(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xfu xfuVar = new xfu((fcxy) obj3);
        xfuVar.a = (cljh) obj;
        xfuVar.b = (aoer) obj2;
        return xfuVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        boolean z = true;
        if (((cljh) obj2).b() && (r0 == 0 || !r0.v())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
