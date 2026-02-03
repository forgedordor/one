package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqs extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    boolean d;
    int e;
    final /* synthetic */ zqt f;
    final /* synthetic */ ekgb g;
    final /* synthetic */ boolean h;
    final /* synthetic */ zqy i;
    final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqs(zqt zqtVar, ekgb ekgbVar, boolean z, zqy zqyVar, boolean z2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = zqtVar;
        this.g = ekgbVar;
        this.h = z;
        this.i = zqyVar;
        this.j = z2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        boolean z;
        fduf fdufVar;
        ekgb ekgbVar;
        fcyl fcylVar = fcyl.a;
        if (this.e != 0) {
            z = this.d;
            obj2 = this.c;
            Object obj3 = this.b;
            Object obj4 = this.a;
            fctl.b(obj);
            ekgbVar = obj3;
            fdufVar = obj4;
        } else {
            fctl.b(obj);
            zqt zqtVar = this.f;
            ekgb ekgbVar2 = this.g;
            obj2 = this.h ? this.i : null;
            fduf fdufVar2 = zqtVar.a;
            boolean z2 = this.j;
            this.a = fdufVar2;
            this.b = ekgbVar2;
            this.c = obj2;
            this.d = z2;
            this.e = 1;
            obj = zqtVar.f(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            z = z2;
            ekgbVar = ekgbVar2;
            fdufVar = fdufVar2;
        }
        fdufVar.f(new zqw(ekgbVar, (zqy) obj2, z, (Boolean) obj));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zqs(this.f, this.g, this.h, this.i, this.j, fcxyVar);
    }
}
