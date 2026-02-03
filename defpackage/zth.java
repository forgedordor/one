package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zth extends fcyz implements fdap {
    int a;
    final /* synthetic */ ztv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zth(ztv ztvVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ztvVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zBooleanValue;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xgc xgcVarD = this.b.d();
            if (xgcVarD != null) {
                this.a = 1;
                obj = xgcVarD.a(3, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new zth(this.b, (fcxy) obj).b(fctx.a);
    }
}
