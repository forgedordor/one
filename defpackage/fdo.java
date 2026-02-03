package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdo extends fcyz implements fdat {
    int a;
    final /* synthetic */ fal b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdo(fal falVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = falVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fal falVar = this.b;
            this.a = 1;
            cuu cuuVar = new cuu((byte[]) null);
            Object objG = fdum.g((fdum) falVar.a.a, new fak(cuuVar, falVar), this);
            if (objG != obj2) {
                objG = fctx.a;
            }
            if (objG == obj2) {
                return obj2;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdo(this.b, fcxyVar);
    }
}
