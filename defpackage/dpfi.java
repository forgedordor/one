package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfi extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfi(dpfq dpfqVar) {
        super(null);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        int i;
        kji kjiVar = (kji) obj2;
        if (kjiVar != null) {
            dpfq dpfqVar = this.a;
            int iOrdinal = kjiVar.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    throw new fctg();
                }
            } else {
                i = 0;
            }
            dpfqVar.setLayoutDirection(i);
            dpfqVar.setTextAlignment(5);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
