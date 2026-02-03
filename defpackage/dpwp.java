package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwp extends fdcy {
    final /* synthetic */ dpwq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpwp(Object obj, dpwq dpwqVar) {
        super(obj);
        this.a = dpwqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        dpwq dpwqVar = this.a;
        dpwqVar.i(iIntValue, false);
        dngq.a(dpwqVar.d.d, Integer.valueOf(iIntValue));
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
