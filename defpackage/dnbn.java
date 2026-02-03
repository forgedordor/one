package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbn extends fdcy {
    final /* synthetic */ dnbo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnbn(dnbo dnboVar) {
        super(null);
        this.a = dnboVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dnbo dnboVar = this.a;
        if (dnboVar.d == 0) {
            dnboVar.d = 1;
            dnboVar.s(0);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
