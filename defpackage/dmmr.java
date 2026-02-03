package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ doig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmr(dmng dmngVar, doig doigVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = doigVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmng dmngVar = this.b;
            doig doigVar = this.c;
            this.a = 1;
            obj = dmngVar.j.a.a(doigVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Error getting output URI for image capture.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmr(this.b, this.c, fcxyVar);
    }
}
