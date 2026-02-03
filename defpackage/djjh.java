package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjh extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdci b;
    final /* synthetic */ hox c;
    final /* synthetic */ iqa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djjh(fdci fdciVar, hox hoxVar, iqa iqaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdciVar;
        this.c = hoxVar;
        this.d = iqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djjh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zBooleanValue;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVar = (fdkf) this.b.a;
            if (fdkfVar != null) {
                this.a = 1;
                obj = fdkfVar.c(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                zBooleanValue = true;
            }
        } else {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        hox hoxVar = this.c;
        hoxVar.b(Boolean.valueOf(!zBooleanValue));
        if (((Boolean) hoxVar.a()).booleanValue()) {
            this.d.a(0);
        }
        this.b.a = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djjh(this.b, this.c, this.d, fcxyVar);
    }
}
