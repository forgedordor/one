package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqr extends fcyz implements fdat {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ zqt e;
    final /* synthetic */ ekgb f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqr(zqt zqtVar, ekgb ekgbVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = zqtVar;
        this.f = ekgbVar;
        this.g = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zqr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean z;
        fduf fdufVar;
        ekgb ekgbVar;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            z = this.c;
            Object obj2 = this.b;
            Object obj3 = this.a;
            fctl.b(obj);
            ekgbVar = obj2;
            fdufVar = obj3;
        } else {
            fctl.b(obj);
            zqt zqtVar = this.e;
            ekgb ekgbVar2 = this.f;
            boolean z2 = this.g;
            fduf fdufVar2 = zqtVar.a;
            this.a = fdufVar2;
            this.b = ekgbVar2;
            this.c = z2;
            this.d = 1;
            obj = zqtVar.f(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = z2;
            fdufVar = fdufVar2;
            ekgbVar = ekgbVar2;
        }
        fdufVar.f(new zqw(ekgbVar, null, z, (Boolean) obj));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zqr(this.e, this.f, this.g, fcxyVar);
    }
}
