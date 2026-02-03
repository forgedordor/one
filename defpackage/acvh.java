package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvh extends fcyz implements fdat {
    int a;
    final /* synthetic */ acvi b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acvh(fcxy fcxyVar, acvi acviVar) {
        super(2, fcxyVar);
        this.b = acviVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acvh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            acvi acviVar = this.b;
            this.a = 1;
            obj = acviVar.a.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        acvd acvdVar = (acvd) obj;
        if ((acvdVar.b & 1) != 0) {
            return new Integer(acvdVar.c);
        }
        this.b.b(0);
        return new Integer(0);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        acvh acvhVar = new acvh(fcxyVar, this.b);
        acvhVar.c = obj;
        return acvhVar;
    }
}
