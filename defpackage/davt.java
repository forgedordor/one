package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davt extends fcyz implements fdat {
    final /* synthetic */ davx a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public davt(fcxy fcxyVar, davx davxVar) {
        super(2, fcxyVar);
        this.a = davxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((davt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        long jC = ((cqpz) this.a.b.b()).c("android_id", 0L);
        if (jC == 0) {
            return null;
        }
        return new Long(jC);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        davt davtVar = new davt(fcxyVar, this.a);
        davtVar.b = obj;
        return davtVar;
    }
}
