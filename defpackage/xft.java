package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xft extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public xft(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xft xftVar = new xft((fcxy) obj3);
        xftVar.a = (aoff) obj;
        xftVar.b = (aoer) obj2;
        return xftVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        boolean z = true;
        if (((aoff) obj2).a() && (r0 == 0 || !r0.v())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
