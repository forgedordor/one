package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfg extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfg(dpfq dpfqVar) {
        super(null);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (!fdbq.f(bool, true)) {
            if (fdbq.f(bool, false)) {
                this.a.h();
            }
        } else {
            dpfq dpfqVar = this.a;
            if (dpfqVar.hasFocus()) {
                dpfqVar.i();
            } else {
                dpfqVar.requestFocus();
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
