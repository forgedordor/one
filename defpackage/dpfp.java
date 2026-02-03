package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfp extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfp(dpfq dpfqVar) {
        super(null);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpgj dpgjVar = (dpgj) obj2;
        if (dpgjVar == null) {
            this.a.setHint((CharSequence) null);
            return;
        }
        dpfq dpfqVar = this.a;
        dpfqVar.setHint(dpgjVar.a);
        ije ijeVar = new ije(dpgjVar.b);
        ije ijeVar2 = ijeVar.i != 16 ? ijeVar : null;
        if (ijeVar2 != null) {
            dpfqVar.setHintTextColor(ijg.b(ijeVar2.i));
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
