package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotq extends fdcy {
    final /* synthetic */ dots a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dotq(dots dotsVar) {
        super(null);
        this.a = dotsVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpxo dpxoVarC;
        fdae fdaeVar = (fdae) obj2;
        if (fdaeVar == null || (dpxoVarC = this.a.c()) == null) {
            return;
        }
        dpxoVarC.gA(fdaeVar);
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
