package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovo extends fdcy {
    final /* synthetic */ dovr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dovo(dovr dovrVar) {
        super(null);
        this.a = dovrVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dovr dovrVar = this.a;
        dpxo dpxoVar = (dpxo) obj2;
        if (dovrVar.m) {
            if (dovrVar.n || dovrVar.i) {
                dovrVar.j(dpxoVar);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
