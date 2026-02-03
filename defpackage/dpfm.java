package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfm extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfm(Object obj, dpfq dpfqVar) {
        super(obj);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        float f = ((kir) obj2).a;
        dpfq dpfqVar = this.a;
        dpfqVar.setMinHeight(!Float.isNaN(f) ? dpfqVar.d().ep(f) : -1);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
