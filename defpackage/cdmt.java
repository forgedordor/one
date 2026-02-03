package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmt extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdnb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmt(fcxy fcxyVar, cdnb cdnbVar) {
        super(2, fcxyVar);
        this.b = cdnbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdnb cdnbVar = this.b;
            this.a = 1;
            obj = cdnbVar.b.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cdne cdneVar = (cdne) obj;
        if ((cdneVar.b & 1) == 0) {
            return cdmq.a;
        }
        cdmq cdmqVar = cdneVar.c;
        return cdmqVar == null ? cdmq.a : cdmqVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdmt cdmtVar = new cdmt(fcxyVar, this.b);
        cdmtVar.c = obj;
        return cdmtVar;
    }
}
