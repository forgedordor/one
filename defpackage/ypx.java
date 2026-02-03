package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypx extends fcyz implements fdat {
    int a;
    final /* synthetic */ yqa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypx(yqa yqaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ypw ypwVar = new ypw(this.b.g);
                this.a = 1;
                obj = fdtc.a(ypwVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            ((Boolean) obj).booleanValue();
            this.b.i();
            return fctx.a;
        } catch (Throwable th) {
            this.b.i();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ypx(this.b, fcxyVar);
    }
}
