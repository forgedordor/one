package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaln extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ hox c;
    final /* synthetic */ fdap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaln(hox hoxVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = hoxVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaln) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        hox hoxVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.b != 0) {
                Object obj2 = this.a;
                fctl.b(obj);
                hoxVar = obj2;
            } else {
                fctl.b(obj);
                hox hoxVar2 = this.c;
                fdap fdapVar = this.d;
                this.a = hoxVar2;
                this.b = 1;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke == fcylVar) {
                    return fcylVar;
                }
                hoxVar = hoxVar2;
                obj = objInvoke;
            }
            hoxVar.b(new zyc(obj));
        } catch (Exception e) {
            fdlw.f(u());
            this.c.b(new zyb(e));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aaln(this.c, this.d, fcxyVar);
    }
}
