package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsq extends fdcy {
    final /* synthetic */ dnst a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnsq(dnst dnstVar) {
        super(null);
        this.a = dnstVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dnkf dnkfVar;
        dnst dnstVar = this.a;
        dnov dnovVar = (dnov) obj2;
        Integer num = dnstVar.d().a;
        if (num != null) {
            dnstVar.d().q(num.intValue());
        }
        int iA = dnstVar.d().a();
        for (int i = 0; i < iA; i++) {
            dnkf dnkfVarL = dnstVar.d().l(i);
            CharSequence charSequence = null;
            CharSequence charSequenceA = dnkfVarL != null ? dnkfVarL.a() : null;
            if (dnovVar != null && (dnkfVar = dnovVar.d) != null) {
                charSequence = ((dnjr) dnkfVar).a;
            }
            if (fdbq.f(charSequenceA, charSequence)) {
                dnstVar.d().q(i);
                return;
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
