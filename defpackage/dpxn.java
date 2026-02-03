package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpxn extends fdcy {
    final /* synthetic */ dpxo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpxn(dpxo dpxoVar) {
        super(null);
        this.a = dpxoVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpgl dpglVar = (dpgl) obj2;
        if (dpglVar == null) {
            throw new IllegalStateException("Do not attempt to apply null HugoColors. This should not happen.");
        }
        dpxo dpxoVar = this.a;
        if (dpxoVar.aW) {
            dpxoVar.aZ(dpglVar);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
