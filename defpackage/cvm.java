package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvm extends fcyy implements fdat {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ cvn e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvm(cvn cvnVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = cvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvm) c((fdex) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdex fdexVar;
        Object obj2;
        int i;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            fdexVar = (fdex) this.f;
            fctl.b(obj);
            obj3 = obj4;
        } else {
            fctl.b(obj);
            fdexVar = (fdex) this.f;
            cvk cvkVar = this.e.b;
            Object obj5 = cvkVar.b;
            obj2 = cvkVar.c;
            i = cvkVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = fdexVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (fdexVar.a(obj6, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvm cvmVar = new cvm(this.e, fcxyVar);
        cvmVar.f = obj;
        return cvmVar;
    }
}
