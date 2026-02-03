package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daxi extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ daxj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daxi(daxj daxjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = daxjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daxi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            daxj daxjVar = this.c;
            chna chnaVar = (chna) daxjVar.a.b();
            this.a = daxjVar;
            this.b = 1;
            Object objA = chnaVar.a(this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj2 = daxjVar;
            obj = objA;
        }
        chnc chncVarB = chnc.b(((chmw) obj).c);
        if (chncVarB == null) {
            chncVarB = chnc.SHARE_TO_UNKNOWN;
        }
        chncVarB.getClass();
        ((daxj) obj2).a(chncVarB);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daxi(this.c, fcxyVar);
    }
}
